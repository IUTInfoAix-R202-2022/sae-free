package fr.univ_amu.iut.dao.jpa;

import fr.univ_amu.iut.dao.DAOAcademie;

import fr.univ_amu.iut.model.Academie;
import fr.univ_amu.iut.model.Discipline;
import fr.univ_amu.iut.model.RegionAcademique;
import jakarta.persistence.EntityManager;

import java.util.List;

public class DAOAcademieJPA implements DAOAcademie {

    private final EntityManager entityManager;
    public DAOAcademieJPA(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public boolean delete(Academie obj) {
        return false;
    }

    @Override
    public List<Academie> findAll() {
        return null;
    }

    @Override
    public Academie getById(int id) {
        return null;
    }

    @Override
    public Academie insert(Academie obj) {
        return null;
    }

    @Override
    public boolean update(Academie obj) {
        return false;
    }


    @Override
    public List<Academie> findByNom(String nom) {
        return null;
    }

    @Override
    public List<Academie> findByDiscipline(Discipline nom) {
        return null;
    }

    @Override
    public List<Academie> findByRegion(RegionAcademique regionAcademique) {
        return null;
    }

    @Override
    public List<Academie> findByCode(String code) {
        return null;
    }
}
