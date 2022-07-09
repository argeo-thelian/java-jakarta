public class Automovil {
    
    //Pincipio de Ocultación 
    private String fabricante;
    private String modelo;
    private String color;
    private double cilindrada;
    private int capacidadTanque = 40;
    // ---------------- Getters
    public String getFabricante(){
        return this.fabricante;
    }
    public String getModelo(){
        return this.modelo;
    }
    public String getColor(){
        return this.color;
    }
    public Double getCilindrada(){
        return this.cilindrada;
    }
    public Integer getCatidadTanque(){
        return this.capacidadTanque;
    }
    //------------------- Setters
    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setCilindrada(Double cilindrada){
        this.cilindrada = cilindrada;
    }
    public void setCantidadTanque(Integer cantidadTanque){
        this.capacidadTanque = cantidadTanque;
    }


    public String detalle(){
        return  "auto.fabricacion = " + this.fabricante + 
                "\nauto.modelo = " + this.modelo +
                "\nauto.color = " + this.color +
                "\nauto.cilindrada = " + this.cilindrada;
    }

    public String acelerar(int rpm){
        return "El auto " + this.fabricante + " acelerando a " + rpm + " rpm";
    }

    public String frenar(){
        return this.fabricante  + " " + this.modelo + " frenando!";
    }

    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float procentajeBencina){
        return km/(capacidadTanque*procentajeBencina);
    }
    //Principio de encapsulamiento 
    //Sobrecarga de método
    //Polimorfismo: la misma operación implementada de distinta forma
    
    public float calcularConsumo(int km, int procentajeBencina){
        return km/(capacidadTanque*(procentajeBencina/100f));
    }
}
