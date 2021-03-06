package fr.univ_amu.iut.dao;

import fr.univ_amu.iut.model.TypeActeur;

import java.util.List;

public interface DAOTypeActeur extends DAO<TypeActeur, Number>{

    List<TypeActeur> findById(int id);

    List<TypeActeur> findByNom(String nom);
}
