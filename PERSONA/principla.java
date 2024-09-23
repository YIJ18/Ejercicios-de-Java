package PERSONA;

public class principla {
    public static void main(String[] args) {
       
        //Alumno
        alumno alum = new alumno();
        alum.PedirDatos();
        alum.datosAlumno();

        alum.MostrarDatos();
        alum.MostrarAlumnos();

        //Profesor
        profesor prof = new profesor();
        prof.PedirDatos();
        prof.datosProf();

        prof.MostrarDatos();
        prof.mostrarProf();
    }
    
}
