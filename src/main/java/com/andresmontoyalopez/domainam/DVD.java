package com.andresmontoyalopez.domainam;

public class DVD extends Recursos implements Prestable{


    public DVD(String nombreAndres) {
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
