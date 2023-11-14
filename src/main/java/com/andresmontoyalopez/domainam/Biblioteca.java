package com.andresmontoyalopez.domainam;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List <Recursos> recursosAndres;

    public Biblioteca() {
        this.recursosAndres = new ArrayList<>();
    }


    public void addRecursoMontoya(Recursos rAndres) {
        if (rAndres instanceof Prestable) {
            ((Prestable) rAndres).prestarMontoya();
            ((Prestable) rAndres).devolverMontoya();
        }
        recursosAndres.add(rAndres);
    }
    public boolean prestarRecursoMontoya(Prestable pAndres) {
        pAndres.prestarMontoya();
        return false;
            /*else {
                System.out.println("El recurso " + recursosAndres + " no se puede prestar de la biblioteca");
                return true;
            }*/
    }
    public boolean devolverRecursoMontoya(Prestable pAndres){
        pAndres.devolverMontoya();
        return true;
    }
    public void listarPrestadosMontoya(){
        System.out.println("Recursos prestados:");
        for (Recursos recursoAndres : recursosAndres) {
            if (recursoAndres.isPrestadoAndres()) {
                System.out.println(recursoAndres);
            }
        }
    }

    public List<Recursos> getRecursosAndres() {
        return recursosAndres;
    }
}
