import java.util.Scanner; // Biblioteca para solicitar numeros al usuario

public class scan_suma 
{
    public static void main(String[] args) 
    {
        int num1;
        int num2;

        System.out.println("Ingresa el primer número : ");
        Scanner numero1 = new Scanner(System.in);
        num1 = numero1.nextInt();

        System.out.println("Ingreses el número 2: ");
        Scanner numero2 = new Scanner(System.in);
        num2 = numero2.nextInt();

        int resultado = num1 + num2;

        System.out.println("EL resultado es: "+ resultado);
    }
}
