package com.dh.liquidacionsueldo.main;

import com.dh.liquidacionsueldo.main.model.Empleado;
import com.dh.liquidacionsueldo.main.model.EmpleadoContratado;
import com.dh.liquidacionsueldo.main.model.EmpleadoEfectivo;
import com.dh.liquidacionsueldo.main.service.Liquidador;
import com.dh.liquidacionsueldo.main.service.impl.LiquidadorEmpleadoContratado;
import com.dh.liquidacionsueldo.main.service.impl.LiquidadorEmpleadoEfectivo;

public class Main {

    public static void main(String[] args) {
        /*Map<String, Liquidador> liquidadores = new HashMap<>();
        liquidadores.put("Efectivo", new LiquidadorEmpleadoEfectivo());
        liquidadores.put("Contratado", new LiquidadorEmpleadoContratado());*/

        Empleado empleado1 = new EmpleadoContratado(
                "José",
                "Contratao",
                "AB12345",
                200, 650);
        Empleado empleado2 = new EmpleadoEfectivo(
                "Lorenzo",
                "Efetivizado",
                "AE13422",
                100000, 10000, 17000);

        Liquidador liquidadorEfectivo = new LiquidadorEmpleadoEfectivo();
        Liquidador liquidadorContratado = new LiquidadorEmpleadoContratado();

        System.out.println(liquidadorEfectivo.calcularSueldo(empleado2));
        System.out.println(liquidadorEfectivo.depositarSueldo(empleado2));

        System.out.println(liquidadorContratado.calcularSueldo(empleado1));
        System.out.println(liquidadorContratado.depositarSueldo(empleado1));
    }
}
