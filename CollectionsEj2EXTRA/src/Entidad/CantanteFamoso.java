
package Entidad;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CantanteFamoso {
  Scanner leer = new Scanner(System.in).useDelimiter("\n"); 
   // me traigo la lista
    private String nombre;
    private String discoConMasVentas;

    public CantanteFamoso() {
    }

    public CantanteFamoso(String nombre, String discoConMasVentas) {
        this.nombre = nombre;
        this.discoConMasVentas = discoConMasVentas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDiscoConMasVentas() {
        return discoConMasVentas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDiscoConMasVentas(String discoConMasVentas) {
        this.discoConMasVentas = discoConMasVentas;
    }
    
    public void cargaCantante(ArrayList <CantanteFamoso> listaCantantes){
            System.out.println("Ingrese el nombre completo del cantante: ");
            String nombreI = leer.next();
            System.out.println("Ingrese el Disco con mas ventas: ");
            String discoConMasVentasI = leer.next();
            CantanteFamoso x = new CantanteFamoso(nombreI, discoConMasVentasI);
            listaCantantes.add(x);
            

    }
    public void eliminaCantante(ArrayList <CantanteFamoso> listaCantantes){
        muestraLista(listaCantantes);
        System.out.println("Que cantante desea eliminar");
        String cantante = leer.next();
        
        Iterator <CantanteFamoso> it = listaCantantes.iterator();
        while(it.hasNext()){
            if (it.next().equals(cantante)) { // busca persona por nombre
                it.remove();
             
            }
        }
        System.out.println("Se elimino al cantante correctamente");
                muestraLista(listaCantantes);
        
    }
    public void muestraLista(ArrayList <CantanteFamoso> listaCantantes){
        for (CantanteFamoso listaCargados : listaCantantes) {
            System.out.println(listaCargados);
        }
    }

    @Override
    public String toString() {
        return "CantanteFamoso{" + "nombre=" + nombre + ", discoConMasVentas=" + discoConMasVentas + '}';
    }
    
    
}
