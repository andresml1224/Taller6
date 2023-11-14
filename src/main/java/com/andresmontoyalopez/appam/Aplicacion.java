package com.andresmontoyalopez.appam;

import com.andresmontoyalopez.domainam.*;

public class Aplicacion {
    public static void main(String[] args) {
        Biblioteca bibliotecaAndres = new Biblioteca();
        bibliotecaAndres.addRecursoMontoya(new Libros("El Quijote"));
        bibliotecaAndres.addRecursoMontoya(new Revistas("National Geographic"));
        bibliotecaAndres.addRecursoMontoya(new DVD("DVD de cocina 1"));
        bibliotecaAndres.addRecursoMontoya(new Tesis("Consecuencias del calentamiento global"));
        bibliotecaAndres.addRecursoMontoya(new Guias("Fundamentos informaticos"));

        bibliotecaAndres.prestarRecursoMontoya((Prestable) bibliotecaAndres.getRecursosAndres().get(0));

        bibliotecaAndres.devolverRecursoMontoya((Prestable) bibliotecaAndres.getRecursosAndres().get(1));
        bibliotecaAndres.prestarRecursoMontoya((Prestable) bibliotecaAndres.getRecursosAndres().get(2));

        bibliotecaAndres.devolverRecursoMontoya((Prestable) bibliotecaAndres.getRecursosAndres().get(0));
        //bibliotecaAndres.prestarRecursoMontoya((Prestable) bibliotecaAndres.getRecursosAndres().get(3));

        bibliotecaAndres.listarPrestadosMontoya();
    }
}
