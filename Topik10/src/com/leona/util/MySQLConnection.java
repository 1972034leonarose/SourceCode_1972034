package com.leona.util;
/**
 * @author Leona Rose
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Driver;
import java.sql.Statement;
public class MySQLConnection {
    private static final String URL = "jdbc:mariadb://localhost:3306/demodb";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    public MySQLConnection() {
    }

    public static Connection createConnection() throws SQLException, ClassNotFoundException {
        Class.forName("org.mariadb.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/demodb", "root", "");
        connection.setAutoCommit(false);
        return connection;
    }
}