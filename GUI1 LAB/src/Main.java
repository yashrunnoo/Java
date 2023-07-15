import javax.swing.*;
//setLayout(null);
//b1.setBounds(50,50,100,50)
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Main Window");

        JOptionPane.showMessageDialog(frame,"Message for the dialog box","Align",JOptionPane.ERROR_MESSAGE);
        frame.setSize(350,350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
