import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Q1MySQLConnectionExample {
    // JDBC URL, username, and password for MySQL database connection
    static final String DB_URL = "jdbc:mysql://localhost:3306/your_database_name";
    static final String USER = "your_username";
    static final String PASSWORD = "your_password";

    public static void main(String[] args) {
        // Initialize a connection object
        Connection connection = null;

        try {
            // Load the MySQL JDBC driver (optional, for newer JDBC versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection to MySQL database
            System.out.println("Connecting to the database...");
            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);

            // If connection is successful, print a confirmation message
            if (connection != null) {
                System.out.println("Connection established successfully!");
            }

        } catch (SQLException e) {
            // Handle SQL exceptions
            System.out.println("SQL Exception: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            // Handle Class Not Found exceptions
            System.out.println("JDBC Driver not found: " + e.getMessage());
        } finally {
            // Close the connection when done
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                    System.out.println("Connection closed.");
                }
            } catch (SQLException e) {
                System.out.println("Error while closing the connection: " + e.getMessage());
            }
        }
    }
}
