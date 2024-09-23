package BIBLIOTECA;

import java.util.Scanner;

public class biblioteca {

    static usuario[] usuarios = {
            new usuario("Ivan", "Perfecto"),
            new usuario("Daniela", "Mendez"),
    };

    static libro[] libros = {
            new libro("Gabriel García Márquez", "Cien años de soledad", "Editorial Sudamericana"),
            new libro("George Orwell", "1984", "Penguin Random House"),
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Autenticación de usuario
        System.out.print("Ingrese su usuario: ");
        String usuario = scanner.nextLine();
        System.out.print("Ingrese su contraseña: ");
        String contrasena = scanner.nextLine();

        if (autenticarUsuario(usuario, contrasena)) {
            // Búsqueda de libros
            System.out.println("\nBúsqueda de libros:");
            System.out.print("Ingrese el autor del libro: ");
            String autorBusqueda = scanner.nextLine();
            buscarLibrosPorAutor(autorBusqueda);

            System.out.print("Ingrese el título del libro: ");
            String tituloBusqueda = scanner.nextLine();
            buscarLibrosPorTitulo(tituloBusqueda);

            System.out.print("Ingrese la editorial del libro: ");
            String editorialBusqueda = scanner.nextLine();
            buscarLibrosPorEditorial(editorialBusqueda);
        } else {
            System.out.println("Autenticación fallida. El programa se cerrará.");
        }
    }

    // Función para autenticar usuarios
    private static boolean autenticarUsuario(String usuario, String contrasena) {
        for (usuario credencial : usuarios) {
            if (credencial.getNombre().equals(usuario) && credencial.getContrasena().equals(contrasena)) {
                return true;
            }
        }
        return false;
    }

    // Función para buscar libros por autor
    private static void buscarLibrosPorAutor(String autor) {
        System.out.println("\nLibros encontrados por autor '" + autor + "':");
        for (libro libro : libros) {
            if (libro.getAutor().equalsIgnoreCase(autor)) {
                System.out.println("Título: " + libro.getTitulo() + ", Editorial: " + libro.getEditorial());
            }
        }
    }

    // Función para buscar libros por título
    private static void buscarLibrosPorTitulo(String titulo) {
        System.out.println("\nLibros encontrados por título '" + titulo + "':");
        for (libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Autor: " + libro.getAutor() + ", Editorial: " + libro.getEditorial());
            }
        }
    }

    // Función para buscar libros por editorial
    private static void buscarLibrosPorEditorial(String editorial) {
        System.out.println("\nLibros encontrados por editorial '" + editorial + "':");
        for (libro libro : libros) {
            if (libro.getEditorial().equalsIgnoreCase(editorial)) {
                System.out.println("Autor: " + libro.getAutor() + ", Título: " + libro.getTitulo());
            }
        }
    }
}
