package fr.univ_amu.iut.dao.jpa;


import fr.univ_amu.iut.dao.DAOAcademie;

import fr.univ_amu.iut.model.Academie;
import fr.univ_amu.iut.model.Discipline;
import fr.univ_amu.iut.model.RegionAcademique;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class DAOAcademieJPA implements DAOAcademie {
    private final EntityManager entityManager;

    public DAOAcademieJPA(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    public Academie insert(Academie academie) {
        entityManager.getTransaction().begin();
        entityManager.persist(academie);
        entityManager.getTransaction().commit();

        return entityManager.find(Academie.class, Academie.toutes());
    }
    public boolean update(Academie obj) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(obj);
            entityManager.getTransaction().commit();

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean delete(Academie obj) {
        return false;
    }

    @Override
    public List<Academie> findAll() {
        TypedQuery<Academie> query = entityManager.createNamedQuery("Academie.findAll", Academie.class);
        return query.getResultList();
    }

    @Override
    public Academie getById(int id) {
        return null;
    }

    @Override
    public Academie getById(String id) {
        return null;
    }

    @Override
    public List<Academie> findByNom(String nom) {
        return null;
    }

    @Override
    public List<Academie> findByCode(String code) {
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

}
