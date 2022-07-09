public class PasarPorReferencias2 {

    public static void main(String[] args) {

        System.out.println("Iniciando el método main");
        
        Persona persona = new Persona();
        persona.modificarNombre("Argeo");
        System.out.println("persona.leerNombre = " + persona.leerNombre());
        
        System.out.println("Antes de llamar al método test");
        test(persona);
        System.out.println("Después de llamar al método test");
        System.out.println("persona.leerNombre = " + persona.leerNombre());
        System.out.println("Finaliza el método main");

    }

    public static void test(Persona persona){
        System.out.println("Iniciamor el método test");
        persona.modificarNombre("Juan");
        System.out.println("Finaliza el método test");
    }
}

class Persona{
    
    private String nombre;

    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;

    }

    public String leerNombre(){
        return this.nombre;
    }
}