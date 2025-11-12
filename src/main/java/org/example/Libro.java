package org.example;

public class Libro {
    private String titulo;
    private String autor;
    private boolean disponible;

    //Constructor
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true; // Por defecto, el libro se encuentra disponible
    }

    //Metodos Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    //Metodo para prestar el libro
    public boolean prestar() {
        if(disponible) {
            disponible = false;
            return true; // Prestamo con exito
        }
        return false; //No se puede prestar
    }

    // Metodo apra devolver el libro
    public void devolver() {
        disponible = true;
    }

    // Metodo para mostrar informaci[on del libro
    public void mostrarInformacion() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Estado: " + (disponible ? "Disponible" : "Prestado"));
    }
}
