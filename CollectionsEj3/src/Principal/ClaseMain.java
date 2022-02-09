package Principal;

import Servicios.ClaseServicios;
import java.util.Scanner;

public class ClaseMain {
    public static void main(String[] args) {
      Scanner leer = new Scanner (System.in).useDelimiter("\n");
      ClaseServicios nuevoArrayList = new ClaseServicios();
        System.out.println("Desea cargar un alumno?S/N");
        String rta = leer.next();
        do{
           nuevoArrayList.cargaDatos();
        }while(rta.equalsIgnoreCase("n"));
        
        nuevoArrayList.muestraDatos();
        System.out.println("De qué alumnx desea ver la nota final?");
        String nombre = leer.next();
        nuevoArrayList.notaFinal(nombre);
        nuevoArrayList.ordenaAlumnos();
    }
    
}
