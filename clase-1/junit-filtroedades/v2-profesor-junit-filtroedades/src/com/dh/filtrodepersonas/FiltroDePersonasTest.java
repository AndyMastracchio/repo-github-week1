package com.dh.filtrodepersonas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FiltroDePersonasTest {

    /*Persona juan;
    Persona pedro;
    Persona ana;
    Persona luz;
    Persona julian;
    FiltroDePersonas filtro;*/

    @BeforeEach
    void setUp() {
        /*juan = new Persona("Juan", 19);
        pedro = new Persona("Pedro", 17);
        ana = new Persona("Ana", 15);
        luz = new Persona("Alessandra", 20);
        julian = new Persona("Julián", 19);
        filtro = new FiltroDePersonas();*/
    }

    @Test
    public void deberiaAgregarSoloLasPersonasQueCorrespondanConElCriterio() {
        //GIVEN
        Persona juan = new Persona("Juan", 19);
        Persona pedro = new Persona("Pedro", 17);
        Persona ana = new Persona("Ana", 15);
        Persona luz = new Persona("Alessandra", 20);
        Persona julian = new Persona("Julián", 19);
        FiltroDePersonas filtro = new FiltroDePersonas();

        //WHEN
        List<Persona> resultado = filtro.filtrar(List.of(juan, pedro, ana, luz, julian));

        //THEN
        Assertions.assertTrue(resultado.size() == 2);
        assertEquals(2, resultado.size());
    }

}
