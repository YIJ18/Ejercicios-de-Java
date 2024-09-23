package CALCULADORA;

import java.util.Scanner;

public class operaciones {
    int num1;
    int num2;
    double suma, mult, div, res;

    Scanner temp = new Scanner(System.in);
    
    public void suma()
    {
        System.out.println("Ingrese un num1");
        num1 = temp.nextInt();
        System.out.println("Ingrese un num2");
        num1 = temp.nextInt();

        suma = num1 + num2;
    }

    public double retornarsuma()
    {
        return suma;
    }

    public void resta()
    {
        System.out.println("Ingrese un num1");
        num1 = temp.nextInt();
        System.out.println("Ingrese un num2");
        num1 = temp.nextInt();

        res = num1 - num2;
    }

    public double retornarresta()
    {
        return res;
    }

    public void multiplicacion()
    {
        System.out.println("Ingrese un num1");
        num1 = temp.nextInt();
        System.out.println("Ingrese un num2");
        num1 = temp.nextInt();

        mult = num1 * num2;
    }

    public double retornamult()
    {
        return mult;
    }

    public void division()
    {
        System.out.println("Ingrese un num1");
        num1 = temp.nextInt();
        System.out.println("Ingrese un num2");
        num1 = temp.nextInt();

        div = (double)num1 / num2;
    }

    public double retornadivis()
    {
        return div;
    }
}
