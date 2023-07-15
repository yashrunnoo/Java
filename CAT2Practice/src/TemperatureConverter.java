import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class TemperatureConverter extends JFrame implements ActionListener {
    private JTextField fahrenheitField;
    private JLabel celsiusValue;
    public TemperatureConverter(){
        setTitle("Temperature Converter");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Panel Implementation
        JPanel panel = new JPanel(new GridLayout(3,2));

        GridBagConstraints constraints = new GridBagConstraints();

        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 0;
        //constraints.insets = new Insets(5,5,5,5);

        JLabel fahrenheitLabel = new JLabel("Fahrenheit");
        constraints.gridx = 1;
        constraints.gridy = 0;
        panel.add(fahrenheitLabel,constraints);

        fahrenheitField = new JTextField(10);
        constraints.gridx = 1;
        panel.add(fahrenheitField,constraints);

        JButton convertButton = new JButton("Convert mama la");
        constraints.gridx = 2;
        constraints.gridy = 1;
        convertButton.addActionListener(this);
        panel.add(convertButton,constraints);

        JLabel celsiusTextLabel = new JLabel("Celsius");
        constraints.gridy = 3;
        constraints.gridx = 0;
        panel.add(celsiusTextLabel,constraints);

        celsiusValue = new JLabel("Yet to be Converted");
        constraints.gridy = 3;
        constraints.gridx = 1;
        panel.add(celsiusValue, constraints);

        add(panel);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e){
        Double fahrenheitValue = 0.0;
        //lakshit:
        try {
            fahrenheitValue = Double.parseDouble(fahrenheitField.getText());
        }
        catch (NumberFormatException vide)
        {
            celsiusValue.setText("Please Enter a Value to convert !!!");
            return;
            //break lakshit;
        }
        double toPrint = 0.0;
        toPrint = (fahrenheitValue - 32.0)* 5 / 9;
        String x = Double.toString(toPrint);
        celsiusValue.setText(String.format("%.2f",toPrint));
    }
    public static void main(String Args[]){
        new TemperatureConverter();
    }
}
