package ANIMALES;

public class principal {
    public static void main(String[] args) {
        animal animales = new animal();
        animal a = new perro();
        animal b = new gato();
        animal c = new pez();
        animal d = new gusano();
        animal e = new pajaro();

        System.out.println("\n\nLos animales en genreal");
        animales.comer();
        animales.dormir();

        System.out.println("\nPerro");
        System.out.println("Se mueve: ");
        a.moverse(); //
        System.out.println("El sonido que hace:  ");
        a.hacerSonido(); // 
        System.out.println("El color:");
        a.color(); //

        System.out.println("\nGato");
        System.out.println("Se mueve: ");
        b.moverse(); //
        System.out.println("El sonido que hace:  ");
        b.hacerSonido(); // 
        System.out.println("El color:");
        b.color(); //

        System.out.println("\nPez");
        System.out.println("Se mueve: ");
        c.moverse(); //
        System.out.println("El sonido que hace:  ");
        c.hacerSonido(); // 
        System.out.println("El color:");
        c.color(); //


        System.out.println("\nGusano");
        System.out.println("Se mueve: ");
        d.moverse(); //
        System.out.println("El sonido que hace:  ");
        d.hacerSonido(); // 
        System.out.println("El color:");
        d.color(); //


        System.out.println("\nPajaro");
        System.out.println("Se mueve: ");
        e.moverse(); //
        System.out.println("El sonido que hace:  ");
        e.hacerSonido(); // 
        System.out.println("El color:");
        e.color(); //
    }
}
