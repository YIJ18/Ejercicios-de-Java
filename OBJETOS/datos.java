package OBJETOS;

import java.util.Scanner;

public class datos {
    String nombre;
    int edad;

    Scanner temp = new Scanner(System.in);

    public void pedirNombre() //metodo para pedir nombre
    {
        System.out.println("Ingrese un nombre");
        nombre = temp.nextLine();
    }

    public void pedirEdad()
    {
        System.out.println("Ingresa edad");
        edad = temp.nextInt();
    }

    public String regresarNombre()
    {
        return nombre;
    }

    public int regresarEdad()
    {
        return edad;
    }

}
