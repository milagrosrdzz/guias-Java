package Servicios;
import Entidades.Peliculas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ClaseServicios {
    ArrayList<Peliculas> listaPeliculas = new ArrayList();
    private Scanner leer;
    public ClaseServicios() {
        listaPeliculas = new ArrayList();
        leer = new Scanner(System.in).useDelimiter("\n");
    }
    public void cargaPelis(){
        String salida = "n";     
        do {
            System.out.println("Nombre de la peli: ");
            String nombre = leer.next();
            System.out.println("Director de la peli: ");
            String director = leer.next();
            System.out.println("Duración de la pelicula: ");
            Integer duracion = leer.nextInt();
            Peliculas nuevaPeli = new Peliculas(nombre, director, duracion);
            listaPeliculas.add(nuevaPeli);
            System.out.println("Desea agregar otra pelicula?S/N");
            salida = leer.next();
        } while (salida.equalsIgnoreCase("S"));
    }
    public void imprimeTodo(){
        for (Peliculas listaPelicula : listaPeliculas) {
            System.out.println("TITULO " + listaPelicula.getTitulo() + " DIRECTOR " + listaPelicula.getDirector()
                    + " DURACION "+ listaPelicula.getDuracion());
        }
    }
    public void mayorUnaHora(){
        for (Peliculas listaPelicula : listaPeliculas) {
            if (listaPelicula.getDuracion()>60) {
                System.out.println(listaPelicula.toString());
            }
        }
    }
    public void mayoraMenorDuracion() {
        Collections.sort(listaPeliculas,
                (Peliculas objeto1, Peliculas objeto2) -> objeto2.getDuracion().compareTo(objeto1.getDuracion()));
        System.out.println("Mayor a menor ");
        imprimeTodo();
    }
     public void menorAMayorDuracion() {
        Collections.sort(listaPeliculas,
                (Peliculas objeto2, Peliculas objeto1) -> objeto2.getDuracion().compareTo(objeto1.getDuracion()));
        System.out.println("Menor a mayor ");
        imprimeTodo();
    }
    public void ordenaTitulos(){
        Collections.sort(listaPeliculas,
                (Peliculas objeto1, Peliculas objeto2) -> objeto1.getTitulo().compareTo(objeto2.getTitulo()));
        System.out.println("Orden Titulos ");
        imprimeTodo();
    }
     public void ordenaDirector(){
        Collections.sort(listaPeliculas,
                (Peliculas objeto1, Peliculas objeto2) -> objeto1.getDirector().compareTo(objeto2.getDirector()));
         System.out.println("Orden Director ");
        imprimeTodo();
    }
}
