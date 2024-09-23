package PRACTICA5;

import java.util.Scanner;

public class estacionamiento {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        int inicio_h, inicio_m, fin_h, fin_m, hora, minuto, pago = 0;

        System.out.println("Ingresa la hora a la que ingresaste: ");
        inicio_h = temp.nextInt();
        System.out.println("Ingresa el minuto a la que ingresaste: ");
        inicio_m = temp.nextInt();
        System.out.println("Ingresa la hora a la que saliste: ");
        fin_h = temp.nextInt();
        System.out.println("Ingresa el minuto a la que saliste: ");
        fin_m = temp.nextInt();

        hora = fin_h - inicio_h;
        minuto = fin_m - inicio_m;

        if (hora >= 7 || (hora == 6 && minuto > 0)) {
            pago = 100;  
        } else {
            if (hora > 0) {
                pago = hora * 15;
            }

            if (minuto != 0) {
                pago += 15;
            }
        }

        System.out.println("El total a pagar es de: " + pago);
    }
}
