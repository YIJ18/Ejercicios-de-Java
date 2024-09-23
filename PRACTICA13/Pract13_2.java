package PRACTICA13;

    /*
 Practica 13
 Como declarar un arreglo:
 tipo [] nombre = new tipo [espacio];
 Ivan Perfecto
*/

import java.util.Scanner;

public class Pract13_2{
    public static void main (String [] args){
        int [] nums = new int [10];
        int x, neg = 0, pos = 0, ceros = 0, x2;
        
        Scanner scanner = new Scanner (System.in);
        
        for (x = 0; x < nums.length; x ++){
            x2 = x + 1;
            System.out.println ("Ingresa numero [" + x2 +  "]: ");
            nums [x] = scanner.nextInt();
            
            if (nums [x] > 0){
                pos ++;
            }
            else if (nums [x] < 0){
                neg ++;
            }
            else {
                ceros++;
            }
        }
        System.out.println ("\nNumeros positivos: " + pos);
        System.out.println ("Numeros negativos: " + neg);
        System.out.println ("Ceros: "+ ceros);
        scanner.close();
    }
}

