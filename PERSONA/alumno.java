package PERSONA;

import java.util.Scanner;

public class alumno extends padre {
    Scanner entrada = new Scanner(System.in);
    int cuenta;
    float promedio;
    String carrera;

    public void datosAlumno() {
        System.out.println("Ingresa el cuenta");
        cuenta = entrada.nextInt();
        System.out.println("Ingresa el promedio");
        promedio = entrada.nextFloat();
        entrada.nextLine();
        System.out.println("Ingresa el carrera");
        carrera = entrada.nextLine();
    }

    public void MostrarAlumnos()
    {
        System.out.println(cuenta + " "+ promedio+" "+carrera);
    }

}
