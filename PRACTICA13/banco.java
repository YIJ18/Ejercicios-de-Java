import java.util.Scanner;
 
public class banco {
    public static void main(String[] args){
        Scanner scanner1 = new Scanner(System.in);
        String nombre="\0";
        String nombre2="\0";
        int op1=0, op2=0, validado=1;
        do{
            System.out.println("1. Registrarse");
            System.out.println("2. Reterias Efectivo");
            System.out.println("3. Salir");
            op1 = scanner1.nextInt();
            switch (op1) {
                case 1:
                    System.out.println("Ingrese su nombre: ");
                    nombre = scanner1.nextLine();
                    //System.out.flush();
                    scanner1.nextLine();
           
                    System.out.println("Ingresa tu contrasena: ");
                    nombre2 = scanner1.nextLine();
                    break;
                case 2:
                    if(nombre.equals(nombre2)){
                        System.out.println("Usuario Validado");
                        validado = 1;
                    }      
                break;
                case 3:
                    System.out.println("Adios");
                    //return;
                break;
           
                default:
                    break;
            }
            if(validado==1){
                System.out.println("1. Ingresar Dinero");
                System.out.println("2. Ingresar Dinero");
                op2 = scanner1.nextInt();
 
                switch (op2) {
                    case 1:
                        System.out.println("Cuanto dinero vas a ingresar: ");
                        break;
                    case 2:
                        System.out.println("Cuanto dinero vas a retirar: ");
                        break;
               
                    default:
                        break;
                }
 
            }
           
   
        }while(op1!=3);
 
        scanner1.close();
    }
}
 