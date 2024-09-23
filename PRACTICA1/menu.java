import java.util.Scanner;

public class menu {
    public static void main(String[]arg)
    {
        int op, op1, salir;
        Scanner temp = new Scanner(System.in);

        do{
        System.out.println("\nBienvenido al restaurante, te damos las siguientes opciones a elegir");
        System.out.println("1. Albondigas");
        System.out.println("2. Estofado");
        System.out.println("3. Hochos");
        System.out.println("4. Hamburguesas");
        System.out.println("5. Chilaquiles\n");
        System.out.print("-- Ingresa una opción: ");
        op = temp.nextInt();

        System.out.println("Para las bebidas tenemos las siguientes opciones:");
        System.out.println("1. Agua");
        System.out.println("2. Agua de limón");
        System.out.println("3. Agus de horchata");
        System.out.println("4. Agua de sandia");
        System.out.println("5. Agua de melon\n");
        System.out.print("-- Ingresa una opción: ");
        op1 = temp.nextInt();

        switch(op)
        {
            case 1:
            System.out.print("Albondigas y ");
            break;
            case 2:
            System.out.print("Estofado y ");
            break;
            case 3:
            System.out.print("Hochos y ");
            break;
            case 4:
            System.out.print("Hamburguesas y ");
            break;
            case 5:  
            System.out.print("Chilaquiles y ");
            break;
            default:
            break;
        }

        switch(op1)
        {
            case 1:
            System.out.println("Agua");
            break;
            case 2:
            System.out.println("Agua de limón");
            break;
            case 3:
            System.out.println("Agua de horchata");
            break;
            case 4:
            System.out.println("Agua de sandia");
            break;
            case 5:  
            System.out.println("Agua de melon");
            break;
            default:
            break;
        }
        System.out.println("¿Quieres salir? ");
        System.out.print("-- Ingresa una opción si = 0, no = 1: ");
        salir = temp.nextInt();
    }while(salir != 0);
    }
}   