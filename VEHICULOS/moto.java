package VEHICULOS;

public class moto extends vehiculo{
    int cilandra = 4;
    float velocidad_max = 10;
    float peso = 50;

    public void mostrar()
    {
        System.out.println("Cilandra:"+ cilandra+"\nVelocidad Máxima: "+velocidad_max+"\nPeso: "+peso);
    }
}
