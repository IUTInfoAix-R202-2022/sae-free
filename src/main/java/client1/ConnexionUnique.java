package client1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionUnique {
    static final String CONNECT_URL = "jdbc:postgresql://castor.db.elephantsql.com/ldtefamu";
    static final String LOGIN = "ldtefamu";
    static final String PASSWORD = "P9-z5ao1AZ5iPG9X3QBkbZNr3-w725g6";

    private Connection connection;
    private static ConnexionUnique instance;

    private ConnexionUnique()
    {
    }

    public Connection getConnection() {
        return connection;
    }

    public static ConnexionUnique getInstance() {
        if (instance == null) {
            try {
                instance = new ConnexionUnique();
                instance.connection = DriverManager.getConnection(CONNECT_URL, LOGIN, PASSWORD);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            try {
                if (instance.connection.isClosed()) {
                    instance.connection = DriverManager.getConnection(CONNECT_URL, LOGIN, PASSWORD);

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return instance;
    }
}


