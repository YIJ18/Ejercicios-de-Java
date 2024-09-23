import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Elementos2 {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Elementos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        // Toggle button
        JToggleButton toggleButton = new JToggleButton("Toggle Button");
        toggleButton.setSelected(false);

        toggleButton.addActionListener(e -> {
            if (toggleButton.isSelected()) {
                System.out.println("Toggle Button fue seleccionado");
            } else {
                System.out.println("Toggle Button dejó de ser seleccionado");
            }
        });
        frame.add(toggleButton);

        // Slider
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
        slider.setMinorTickSpacing(5);
        slider.setMajorTickSpacing(20);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        slider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                JSlider source = (JSlider) e.getSource();
                if (!source.getValueIsAdjusting()) {
                    System.out.println("Slider valor: " + source.getValue());
                }
            }
        });

        frame.add(slider);

        // JProgressBar
        JProgressBar progressBar = new JProgressBar(0, 100);
        progressBar.setStringPainted(true);
        progressBar.setValue(100);
        frame.add(progressBar);

        frame.setVisible(true);
    }
}
