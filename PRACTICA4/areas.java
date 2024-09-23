package PRACTICA4;

import java.util.Scanner;

public class areas {
    public static void main(String[] args) {
        int base, altura, radio;
        Scanner temp = new Scanner(System.in);
        System.out.print("\nIngresa la base: ");
        base = temp.nextInt();
        System.out.print("\nIngresa la altura: ");
        altura = temp.nextInt();
        System.out.print("\nIngresa el radio: ");
        radio = temp.nextInt();

        System.out.println("\nLas áreas son: \n");
        System.out.println("Rectangulo = " + altura * base);
        System.out.println("Triangulo = " + (altura * base) / 2.0);
        System.out.println("Circulo = " + (radio * radio) * 3.1416);
        System.out.println("Cuadrado = " + altura * base);

    }
}
