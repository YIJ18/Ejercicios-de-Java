package VEHICULOS;

public class camion extends vehiculo{
    int cap_carga = 48;
    float altura = 2;
    String traccion="4x4 y los turbomotores";

    public void mostrar()
    {
        System.out.println("Capacidad de carga:"+ cap_carga + "\nAtura:" + altura+ "\nTraccion:"+traccion);
    }
}
