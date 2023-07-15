/*Write a program using Java Swing and JDBC that views, inserts, and updates staff information stored in a database, as shown in the Figure below. The View button displays a record with a specified ID. The Insert button inserts a new record. The Update button updates the record for the specified ID. A staff member is uniquely identified by staff id and is further characterized by her/his last name, first name and middle initial, her/his address, city, state, telephone and email address.*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class StaffInformationApp extends JFrame {
    private JLabel idLabel, lastNameLabel, firstNameLabel, middleInitialLabel, addressLabel, cityLabel, stateLabel,
            telephoneLabel, emailLabel;
    private JTextField idField, lastNameField, firstNameField, middleInitialField, addressField, cityField, stateField,
            telephoneField, emailField;
    private JButton viewButton, insertButton, updateButton;

    // Database credentials
    private static final String DB_URL = "jdbc:mysql://localhost:3306/staff_db";
    private static final String USER = "your_username";
    private static final String PASS = "your_password";

    // JDBC objects
    private Connection conn = null;
    private Statement stmt = null;

    public StaffInformationApp() {
        initializeComponents();
        initializeDatabase();
    }

    private void initializeComponents() {
        // Set up the frame
        setTitle("Staff Information");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(10, 2));

        // Create labels
        idLabel = new JLabel("ID:");
        lastNameLabel = new JLabel("Last Name:");
        firstNameLabel = new JLabel("First Name:");
        middleInitialLabel = new JLabel("Middle Initial:");
        addressLabel = new JLabel("Address:");
        cityLabel = new JLabel("City:");
        stateLabel = new JLabel("State:");
        telephoneLabel = new JLabel("Telephone:");
        emailLabel = new JLabel("Email:");

        // Create text fields
        idField = new JTextField();
        lastNameField = new JTextField();
        firstNameField = new JTextField();
        middleInitialField = new JTextField();
        addressField = new JTextField();
        cityField = new JTextField();
        stateField = new JTextField();
        telephoneField = new JTextField();
        emailField = new JTextField();

        // Create buttons
        viewButton = new JButton("View");
        insertButton = new JButton("Insert");
        updateButton = new JButton("Update");

        // Add components to the frame
        add(idLabel);
        add(idField);
        add(lastNameLabel);
        add(lastNameField);
        add(firstNameLabel);
        add(firstNameField);
        add(middleInitialLabel);
        add(middleInitialField);
        add(addressLabel);
        add(addressField);
        add(cityLabel);
        add(cityField);
        add(stateLabel);
        add(stateField);
        add(telephoneLabel);
        add(telephoneField);
        add(emailLabel);
        add(emailField);
        add(viewButton);
        add(insertButton);
        add(updateButton);

        // Add action listeners to buttons
        viewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewRecord();
            }
        });

        insertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                insertRecord();
            }
        });

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateRecord();
            }
        });
    }

    private void initializeDatabase() {
        try {
            // Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Open a connection
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // Create a statement
            stmt = conn.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void viewRecord() {
        try {
            int id = Integer.parseInt(idField.getText());

            // Execute
            private void viewRecord () {
                try {
                    int id = Integer.parseInt(idField.getText());

                    // Execute the SQL query
                    String sql = "SELECT * FROM staff WHERE id = " + id;
                    ResultSet rs = stmt.executeQuery(sql);

                    // Display the results
                    if (rs.next()) {
                        lastNameField.setText(rs.getString("last_name"));
                        firstNameField.setText(rs.getString("first_name"));
                        middleInitialField.setText(rs.getString("middle_initial"));
                        addressField.setText(rs.getString("address"));
                        cityField.setText(rs.getString("city"));
                        stateField.setText(rs.getString("state"));
                        telephoneField.setText(rs.getString("telephone"));
                        emailField.setText(rs.getString("email"));
                    } else {
                        JOptionPane.showMessageDialog(this, "Record not found.");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            private void insertRecord () {
                try {
                    String lastName = lastNameField.getText();
                    String firstName = firstNameField.getText();
                    String middleInitial = middleInitialField.getText();
                    String address = addressField.getText();
                    String city = cityField.getText();
                    String state = stateField.getText();
                    String telephone = telephoneField.getText();
                    String email = emailField.getText();

                    // Execute the SQL query
                    String sql = "INSERT INTO staff (last_name, first_name, middle_initial, address, city, state, telephone, email) " +
                            "VALUES ('" + lastName + "', '" + firstName + "', '" + middleInitial + "', '" + address + "', '" +
                            city + "', '" + state + "', '" + telephone + "', '" + email + "')";
                    stmt.executeUpdate(sql);

                    // Clear the fields
                    idField.setText("");
                    lastNameField.setText("");
                    firstNameField.setText("");
                    middleInitialField.setText("");
                    addressField.setText("");
                    cityField.setText("");
                    stateField.setText("");
                    telephoneField.setText("");
                    emailField.setText("");

                    JOptionPane.showMessageDialog(this, "Record inserted successfully.");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            private void updateRecord () {
                try {
                    int id = Integer.parseInt(idField.getText());
                    String lastName = lastNameField.getText();
                    String firstName = firstNameField.getText();
                    String middleInitial = middleInitialField.getText();
                    String address = addressField.getText();
                    String city = cityField.getText();
                    String state = stateField.getText();
                    String telephone = telephoneField.getText();
                    String email = emailField.getText();

                    // Execute the SQL query
                    String sql = "UPDATE staff SET last_name = '" + lastName + "', first_name = '" + firstName +
                            "', middle_initial = '" + middleInitial + "', address = '" + address + "', city = '" + city +
                            "', state = '" + state + "', telephone = '" + telephone + "', email = '" + email +
                            "' WHERE id = " + id;
                    int rowsUpdated = stmt.executeUpdate(sql);

                    if (rowsUpdated > 0) {
                        JOptionPane.showMessageDialog(this, "Record updated successfully.");
                    } else {
                        JOptionPane.showMessageDialog(this, "Record not found.");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            public static void main (String[]args){
                // Create and show the frame
                StaffInformationApp app = new StaffInformationApp();
                app.setVisible(true);
            }
        }
    }
}