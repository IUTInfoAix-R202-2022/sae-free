package fr.univ_amu.iut.dao.jpa;

import fr.univ_amu.iut.dao.DAORessource;
import fr.univ_amu.iut.model.Academie;
import fr.univ_amu.iut.model.Ressource;

import java.util.List;

public class DAORessourceJPA implements DAORessource {
    @Override
    public boolean delete(Ressource obj) {
        return false;
    }

    @Override
    public List<Ressource> findAll() {
        return null;
    }

    @Override
    public Ressource getById(int id) {
        return null;
    }

    @Override
    public Ressource insert(Ressource obj) {
        return null;
    }

    @Override
    public boolean update(Ressource obj) {
        return false;
    }

    @Override
    public List<Ressource> findById(int id) {
        return null;
    }
}
