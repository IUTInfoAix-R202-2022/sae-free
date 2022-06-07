package client1;

import fr.univ_amu.iut.model.Acteur;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AfficheActeur {
    public static void main(String[] args) {

        try{

            Connection connexion = DriverManager.getConnection("jdbc:postgresql://castor.db.elephantsql.com/ldtefamu","ldtefamu","P9-z5ao1AZ5iPG9X3QBkbZNr3-w725g6");

            Statement instruction = connexion.createStatement();

            ResultSet resultat = instruction.executeQuery("SELECT * FROM Acteur");

            while(resultat.next()){

                  List<Acteur> acteurs = new ArrayList<>();
                    Acteur acteur =new Acteur();
                    acteur.setNumero(resultat.getInt("ID"));
                    acteur.setNom(resultat.getString("NOM"));
                    acteur.setPrenom(resultat.getString("PRENOM"));
                    acteur.setTypeActeur(resultat.getString("TYPEAC"));
                    acteurs.add(acteur);
                System.out.println(acteurs);
                }

        } catch (Exception e){

            e.printStackTrace();
        }

    }

}

