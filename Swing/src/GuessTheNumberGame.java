import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessTheNumberGame extends JFrame {
    private static final long serialVersionUID = 1L;
    private final JLabel instructionsLabel;
    private final JLabel hintLabel;
    private final JTextField guessField;
    private final JButton newGameButton;
    private final Random random;
    private int numberToGuess;
    private boolean gameOver;

    public GuessTheNumberGame() {
        super("Guess the Number Game");
        setLayout(new FlowLayout());

        instructionsLabel = new JLabel("I have a number between 1 and 1000. Can you guess my number?");
        add(instructionsLabel);

        hintLabel = new JLabel();
        add(hintLabel);

        guessField = new JTextField(5);
        guessField.addActionListener(new GuessListener());
        add(guessField);

        newGameButton = new JButton("New Game");
        newGameButton.addActionListener(new NewGameListener());
        add(newGameButton);

        random = new Random();
        gameOver = false;

        startNewGame();
    }

    private void startNewGame() {
        numberToGuess = random.nextInt(1000) + 1;
        guessField.setText("");
        guessField.setEditable(true);
        instructionsLabel.setText("I have a number between 1 and 1000. Can you guess my number?");
        hintLabel.setText("");
        guessField.setBackground(Color.WHITE);
        guessField.requestFocus();
        gameOver = false;
    }

    private class GuessListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (gameOver) {
                return;
            }

            int guess;

            try {
                guess = Integer.parseInt(guessField.getText());
            } catch (NumberFormatException ex) {
                guess = 0;
            }

            if (guess < 1 || guess > 1000) {
                instructionsLabel.setText("Invalid guess. Please enter a number between 1 and 1000.");
                guessField.setText("");
                guessField.requestFocus();
                return;
            }

            if (guess == numberToGuess) {
                instructionsLabel.setText("Correct!");
                guessField.setEditable(false);
                guessField.setBackground(Color.GREEN);
                gameOver = true;
                return;
            }

            int difference = Math.abs(guess - numberToGuess);

            if (difference < 50) {
                hintLabel.setText("Getting warmer!");
                guessField.setBackground(Color.RED);
            } else if (difference < 100) {
                hintLabel.setText("Warmer!");
                guessField.setBackground(new Color(255, 128, 128));
            } else if (difference < 200) {
                hintLabel.setText("Colder!");
                guessField.setBackground(new Color(128, 128, 255));
            } else {
                hintLabel.setText("Getting colder!");
                guessField.setBackground(Color.BLUE);
            }

            if (guess < numberToGuess) {
                instructionsLabel.setText("Too low. Try again.");
            } else {
                instructionsLabel.setText("Too high. Try again.");
            }

            guessField.setText("");
            guessField.requestFocus();
        }
    }

    private class NewGameListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            startNewGame();
        }
    }

    public static void main(String[] args) {
        GuessTheNumberGame game = new GuessTheNumberGame();
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.setSize(350, 150);
        game.setVisible(true);
    }
}
