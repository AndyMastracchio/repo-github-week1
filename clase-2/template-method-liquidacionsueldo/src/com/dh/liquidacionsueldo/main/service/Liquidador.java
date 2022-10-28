package com.dh.liquidacionsueldo.main.service;

import com.dh.liquidacionsueldo.main.model.Empleado;
import com.dh.liquidacionsueldo.main.model.EmpleadoContratado;
import com.dh.liquidacionsueldo.main.model.EmpleadoEfectivo;

public abstract class Liquidador {

    //Método plantilla (Template Method)
    void liquidarEmpleado(Empleado empleado) {
        calcularSueldo(empleado);
        generarRecibo(empleado);
        depositarSueldo(empleado);
    }

    public abstract void calcularSueldo(Empleado empleado);

    private void generarRecibo(Empleado empleado) {
        String mensajeDeRespuesta = "La liquidación no pudo ser calculada.";
        if (empleado instanceof EmpleadoEfectivo) {
            EmpleadoEfectivo empleadoEfectivo = (EmpleadoEfectivo) empleado;
            mensajeDeRespuesta = "La liquidación generada es un documento impreso. Saldo a liquidar: "
                    + empleadoEfectivo.getSueldo();
        } else {
            EmpleadoContratado empleadoContratado = (EmpleadoContratado) empleado;
            mensajeDeRespuesta = "La liquidación generada es un documento digital. Saldo a liquidar: "
                    + empleadoContratado.getSueldo();
        }
        System.out.println(mensajeDeRespuesta);
    }

    private void depositarSueldo(Empleado empleado){
        System.out.println("Sueldo depositado en la cuenta " + empleado.getNumeroDeCuenta());
    }
}
