import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Q5MySQLDeleteExample {

    // JDBC URL, username, and password for MySQL database connection
    static final String DB_URL = "jdbc:mysql://localhost:3306/your_database_name";
    static final String USER = "your_username";
    static final String PASSWORD = "your_password";

    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            // Load the MySQL JDBC driver (optional for newer versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            System.out.println("Connecting to the database...");
            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);

            // SQL DELETE query using a placeholder for dynamic data
            String query = "DELETE FROM employees WHERE employee_id = ?";

            // Create a prepared statement
            preparedStatement = connection.prepareStatement(query);

            // Set the parameter for the employee_id in the query
            preparedStatement.setInt(1, 123); // Assuming employee_id is 123

            // Execute the prepared statement
            int rowsDeleted = preparedStatement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("An employee record was deleted successfully!");
            }

        } catch (SQLException e) {
            // Handle SQL exceptions
            System.out.println("SQL Exception: " + e.getMessage());
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // Handle Class Not Found exceptions
            System.out.println("JDBC Driver not found: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Close resources in the finally block
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                    System.out.println("Connection closed.");
                }
            } catch (SQLException e) {
                System.out.println("Error while closing resources: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
