package com.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnect {
    public static Connection connect;
    public static Statement statement;
    public static ResultSet resultset;

    private static final String DB_URL = "jdbc:mysql://localhost:3306/db_pipsterr";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "";

    public static void connection() {
        try {
            connect = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Connection: Gagal");
        }
    }
}
