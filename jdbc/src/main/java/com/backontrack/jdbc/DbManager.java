package com.backontrack.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public enum DbManager {

    INSTANCE;

    private Connection connection;

    DbManager() {
        Properties connectionProps = new Properties();
        connectionProps.put("user", "backontracker");
        connectionProps.put("password", "letsdoit!");
        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/back_on_track" +
                            "?serverTimezone=Europe/Warsaw" +
                            "&useSSL=False&allowPublicKeyRetrieval=true",
                    connectionProps);
        } catch (SQLException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static DbManager getInstance() {
        return INSTANCE;
    }

    public Connection getConnection() {
        return connection;
    }
}