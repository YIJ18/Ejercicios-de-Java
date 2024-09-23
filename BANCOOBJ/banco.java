package BANCOOBJ;

public class banco {
    public static void main(String[] args) {
        datos solicitud = new datos();
        solicitud.menu();

        switch (solicitud.regresa_opcion()) {
            case 1:
            solicitud.pedir_usuario();
            solicitud.pedir_contrasena();

                break;
            case 2:
            solicitud.submenu1();
                break;
            case 3:
            System.out.println("Usted ha salido del banco");
                break;

            default:
                break;
        }
    }
}
