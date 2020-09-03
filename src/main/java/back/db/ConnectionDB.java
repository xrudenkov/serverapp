package back.db;

import back.exception.CoreError;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDB {

    public static void JDBCDriverInit() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new CoreError("PostgresSQL JDBC Driver is not found.", e);
        }
    }
    public static Connection getPostgresConnection() {
        final String DB_URL = "jdbc:postgresql://localhost:5432/template1";

        try {
            return DriverManager.getConnection(DB_URL);
        } catch (SQLException e) {
            throw new CoreError("Connection Failed", e);
        }
    }
    public static Connection getPostgresConnection(String DB_URL) {
        try {
            return DriverManager.getConnection(DB_URL);
        } catch (SQLException e) {
            throw new CoreError("Connection Failed", e);
        }
    }
    public static Connection getPostgresConnection(String DB_URL, String USER, String PASS) {
        try {
            return DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException e) {
            throw new CoreError("Connection Failed", e);
        }
    }
    public static Statement createPostgresStatement(Connection connection) {
        try {
            return connection.createStatement();
        } catch (SQLException e) {
            throw new CoreError("Connection Failed", e);
        }
    }
}
