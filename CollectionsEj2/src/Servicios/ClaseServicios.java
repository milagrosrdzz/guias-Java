package Servicios;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ClaseServicios {
    private ArrayList<String> listaMascotas;//creo la lista que va a contener las razas
    private Scanner leer ;
    //Esta es una muy buena practica
    public ClaseServicios() {
        this.listaMascotas = new ArrayList<>(); // Creo el espacio en memoria del LISTA
        this.leer = new Scanner(System.in).useDelimiter("\n");// Cuando se invoca la clase, habilita el flujo de datos
    }
        
    public void cargaRazas() {
        String salida = "n";
        do {
            System.out.println("Ingrese la raza de la mascota: ");
            String razaIngresada = leer.next();
            razaIngresada = razaIngresada.toUpperCase();
            System.out.println("Desea agregar otra raza?");
            salida = leer.next();
            listaMascotas.isEmpty(); // para saber si esta vacía
            listaMascotas.add(new String(razaIngresada));
        } while (salida.equalsIgnoreCase("s"));

        for (Object var : listaMascotas) {
            System.out.println(var);
        }
    }
    public void buscaRaza() {
        System.out.println("Ingrese una raza");
        String buscaRaza = leer.next();
        Iterator <String> it = listaMascotas.iterator();
        while (it.hasNext()) {
            String aux = it.next();
            System.out.println(aux);
            if (aux.equalsIgnoreCase(buscaRaza)) { // 
                System.out.println("Se eliminará "+ buscaRaza);
                it.remove();
            }else{
                System.out.println("La raza no se encuentra en la lista" ); 
            } 
        }
        Collections.sort(listaMascotas);
        listaMascotas.forEach((e) -> System.out.println(e));
    }


    
 }