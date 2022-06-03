package client1;

import fr.univ_amu.iut.dao.DAOAcademie;
import fr.univ_amu.iut.dao.factory.DAOFactoryProducer;
import fr.univ_amu.iut.dao.factory.DAOType;

public class AfficheModuleDAOJPA {

    public static void main(String[] args) {

        DAOAcademie dao = DAOFactoryProducer.getFactory(DAOType.JPA).createDAOAcademie();
        System.out.println(dao.findAll());
        System.out.println("\nOk.\n");
    }
}
