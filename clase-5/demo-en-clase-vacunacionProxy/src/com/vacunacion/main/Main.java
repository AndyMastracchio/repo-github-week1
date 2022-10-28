package com.vacunacion.main;

import com.vacunacion.modelo.Persona;
import com.vacunacion.registro.Registrable;
import com.vacunacion.registro.impl.RegistroVacunaProxy;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2021, 6, 5);

        Persona persona = new Persona("Juan", "Vacunado", "342342342",
                "Pfizer", date);

        Registrable registro = new RegistroVacunaProxy();
        registro.registrar(persona.datos());
    }
}
