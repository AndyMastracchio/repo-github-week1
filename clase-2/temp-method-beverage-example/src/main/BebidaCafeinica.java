package main;

public abstract class BebidaCafeinica {

    final void prepararReceta() {
        hervirAgua();
        colar();
        servir();
        agregarCondimento();
    }

    public void hervirAgua() {
        System.out.println("Hirviendo agua");
    }

    abstract void colar();

    private void servir() {
        System.out.println("Sirviendo café");
    }

    abstract void agregarCondimento();


}
