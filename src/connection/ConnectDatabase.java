package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDatabase {
    public static Connection openConnection() throws ClassNotFoundException, SQLException {
        System.out.println("Helllowwww owwe ");
        Class.forName("com.mysql.cj.jdbc.Driver");
        String connectionURL = "jdbc:mysql://localhost/database_nmcnpm_nhom1";
        String username = "root";
        String password = "";
        return DriverManager.getConnection(connectionURL, username, password);
    }
}
