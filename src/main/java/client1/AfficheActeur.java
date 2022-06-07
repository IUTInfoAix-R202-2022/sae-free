package client1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AfficheActeur {
    public static void main(String[] args) {

        try{

            Connection connexion = DriverManager.getConnection("jdbc:postgresql://castor.db.elephantsql.com/ldtefamu","ldtefamu","P9-z5ao1AZ5iPG9X3QBkbZNr3-w725g6");

            Statement instruction = connexion.createStatement();

            ResultSet resultat = instruction.executeQuery("SELECT * FROM Acteur");
            while(resultat.next()){

                System.out.println("---------------------------");
                System.out.println("Nom du client: "+resultat.getInt("ID"));
                System.out.println("Nom: "+resultat.getString("NOM"));
                System.out.println("prenom: "+resultat.getString("PRENOM"));


            }
        } catch (Exception e){

            e.printStackTrace();
        }

    }

}

