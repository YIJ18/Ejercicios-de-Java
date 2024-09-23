package VEHICULOS;

public class vehiculo {

    String marca = "Nissan";
    String combustible;
    String modelo;
    String color;

    public void avanzar()
    {
        System.out.println("avanzo :), purrrrummmm");
    }

    public void frenar()
    {
        System.out.println("Frenooooooo!!!!!!!");
    }

    public void mostrar()
    {
        System.out.println("Marca:"+ marca+"\nCombustible"+combustible+"\nModelo:"+modelo+"\nColor:"+color);
    }
}
