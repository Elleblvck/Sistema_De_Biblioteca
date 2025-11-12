package org.example;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros = new ArrayList<>();

    // 🏆 Mejora: Definición de una constante para la cadena literal
    private static final String PREFIJO_LIBRO = "El libro ";

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

    // --- CÓDIGO REFABRICADO ---
    // Metodo para prestar un libro por titulo
    public void prestarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                if (libro.prestar()) {
                    // Uso de la constante
                    System.out.println(PREFIJO_LIBRO + "\"" + titulo + "\" ha sido prestado.");
                } else {
                    // Uso de la constante
                    System.out.println(PREFIJO_LIBRO + "\"" + titulo + "\" ya esta prestado.");
                }
                return;
            }
        }
        // Uso de la constante
        System.out.println(PREFIJO_LIBRO + "\"" + titulo + "\" no se encuentra disponible.");
    }

    // Metodo para devolver un libro por titulo
    public void devolverLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                libro.devolver();
                // Uso de la constante
                System.out.println(PREFIJO_LIBRO + "\"" + titulo + "\" ha sido devuelto.");
                return;
            }
        }
        // Uso de la constante
        System.out.println(PREFIJO_LIBRO + "\"" + titulo + "\" no se encuentra en la biblioteca");
    }
}