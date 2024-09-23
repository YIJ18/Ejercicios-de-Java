package INVENTARIO;

public class refresco extends tienda{
    String tipo;
    String cafeina;
    String envace;

    public void DatosRefresco()
    {
        System.out.println("Ingresa la marca del tipo: ");
        tipo = entrada.nextLine();
        System.out.println("Ingresa la cafeina");
        cafeina = entrada.nextLine();
        System.out.println("Ingresa el envace");
        envace = entrada.nextLine();
    }

    public void MostrarRefresco()
    {
        System.out.println("Tipo: "+ tipo);
        System.out.println("Cafeina: "+ cafeina);
        System.out.println("Envace: "+ envace);
    }
}
