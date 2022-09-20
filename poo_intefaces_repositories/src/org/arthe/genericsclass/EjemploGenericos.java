package org.arthe.genericsclass;

public class EjemploGenericos {

    public static <T> void imprimirCamion(Camion<T> camion){
         for(T a: camion){
             if(a instanceof Animal){
                 System.out.println(((Animal) a).getNombre() + " tipo: " + ((Animal) a).getTipo());
             }
             else if(a instanceof Automovil){
                 System.out.println(((Automovil) a).getMarca());
             }
             else if(a instanceof Maquinaria){
                 System.out.println(((Maquinaria) a).getTipo());
             }
         }
    }
    public static void main(String[] args) {
        Camion<Animal> transporteCaballos = new Camion<>(5);
        transporteCaballos.add(new Animal("Peregrino","Caballo"));
        transporteCaballos.add(new Animal("Grillo", "Caballo"));
        transporteCaballos.add(new Animal("Trilo", "Caballo"));
        transporteCaballos.add(new Animal("Siras", "Yegua"));
        transporteCaballos.add(new Animal("Bisas", "Yegua"));

        System.out.println("=============");
        /*for(Object o: transporteCaballos){
            Animal a = (Animal) o;
            System.out.println(a.getNombre() + " tipo: " + a.getTipo());
        }*/
        imprimirCamion(transporteCaballos);

        Camion<Maquinaria> transMaquinas = new Camion<>(3);
        transMaquinas.add(new Maquinaria("Bulldozer"));
        transMaquinas.add(new Maquinaria("Grúa Horquilla"));
        transMaquinas.add(new Maquinaria("Perforadora"));

        System.out.println("=============");
        /*for (Object o: transMaquinas){
            Maquinaria m = (Maquinaria) o;
            System.out.println(m.getTipo());
        }*/
        imprimirCamion(transMaquinas);

        Camion<Automovil> transAuto = new Camion<>(3);
        transAuto.add(new Automovil("Toyota"));
        transAuto.add(new Automovil("Mercedez"));
        transAuto.add(new Automovil("BMW"));

        System.out.println("=============");
        /*for (Object o: transAuto){
            Automovil a = (Automovil) o;
            System.out.println(a.getMarca());
        }*/
        imprimirCamion(transAuto);



    }

}
