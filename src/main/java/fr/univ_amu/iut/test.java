package fr.univ_amu.iut;


import fr.univ_amu.iut.model.Academie;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;


public class test {
    public static void main(String[] args) {
        try(EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestionUsagesPU")){
            try(EntityManager em = emf.createEntityManager()){
                TypedQuery<Academie> query = em.createNamedQuery("Academie.findAll", Academie.class);
                query.setParameter("nom","");
                System.out.println(query.getResultList());
            }
        }
    }
}
