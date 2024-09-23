package PERSONA;

import java.util.Scanner;

public class padre {
    Scanner entrada = new Scanner(System.in);
    String nombre;
    int edad;
    String genero;
   

    public void PedirDatos()
    {
        System.out.println("Ingresa el nombre");
        nombre =  entrada.nextLine();
        System.out.println("Ingresa el edad");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingresa el genero");
        genero =  entrada.nextLine();

    }

    public void MostrarDatos()
    {
        System.out.println(nombre+" "+edad+" "+genero);
    }
}
