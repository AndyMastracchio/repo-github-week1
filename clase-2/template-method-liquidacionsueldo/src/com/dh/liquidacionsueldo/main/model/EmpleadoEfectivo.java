package com.dh.liquidacionsueldo.main.model;

public class EmpleadoEfectivo extends Empleado{
    private int sueldoBase;
    private int bonos;
    private int descuentos;

    public EmpleadoEfectivo(String nombre, String apellido, String numeroDeCuenta,
                            int sueldoBase, int bonos, int descuentos) {
        super(nombre, apellido, numeroDeCuenta);
        this.sueldoBase = sueldoBase;
        this.bonos = bonos;
        this.descuentos = descuentos;
    }

    public EmpleadoEfectivo(String nombre, String apellido, String numeroDeCuenta, int sueldo,
                            int sueldoBase, int bonos, int descuentos) {
        super(nombre, apellido, numeroDeCuenta, sueldo);
        this.sueldoBase = sueldoBase;
        this.bonos = bonos;
        this.descuentos = descuentos;
    }

    public int getSueldoBase() {
        return this.sueldoBase;
    }

    public int getBonos() {
        return this.bonos;
    }

    public int getDescuentos() {
        return this.descuentos;
    }

    public void setSueldoBase(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public void setBonos(int bonos) {
        this.bonos = bonos;
    }

    public void setDescuentos(int descuentos) {
        this.descuentos = descuentos;
    }
}
