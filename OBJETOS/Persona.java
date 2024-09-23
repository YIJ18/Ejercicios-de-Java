package OBJETOS;

public class Persona {
    public static void main (String[] args)
    {
        datos per = new datos(); 
        per.pedirNombre(); //creación de un objeto (datos es la clase y "per" el objeto)
        per.pedirEdad();// objeto per se comunica con el metodo pedirEdad

        if(per.regresarEdad() >= 18)
        {
            System.out.println("Eres mayor de edad " + per.regresarNombre() + " ya que tienes " + per.regresarEdad() + " años");
        }
        else
        {
            System.out.println("No eres mayor de edad " + per.regresarNombre() + " ya que tienes " + per.regresarEdad() + " años");
        }

    }
}
