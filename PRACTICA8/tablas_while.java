package PRACTICA8;

import java.util.Scanner;

public class tablas_while {
    static public void main (String[] args)
    {
        Scanner temp = new Scanner(System.in);
        int num, i = 1;

        System.out.println("Ingresa un número: ");
        num = temp.nextInt();
        System.out.println("Con  while");
        while(i <= 10)
        {
            System.out.println(num +"x" + i + "=" + i * num);
            i++;
        }
            i = 1;
            System.out.println("Con do - while");
        do 
        {
            System.out.println(num +"x" + i + "=" + i * num);
            i++;
        } while(i <= 10);

    }
}
