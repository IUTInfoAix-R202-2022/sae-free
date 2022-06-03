package fr.univ_amu.iut.dao;

import fr.univ_amu.iut.model.TypeRessource;

import java.util.List;

public interface DAOTypeRessource extends DAO<TypeRessource> {

    List<TypeRessource> findByNom(String nom);
}
