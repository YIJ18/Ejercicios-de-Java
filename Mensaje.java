import javax.swing.JOptionPane;

public class Mensaje
{
    public static void main(String[] args)
    {
        //Mostrar mensaj e de informacion
        JOptionPane.showMessageDialog(null, "Hola mundo", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        //Mostrar mensaje de advertencia
        JOptionPane.showMessageDialog(null, "Mensaje advertidor", "Mensaje", JOptionPane.WARNING_MESSAGE);
        //mensaje de error
        JOptionPane.showMessageDialog(null, "Mensaje de error", "Mensaje", JOptionPane.ERROR_MESSAGE);
    
        //mensaje de pregunta
        int respuesta = JOptionPane.showConfirmDialog(null, "Estas seguro de continuar", "Confirmacion", JOptionPane.WARNING_MESSAGE);
         if(respuesta == JOptionPane.YES_NO_OPTION)
         {
            JOptionPane.showMessageDialog(null, "Continuando..");
         }
         else
         {
            JOptionPane.showMessageDialog(null, "Cancelando..");
         }

         String nombre = JOptionPane.showInputDialog(null, "Por facor, escriba su nombre");
         JOptionPane.showMessageDialog(null, "Hola " + nombre + "!");
    }
}