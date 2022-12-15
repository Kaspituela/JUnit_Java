package test;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public ArrayList<Libro> buscarTitulo(ArrayList<Libro> libros, String titulo){
        ArrayList<Libro> auxLibro = new ArrayList<Libro>();
        for(int i = 0; i < libros.size(); i++){
            if(libros.get(i).getTitulo().equals(titulo)){
                auxLibro.add(libros.get(i));
            }
        }
        return auxLibro;
    }

    public ArrayList<Libro> buscarISBN(ArrayList<Libro> libros, String isbn){
        ArrayList<Libro> auxLibro = new ArrayList<Libro>();
        for(int i = 0; i < libros.size(); i++){
            if(libros.get(i).getISBN().equals(isbn)){
                auxLibro.add(libros.get(i));
            }
        }
        return auxLibro;
    }
    public ArrayList<Libro> buscarAutor(ArrayList<Libro> libros, String autor){
        ArrayList<Libro> auxLibro = new ArrayList<Libro>();
        for(int i = 0; i < libros.size(); i++){
            if(libros.get(i).getAutor().contains(autor)){
                auxLibro.add(libros.get(i));
            }
        }
        return auxLibro;
    }

    public void printLibros(ArrayList<Libro> libros){
        for(int i = 0; i < libros.size(); i++){
                    System.out.println("Titulo: "+ libros.get(i).getTitulo());
                    for( int j = 0; j < libros.get(i).getAutor().size(); j++){
                        System.out.println("Autor"+ j + ": "+ libros.get(i).getAutor().get(j));
                    }
                    System.out.println("Editorial: "+ libros.get(i).getEditorial());
                    System.out.println("Genero: "+ libros.get(i).getGenero());
                    System.out.println("Numero de paginas: "+ libros.get(i).getNumPaginas());
                    System.out.println("ISBN: "+ libros.get(i).getISBN());
                    System.out.println("Estado: "+ libros.get(i).getEstado());
                    System.out.println("Descripcion: "+ libros.get(i).getDescripcion());
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");

                }
    }

    public static void main(String[] args) {
        ArrayList<Libro> libro = new ArrayList<Libro>();
        Scanner inputScanner = new Scanner(System.in);
        String input, input2, inputTitulo;
        while (true) {
            System.out.println("\nBienvenido a la biblioteca municipal, elige una opcion:");
            // Opciones
            System.out.println("[1] Ver libros");
            System.out.println("[2] Buscar libros");
            System.out.println("[3] Editar Libro");
            System.out.println("[4] Eliminar Libro");
            System.out.println("[5] Cambia de Estado");
            System.out.println("[6] Cargar libros");

            // Leer input
            input = inputScanner.nextLine().trim();
            int intInput;
            try {
                intInput = Integer.parseInt(input);
            }
            catch (Exception e) {
                System.out.println("Opción inválida. Por favor inténtelo nuevamente.");
                continue;
            }
            //Print libros
            if (intInput == 1) {
                new Main().printLibros(libro);
            }
            //Busqueda
            if (intInput == 2) {
                System.out.println("[1] Titulo");
                System.out.println("[2] Autor");
                System.out.println("[3] ISBN");

                // Leer input
                input2 = inputScanner.nextLine().trim();
                int intInput2;
                try {
                    intInput2 = Integer.parseInt(input2);
                }
                catch (Exception e) {
                    System.out.println("Opción inválida. Por favor inténtelo nuevamente.");
                    continue;
                }
                ArrayList<Libro> auxLibro = new ArrayList<Libro>();
                if (intInput2 == 1){
                    System.out.println("Ingrese titulo");
                    inputTitulo = inputScanner.nextLine().trim();
                    auxLibro = new Main().buscarTitulo(libro, inputTitulo);
                }

                if (intInput2 == 2){
                    System.out.println("Ingrese Autor");
                    inputTitulo = inputScanner.nextLine().trim();
                    auxLibro = new Main().buscarAutor(libro, inputTitulo);
                }

                if (intInput2 == 3){
                    System.out.println("Ingrese ISBN");
                    inputTitulo = inputScanner.nextLine().trim();
                    auxLibro = new Main().buscarISBN(libro, inputTitulo);
                }
                new Main().printLibros(auxLibro);
            }
            //Editar
            if (intInput == 3) {
                for(int i = 0; i < libro.size(); i++){
                    System.out.println("["+(i+1)+"] Titulo: "+ libro.get(i).getTitulo());
                }
                System.out.println("Ingrese el número del libro");
                input = inputScanner.nextLine().trim();
                try {
                    intInput = Integer.parseInt(input);
                }
                catch (Exception e) {
                    System.out.println("Opción inválida. Por favor inténtelo nuevamente.");
                    continue;
                }
                System.out.println("[1] Titulo");
                System.out.println("[2] Numero Paginas");
                System.out.println("[3] Editorial");
                System.out.println("[4] Genero");
                System.out.println("[5] ISBN");
                System.out.println("[6] Descripcion");
                input2 = inputScanner.nextLine().trim();
                int intInput2;
                try {
                    intInput2 = Integer.parseInt(input2);
                }
                catch (Exception e) {
                    System.out.println("Opción inválida. Por favor inténtelo nuevamente.");
                    continue;
                }
                if(intInput2 == 1){
                    System.out.println("Ingrese Titulo");
                    inputTitulo = inputScanner.nextLine().trim();
                    libro.get(intInput-1).setTitulo(inputTitulo);
                }

                if(intInput2 == 2){
                    System.out.println("Ingrese Numero Paginas");
                    inputTitulo = inputScanner.nextLine().trim();
                    try {
                    intInput2 = Integer.parseInt(inputTitulo);
                    }
                    catch (Exception e) {
                        System.out.println("Opción inválida. Por favor inténtelo nuevamente.");
                        continue;
                    }
                    libro.get(intInput-1).setNumPaginas(intInput2);
                }

                if(intInput2 == 3){
                    System.out.println("Ingrese Editorial");
                    inputTitulo = inputScanner.nextLine().trim();
                    libro.get(intInput-1).setEditorial(inputTitulo);
                }

                if(intInput2 == 4){
                    System.out.println("Ingrese Genero");
                    inputTitulo = inputScanner.nextLine().trim();
                    libro.get(intInput-1).setGenero(inputTitulo);
                }

                if(intInput2 == 5){
                    System.out.println("Ingrese ISBN");
                    inputTitulo = inputScanner.nextLine().trim();
                    libro.get(intInput-1).setISBN(inputTitulo);
                }

                if(intInput2 == 6){
                    System.out.println("Ingrese Descripcion");
                    inputTitulo = inputScanner.nextLine().trim();
                    libro.get(intInput-1).setDescripcion(inputTitulo);
                }
            }
            
            if (intInput == 4){
                for(int i = 0; i < libro.size(); i++){
                    System.out.println("["+(i+1)+"] Titulo: "+ libro.get(i).getTitulo());
                }
                System.out.println("Ingrese el número del libro");
                input = inputScanner.nextLine().trim();
                try {
                    intInput = Integer.parseInt(input);
                }
                catch (Exception e) {
                    System.out.println("Opción inválida. Por favor inténtelo nuevamente.");
                    continue;
                }

                try {
                    libro.remove(intInput-1);
                } 
                catch (Exception e) {
                    System.out.println("Error al eliminar un libro");
                    continue;
                }
            
            }

            if (intInput == 5){
                for(int i = 0; i < libro.size(); i++){
                    System.out.println("["+(i+1)+"] Titulo: "+ libro.get(i).getTitulo());
                }
                System.out.println("Ingrese el número del libro");
                input = inputScanner.nextLine().trim();
                try {
                    intInput = Integer.parseInt(input);
                }
                catch (Exception e) {
                    System.out.println("Opción inválida. Por favor inténtelo nuevamente.");
                    continue;
                }
                System.out.println("Elige el estado");
                System.out.println("[1] Prestado");
                System.out.println("[2] Disponible");
                System.out.println("[3] Extraviado");
                input2 = inputScanner.nextLine().trim();
                int intInput2;
                try {
                    intInput2 = Integer.parseInt(input2);
                }
                catch (Exception e) {
                    System.out.println("Opción inválida. Por favor inténtelo nuevamente.");
                    continue;
                }

                if(intInput2 == 1){
                    libro.get(intInput-1).setEstado("Prestado");
                }

                if(intInput2 == 2){
                    libro.get(intInput-1).setEstado("Disponible");
                }

                if(intInput2 == 3){
                    libro.get(intInput-1).setEstado("Extraviado");
                }

            }
            if (intInput == 6) {
                Libro libro1 = new Libro("Libro", new ArrayList<String>(){{add("Autor"); add("Autor");}}, "23/10/1992 02:15:15", 245, "Editorial", "Genero","12312312", 1, 3, "Disponible", "Descripcion libre de pruebas");
                Libro libro2 = new Libro("Libro2", new ArrayList<String>(){{add("Autor2"); add("Autor2");}}, "23/10/1992 02:15:15", 245, "Editorial2", "Genero2","21321123", 1, 3, "Prestado", "Descripcion libre de pruebas2");
                Libro libro3 = new Libro("Libro3", new ArrayList<String>(){{add("Autor3"); add("Autor3");}}, "23/10/1992 02:15:15", 245, "Editorial3", "Genero3","213123123", 1, 3, "Prestado", "Descripcion libre de pruebas3");
                Libro libro4 = new Libro("Libro4", new ArrayList<String>(){{add("Autor4"); add("Autor4");}}, "23/10/1992 02:15:15", 245, "Editorial4", "Genero4","828773", 1, 3, "Extraviado", "Descripcion libre de pruebas4");
                Libro libro5 = new Libro("Libro5", new ArrayList<String>(){{add("Autor5"); add("Autor5");}}, "23/10/1992 02:15:15", 245, "Editorial5", "Genero5","81235", 1, 3, "Disponible", "Descripcion libre de pruebas5");
                libro.add(libro1);
                libro.add(libro2);
                libro.add(libro3);
                libro.add(libro4);
                libro.add(libro5);
            }
        }
    }
}