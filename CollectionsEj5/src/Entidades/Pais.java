/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Pais {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashSet <String> paises = new HashSet();//inicializo mi conjunto (NO aceptan elementos duplicados)
    public void ingresaPaises() {
        String salida = "n";
        do {
            System.out.println("Ingrese un país:");
            String paisIngresado = leer.next();
            System.out.println("Desea ingresar otro pais? S/N");
            salida = leer.next();
            paises.add(paisIngresado);

        } while (salida.equalsIgnoreCase("s"));
        System.out.println(paises);

    }
    public void ordenaYMuestraPaises(){
        ArrayList <String> paisesOrdenados = new ArrayList(paises); // convierte el Hasg a ArrayList
        Collections.sort(paisesOrdenados); //Ordenamos con .sort
        for (String paisesOrdenado : paisesOrdenados) {
            System.out.println(paisesOrdenado);
        } 
    }
}
