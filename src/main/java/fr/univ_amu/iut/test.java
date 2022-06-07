package fr.univ_amu.iut;


import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class test {
    public static String main(String[] args) throws SQLException {


        Connection connexion;
        {
            try {
                connexion = DriverManager.getConnection("jdbc:postgresql://castor.db.elephantsql.com/ldtefamu", "ldtefamu", "P9-z5ao1AZ5iPG9X3QBkbZNr3-w725g6");
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }

        ResultSet resultats = null;
        String requete = "SELECT type_dacteurs, identité_des_acteurs_nom_prénom FROM test ";

        try {
            Statement stmt = connexion.createStatement();
            resultats = stmt.executeQuery(requete);
        } catch (SQLException e) {
            //traitement de l'exception
        }
        ResultSetMetaData rsmd = null;
        try {
            rsmd = resultats.getMetaData();
        } catch (SQLException ex) {
            System.out.println("échec de la requête 2");
            throw new RuntimeException(ex);
        }
        int nbCols = 0;
        try {
            nbCols = rsmd.getColumnCount();
        } catch (SQLException ex) {
            System.out.println("échec de la requête 3");
            throw new RuntimeException(ex);
        }

        while (true) {

            try {
                if (!resultats.next()) break;
            } catch (SQLException ex) {
                System.out.println("échec de la requête 4");
                throw new RuntimeException(ex);
            }
            try {
                rsmd = resultats.getMetaData();
                nbCols = rsmd.getColumnCount();
                while (resultats.next()) {
                    for (int i = 1; i <= nbCols; i++)
                        System.out.print(resultats.getString(i) + " ");
                    System.out.println();
                }
                resultats.close();
            } catch (SQLException e) {
                //traitement de l'exception
            }
            System.out.println();
        }

        return requete;
    }

}


// Affichage du resultat