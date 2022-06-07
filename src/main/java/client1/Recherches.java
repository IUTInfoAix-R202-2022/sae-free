package client1;

import javafx.fxml.Initializable;

import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

import static javafx.application.Application.launch;

public class
Recherches implements Initializable {


    public static void main(String[]args){
        launch(args);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        final String CONNECT_URL = "jdbc:postgresql://castor.db.elephantsql.com/ldtefamu";
        final String LOGIN = "ldtefamu";
        final String PASSWORD = "P9-z5ao1AZ5iPG9X3QBkbZNr3-w725g6";

        try {
            Connection con = DriverManager.getConnection(CONNECT_URL, LOGIN, PASSWORD);
            Statement statement = con.createStatement();

            ResultSet resultSet = statement.executeQuery("select p from Academie p  ");

            System.out.println(resultSet);
        } catch (SQLException e) {

        }
    }
}



