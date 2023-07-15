import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatureConverter extends JFrame implements ActionListener {

    private JTextField inputField;
    private JLabel resultLabel;

    public TemperatureConverter() {
        setTitle("Temperature Converter");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setSize(300, 150);

        inputField = new JTextField();
        inputField.setBounds(50, 30, 100, 20);
        add(inputField);

        JLabel fahrenheitLabel = new JLabel("Fahrenheit");
        fahrenheitLabel.setBounds(160, 30, 100, 20);
        add(fahrenheitLabel);

        resultLabel = new JLabel("");
        resultLabel.setBounds(50, 60, 200, 20);
        add(resultLabel);

        inputField.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        try {
            double fahrenheit = Double.parseDouble(inputField.getText());
            double celsius = (5.0 / 9.0) * (fahrenheit - 32);
            resultLabel.setText(String.format("%.2f degrees Celsius", celsius));
        } catch (NumberFormatException e) {
            resultLabel.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        new TemperatureConverter();
    }
}

