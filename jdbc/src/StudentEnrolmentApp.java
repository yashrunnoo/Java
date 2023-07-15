/*Consider the information about student and their enrolment in courses. A student is uniquely identified by her/his social security number and is further characterized by her/his full name. An enrolment object is uniquely identified by the social security number of a student and the name of the course she/he had taken and is further characterized by the grade secured by the student in the course. Write a program using Java Swing and JDBC that displays the grade of a student when her/his social security number is entered. The GUI interface should appear as shown below.*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class StudentEnrolmentApp extends JFrame implements ActionListener {
    // Database connection information
    private final String DB_URL = "jdbc:mysql://localhost:3306/student_enrolment";
    private final String DB_USER = "root";
    private final String DB_PASSWORD = "password";

    // GUI components
    private final JLabel ssnLabel = new JLabel("Social Security Number:");
    private final JTextField ssnField = new JTextField();
    private final JButton searchButton = new JButton("Search");
    private final JLabel gradeLabel = new JLabel("Grade:");
    private final JTextField gradeField = new JTextField();

    // Database connection and statement objects
    private Connection conn;
    private Statement stmt;

    public StudentEnrolmentApp() {
        super("Student Enrolment App");

        // Set up the GUI components
        setLayout(new GridLayout(2, 2));
        add(ssnLabel);
        add(ssnField);
        add(searchButton);
        add(gradeLabel);
        add(gradeField);
        gradeField.setEditable(false);

        // Set up the database connection and statement objects
        try {
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            stmt = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Add the action listener to the search button
        searchButton.addActionListener(this);

        // Set up the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 100);
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == searchButton) {
            try {
                String ssn = ssnField.getText();

                // Execute the SQL query
                String sql = "SELECT grade FROM enrolment WHERE ssn = '" + ssn + "'";
                ResultSet rs = stmt.executeQuery(sql);

                // Display the results
                if (rs.next()) {
                    gradeField.setText(rs.getString("grade"));
                } else {
                    JOptionPane.showMessageDialog(this, "No grade found for student with SSN " + ssn);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // Create and show the frame
        StudentEnrolmentApp app = new StudentEnrolmentApp();
        app.setVisible(true);
    }
}
