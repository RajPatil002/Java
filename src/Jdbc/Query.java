package Jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Query extends Database {
    String TABLE = "user";

    Query(String db) throws SQLException {
        super(db);
    }

    private String getInsertQuery(String name, int age) throws SQLException {
        return String.format("insert into %s(name,age) values('%s',%s);", TABLE, name, age);
    }

    boolean insert(String name, int age) throws SQLException {
        return runDMLQuery(getInsertQuery(name, age));
    }

    boolean delete(String condition) throws SQLException {
        return runDMLQuery(String.format("delete from %s where %s;", TABLE, condition));
    }

    boolean update(String updatewith, String condition) throws SQLException {
        return runDMLQuery(String.format("update %s set %s where %s", TABLE, updatewith, condition));
    }

    boolean update(String updatewith) throws SQLException {
        return runDMLQuery(String.format("update %s set %s ", TABLE, updatewith));
    }

    private String getRow(ResultSet rs) throws SQLException {
        return String.format("\t |  %-5s |\t%-10s | %3s ", rs.getString("id"), rs.getString("name"),
                rs.getString("age"));
    }

    void showResult() throws SQLException {
        ResultSet rs = runDQLQuery(String.format("select * from %s", TABLE));
        System.out.println(String.format("\t |  %-5s |\t%-10s | %3s \n", "ID", ("name"), ("age")));
        while (rs.next()) {
            System.out.println(rs.getRow() + getRow(rs));
        }
    }

    public static void main(String[] args) throws SQLException {
        Query q = new Query("InfoDB");
        // q.insert("Raj", 21);
        // q.insert("Ram", 30);
        // q.insert("Ravi", 2);
        q.showResult();
        q.update("age = age - 10", "id %2 = 0");
        // q.showResult();
        // q.delete("id %3 = 0");
        q.showResult();
        q.disconnect();
        System.out.println(q.sql.isClosed());
    }

}
