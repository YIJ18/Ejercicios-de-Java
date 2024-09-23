package PRACTICA3;
import java.util.Scanner;
public class agenda {
    public static void main(String[] args) 
    {
        String nombre, direccion, celular, alias;
        Scanner temp = new Scanner(System.in);

        System.out.print("Introduzca su nombre: ");
        nombre = temp.nextLine();
        System.out.print("\nIntroduzca su direccion: ");
        direccion = temp.nextLine();
        System.out.print("\nIntroduzca su alias: ");
        alias = temp.nextLine();
        System.out.print("\nIntroduzca su celular: ");
        celular = temp.nextLine();

        System.out.println("\n\n" +alias);
        System.out.println("\n" + nombre);
        System.out.println(direccion);
        System.out.println("Telefono: " + celular);
    }
}
