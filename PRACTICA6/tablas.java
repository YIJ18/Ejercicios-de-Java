package PRACTICA6;

import java.util.Scanner;

public class tablas {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        int n, i, mult;
        System.out.printf("Ingresa un número: ");
        n = temp.nextInt();

        for(i = 0; i < 10; ++i)
        {
            mult = i * n;
            System.out.println("La multiplicación de " + i + "x" + n + "=" + mult);
        }

    }
}