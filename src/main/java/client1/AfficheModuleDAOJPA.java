package client1;


import fr.univ_amu.iut.dao.DAOAcademie;
import fr.univ_amu.iut.dao.factory.DAOFactoryProducer;
import fr.univ_amu.iut.dao.factory.DAOType;
import fr.univ_amu.iut.model.Academie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class AfficheModuleDAOJPA {

    public static void main(String[] args) {
        Connection connection;
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://castor.db.elephantsql.com/ldtefamu", "ldtefamu", "P9-z5ao1AZ5iPG9X3QBkbZNr3-w725g6");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        ResultSet résultats = null;
        String requête = "SELECT numéro FROM sae where numéro = 37";

    }
}


