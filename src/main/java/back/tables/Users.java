package back.tables;

import back.db.ConnectionDB;
import back.exception.CoreError;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static java.lang.System.out;

public class Users {
    public static void create() {
        String createTable = "CREATE TABLE if NOT EXISTS Users (" +
                "id serial PRIMARY KEY, " +
                "name varchar NOT NULL, " +
                "surname varchar NOT NULL, " +
                "age integer NOT NULL, " +
                "growth integer NOT NULL);";
        try {
            PreparedStatement preparedStatement = ConnectionDB.getPostgresConnection().prepareStatement(createTable);
            preparedStatement.execute();
            out.println("Create table successfully");
        } catch (SQLException exc) { throw new CoreError("Table not created", exc); }
    }

    public static void update(String name, String surname, int age, int grown) {
        String responseInsert = "INSERT INTO Users (name, surname, age, growth)" +
                " VALUES ('"+name+"', '"+surname+"', "+age+", "+grown+");";

        try {
            PreparedStatement preparedStatement = ConnectionDB.getPostgresConnection().prepareStatement(responseInsert);
            preparedStatement.execute();
            out.println("Values inserted");
        } catch (SQLException exc) { throw new CoreError("Values not inserted", exc); }
    }

    public static ResultSet read() throws SQLException {
        String selectUsers = "SELECT * FROM Users";

        PreparedStatement preparedStatement = ConnectionDB.getPostgresConnection().prepareStatement(selectUsers);
        return preparedStatement.executeQuery();
    }

    public static void delete(int id) {
        String deleteRecord = "DELETE FROM Users WHERE id = " + id + ";";

        try {
            PreparedStatement preparedStatement = ConnectionDB.getPostgresConnection().prepareStatement(deleteRecord);
            preparedStatement.execute();
        } catch (SQLException exc) {
            throw new CoreError("Record not deleted", exc);
        }
    }

    public static void drop() {
        String dropTable = "DROP TABLE if EXISTS Users;";

        try {
            PreparedStatement preparedStatement = ConnectionDB.getPostgresConnection().prepareStatement(dropTable);
            preparedStatement.execute();
        } catch (SQLException exc) {
            throw new CoreError("Table not deleted", exc);
        }
    }
}
