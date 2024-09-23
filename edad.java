

import java.util.Scanner;

public class edad{
    public static void main (String [] args){
        int edad = 10;

        Scanner scanner = new Scanner (System.in);
        System.out.println ("Ingresa numero ");
            edad = scanner.nextInt();

        if (edad >= 18)
        {
            System.out.println("Eres mayor de edad");
        }
        else
        System.out.println("No lo eres");
        scanner.close();
    }
}
