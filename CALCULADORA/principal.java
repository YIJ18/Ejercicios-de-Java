package CALCULADORA;

public class principal {
    public static void main (String[] args)
    {
        operaciones op= new operaciones();
        op.suma();
        System.out.println("La suma es: "+ op.retornarsuma());
        op.resta();
        System.out.println("La resta es: "+ op.retornarresta());
        op.division();
        System.out.println("La division es: "+ op.retornadivis());
        op.multiplicacion();
        System.out.println("La resta es: "+ op.retornamult());

    }
}
