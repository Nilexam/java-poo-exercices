import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static Connection connection;

    public static Connection getConnection() throws SQLException {
        if (connection == null) {
            String url = "jdbc:mysql://localhost:3306/mydatabase";
            String user = "myusername";
            String password = "mypassword";
            connection = DriverManager.getConnection(url, user, password);
        }
        return connection;
    }
}