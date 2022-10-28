package com.dh.filtrodepersonas;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Persona> personas = new ArrayList<>();
        FiltroDePersonas filtroDePersonas = new FiltroDePersonas();

        personas.add(new Persona("Juan", 19));
        personas.add(new Persona("Pedro", 17));
        personas.add(new Persona("Ana", 15));
        personas.add(new Persona("Alessandra", 20));
        personas.add(new Persona("Julián", 19));

        List<Persona> listaFinal = filtroDePersonas.filtrar(personas);

        System.out.println(listaFinal.size());
        listaFinal.forEach(p -> System.out.println("Nombre: " + p.getNombre() + ", Edad: " + p.getEdad()));

        /*Persona juan = new Persona("Juan", 19);
        Persona pedro = new Persona("Pedro", 17);
        Persona ana = new Persona("Ana", 15);
        Persona luz = new Persona("Alessandra", 20);
        Persona julian = new Persona("Julián", 19);*/
    }
}
