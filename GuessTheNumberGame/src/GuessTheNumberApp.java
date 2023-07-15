import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessTheNumberApp extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    private int randomNumber;
    private int previousGuess;
    private int guessCount;
    private JLabel guessPrompt;
    private JTextField guessField;
    private JLabel resultLabel;
    private JButton guessButton;
    private JButton newGameButton;
    private JPanel mainPanel;

    public GuessTheNumberApp() {
        randomNumber = new Random().nextInt(1000) + 1;
        previousGuess = 0;
        guessCount = 0;

        guessPrompt = new JLabel("I have a number between 1 and 1000. Can you guess my number?");
        guessField = new JTextField(10);
        resultLabel = new JLabel("");
        guessButton = new JButton("Guess");
        newGameButton = new JButton("New Game");

        guessButton.addActionListener(this);
        newGameButton.addActionListener(this);

        mainPanel = new JPanel();
        mainPanel.add(guessPrompt);
        mainPanel.add(guessField);
        mainPanel.add(guessButton);
        mainPanel.add(resultLabel);
        mainPanel.add(newGameButton);

        add(mainPanel);
        setTitle("Guess the Number");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == guessButton) {
            String guessString = guessField.getText();
            if (guessString.length() > 0) {
                int guess = Integer.parseInt(guessString);
                guessCount++;
                if (guess == randomNumber) {
                    guessField.setEditable(false);
                    resultLabel.setText("Correct! You guessed it in " + guessCount + " guesses.");
                    guessButton.setEnabled(false);
                } else {
                    int difference = Math.abs(randomNumber - guess);
                    if (previousGuess != 0 && difference < Math.abs(randomNumber - previousGuess)) {
                        guessField.setBackground(Color.RED);
                    } else {
                        guessField.setBackground(Color.BLUE);
                    }
                    previousGuess = guess;
                    if (guess > randomNumber) {
                        resultLabel.setText("Too high");
                    } else {
                        resultLabel.setText("Too low");
                    }
                }
            }
        } else if (e.getSource() == newGameButton) {
            randomNumber = new Random().nextInt(1000) + 1;
            previousGuess = 0;
            guessCount = 0;
            guessField.setEditable(true);
            guessField.setText("");
            guessButton.setEnabled(true);
            resultLabel.setText("");
        }
    }

    public static void main(String[] args) {
        new GuessTheNumberApp();
    }
}
