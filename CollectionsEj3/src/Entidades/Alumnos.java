package Entidades;

import java.util.ArrayList;

public class Alumnos {
    private String nombre;
    private ArrayList<Integer> listaNotas = new ArrayList();

    public Alumnos() {
    }

    public Alumnos(String nombre) {
        this.nombre = nombre;

    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Integer> getListaNotas() {
        return listaNotas;
    }
    
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setListaNotas(ArrayList<Integer> listaNotas) {
        this.listaNotas = listaNotas;
    }
    
    
    @Override
    public String toString() {
        return "Alumnos{" + "nombre=" + nombre + ", listaNotas=" + listaNotas + '}';
    }
    
}
