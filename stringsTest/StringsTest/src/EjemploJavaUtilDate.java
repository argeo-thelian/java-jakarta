import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilDate{
    public static void main(String[] args) {
        
        Date fecha = new Date();

        System.out.println("fecha = " + fecha);

        SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd MM, yyyy");
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat dateFormat3 = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat dateFormat4 = new SimpleDateFormat("dd:MM:yyyy");
        SimpleDateFormat dateFormat5 = new SimpleDateFormat("dd:MMMM:yyyy");
        SimpleDateFormat dateFormat6 = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
        SimpleDateFormat dateFormat7 = new SimpleDateFormat("EEEE dd 'de' MMMM, yyyy");
        String fechaStr1 = dateFormat1.format(fecha);
        String fechaStr2 = dateFormat2.format(fecha);
        String fechaStr3 = dateFormat3.format(fecha);
        String fechaStr4 = dateFormat4.format(fecha);
        String fechaStr5 = dateFormat5.format(fecha);
        String fechaStr6 = dateFormat6.format(fecha);
        String fechaStr7 = dateFormat7.format(fecha);
        System.out.println("fechaStr1 = " + fechaStr1);
        System.out.println("fechaStr2 = " + fechaStr2);
        System.out.println("fechaStr3 = " + fechaStr3);
        System.out.println("fechaStr4 = " + fechaStr4);
        System.out.println("fechaStr5 = " + fechaStr5);
        System.out.println("fechaStr6 = " + fechaStr6);
        System.out.println("fechaStr7 = " + fechaStr7);

        long j = 0;
        for (int i = 0; i < 10000000; i ++){
            j +=i;
        }
        System.out.println("j = " + j);
        
        Date fecha2 = new Date();
        long tiempoFinal = fecha2.getTime() - fecha.getTime();

        System.out.println(" tiempo Transcurrido en el for = " + tiempoFinal);


        //------ Futuras Calendar

        Calendar calendar = Calendar.getInstance();
        
        Date date = calendar.getTime();
        System.out.println("Calendario = " + date);

        calendar.set(2020, 0 , 25, 19,20,10);
        date = calendar.getTime();
        System.out.println("Calendario = " + date);


        calendar.set(Calendar.YEAR,2020);
        calendar.set(Calendar.MONTH,Calendar.JANUARY);
        calendar.set(Calendar.DAY_OF_MONTH,23);
        // calendar.set(calendar.HOUR_OF_DAY,21);
        calendar.set(Calendar.HOUR, 7);
        calendar.set(Calendar.AM_PM, Calendar.PM);
        calendar.set(Calendar.MINUTE,20);
        calendar.set(Calendar.SECOND,10);
        date = calendar.getTime();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS a");
        String fechaFormat = format.format(date);
        System.out.println("Calendario = " + fechaFormat);

        // Parse fecha

        SimpleDateFormat formatParse = new SimpleDateFormat("yyyy-MM-dd");
        
        try {
            Date parseDate = formatParse.parse("2020-12-25");
            System.out.println("fecha = " + parseDate);
            System.out.println("format = " + formatParse.format(parseDate));

            Date fechaCon1  = new Date();
            if(parseDate.after(fechaCon1)){
                System.out.println("Fecha del usuairo es muy joven");
            } else {
                System.out.println("Fecha del usuairo mayor a un dia");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}