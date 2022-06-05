package fr.univ_amu.iut.dao;

import fr.univ_amu.iut.model.Acteur;
import java.util.List;

public interface DAOActeur extends DAO<Acteur, Number>{

    List<Acteur> findByNom(String nom);

    List<Acteur> findById(int id);

    List<Acteur> findByPrenom(String prenom);
}
