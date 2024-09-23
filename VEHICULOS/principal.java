package VEHICULOS;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        vehiculo moto1 = new moto();
        vehiculo auto2 = new auto();
        vehiculo camion3 = new camion();
        int op;

        do{
        System.out.println("Ingresa el vehiculo que quiere visualizar: ");

        System.out.println("1. Moto");
        System.out.println("2. Auto");
        System.out.println("3. Camion");
        System.out.println("4. Salir");
        System.out.print("-- ");
        op = teclado.nextInt();

        if (op == 1)
            moto1.mostrar();
        else if (op == 2)
            auto2.mostrar();
        else if (op == 3)
            camion3.mostrar();

        }while(op!=4);
    }

}
