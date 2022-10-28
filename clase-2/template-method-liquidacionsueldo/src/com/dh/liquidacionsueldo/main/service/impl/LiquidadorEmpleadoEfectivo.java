package com.dh.liquidacionsueldo.main.service.impl;

import com.dh.liquidacionsueldo.main.model.Empleado;
import com.dh.liquidacionsueldo.main.model.EmpleadoEfectivo;
import com.dh.liquidacionsueldo.main.service.Liquidador;

public class LiquidadorEmpleadoEfectivo extends Liquidador {
    @Override
    public void calcularSueldo(Empleado empleado) {
        if (empleado instanceof EmpleadoEfectivo) {
            EmpleadoEfectivo empleadoEfectivo = (EmpleadoEfectivo) empleado;
            int sueldoFinal = empleadoEfectivo.getSueldoBase()
                    + empleadoEfectivo.getBonos() - empleadoEfectivo.getDescuentos();
            empleadoEfectivo.setSueldo(sueldoFinal);
        }
    }
}
