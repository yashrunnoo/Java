import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DiceRollerGUI extends JFrame implements ActionListener {
    private JButton rollDie, reset;
    private JLabel die1, die2, sum, result;
    private JTextField die1Text, die2Text, sumText, resultText;

    public DiceRollerGUI() {
        JPanel myPanel = new JPanel(new GridLayout(2, 1, 5, 5));
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridy = 0;
        constraints.gridx = 0;


        die1 = new JLabel("Die 1 score : ");
        constraints.gridy = 0;
        constraints.gridx = 0;
        myPanel.add(die1, constraints);

        die2 = new JLabel("Die 2 score");
        constraints.gridy = 1;
        constraints.gridx = 0;
        myPanel.add(die2, constraints);

        sum = new JLabel("Sum : ",SwingConstants.CENTER);
        result = new JLabel("Result : ");
        die1Text = new JTextField("", 10);
        die2Text = new JTextField("", 10);
        sumText = new JTextField("", 10);
        resultText = new JTextField("", 10);


        myPanel.add(die1Text);
        myPanel.add(die2);
        myPanel.add(die2Text);
        myPanel.add(sum);
        myPanel.add(sumText);
        myPanel.add(result);
        myPanel.add(resultText);
        rollDie = new JButton("Roll Die");
        constraints.gridy = 2;
        constraints.gridx = 0;

        reset = new JButton("Reset !");
        reset.setEnabled(false);
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Inside Reset");
                new DiceRollerGUI();
            }
        });

        myPanel.add(rollDie, constraints);

        myPanel.add(reset);

        rollDie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Inside rollDie");
                int score1 = 0;
                int score2 = 0;
                String firstScore = die1Text.getText();
                score1 = generateScore();
                die1Text.setText(String.format("%d", score1));
                die1.setHorizontalAlignment(SwingConstants.CENTER);
                firstScore = die2Text.getText();
                score2 = generateScore();
                die2Text.setText(String.format("%d", score2));
                die2.setHorizontalAlignment(SwingConstants.CENTER);

                int sum1 = score2 + score1;
                sumText.setText(String.format("%d", sum1));

                if (sum1 >= 10) {
                    resultText.setText("Win");
                    resultText.setHorizontalAlignment(SwingConstants.CENTER);
                    resultText.setBackground(Color.CYAN);
                    rollDie.setEnabled(false);
                    reset.setEnabled(true);
                } else if (sum1 <= 5) {
                    resultText.setText("Lose");
                    resultText.setHorizontalAlignment(SwingConstants.CENTER);
                    resultText.setBackground(Color.red);
                    rollDie.setEnabled(false);
                    reset.setEnabled(true);
                }
            }
        });

        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(myPanel);
        setVisible(true);


    }

    public int generateScore() {
        int score = (int) (Math.random() * (6 - 1 + 1) + 1);
        return score;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == rollDie) {
            if (die1Text.getText() == "") {
                int score1 = 0;
                String firstScore = die1Text.getText();
                score1 = generateScore();
                die1Text.setText(String.format("%.2f", score1));
            }
            if (die2Text.getText() == "") {
                int score1 = 0;
                String firstScore = die2Text.getText();
                score1 = generateScore();
                die2Text.setText(String.format("%.2f", score1));
            }
        }
    }

    public static void main(String[] args) {
        new DiceRollerGUI();
    }
}
