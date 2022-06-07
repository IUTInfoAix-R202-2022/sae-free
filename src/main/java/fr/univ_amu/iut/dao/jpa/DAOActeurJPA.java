package fr.univ_amu.iut.dao.jpa;

import fr.univ_amu.iut.dao.DAOActeur;
import fr.univ_amu.iut.model.Acteur;
import fr.univ_amu.iut.model.Coordonees;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class DAOActeurJPA implements DAOActeur {
    private final EntityManager entityManager;

    public DAOActeurJPA(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public boolean delete(Acteur obj) {
        try {
            entityManager.getTransaction().begin();
            entityManager.remove(obj);
            entityManager.getTransaction().commit();

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<Acteur> findAll() {
        TypedQuery<Acteur> query = entityManager.createNamedQuery("Acteur.findAll", Acteur.class);
        return query.getResultList();
    }

    @Override
    public Acteur getById(int id) {
        return null;
    }

    @Override
    public Acteur insert(Acteur obj) {
        entityManager.getTransaction().begin();
        entityManager.persist(obj);
        entityManager.getTransaction().commit();
        return entityManager.find(Acteur.class, obj.getNom());
    }

    @Override
    public boolean update(Acteur obj) {
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
    public List<Acteur> findByNom(String nom) {
        TypedQuery<Acteur> query = entityManager.createNamedQuery("Acteur.findAll", Acteur.class);
        return query.getResultList();
    }

    @Override
    public List<Acteur> findById(int id) {
        return null;
    }

    @Override
    public List<Acteur> findByPrenom(String prenom) {
        return null;
    }


    @Override
    public List<Acteur> findByCoordonees(Coordonees coordonees) {
        return null;
    }
}
