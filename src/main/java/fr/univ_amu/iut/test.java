package fr.univ_amu.iut;


import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class test {
    public static void main(String[] args) {


        Connection con;
        {
            try {
                con = DriverManager.getConnection("jdbc:postgresql://castor.db.elephantsql.com/ldtefamu", "ldtefamu", "P9-z5ao1AZ5iPG9X3QBkbZNr3-w725g6");
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }

        ResultSet resultats = null;
        String requete = "SELECT Académie FROM test ";

        try {
            Statement stmt = con.createStatement();
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
        try {
            resultats.close();
        } catch (SQLException ex) {
            System.out.println("échec de la requête 6");
            throw new RuntimeException(ex);
        }

    }
    }


// Affichage du resultat