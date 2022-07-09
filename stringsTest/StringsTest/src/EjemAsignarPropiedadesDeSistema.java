import java.io.FileInputStream;
import java.util.Map;
import java.util.Properties;


public class EjemAsignarPropiedadesDeSistema {
    public static void main(String[] args) {

        try{
            FileInputStream archivo = new FileInputStream("src/config.properties");
            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada", "Mi valor guardado");
            System.setProperties(p);
            System.getProperties().list(System.out);
        }catch(Exception e){
            System.out.println("No existe el archivo = " + e);
        }

        //Variables del sistema

        Map<String, String> varEnv = System.getenv();
        System.out.println("Variables de ambiente del sistema = " + varEnv);
        String usrname = System.getenv("USERNAME");
        System.out.println("Username = " + usrname);
    }
}
