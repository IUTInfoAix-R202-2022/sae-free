package client1;


import fr.univ_amu.iut.model.Acteur;
import fr.univ_amu.iut.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class AfficheActeur {
    // La requete de test
    private static final String reqEtudiantsAixois = "SELECT type_dacteurs "
            +
            "FROM test " ;

    public static void main(String[] args) {
        // Connexion a la base de données
        System.out.println("Connexion");
        try (Connection conn = ConnexionUnique.getInstance().getConnection()) {
            System.out.println("Connecte\n");

            // Creation d'une instruction SQL
            Statement statement = conn.createStatement();

            // Execution de la requete
            System.out.println("Execution de la requete : " + reqEtudiantsAixois);
            ResultSet result = statement.executeQuery(reqEtudiantsAixois);

            List<Acteur> acteurs = new ArrayList<>();
            // Affichage du resultat
            while (result.next()) {
                Acteur acteur = new Acteur();
                acteur.setTypeActeur(test.main(args));
                acteurs.add(acteur);
            }
            System.out.println(acteurs);

            // Fermeture de l'instruction (liberation des ressources)
            statement.close();
            System.out.println("\nOk.\n");
        } catch (SQLException e) {
            e.printStackTrace();// Arggg!!!
            System.out.println(e.getMessage() + "\n");
        }
    }
}

