package dbUtil;

import java.sql.*;


public class databaseService {

    private static String userName = "USER";
    private static String password = "PASSWORD";
    private static String URL = "jdbc:mysql://localhost:8080/login";
    private static String SQL_Connection = "jbdc:sqlite:JAVA_NEW.sqlite";

    public static Connection establishConnection() throws SQLException {
        Class.forName("org.sqlite.JDBC");
        return DriverManager.getConnection(SQL_Connection);
        return null;
    }
}
