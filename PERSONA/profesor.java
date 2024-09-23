package PERSONA;

public class profesor extends padre{
    String cedula;
    String id_maestro;
    float sueldo;

    public void datosProf()
    {
        System.out.println("Ingresa tu cedula: ");
        cedula = entrada.nextLine();
        System.out.println("Ingresa el id_maestro");
        id_maestro =  entrada.nextLine();
        System.out.println("Ingresa el sueldo");
        sueldo = entrada.nextFloat();
    }

    public void mostrarProf()
    {
        System.out.println(cedula+" "+ id_maestro+" "+sueldo);
    }
}

