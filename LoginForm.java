import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginForm extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JTextField nombreField; // Added declaration for nombreField
    private JTextField edadField;   // Added declaration for edadField

    public LoginForm() {
        super("Login Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(2, 2));

        JLabel usernameLabel = new JLabel("Usuario");
        inputPanel.add(usernameLabel);
        usernameField = new JTextField();
        inputPanel.add(usernameField);

        JLabel passwordLabel = new JLabel("Contraseña");
        inputPanel.add(passwordLabel);
        passwordField = new JPasswordField();
        inputPanel.add(passwordField);

        panel.add(inputPanel, BorderLayout.CENTER);

        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (username.equals("a") && password.equals("a")) {
                    JOptionPane.showMessageDialog(LoginForm.this, "Login successful");

         String nombre = JOptionPane.showInputDialog(null, "Por favor, escriba su nombre");
         String edad = JOptionPane.showInputDialog(null, "Por favor, escriba su edad");

         JOptionPane.showMessageDialog(null, "Hola " + nombre +" "+ edad + "!");

         String options = "Las opciones de película son:\n1. Cars\n2. La sirenita\n3. Pollitos en fuga\n4. Hercules\n5. Hipatia";
         JOptionPane.showMessageDialog(null, options);
 
         int response = JOptionPane.showConfirmDialog(null, "¿Estás seguro de continuar?", "Confirmación", JOptionPane.WARNING_MESSAGE);
 
         if (response == JOptionPane.YES_OPTION) {
             String input = JOptionPane.showInputDialog(null, "Ingresa el número de la película que deseas ver:");
             try {
                 int movieNumber = Integer.parseInt(input);
 
                 switch (movieNumber) {
                     case 1:
                         JOptionPane.showMessageDialog(null, "Seleccionaste Cars");
                         break;
                     case 2:
                         JOptionPane.showMessageDialog(null, "Seleccionaste La sirenita");
                         break;
                     case 3:
                         JOptionPane.showMessageDialog(null, "Seleccionaste Pollitos en fuga");
                         break;
                     case 4:
                         JOptionPane.showMessageDialog(null, "Seleccionaste Hercules");
                         break;
                     case 5:
                         JOptionPane.showMessageDialog(null, "Seleccionaste Hipatia");
                         break;
                     default:
                         JOptionPane.showMessageDialog(null, "Número no válido. Cancelando...");
                 }
             } catch (NumberFormatException e) {
                 JOptionPane.showMessageDialog(null, "Entrada inválida. Cancelando...");
             }
            }
                } else {
                    JOptionPane.showMessageDialog(LoginForm.this, "Login failed. Please try again");
                }
            }
        });

        panel.add(loginButton, BorderLayout.SOUTH);

        getContentPane().add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LoginForm();
            }
        });
    }
}


/*
 * Poner 5 peliculas y depende de que elija decirle el precio
 */