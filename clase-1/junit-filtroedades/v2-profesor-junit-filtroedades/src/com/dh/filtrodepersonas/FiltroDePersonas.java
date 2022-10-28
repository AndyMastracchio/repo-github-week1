package com.dh.filtrodepersonas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FiltroDePersonas {
    public List<Persona> filtrar(List<Persona> personas) {

        List<Persona> listadoPersonas = new ArrayList<>();

        for (Persona p : personas) {
            if (p.esMayorDeEdad()) {
                listadoPersonas.add(p);
            }
        }

        return listadoPersonas;

        /*return personas.stream()
                .filter(p -> p.esMayorDeEdad() && p.getNombre().length() > 5)
                .collect(Collectors.toList());*/
    }
}
