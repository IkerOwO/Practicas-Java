package Practica2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Autor autor = new Autor("Jose", "Antonio", LocalDate.of(1999,10,1), GeneroLiterario.DIDACTICO);

        Libro libro = new Libro("Programacion POO", autor, "Edelvives", LocalDate.of(2004,10,20), "12012093902AD", 10.0);

        Libro libro2 = new Libro("Linux para novatos", autor, "Paraninfo", LocalDate.of(2010, 04, 11), "123982304DM", 20.0);

        // INSTANCIA BIBLIOTECA
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(libro);
        biblioteca.agregarLibro(libro2);
        biblioteca.mostrarBiblioteca();

        // BORRAR LIBROS
        biblioteca.eliminarLibro("123982304DM");
        biblioteca.eliminarLibro("111-22-333-4444-3"); // Lanza una excepción porque el libro no existe
        System.out.println();
        biblioteca.mostrarBiblioteca();

    }
}
