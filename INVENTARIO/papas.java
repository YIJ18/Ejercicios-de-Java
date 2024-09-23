package INVENTARIO;

public class papas extends tienda{
    String edicion;
    int picante;
    String presentacion;

    public void DatosPedir()
    {
        System.out.println("Ingresa la marca del edicion: ");
        edicion = entrada.nextLine();
        System.out.println("Ingresa la picante");
        picante = entrada.nextInt();
        System.out.println("Ingresa el presentacion");
        presentacion = entrada.nextLine();
    }
}
