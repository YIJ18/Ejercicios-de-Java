package VEHICULOS;

public class auto extends vehiculo{
    double tam_cajuela = 3.4;
    String seguridad = "Gran seguridad";

    public void mostrar()
    {
        System.out.println("\nDimensiones de la cajuela: "+tam_cajuela + "\nLa seguridad del vehiculo es con: "+seguridad);
    }

}
