package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        // Agregar libros iniciales
        biblioteca.agregarLibro(new Libro("Cien Años de soledad", "Gabriel"));
        biblioteca.agregarLibro(new Libro("Don Quijote", "Miguel"));
        biblioteca.agregarLibro(new Libro("El Principito", "Antonie"));

        int opcion;

        do {
            System.out.println("\n=== Menu de Biblioteca ===");
            System.out.println("1. Mostrar todos los libros");
            System.out.println("2. Prestar un libro");
            System.out.println("3. Devolver un libro");
            System.out.println("4. Salir");
            System.out.println("Selecciona una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); //Consumir el salto de linea

            switch (opcion) {
                case 1:
                    biblioteca.mostrarLibros();
                    break;

                case 2:
                    System.out.println("Introduce el titulo del libro a prestar");
                    String tituloPrestar = scanner.nextLine();
                    biblioteca.prestarLibro(tituloPrestar);
                    break;

                case 3:
                    System.out.println("Introduce el titulo del libro a devolver");
                    String tituloDevolver = scanner.nextLine();
                    biblioteca.devolverLibro(tituloDevolver);
                    break;

                case 4:
                    System.out.println("Saliendo del sistema de Biblioteca.");
                    break;
            }
        } while (opcion != 4);

        scanner.close();
    }
}