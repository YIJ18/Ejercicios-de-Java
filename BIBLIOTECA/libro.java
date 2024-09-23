package BIBLIOTECA;

public class libro {
    private String autor;
    private String titulo;
    private String editorial;

    public libro(String autor, String titulo, String editorial) {
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEditorial() {
        return editorial;
    }
}
