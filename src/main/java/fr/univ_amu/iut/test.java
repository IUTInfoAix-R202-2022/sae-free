package fr.univ_amu.iut;

import fr.univ_amu.iut.model.Acteur;
import jakarta.persistence.*;

public class test {
    public static void main(String[] args) {
        try(EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestionPedaPU")){
            try(EntityManager em = emf.createEntityManager()){
                TypedQuery<Acteur> query = em.createNamedQuery("Acteur.findAll", Acteur.class);
                System.out.println(query.getResultList());
            }
        }
    }
}
