import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

public class GuessTheNumberGame extends JFrame implements EventListener {
    private JTextField input;
    private JLabel highOrLow;
    private JLabel resultLabel;
    private JButton playAgain, guess;
    public int target = 0;

    public GuessTheNumberGame(){
        setTitle("Guessing Game haha !!!");
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLabel promptLabel = new JLabel("I have a number between 1 and 1000, GUESS IT...");

        input = new JTextField(10);
        guess = new JButton("Guess");
        playAgain = new JButton("Play Again");
        playAgain.setEnabled(false);
        resultLabel = new JLabel();

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        panel.add(promptLabel);
        panel.add(input);
        panel.add(guess);
        panel.add(resultLabel);
        panel.add(playAgain);
        add(panel);
        setVisible(true);
        target = generateRandomNumber();
        System.out.println(target);

        playAgain.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == playAgain) {
                    new GuessTheNumberGame();
                }
            }
        });
        guess.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playAgain.setEnabled(false);
                processGuess();
            }
        });
    }

    private void processGuess(){
        String myNumber = input.getText();
        int guessed = 0;

        try{
            guessed = Integer.parseInt(myNumber);
        }
        catch(NumberFormatException e){
            resultLabel.setText("<<<Enter a valid Number>>>");
            input.setText("");
            return;
        }
        if (guessed == target){
            input.setBackground(Color.green);
            guess.setEnabled(false);
            resultLabel.setText("Congratulations !!!");
            input.setEditable(false);
            playAgain.setEnabled(true);
        }
        else if (guessed < target ){
            resultLabel.setText("Too Low");
            input.setBackground(Color.CYAN);
        }
        else{
            resultLabel.setText("Too High");
            input.setBackground(Color.red);
        }
    }
    private int generateRandomNumber(){
        int number = (int)(Math.random()* (1000 - 1 + 1) + 1);
        input.setEditable(true);
        input.setText("");
        input.setBackground(Color.ORANGE);
        resultLabel.setText("");
        return number;
    }
    public static void main(String[] args) {
        new GuessTheNumberGame();
    }
}