package com.dh.liquidacionsueldo.main.service.impl;

import com.dh.liquidacionsueldo.main.model.Empleado;
import com.dh.liquidacionsueldo.main.model.EmpleadoContratado;
import com.dh.liquidacionsueldo.main.model.EmpleadoEfectivo;
import com.dh.liquidacionsueldo.main.service.Liquidador;

public class LiquidadorEmpleadoContratado extends Liquidador {

    @Override
    public void calcularSueldo(Empleado empleado) {
        if(empleado instanceof EmpleadoContratado){
            EmpleadoContratado empleadoContratado = (EmpleadoContratado) empleado;
            int sueldoFinal = empleadoContratado.getHorasTrabajadas() * empleadoContratado.getValorHora();
            empleadoContratado.setSueldo(sueldoFinal);
        }
    }
}
