package client1;


import fr.univ_amu.iut.dao.DAOAcademie;
import fr.univ_amu.iut.dao.factory.DAOFactoryProducer;
import fr.univ_amu.iut.dao.factory.DAOType;
import fr.univ_amu.iut.model.Academie;


public class AfficheModuleDAOJPA {

    public static void main(String[] args) {

        DAOAcademie dao = (DAOAcademie) DAOFactoryProducer.getFactory(DAOType.JPA).createDAOAcademie();
       // System.out.println(Academie.findAll());
        System.out.println("\nOk.\n");
    }
}

