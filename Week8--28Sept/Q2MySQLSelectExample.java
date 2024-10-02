import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Q2MySQLSelectExample {
    // JDBC URL, username, and password for MySQL database connection
    static final String DB_URL = "jdbc:mysql://localhost:3306/your_database_name";
    static final String USER = "your_username";
    static final String PASSWORD = "your_password";

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;

        try {
            // Load the MySQL JDBC driver (optional for newer versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            System.out.println("Connecting to the database...");
            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);

            // Create a statement object to execute the query
            statement = connection.createStatement();
            
            // SQL SELECT query to retrieve all records from the "customers" table
            String query = "SELECT * FROM customers";

            // Execute the query and store the result in a ResultSet
            ResultSet resultSet = statement.executeQuery(query);

            // Process the result set
            while (resultSet.next()) {
                // Assuming the table has columns: id (int), name (String), and email (String)
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");

                // Print the retrieved data
                System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
            }

            // Close the ResultSet
            resultSet.close();

        } catch (SQLException e) {
            // Handle SQL exception
            System.out.println("SQL Exception: " + e.getMessage());
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // Handle Class Not Found exception
            System.out.println("JDBC Driver not found: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Close the statement and connection in the "finally" block
            try {
                if (statement != null) {
                    statement.close();
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
