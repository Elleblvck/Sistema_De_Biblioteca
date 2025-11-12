package org.example;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros = new ArrayList<>();

    // Metodo para agregar un libro a la biblioteca
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    // Metodo para mostrar todos los libros
    public void mostrarLibros() {
        for (Libro libro : libros) {
            libro.mostrarInformacion();
            System.out.println("-----------------");
        }
    }

    // Metodo para prestar un libro por titulo
    public void prestarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                if (libro.prestar()) {
                    System.out.println("El libro \"" + titulo + "\" ha sido prestado.");
                } else {
                    System.out.println("El libro \"" + titulo + "\" ya esta prestado.");
                }
                return;
            }
        }
        System.out.println("El libro \"" + titulo + "\" no se encuentra disponible.");
    }

    // Metodo para devolver un libro por titulo
    public void devolverLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                libro.devolver();
                System.out.println("El libro \"" + titulo + "\" ha sido devuelto.");
                return;
            }
        }
        System.out.println("El libro \"" + titulo + "\" no se encuentra en la biblioteca");
    }
}
