package main;

public class Cafe extends BebidaCafeinica {

    @Override
    void colar() {
        System.out.println("Colando café");
    }

    @Override
    void agregarCondimento() {
        System.out.println("Agregando azucar");
    }
}
