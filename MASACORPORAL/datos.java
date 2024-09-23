package MASACORPORAL;

import java.util.Scanner;

public class datos {
    double kg, metros;
    Scanner temp = new Scanner(System.in);

    public void ingresar_datos()
    {
        System.out.println("Ingresa tu peso (kg): ");
        kg = temp.nextDouble();
        System.out.println("Ingresa tu altura (m): ");
        metros = temp.nextDouble();
    }

    public Double regresar_imc()
    {
        return  (kg / (metros*metros));
    }
    
}
