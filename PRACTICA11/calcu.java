package PRACTICA11;

import java.util.Scanner;

public class calcu {
    public static void main(String[] arg) {
        int op1, salir = 1, i;
        float num1 = 0, num2 = 0, pot = 1;
        Scanner temp = new Scanner(System.in);

        do {
            num1 = 0; num2 = 0; pot = 1;
            System.out.println("\nBienvenido al restaurante, te damos las siguientes opciones a elegir");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Potencia");
            System.out.println("6. SALIR");
            op1 = temp.nextInt();

            if (op1 != 6) {
                System.out.print("Ingresa el primer numero: ");
                num1 = temp.nextInt();
                System.out.print("Ingrese el segundo numero: ");
                num2 = temp.nextInt();
            }
            switch (op1) {
                case 1:
                    System.out.println("EL RESULTADO DE LA SUMA ES: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("EL RESULTADO DE LA RESTA ES: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("EL RESULTADO DE LA MULTIPLICACIÓN ES: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("EL RESULTADO DE LA DIVISIÓN ES: " + (num1 / num2));
                    break;
                case 5:
                if (num2 == 0)
                    System.out.println("No quiero dividir entre 0");
                else{

                    for (i = 0; i < num2; i++)
                        pot *= num1;

                    System.out.println("EL RESULTADO DE LA POTENCIA ES: " + pot);
                }
                    break;
                case 6:
                    System.out.println("SALIR");
                    salir = 0;
                    break;
                default:
                    break;
            }
        } while (salir != 0);

    }
}