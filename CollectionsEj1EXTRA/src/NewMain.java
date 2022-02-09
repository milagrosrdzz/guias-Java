
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class NewMain {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
       Integer num;
       ArrayList <Integer> listaNum = new ArrayList();
        do {
            System.out.println("Ingrese un número a la lista, use -99 para salir: ");
            num = leer.nextInt();
            listaNum.add(num);
        } while (!num.equals(-99));
        System.out.println(listaNum);
;
        Iterator<Integer> it = listaNum.iterator(); // inicia el iterator con el tipo de datos, despues nombra la lista a recorrer
        while (it.hasNext()) { // mientras haya un siguiente
            if (it.next() == (-99)) { // comprueba si el numero es -99 y  si lo encuentra Borra el num
                it.remove();
            }
        }
        
        Integer suma =0;
        int contador = 0;
        for (Integer arrayNum : listaNum) { // con el forEach mostramos la lista sin el ultimo ingresado
            suma = suma + arrayNum;
            System.out.println(arrayNum);  
            contador++;
        }    
        System.out.println("La suma de los elementos de la lista es: "+suma);
        System.out.println("El promedio de los numeros ingresados es: "+suma/contador);
    }
    
}
