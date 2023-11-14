package com.andresmontoyalopez.domainam;

public class Revistas extends Recursos implements Prestable{


    public Revistas(String nombreAndres) {
        super(nombreAndres);
    }

    @Override
    public void prestarMontoya() {
        this.setPrestadoAndres(true);
    }

    @Override
    public void devolverMontoya() {
        this.setPrestadoAndres(false);
    }
}
