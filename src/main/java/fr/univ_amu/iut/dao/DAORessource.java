package fr.univ_amu.iut.dao;

import fr.univ_amu.iut.model.Ressource;

import java.util.List;

public interface DAORessource extends DAO<Ressource, Number>{

    List<Ressource> findById(int id);

}
