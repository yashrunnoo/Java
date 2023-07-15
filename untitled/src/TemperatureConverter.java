import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatureConverter extends JFrame implements ActionListener {
    private JTextField fahrenheitField;
    private JLabel celsiusLabel;

    public TemperatureConverter() {
        setTitle("Temperature Converter");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.insets = new Insets(5, 5, 5, 5);

        JLabel fahrenheitLabel = new JLabel("Fahrenheit:");
        panel.add(fahrenheitLabel, constraints);

        fahrenheitField = new JTextField(10);
        constraints.gridx = 1;
        panel.add(fahrenheitField, constraints);

        JButton convertButton = new JButton("Convert");
        constraints.gridx = 2;
        panel.add(convertButton, constraints);
        convertButton.addActionListener(this);

        JLabel celsiusTextLabel = new JLabel("Celsius:");
        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(celsiusTextLabel, constraints);

        celsiusLabel = new JLabel("");
        constraints.gridx = 1;
        panel.add(celsiusLabel, constraints);

        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String fahrenheitString = fahrenheitField.getText();
        double fahrenheit = Double.parseDouble(fahrenheitString);
        double celsius = (5.0 / 9.0) * (fahrenheit - 32.0);
        celsiusLabel.setText(String.format("%.2f", celsius));
    }

    public static void main(String[] args) {
        new TemperatureConverter();
    }
}
