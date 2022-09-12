import models.electronica.IPhone;
import models.electronica.TvLcd;
import models.libro.Comics;

import java.util.Date;



public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bien venido a la tienda!");
        System.out.println("Compra lo que gustes!");

        IPhone iphone = new IPhone(300, "Apple", "X Pro Max", "Verde");
        TvLcd tv = new TvLcd(15000, "LG", 70);
        Comics comics = new Comics(200,new Date(2014,2,14), "Franco", "Dark", "Obscure", "Night");
        
        System.out.println(iphone.toString());
        System.out.println(tv.toString());
        System.out.println(comics.toString());

    }
}
