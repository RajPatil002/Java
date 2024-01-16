package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Mysql {
    protected Connection sql;
    private final String url = "jdbc:mysql://localhost:3306";
    private String USER = "me";
    private String PASSWORD = "rajp002";

    Mysql() throws SQLException {
        if (sql == null || sql.isClosed())
            sql = DriverManager.getConnection(url, USER, PASSWORD);
    }

    Mysql(String user, String password) throws SQLException {
        USER = user;
        PASSWORD = password;
        connect();
    }

    public Connection connect() throws SQLException {
        if (sql == null || sql.isClosed())
            sql = DriverManager.getConnection(url, USER, PASSWORD);
        return sql;
    }

    public void disconnect() throws SQLException {
        sql.close();
    }

    // public static void main(String[] args) throws Exception {
    // Class.forName("com.mysql.cj.jdbc.Driver");
    // Mysql mc = new Mysql();
    // mc.connect();
    // mc.disconnect();
    // System.out.println("Connected " + mc.sql.isClosed());
    // mc.connect();
    // System.out.println("Connected " + mc.sql.isClosed());
    // }
}
