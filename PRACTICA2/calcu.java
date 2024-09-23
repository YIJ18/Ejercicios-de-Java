import java.util.Scanner;

public class calcu {
    public static void main(String[] args) {
        int opc1;
        int num1, num2;
        double div, mult, sum, res;

        System.out.println("Ingresa el primer número : ");
        Scanner numero1 = new Scanner(System.in);
        num1 = numero1.nextInt();

        System.out.println("Ingreses el número 2: ");
        Scanner numero2 = new Scanner(System.in);
        num2 = numero2.nextInt();

        sum = num1+num2;
        div = (double) num1/num2;
        res = num1 - num2;
        mult = num1*num2;

        System.out.println("1. Suma: " + sum);
        System.out.println("2. Resta: " + res);
        System.out.println("3. Multiplicación: " + mult);
        System.out.println("4. Division: " + div);
    }
}
