package test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;

class LibroTest {
    private ArrayList<Libro> libro;
    @BeforeEach
    void setUp() {
        libro = new ArrayList<Libro>();
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

    @Test
    public void testBuscarTitulo() {
        ArrayList<Libro> libroTest = new ArrayList<Libro>();
        Libro libro2 = new Libro("Libro2", new ArrayList<String>(){{add("Autor2"); add("Autor2");}}, "23/10/1992 02:15:15", 245, "Editorial2", "Genero2","21321123", 1, 3, "Prestado", "Descripcion libre de pruebas2");
        libroTest.add(libro2);
        ArrayList<Libro> busqueda = new Main().buscarTitulo(libro, "Libro2");
        assertEquals(libroTest.get(0).getTitulo(), busqueda.get(0).getTitulo(), "Fallo al buscar el titulo");
    }

    @Test
    public void testBuscarAutor() {
        ArrayList<Libro> libroTest = new ArrayList<Libro>();
        Libro libro2 = new Libro("Libro2", new ArrayList<String>(){{add("Autor2"); add("Autor2");}}, "23/10/1992 02:15:15", 245, "Editorial2", "Genero2","21321123", 1, 3, "Prestado", "Descripcion libre de pruebas2");
        libroTest.add(libro2);
        ArrayList<Libro> busqueda = new Main().buscarAutor(libro, "Autor2");
        assertArrayEquals(libroTest.get(0).getAutor().toArray(), busqueda.get(0).getAutor().toArray(), "Fallo al buscar el titulo");
    }

    @Test
    public void testBuscarISBN() {
        ArrayList<Libro> libroTest = new ArrayList<Libro>();
        Libro libro2 = new Libro("Libro2", new ArrayList<String>(){{add("Autor2"); add("Autor2");}}, "23/10/1992 02:15:15", 245, "Editorial2", "Genero2","21321123", 1, 3, "Prestado", "Descripcion libre de pruebas2");
        libroTest.add(libro2);
        ArrayList<Libro> busqueda = new Main().buscarISBN(libro, "21321123");
        assertEquals(libroTest.get(0).getISBN(), busqueda.get(0).getISBN(), "Fallo al buscar el titulo");
    }
}