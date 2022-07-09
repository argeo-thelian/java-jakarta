import java.awt.*;
import java.util.Arrays;

public class EjemploAutomovil {
    public static void main(String[] args) {
        
//        Automovil auto = new Automovil();
//
//        auto.setFabricante("Subaru");
//        auto.setModelo("Impreza");
//        auto.setColor("Verde");
//        auto.setCilindrada(3.0);
//
//        System.out.println(auto.detalle());
//        System.out.println(auto.acelerar(4));
//        System.out.println(auto.frenar());
//        System.out.println(auto.acelerarFrenar(10));
//        System.out.println("Kilometros por litro " + auto.calcularConsumo(100, 0.30f));
//        System.out.println("Kilometros por litro " + auto.calcularConsumo(100, 60));
//
        Motor motorSubaru = new Motor(2.0, TipoMotor.BENCINA);
        Estanque estanqueSubaru = new Estanque();
        Persona condutorSubaru = new Persona("Lucia", "Martinez");
        TipoAuto tipoAutoSubaru = TipoAuto.SUV;
        Rueda[] ruedaSubaru = new Rueda[5];
        Auto subaru = new Auto("Subaru", "ImpreZA");
        subaru.setMotor(motorSubaru);
        subaru.setEstanque(estanqueSubaru);
        subaru.setColor(Color.WHITE);
        subaru.setPersona(condutorSubaru);
        subaru.setTipoAuto(tipoAutoSubaru);
        for (int i = 0; i < ruedaSubaru.length;  i++){
            subaru.addRueda(new Rueda("Yokohama", 16,7.5));
        }

        Motor motorToyota = new Motor(1.8, TipoMotor.DIESEL);
        Estanque estanqueToyota = new Estanque();
        Persona condutorToyota = new Persona("Jose", "Perez");
        TipoAuto tipoAutoToyota = TipoAuto.SUV;
        Rueda[] ruedaToyota = new Rueda[5];
        Auto toyota = new Auto("Toyota", "Prius");
        toyota.setMotor(motorToyota);
        toyota.setEstanque(estanqueToyota);
        toyota.setColor(Color.WHITE);
        toyota.setPersona(condutorToyota);
        toyota.setTipoAuto(tipoAutoToyota);
        for (int i = 0; i < ruedaToyota.length;  i++){
            toyota.addRueda(new Rueda("Hibrido", 16,7.5));
        }

        Auto[] autos = new Auto[2];
        autos[0] = toyota;
        autos[1] = subaru;

        for (Auto auto : autos) {
            System.out.println(auto);
        }
        Arrays.sort(autos); //Error de contrato
        // Crear interfas -> firmas de metodos -> comparable
        // Después de implementar el Compara to, se van a ordenar
        for (Auto auto : autos) {
            System.out.println(auto);
        }
    }
}