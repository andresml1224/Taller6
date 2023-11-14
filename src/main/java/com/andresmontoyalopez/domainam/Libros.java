package com.andresmontoyalopez.domainam;

public class Libros extends Recursos implements Prestable{
    public Libros(String nombreAndres) {
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
