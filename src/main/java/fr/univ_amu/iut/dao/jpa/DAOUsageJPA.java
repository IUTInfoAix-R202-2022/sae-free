package fr.univ_amu.iut.dao.jpa;

import fr.univ_amu.iut.dao.DAOUsage;
import fr.univ_amu.iut.model.Academie;
import fr.univ_amu.iut.model.Acteur;
import fr.univ_amu.iut.model.Usage;

import java.util.List;

public class DAOUsageJPA implements DAOUsage {
    @Override
    public boolean delete(Usage obj) {
        return false;
    }

    @Override
    public List<Academie> findAll() {
        return null;
    }

    @Override
    public Usage getById(int id) {
        return null;
    }

    @Override
    public Usage insert(Usage obj) {
        return null;
    }

    @Override
    public boolean update(Usage obj) {
        return false;
    }

    @Override
    public List<Acteur> findById(int id) {
        return null;
    }

    @Override
    public List<Acteur> findByNom(String nom) {
        return null;
    }

    @Override
    public List<Acteur> findByDescription(String description) {
        return null;
    }
}
