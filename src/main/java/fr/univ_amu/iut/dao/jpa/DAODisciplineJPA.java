package fr.univ_amu.iut.dao.jpa;

import fr.univ_amu.iut.dao.DAODiscipline;
import fr.univ_amu.iut.model.Academie;
import fr.univ_amu.iut.model.Discipline;

import java.util.List;

public class DAODisciplineJPA implements DAODiscipline {
    @Override
    public boolean delete(Discipline obj) {
        return false;
    }

    @Override
    public List<Discipline> findAll() {
        return null;
    }

    @Override
    public Discipline getById(int id) {
        return null;
    }

    @Override
    public Discipline insert(Discipline obj) {
        return null;
    }

    @Override
    public boolean update(Discipline obj) {
        return false;
    }

    @Override
    public List<Discipline> findByNom(String nom) {
        return null;
    }

    @Override
    public List<Discipline> findById(String id) {
        return null;
    }

    @Override
    public List<Discipline> findByAcademie(Academie nom) {
        return null;
    }
}
