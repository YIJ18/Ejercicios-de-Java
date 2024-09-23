package INVENTARIO;

import java.util.Scanner;

public class tienda {
    Scanner entrada = new Scanner(System.in);
    String marca;
    String caducidad;
    Float precio;
    int cod_barras;
    float existencia;
    String unidad;


    public void PedirDatos()
    {
        System.out.println("Ingresa la marca del producto: ");
        marca = entrada.nextLine();
        System.out.println("Ingresa la caducidad");
        caducidad = entrada.nextLine();
        System.out.println("Ingresa el precio");
        precio = entrada.nextFloat();
        System.out.println("Ingresa código de barras");
        cod_barras = entrada.nextInt();
        System.out.println("Ingresa la existencia");
        existencia = entrada.nextFloat();
        System.out.println("Ingresa la unidad, kg, L, ml, g");
        unidad = entrada.nextLine();
    }

    public void MostrarDatos()
    {
        System.out.println("Marca: "+ marca);
        System.out.println("Caducidad: "+ caducidad);
        System.out.println("Precio: "+ precio);
        System.out.println("Cod_barras: "+ marca);
        System.out.println("Existencia: "+ existencia);
        System.out.println("Unidad: "+ unidad);

    }
}
