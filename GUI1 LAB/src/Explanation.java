import javax.swing.*;

public class Explanation {
    public static void main(String[] args) {

        //Creating the Frame
        JFrame f = new JFrame("This is a frame");
        f.setSize(640,480);
        f.setLocation(100,100);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);

        //Adding Button
        JButton b1 = new JButton("This is text Only");
        b1.setBounds(200,200,200,200);
//        f.add(b1);

        JCheckBox check1 = new JCheckBox("Snap to Grid");
        JCheckBox check2 = new JCheckBox("Show Grid");

        check1.setBounds(150,150,50,50);
        check1.setBounds(150,150,50,50);

//        f.add(check1);
//        f.add(check2);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();

        panel1.add(check1);
        panel1.add(check2);

        JLabel label1 = new JLabel("X : ");
        JTextField txt1 = new JTextField(5);

        JLabel label2 = new JLabel("Y : ");
        JTextField txt2 = new JTextField(5);

        panel2.add(label1);
        panel2.add(txt1);

        panel2.add(label2);
        panel2.add(txt2);

        //cfvghb
        // sefrthyhygrfefde
        JButton b11 = new JButton("Ok");
        JButton b2 = new JButton("Cancel");
        JButton b3 = new JButton("Help!!!");

        panel3.add(b11);
        panel3.add(b2);
        panel3.add(b3);

        f.add(panel1);
        f.add(panel2);
        f.add(panel3);
//        f.setDefaultCloseOperation();
    }

}

