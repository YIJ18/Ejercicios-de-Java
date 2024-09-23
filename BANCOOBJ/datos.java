package BANCOOBJ;
import java.util.Scanner;

public class datos {
    String contrasena;
    String usuario;
    Double dinero, cantidad;
    int op;
    Scanner temp = new Scanner(System.in);

    public void menu()
    {
        System.out.println("Elige la opción que se adecue a tus necesidades: ");
        System.out.println("1. Registrarse");
        System.out.println("2. Ingresar");
        System.out.println("3. Salir");
        op = temp.nextInt();
    }

    public void submenu1()
    {
        System.out.println("Elige la opción que se adecue a tus necesidades: ");
        System.out.println("1. Ingresar ");
        System.out.println("2. Retirar efectivo ");
        System.out.println("3. Salir");
        op = temp.nextInt();
    }

    public void pedir_usuario()
    {
        System.out.println("Ingresa el usuario: ");
        usuario = temp.nextLine();
    }

    public void pedir_contrasena()
    {
        System.out.println("Ingresa el contrasena: ");
        usuario = temp.nextLine();
    }

    public void ingresar_din()
    {
        System.out.println("Ingrese la cantidad de dinero que quiere ingresar: ");
        cantidad = temp.nextDouble();
        dinero = dinero + cantidad;
    }

    public void retire_din()
    {
        System.out.println("Ingrese la cantidad de dinero que quiere retirar: ");
        cantidad = temp.nextDouble();
        dinero = dinero - cantidad;
    }
    
    public String regresar_usuario()
    {
        return  usuario;
    }

    public String regresar_contrasena()
    {
        return  contrasena;
    }

    public Double regresar_din()
    {
        return dinero;
    }

    public int regresa_opcion()
    {
        return op;
    }

}
