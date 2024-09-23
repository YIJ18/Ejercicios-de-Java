package CALCULADORA2;
import java.util.Scanner;

public class datos {
     static int valor1, valor2;
     //con static los valores son para todas las instancias
    int resultado;
    Scanner entrada = new Scanner(System.in);

    public void PedirDatos()
    {
        System.out.println("Ingresa el primer valor");
        valor1 = entrada.nextInt();
        System.out.println("Ingresa el primer valor");
        valor2 = entrada.nextInt();
    }

    public void mostrarDatos()
    {
     System.out.println(resultado);   
    }
    
}
