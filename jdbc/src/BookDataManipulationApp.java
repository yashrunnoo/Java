import java.sql.*;

public class BooksDataManipulationApp {

    private static Connection connection;

    public static void main(String[] args) {
        try {
            // Connect to the database
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/books", "username", "password");

            // Display the menu to the user
            displayMenu();

            // Close the database connection
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Error connecting to the database");
        }
    }

    private static void displayMenu() throws SQLException {
        boolean exit = false;
        while (!exit) {
            System.out.println("\nData Manipulation Menu:");
            System.out.println("1. Add a new author");
            System.out.println("2. Edit existing author information");
            System.out.println("3. Add a new title for an author");
            System.out.println("4. Add a new entry in the AuthorISBN table");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = getIntInput();

            switch (choice) {
                case 1:
                    addNewAuthor();
                    break;
                case 2:
                    editAuthorInformation();
                    break;
                case 3:
                    addNewTitle();
                    break;
                case 4:
                    linkAuthorWithTitle();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    private static void addNewAuthor() throws SQLException {
        System.out.println("\nAdding a new author:");
        System.out.print("Enter the author's first name: ");
        String firstName = getInput();

        System.out.print("Enter the author's last name: ");
        String lastName = getInput();

        System.out.print("Enter the author's phone number: ");
        String phone = getInput();

        String sql = "INSERT INTO Authors (FirstName, LastName, Phone) VALUES (?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, firstName);
        statement.setString(2, lastName);
        statement.setString(3, phone);
        statement.executeUpdate();

        System.out.println("New author added successfully!");
    }

    private static void editAuthorInformation() throws SQLException {
        System.out.println("\nEditing author information:");
        System.out.print("Enter the author's last name: ");
        String lastName = getInput();

        String sql = "SELECT * FROM Authors WHERE LastName = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, lastName);
        ResultSet resultSet = statement.executeQuery();

        if (resultSet.next()) {
            int authorID = resultSet.getInt("AuthorID");
            String firstName = resultSet.getString("FirstName");
            String phone = resultSet.getString("Phone");

            System.out.println("Author found:");
            System.out.println("Author ID: " + authorID);
            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);
            System.out.println("Phone: " + phone);

            System.out.print("Enter the new phone number: ");
            String newPhone = getInput();

            sql = "UPDATE Authors SET Phone = ? WHERE AuthorID = ?";
            statement = connection.prepareStatement(sql);
            statement.setString(1, newPhone);
            statement.setInt(2, authorID);
            statement.executeUpdate();

            System.out.println("Author information updated successfully!");
        } else {
            System.out.println("Author not found!");
        }
    }
}
