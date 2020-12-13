package com.linh.pttkht2.controller.impl;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDAO {
    protected String jdbcURL = "jdbc:mysql://localhost:3306/pttkht_btl";
    protected String jdbcUsername = System.getenv("DB_USERNAME");
    protected String jdbcPassword = System.getenv("DB_PASSWORD");
    public static Connection connection;

    public ConnectionDAO(){
        if(connection == null){
            String dbClass = "com.mysql.jdbc.Driver";
            try {
                Class.forName(dbClass);
                connection = DriverManager.getConnection (jdbcURL, jdbcUsername, jdbcPassword);
            }catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}
