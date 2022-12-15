package test;

import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Libro {

    private String Titulo;
    private ArrayList<String> Autor;
    private String FechaEdicion;
    private int NumPaginas;
    private String Editorial;
    private String Genero;
    private String ISBN;
    private int UbicacionX;
    private int UbicacionY;
    private String Estado;
    private String Descripcion;

    // Constructores
    public Libro() {
        this.Titulo = "Aventuas de Prusoft";
        this.Autor = new ArrayList<String>() {{
            add("Pedro Picasso");
            add("Pedro Picasso2");
        }};
        this.FechaEdicion = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSS"));;
        this.NumPaginas = 233;
        this.Editorial = "Chepitos";
        this.Genero = "Thriller";
        this.ISBN = "123123123";
        this.UbicacionX = 3;
        this.UbicacionY = 5;
        this.Estado = "Disponible";
        this.Descripcion = "Descripcion de prueba";
    }

    public Libro(String Titulo, ArrayList<String> Autor, String FechaEdicion, int NumPaginas, String Editorial, String Genero, String ISBN, int UbicacionX, int UbicacionY, String Estado, String Descripcion) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.FechaEdicion = FechaEdicion;
        this.NumPaginas = NumPaginas;
        this.Editorial = Editorial;
        this.Genero = Genero;
        this.ISBN = ISBN;
        this.UbicacionX = UbicacionX;
        this.UbicacionY = UbicacionY;
        this.Estado = Estado;
        this.Descripcion = Descripcion;
    }

    // Getters
    public String getTitulo() {
        return Titulo;
    }

    public ArrayList<String> getAutor() {
        return Autor;
    }

    public String getFechaEdicion() {
        return FechaEdicion;
    }

    public int getNumPaginas() {
        return NumPaginas;
    }

    public String getEditorial() {
        return Editorial;
    }

    public String getGenero() {
        return Genero;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getUbicacionX() {
        return UbicacionX;
    }

    public int getUbicacionY() {
        return UbicacionY;
    }

    public String getEstado() {
        return Estado;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setAutor(ArrayList<String> Autor) {
        this.Autor = Autor;
    }

    public void setFechaEdicion(String FechaEdicion) {
        this.FechaEdicion = FechaEdicion;
    }

    public void setNumPaginas(int NumPaginas) {
        this.NumPaginas = NumPaginas;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setUbicacionX(int UbicacionX) {
        this.UbicacionX = UbicacionX;
    }

    public void setUbicacionY(int UbicacionY) {
        this.UbicacionY = UbicacionY;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
}