package ENTORNO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class sumaNumeros extends JFrame {

    JTextField numField1;
    JTextField numField2;
    JTextField resultadoField;

    public sumaNumeros() {
        setTitle("Suma de dos Numeros");
        setSize(350, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel numLabel1 = new JLabel("Numero 1: ");
        numField1 = new JTextField();
        JLabel numLabel2 = new JLabel("Numero 2: ");
        numField2 = new JTextField();
        JLabel resLabel = new JLabel("Resultado: ");
        resultadoField = new JTextField();
        resultadoField.setEditable(false);
        JButton sumarButton = new JButton("-SUMAR-");

        panel.add(numLabel1);
        panel.add(numField1);
        panel.add(numLabel2);
        panel.add(numField2);
        panel.add(resLabel);
        panel.add(resultadoField);

        // agregar actionListener
        sumarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            SumarNumeros();
            }
        });

        add(panel, BorderLayout.CENTER);
        add(sumarButton, BorderLayout.SOUTH);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                sumaNumeros SumaNumeros = new sumaNumeros();
                SumaNumeros.setVisible(true);
            }
        });
    }

   private void SumarNumeros()
   {
    try {
        double num1=Double.parseDouble(numField1.getText());
        double num2=Double.parseDouble(numField2.getText());
        double resultado = num1+num2;
        resultadoField.setText(Double.toString(resultado));
    }catch(NumberFormatException ex)
    {
        JOptionPane.showMessageDialog(this, "Ingrese solo números", "Error", JOptionPane.ERROR_MESSAGE);
    }

   }                                                                     
}

//31+200 -> calcular cuanto pago, tarifa 1