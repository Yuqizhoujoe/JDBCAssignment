package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDatabase {

    public static Connection getConnection(){
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "Whan5201314!");
        } catch (ClassNotFoundException | SQLException e) {
            connection = null;
            e.printStackTrace();
        }
        return connection;
    }

}
