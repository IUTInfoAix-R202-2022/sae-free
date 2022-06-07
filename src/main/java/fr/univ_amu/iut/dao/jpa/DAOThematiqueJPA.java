package fr.univ_amu.iut.dao.jpa;

import fr.univ_amu.iut.dao.DAOThematique;
import fr.univ_amu.iut.model.Academie;
import fr.univ_amu.iut.model.Thematique;

import java.util.List;

public class DAOThematiqueJPA implements DAOThematique {
    @Override
    public boolean delete(Thematique obj) {
        return false;
    }

    @Override
    public List<Academie> findAll() {
        return null;
    }

    @Override
    public Thematique getById(int id) {
        return null;
    }

    @Override
    public Thematique insert(Thematique obj) {
        return null;
    }

    @Override
    public boolean update(Thematique obj) {
        return false;
    }

    @Override
    public List<Thematique> findById(int id) {
        return null;
    }

    @Override
    public List<Thematique> findByNom(String nom) {
        return null;
    }
}
