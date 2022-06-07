package client1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AfficheAcademie {
    public static void main(String[] args) {

        try{

            Connection connexion = DriverManager.getConnection("jdbc:postgresql://castor.db.elephantsql.com/ldtefamu","ldtefamu","P9-z5ao1AZ5iPG9X3QBkbZNr3-w725g6");

            Statement instruction = connexion.createStatement();

            ResultSet resultat = instruction.executeQuery("SELECT * FROM typeacteur");
            while(resultat.next()){

                System.out.println("---------------------------");
                System.out.println("Académie: "+resultat.getInt("ID"));
                System.out.println("Nom: "+resultat.getString("NOM"));

            }
        } catch (Exception e){

            e.printStackTrace();
        }

    }

}

