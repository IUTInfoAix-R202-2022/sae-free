package fr.univ_amu.iut.dao;


import fr.univ_amu.iut.model.Acteur;
import fr.univ_amu.iut.model.Usage;

import java.util.List;

public interface DAOUsage extends DAO<Usage, Number>{

    List<Acteur> findById(int id);

    List<Acteur> findByNom(String nom);

    List<Acteur> findByDescription(String description);

}
