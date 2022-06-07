package fr.univ_amu.iut.dao.jpa;

import fr.univ_amu.iut.dao.DAOTypeRessource;
import fr.univ_amu.iut.model.Academie;
import fr.univ_amu.iut.model.TypeRessource;

import java.util.List;

public class DAOTypeRessourceJPA implements DAOTypeRessource {
    @Override
    public boolean delete(TypeRessource obj) {
        return false;
    }

    @Override
    public List<TypeRessource> findAll() {
        return null;
    }

    @Override
    public TypeRessource getById(int id) {
        return null;
    }

    @Override
    public TypeRessource insert(TypeRessource obj) {
        return null;
    }

    @Override
    public boolean update(TypeRessource obj) {
        return false;
    }

    @Override
    public List<TypeRessource> findByNom(String nom) {
        return null;
    }
}
