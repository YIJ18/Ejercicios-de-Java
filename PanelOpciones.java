import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelOpciones extends JPanel implements ActionListener {
    private JTextField nameField;
    private JSpinner ageSpinner;
    private JComboBox<String> comboBox;
    private JCheckBox checkBox1, checkBox2;
    private JRadioButton radioButton1, radioButton2;

    public PanelOpciones() {
        setLayout(new GridLayout(7, 1));

        // nombre
        JPanel namePanel = new JPanel();
        JLabel nameLabel = new JLabel("Nombre: ");
        nameField = new JTextField(15);
        namePanel.add(nameLabel);
        namePanel.add(nameField);
        add(namePanel);

        // edad
        JPanel agePanel = new JPanel();
        JLabel ageLabel = new JLabel("Edad: ");
        SpinnerNumberModel spinnerModel = new SpinnerNumberModel(18, 0, 120, 1);
        ageSpinner = new JSpinner(spinnerModel);
        agePanel.add(ageLabel);
        agePanel.add(ageSpinner);
        add(agePanel);

        // comboBox
        String[] options = {"Opcion 1", "Opcion 2", "Opcion 3"};
        comboBox = new JComboBox<>(options);
        add(comboBox);

        // checkBox1
        checkBox1 = new JCheckBox("Opcion 1");
        add(checkBox1);

        // checkBox2
        checkBox2 = new JCheckBox("Opcion 2");
        add(checkBox2);

        // radioButton's
        JPanel radioPanel = new JPanel();
        radioButton1 = new JRadioButton("Opcion A");
        radioButton2 = new JRadioButton("Opcion B");
        ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(radioButton1);
        radioGroup.add(radioButton2);
        radioPanel.add(radioButton1);
        radioPanel.add(radioButton2);
        add(radioPanel);

        // boton para mostrar seleccion
        JButton showSelectionButton = new JButton("Mostrar seleccion");
        showSelectionButton.addActionListener(this);
        add(showSelectionButton);
    }

    // ActionEvent para el boton de mostrar seleccion
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Mostrar Selección")) {
        
    // Obtener los valores seleccionados 
            String nombre = nameField.getText();
            int edad = (int) ageSpinner.getValue();
            boolean checkBox1Seleccionado = checkBox1.isSelected();
            boolean checkBox2Seleccionado = checkBox2.isSelected();
            String comboBoxSeleccionado = (String) comboBox.getSelectedItem();
            String radioButtonSeleccionado = "";
            if (radioButton1.isSelected()) {
                radioButtonSeleccionado = "Opción A seleccionada";
            } else if (radioButton2.isSelected()) {
                radioButtonSeleccionado = "Opción B seleccionada";
            } else {
                radioButtonSeleccionado = "Ninguna opción seleccionada";
            }

            
            StringBuilder mensaje = new StringBuilder();
            mensaje.append("Nombre: ").append(nombre).append("\n");
            mensaje.append("Edad: ").append(edad).append("\n");
            mensaje.append("CheckBox 1 seleccionado: ").append(checkBox1Seleccionado).append("\n");
            mensaje.append("CheckBox 2 seleccionado: ").append(checkBox2Seleccionado).append("\n");
            mensaje.append("ComboBox seleccionado: ").append(comboBoxSeleccionado).append("\n");
            mensaje.append("RadioButton seleccionado: ").append(radioButtonSeleccionado);

            // Mostrar el mensaje con los valores seleccionados 
            JOptionPane.showMessageDialog(this, mensaje.toString());
        }
    }
}