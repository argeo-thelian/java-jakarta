import java.awt.*;
import java.util.Arrays;
import java.util.Objects;

public class Auto implements Comparable<Auto> {

    private int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.GRAY;
    private Motor motor;
    private Estanque estanque;
    private Persona persona;
    private Rueda[] ruedas;
    private int indiceRuedas;
    private TipoAuto tipoAuto;

    private static Color colorPatente = Color.ORANGE;
    private static int capacidadEstanqueEstatico = 30;
    private static int ultimoId;
    public Auto(){
        this.id = ++ultimoId;
        this.ruedas = new Rueda[5];
    }
    public Auto(String fabricante, String modelo){
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Auto(String fabricante, String modelo, Color color){
        this(fabricante, modelo);
        this.color = color;
    }

    public Auto(String fabricante, String modelo, Color color, Motor motor){
        this(fabricante, modelo, color);
        this.motor = motor;
    }
    public Auto(String fabricante, String modelo, Color color, Motor motor, Estanque estanque){
        this(fabricante, modelo, color, motor);
        this.estanque = estanque;
    }

    public Auto(String fabricante, String modelo, Color color, Motor motor, Estanque estanque, Persona persona){
        this(fabricante, modelo, color, motor, estanque);
        this.persona = persona;
    }
    public Auto(String fabricante, String modelo, Color color, Motor motor, Estanque estanque, Persona persona, Rueda[] ruedas){
        this(fabricante, modelo, color, motor, estanque, persona);
        this.ruedas = ruedas;
    }

    public Auto(String fabricante, String modelo, Color color, Motor motor, Estanque estanque, Persona persona, Rueda[] ruedas, TipoAuto tipoAuto){
        this(fabricante, modelo, color, motor, estanque, persona, ruedas);
        this.tipoAuto = tipoAuto;
    }
    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public Color getColor() {
        return color;
    }

    public Motor getMotor() {
        return motor;
    }

    public Estanque getEstanque() {
        return estanque;
    }

    public Persona getPersona() {
        return persona;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public TipoAuto getTipoAuto() {
        return tipoAuto;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public void setTipoAuto(TipoAuto tipoAuto) {
        this.tipoAuto = tipoAuto;
    }

    public Auto addRueda(Rueda rueda){
        if(indiceRuedas < this.ruedas.length){
            this.ruedas[indiceRuedas++] = rueda;
        }
        return this;
    }


    @Override
    public String toString() {
        return "Auto{" +
                "id = " + id +
                ", fabricante = '" + fabricante + '\'' +
                ", modelo = '" + modelo + '\'' +
                ", color = " + color +
                ", motor = " + motor +
                ", estanque = " + estanque +
                ", persona = " + persona +
                ", ruedas = " + Arrays.toString(ruedas) +
                '}';
    }

    public String acelerar(int rpm) {
        return "El auto " + this.fabricante + " acelera a " + rpm + " rpm ";
    }

    public String frenar(){return this.fabricante + " " + this.modelo + " frenando!";}

    public String  acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float procentajeBencina){
        return km / (getEstanque().getCapacidad() * procentajeBencina);
    }
    public float calcularConsumo(int km, int procentajeBencina){
        return km / (getEstanque().getCapacidad() * (procentajeBencina / 100f));
    }

    public float calcularConsumo(int km, double procentajeBencina){
        return km / (capacidadEstanqueEstatico * ((float)procentajeBencina / 100f));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return id == auto.id && Objects.equals(fabricante, auto.fabricante) && Objects.equals(modelo, auto.modelo) && Objects.equals(color, auto.color) && Objects.equals(motor, auto.motor) && Objects.equals(estanque, auto.estanque) && Objects.equals(persona, auto.persona) && Arrays.equals(ruedas, auto.ruedas);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, fabricante, modelo, color, motor, estanque, persona);
        result = 31 * result + Arrays.hashCode(ruedas);
        return result;
    }

    @Override
    public int compareTo(Auto a) {
        return this.fabricante.compareTo(a.fabricante);
    }
//// implements Comparable // Este es por que no se usa un objeto especifico
//    @Override
//    public int compareTo(Object o) {
//        Auto a = (Auto) o; //Haciendo el cast
//        return this.fabricante.compareTo(a.fabricante);
//    }
}
