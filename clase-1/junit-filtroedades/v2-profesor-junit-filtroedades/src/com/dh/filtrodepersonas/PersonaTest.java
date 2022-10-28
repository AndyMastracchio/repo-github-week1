package com.dh.filtrodepersonas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonaTest {

    @Test
    public void esMayorDeEdad_deberiaRetornarVerdaderoCuandoLaEsadEsMayorQue18(){
        //GIVEN
        Persona sujetoDePrueba = new Persona("Juancho", 18);

        //WHEN
        boolean respuesta = sujetoDePrueba.esMayorDeEdad();

        //THEN
        Assertions.assertTrue(respuesta);
    }
}
