package client1;

import fr.univ_amu.iut.model.Acteur;
import fr.univ_amu.iut.model.TypeActeur;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AfficheTypeActeur {
    public static void main(String[] args) {

        try{

            Connection connexion = DriverManager.getConnection("jdbc:postgresql://castor.db.elephantsql.com/ldtefamu","ldtefamu","P9-z5ao1AZ5iPG9X3QBkbZNr3-w725g6");

            Statement instruction = connexion.createStatement();

            ResultSet resultat = instruction.executeQuery("SELECT * FROM typeacteur");
            while(resultat.next()){

                System.out.println("---------------------------");
                System.out.println("Type Acteur: "+resultat.getInt("ID"));
                System.out.println("Nom: "+resultat.getString("NOM"));


            }
        } catch (Exception e){

            e.printStackTrace();
        }

    }

}

