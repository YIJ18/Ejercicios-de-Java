package BIBLIOTECA;

public class usuario {
    private String nombre;
    private String contrasena;

    public usuario(String nombre, String contrasena) {
        this.nombre = nombre;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContrasena() {
        return contrasena;
    }
}

