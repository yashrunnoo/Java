import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class GuessTheNumber extends JFrame implements ActionListener {

    private JLabel promptLabel;
    private JTextField guessField;
    private JButton guessButton;
    private JLabel resultLabel;

    private int numberToGuess;
    private int guessesLeft = 10;

    public GuessTheNumber() {
        setTitle("Guess The Number");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create UI components
        promptLabel = new JLabel("I have a number between 1 and 1000. Can you guess my number?");
        guessField = new JTextField(10);
        guessButton = new JButton("Guess");
        resultLabel = new JLabel("");

        // Add components to the content pane
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        contentPane.add(promptLabel);
        contentPane.add(guessField);
        contentPane.add(guessButton);
        contentPane.add(resultLabel);

        // Add action listeners
        guessField.addActionListener(this);
        guessButton.addActionListener(this);

        // Generate random number to guess
        Random rand = new Random();
        numberToGuess = rand.nextInt(1000) + 1;

        // Set the size of the window and display it
        setSize(400, 100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Check if the user's guess is correct
        int guess = Integer.parseInt(guessField.getText());
        if (guess == numberToGuess) {
            resultLabel.setText("Congratulations, you guessed the number!");
            guessField.setEnabled(false);
            guessButton.setEnabled(false);
        } else {
            guessesLeft--;
            if (guessesLeft == 0) {
                resultLabel.setText("Sorry, you ran out of guesses. The number was " + numberToGuess + ".");
                guessField.setEnabled(false);
                guessButton.setEnabled(false);
            } else if (guess < numberToGuess) {
                resultLabel.setText("Too low. Guesses left: " + guessesLeft);
            } else {
                resultLabel.setText("Too high. Guesses left: " + guessesLeft);
            }
        }

        // Clear the guess field
        guessField.setText("");
    }

    public static void main(String[] args) {
        new GuessTheNumber();
    }

}
