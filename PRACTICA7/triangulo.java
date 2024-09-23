package PRACTICA7;

import java.util.Scanner;

public class triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i, j, k, filas;

        System.out.print("Ingresa el número de filas para la pirámide: ");
        filas = scanner.nextInt();

        for (i = 0; i < filas; i++) {
            for (j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (i = 1; i <= filas; i++) {
            for (j = 1; j <= filas - i; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
