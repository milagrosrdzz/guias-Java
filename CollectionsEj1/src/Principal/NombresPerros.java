
package Principal;
import java.util.ArrayList;
import java.util.Scanner;
public class NombresPerros {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
       ArrayList <String> mascotas = new ArrayList();
       
       String salida = "n";
        do {
            System.out.println("Ingrese el nombre de la mascota: ");
            String nombre = leer.next();
            System.out.println("Desea agregar otro nombre?");
            salida = leer.next();
            mascotas.add(nombre);
        } while (salida.equalsIgnoreCase("s"));
        
        for (String mascota : mascotas) {
            System.out.println(mascota);
        }
    }

}
