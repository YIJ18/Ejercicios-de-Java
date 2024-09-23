import java.util.Scanner;

public class teclado {
    public static void main(String[] args) {
        String nombre;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca su nombre: ");
        nombre = teclado.nextLine();
        System.out.println("Hola " + nombre);
    }
}
