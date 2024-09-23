package CALCULADORA2;

public class principal {
    public static void main(String[] args) {
        claseHija_Suma suma = new claseHija_Suma();
        claseHija_Multiplicacion mult = new claseHija_Multiplicacion();
        claseHija_Resta resta = new claseHija_Resta();

        suma.PedirDatos();
        suma.suma();
        suma.mostrarDatos();

        resta.resta();
        resta.mostrarDatos();

        mult.multiplicacion();
        mult.mostrarDatos();
    }
}
