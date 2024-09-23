package MASACORPORAL;

public class calculadora_imc {
    public static void main(String[] args) {
        datos imc = new datos();
        double valor = 0;
        
        imc.ingresar_datos();
        valor = imc.regresar_imc();
        System.out.println("ADVERTENCIA: si ingresa los datos en unidades erroneas, el resultado puede ser falso.");
        if(valor < 18.5)
        System.out.println("Esta bajo de peso, su imc es de: " + valor);
        else if(valor >= 18.5 && valor <= 24.9)
        System.out.println("Su peso es adecuado para su altura, pues es de: " + valor);
        else if(valor >= 25 && valor <= 29.9)
        System.out.println("Cuidado, estas en sobrepeso pues tu imc es de: "+ valor);
        else if(valor >= 30 && valor <= 34.9)
        System.out.println("Obesidad tipo 1, imc de " + valor);
        else if(valor >= 35 && valor <= 39.9)
        System.out.println("Obesidad tipo 2, imc de " + valor);
        else if(valor >= 40)
        System.out.println("Obesidad tipo 3, imc de " + valor);
        
    }
}
