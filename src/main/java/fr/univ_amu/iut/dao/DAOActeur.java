package fr.univ_amu.iut.dao;

import fr.univ_amu.iut.model.Academie;
import fr.univ_amu.iut.model.Acteur;
import fr.univ_amu.iut.model.Discipline;

import java.util.List;

public interface DAOActeur extends DAO<Acteur, Number>{

    List<Acteur> findByNom(String nom);

    List<Acteur> findById(int id);

    List<Acteur> findByPrenom(String prenom);

    List<Acteur> findByDiscipline(Discipline nom);

}
