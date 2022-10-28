package com.dh.chainofresponsability;

import com.dh.chainofresponsability.chain.*;
import com.dh.chainofresponsability.model.Correo;

public class ValidadorDeCorreos {
    private Manejador inicial;
    //private final String MENSAJE_SPAM = "¡Ojo! Marcado como spam....";

    public ValidadorDeCorreos() {
        //Creamos los eslabones de la cadena....
        this.inicial = new ManejadorGerencia();
        Manejador comercial = new ManejadorComercial();
        Manejador tecnica = new ManejadorSoporteIT();
        Manejador spam = new ManejadorSpam();

        //Luego los unimos.
        inicial.setSiguiente(comercial);
        comercial.setSiguiente(tecnica);
        tecnica.setSiguiente(spam);
    }

    public String comprobar(Correo email) {
        //return !MENSAJE_SPAM.equalsIgnoreCase(inicial.comprobar( email ));
        return inicial.comprobar(email);
    }
}

