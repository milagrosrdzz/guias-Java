package Servicios;

import Entidades.Alumnos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ClaseServicios {

    private ArrayList<Alumnos> nuevaLista = new ArrayList();//lista de alumnos
    private Scanner leer;

    public ClaseServicios() {
        this.nuevaLista = new ArrayList<>();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void cargaDatos() {
        
        String respuesta = "s";
        do {
            Alumnos nuevoAlumno = new Alumnos();
            System.out.println("Ingrese su nombre");
            String nombre = leer.next();
            nuevoAlumno.setNombre(nombre);
            ArrayList<Integer> listaAuxi = new ArrayList();
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese su " + (1+i) + " nota");
                listaAuxi.add(leer.nextInt());
                nuevoAlumno.setListaNotas(listaAuxi);
            }
            nuevaLista.add(nuevoAlumno);
            System.out.println("Desea cargar otro alumnx? S/N");
            respuesta= leer.next();
        } while (respuesta.equalsIgnoreCase("s")) ;
    }
    public void muestraDatos() {
        nuevaLista.forEach((e) -> System.out.println(e));
    }
    public void notaFinal(String alum) {
        int acumulador = 0;
        boolean encuentra = false;
        for (Alumnos recorre : nuevaLista) {
            if (alum.equalsIgnoreCase(recorre.getNombre())) {
                for (int i = 0; i < recorre.getListaNotas().size(); i++) {
                    acumulador = acumulador + recorre.getListaNotas().get(i); //Acumula las notas
                }
                System.out.println("Promedio de: " + recorre.getNombre() + " es: " + acumulador / recorre.getListaNotas().size());
                encuentra = true;
            }
        }
        if (encuentra == false) {
                System.out.println("No se encontro el nombre Adri no ta");
            }
    }
    public void ordenaAlumnos() {
        Collections.sort(nuevaLista,(Alumnos objeto2, Alumnos objeto1) -> objeto2.getNombre().compareTo(objeto1.getNombre()));
        muestraDatos();
    }
}
