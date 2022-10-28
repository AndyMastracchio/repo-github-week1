package com.vacunacion.registro.impl;

import com.vacunacion.registro.Registrable;

import java.time.LocalDate;

public class RegistroVacunaProxy implements Registrable {

    @Override
    public void registrar(Object[] datos) {
        if (comprobarFecha((LocalDate) (datos[1]))) {
            RegistroVacuna registroVacuna = new RegistroVacuna();
            registroVacuna.registrar(datos);
        }
    }

    public boolean comprobarFecha(LocalDate fecha) {
        return fecha.isBefore(LocalDate.now());
    }
}
