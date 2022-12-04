package com.arthe.junit5app.ejemplos.models;

import com.arthe.junit5app.ejemplos.exceptions.DineroInsuficienteException;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {
    @Test
    @DisplayName("Probando el nombre la cuenta corriente!")
    void testNombreCuenta() {
        Cuenta cuenta = new Cuenta("Argeo", new BigDecimal("1000.12345"));
//        cuenta.setPersona("Argeo");
        String esperado = "Argeo";
        String real = cuenta.getPersona();
        assertNotNull(real, () -> "La cuenta no puede ser nula.");
        assertEquals(esperado, real, () -> "El nombre de la cuenta no es el que se esperaba.");
        assertTrue(real.equals("Argeo"), () -> "Nombre cuenta esperada debe ser igual a la real.");
    }

    @Test
    @Disabled
    void testSaldoCuenta() {
        Cuenta cuenta = new Cuenta("Argeo", new BigDecimal("1000.123421"));
        assertEquals(1000.123421, cuenta.getSaldo().doubleValue());
        assertFalse(cuenta.getSaldo().compareTo(BigDecimal.ZERO) < 0);
    }

    @Test
    void testReferenciaCuenta() {
        Cuenta cuenta1 = new Cuenta("John Doe", new BigDecimal("8900.9997"));
        Cuenta cuenta2 = new Cuenta("John Doe", new BigDecimal("8900.9997"));

//        assertNotEquals(cuenta2, cuenta1);
        assertEquals(cuenta2, cuenta1);
    }

    @Test
    void testDebitoCuenta() {
        Cuenta cuenta1 = new Cuenta("Argeo", new BigDecimal("1000.123"));
        cuenta1.debito(new BigDecimal(100));
        assertNotNull(cuenta1.getSaldo());
        assertEquals(900, cuenta1.getSaldo().intValue());
        assertEquals("900.123", cuenta1.getSaldo().toPlainString());
    }

    @Test
    void testCreditoCuenta() {
        Cuenta cuenta1 = new Cuenta("Argeo", new BigDecimal("1000.123"));
        cuenta1.credito(new BigDecimal(100));
        assertNotNull(cuenta1.getSaldo());
        assertEquals(1100, cuenta1.getSaldo().intValue());
        assertEquals("1100.123", cuenta1.getSaldo().toPlainString());
    }

    @Test
    void testDineroInsuficienteException() {
        Cuenta cuenta = new Cuenta("Argeo", new BigDecimal("1000.12345"));
        Exception exception = assertThrows(DineroInsuficienteException.class, () -> {
            cuenta.debito(new BigDecimal(1500));
        });
        String actual = exception.getMessage();
        String esperado = "Dinero Insuficiente";
        assertEquals(esperado, actual);
    }

    @Test
    void testTranferirDineroCuentas() {
        Cuenta cuenta1 = new Cuenta("John Doe", new BigDecimal("2500"));
        Cuenta cuenta2 = new Cuenta("Angel Ros", new BigDecimal("1500.12312"));
        Banco banco = new Banco();
        banco.setNombre("Banco del estado");
        banco.transferir(cuenta2, cuenta1, new BigDecimal(500));
        assertEquals("1000.12312", cuenta2.getSaldo().toPlainString());
        assertEquals("3000", cuenta1.getSaldo().toPlainString());

    }

    @Test
    void testRelacionBancoCuentas() {
        Cuenta cuenta1 = new Cuenta("John Doe", new BigDecimal("2500"));
        Cuenta cuenta2 = new Cuenta("Angel Ros", new BigDecimal("1500.12312"));

        Banco banco = new Banco();
        banco.addCuenta(cuenta1);
        banco.addCuenta(cuenta2);

        banco.setNombre("Banco del estado");
        banco.transferir(cuenta2, cuenta1, new BigDecimal(500));
        assertAll(
                () -> assertEquals("1000.12312", cuenta2.getSaldo().toPlainString()),
                () -> assertEquals("3000", cuenta1.getSaldo().toPlainString()),
                () -> assertEquals(2, banco.getCuentas().size()),
                () -> assertEquals("Banco del estado", cuenta1.getBanco().getNombre()),
                () -> {
                    assertEquals("Angel Ros", banco.getCuentas()
                            .stream()
                            .filter(c -> c.getPersona().equals("Angel Ros"))
                            .findFirst()
                            .get().getPersona());
                },
                () -> assertTrue(banco.getCuentas()
                            .stream()
                            .filter(c -> c.getPersona().equals("Angel Ros"))
                            .findFirst()
                            .isPresent()),
                () -> {
                    assertTrue(banco.getCuentas()
                            .stream()
                            .anyMatch(c -> c.getPersona().equals("Angel Ros")));
                }
        );
    }

}