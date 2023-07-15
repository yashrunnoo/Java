package Swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NumberConverter extends JFrame implements ActionListener {
    private JTextField decimalField, hexField, binaryField;

    public NumberConverter() {
        setTitle("Number Converter");
        setSize(400, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel decimalLabel = new JLabel("Decimal value:");
        decimalField = new JTextField(10);
        decimalField.addActionListener(this);
        panel.add(decimalLabel);
        panel.add(decimalField);

        JLabel hexLabel = new JLabel("Hex value:");
        hexField = new JTextField(10);
        hexField.setEditable(false);
        panel.add(hexLabel);
        panel.add(hexField);

        JLabel binaryLabel = new JLabel("Binary value:");
        binaryField = new JTextField(10);
        binaryField.setEditable(false);
        panel.add(binaryLabel);
        panel.add(binaryField);

        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == decimalField) {
            int decimalValue = Integer.parseInt(decimalField.getText());
            hexField.setText(Integer.toHexString(decimalValue).toUpperCase());
            binaryField.setText(Integer.toBinaryString(decimalValue));
        }
    }

    public static void main(String[] args) {
        new NumberConverter();
    }
}