
package Principal;

import Entidad.CantanteFamoso;
import java.util.ArrayList;
import java.util.Scanner;

public class ClaseMain {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList <CantanteFamoso> listaCantantes = new ArrayList();
        CantanteFamoso a = new CantanteFamoso();
        System.out.println("Cuántos cantantes va a agregar?");
        Integer cantidad = leer.nextInt();
        Integer cont=0;
        do {
            a.cargaCantante(listaCantantes);
            cont++;
        } while (!cantidad.equals(cont));
        String respuesta = "";
        do {
            System.out.println("OPCIONES+"
                    + "\n 1. Cargar otro cantante"
                    + "\n 2. Mostrar todos los cantantes y discos"
                    + "\n 3. Eliminar cantante"
                    + "\n 4. Salir");
            byte opcionElegida = leer.nextByte();
            switch (opcionElegida) {
                case 1:
                    if(opcionElegida ==1){
                        a.cargaCantante(listaCantantes);
                    }
                    break;
                case 2:
                     opcionElegida=2;
                     a.muestraLista(listaCantantes);
                    break;
                case 3:
                     if(opcionElegida == 3){
                         a.eliminaCantante(listaCantantes);
                     }
                    break;
                case 4:
                    if(opcionElegida == 4){
                       break;      
                    }
                default:
                    System.out.println("ELEGISTE UNA OPCION NO VALIDA");
            }

            System.out.println("Desea volver a ver el  MENU DE OPCIONES ?");
            respuesta = leer.next();
        } while (respuesta.equalsIgnoreCase("Si"));            
   
        
        
        
    }
    
}
