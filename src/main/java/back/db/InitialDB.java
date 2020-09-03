package back.db;

import back.exception.CoreError;
import java.sql.*;
import static java.lang.System.out;


public class InitialDB {

    //  Database url
    static final String DB_URL = "jdbc:postgresql://localhost:5432/template1?useUnicode=yes&characterEncoding=UTF-8";

    public static void init() {
        ConnectionDB.JDBCDriverInit();
        Connection connection = ConnectionDB.getPostgresConnection(DB_URL);
        Statement statement = ConnectionDB.createPostgresStatement(connection);

        try {
            statement.execute("DROP TABLE if EXISTS Users;");
        } catch (SQLException exc) {
            throw new CoreError("Table not deleted", exc);
        }

        try {
            statement.executeUpdate("CREATE TABLE if NOT EXISTS Users (" +
                    "id serial PRIMARY KEY, " +
                    "name varchar NOT NULL, " +
                    "surname varchar NOT NULL, " +
                    "age integer NOT NULL, " +
                    "growth integer NOT NULL" +
                    ");"
            );
            out.println("Create table successfully");
        } catch (SQLException exc) { throw new CoreError("Table not created", exc); }

        try {
            statement.executeUpdate("INSERT INTO Users (name, surname, age, growth)" +
                    "VALUES" +
                    "('Саня', 'Белый', 29, 178)," +
                    "('Ваня', 'Стриж', 34, 174)," +
                    "('Копатыч', 'Смешарик', 34, 174)," +
                    "('Енотич', 'Вишнев', 34, 174)," +
                    "('Коля', 'Балда', 41, 179);"
            );
            out.println("Values inserted");
        } catch (SQLException exc) { throw new CoreError("Values not inserted", exc); }
    }
}
