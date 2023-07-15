/*Define query application for the books database. Provide the following predefined queries:
a) Select all authors from the Authors table.
b) Select a specific author and list all books for that author. Include each book’s title, year and ISBN. Order the information alphabetically by the author’s last name then by first name.
c) Select a specific title and list all authors for that title. Order the authors alphabetically by last name then by first name.
d) Provide any other queries you feel are appropriate.
Display a JComboBox with appropriate names for each predefined query. Also allow users to supply their own queries.*/
import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class BooksQueryApp extends JFrame {

    private JComboBox<String> queryComboBox;
    private JTextArea resultTextArea;
    private Connection connection;

    public BooksQueryApp() {
        super("Books Query Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        queryComboBox = new JComboBox<>();
        queryComboBox.addItem("Select all authors");
        queryComboBox.addItem("Select books for author");
        queryComboBox.addItem("Select authors for book");

        resultTextArea = new JTextArea(20, 80);
        resultTextArea.setEditable(false);

        JButton executeButton = new JButton("Execute");
        executeButton.addActionListener(e -> executeQuery());

        JTextField customQueryField = new JTextField(80);
        customQueryField.addActionListener(e -> executeCustomQuery(customQueryField.getText()));

        JPanel topPanel = new JPanel();
        topPanel.add(new JLabel("Select a query: "));
        topPanel.add(queryComboBox);
        topPanel.add(executeButton);
        topPanel.add(new JLabel("Or enter your own query: "));
        topPanel.add(customQueryField);

        add(topPanel, BorderLayout.NORTH);
        add(new JScrollPane(resultTextArea), BorderLayout.CENTER);

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/books", "root", "");
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Unable to connect to database");
            System.exit(1);
        }

        pack();
        setVisible(true);
    }

    private void executeQuery() {
        try {
            String selectedQuery = (String) queryComboBox.getSelectedItem();
            String query = "";

            if (selectedQuery.equals("Select all authors")) {
                query = "SELECT * FROM authors ORDER BY last_name, first_name";
            } else if (selectedQuery.equals("Select books for author")) {
                String author = JOptionPane.showInputDialog("Enter author name:");
                query = "SELECT title, year, isbn FROM books, authors, authorISBN " +
                        "WHERE books.isbn = authorISBN.isbn AND authors.authorID = authorISBN.authorID " +
                        "AND CONCAT(authors.first_name, ' ', authors.last_name) = '" + author + "' ORDER BY title";
            } else if (selectedQuery.equals("Select authors for book")) {
                String title = JOptionPane.showInputDialog("Enter book title:");
                query = "SELECT CONCAT(authors.first_name, ' ', authors.last_name) AS author " +
                        "FROM books, authors, authorISBN " +
                        "WHERE books.isbn = authorISBN.isbn AND authors.authorID = authorISBN.authorID " +
                        "AND books.title = '" + title + "' ORDER BY authors.last_name, authors.first_name";
            }

            executeCustomQuery(query);
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error executing query");
        }
    }

    private void executeCustomQuery(String query) {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            ResultSetMetaData metaData = resultSet.getMetaData();

            StringBuilder resultBuilder = new StringBuilder();
            while (resultSet.next()) {
                for (int i = 1; i <= metaData.getColumnCount(); i++) {
                    resultBuilder.append(resultSet.getString(i)).append(" ");
                }
                resultBuilder.append("\n");
            }

            resultTextArea.setText(resultBuilder.toString());
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error executing query");
        }
    }

    public static void main(String[] args) {
        new BooksQueryApp();
    }
}
