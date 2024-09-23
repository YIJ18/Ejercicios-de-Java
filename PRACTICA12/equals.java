package PRACTICA12;
import java.util.Scanner;

public class equals {
    public static void main(String[] args)
    {
        Scanner temp = new Scanner(System.in);
        String cadena1, cadena2;
        System.out.println("Dame un nombre");
        cadena1=temp.nextLine();
        System.out.println("Dame un nombre");
        cadena2=temp.nextLine();

        if(cadena1.equals(cadena2))
        System.out.println("Las cadenas son iguales");
        else
        System.out.println("Las caedenas son diferentes");

    }
}
