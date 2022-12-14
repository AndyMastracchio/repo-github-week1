package com.dh.liquidacionsueldo.main.model;

public class EmpleadoContratado extends Empleado {
    private int horasTrabajadas;
    private int valorHora;

    public EmpleadoContratado(String nombre, String apellido, String numeroDeCuenta,
                              int horasTrabajadas, int valorHora) {
        super(nombre, apellido, numeroDeCuenta);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    public EmpleadoContratado(String nombre, String apellido, String numeroDeCuenta, int sueldo,
                              int horasTrabajadas, int valorHora) {
        super(nombre, apellido, numeroDeCuenta, sueldo);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    public int getHorasTrabajadas() {
        return this.horasTrabajadas;
    }

    public int getValorHora() {
        return this.valorHora;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }
}
