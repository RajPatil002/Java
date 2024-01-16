package Jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database extends Mysql {
    private String DB;
    private Statement statement;

    Database(String db) throws SQLException {
        super();
        DB = db;
        setDatabase();
        statement = sql.createStatement();
    }

    void setDatabase() throws SQLException {
        sql.setCatalog(DB);
    }

    String getDatabase() throws SQLException {
        System.out.println(DB);
        return sql.getCatalog();
    }

    boolean runDMLQuery(String query) throws SQLException {
        return statement.execute(query);
    }

    boolean runDDLQuery(String query) throws SQLException {
        return runDMLQuery(query);
    }

    ResultSet runDQLQuery(String query) throws SQLException {
        return statement.executeQuery(query);
    }

    public static void main(String[] args) throws SQLException {
        Database db = new Database("InfoDB");
        System.out.println(db.getDatabase());
        db.runDDLQuery("""
                      create table user (
                    id int auto_increment not null,
                    name varchar(20) not null,
                    age int(3) not null,
                    primary key (id)
                );""");
    }
}
