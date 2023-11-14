package com.andresmontoyalopez.domainam;

public abstract class Recursos {
    private boolean prestadoAndres;
    private String nombreAndres;

    public Recursos(String nombreAndres) {
        this.nombreAndres = nombreAndres;
        this.prestadoAndres = false;
    }

    public boolean isPrestadoAndres() {
        return prestadoAndres;
    }

    public String getNombreAndres() {
        return nombreAndres;
    }

    public void setNombreAndres(String nombreAndres) {
        this.nombreAndres = nombreAndres;
    }

    public void setPrestadoAndres(boolean prestadoAndres) {
        this.prestadoAndres = prestadoAndres;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombreAndres + ", Estado: " + (prestadoAndres ? "Prestado" : "Disponible");
    }
}
