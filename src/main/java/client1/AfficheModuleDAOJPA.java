package client1;


import fr.univ_amu.iut.dao.DAOAcademie;
import fr.univ_amu.iut.dao.factory.DAOFactoryProducer;
import fr.univ_amu.iut.dao.factory.DAOType;
import fr.univ_amu.iut.model.Academie;


public class AfficheModuleDAOJPA {

    public static void main(String[] args) {



        DAOAcademie dao = DAOFactoryProducer.getFactory(DAOType.JPA).createDAOAcademie();
        Academie.toutes().stream().forEach(dao::insert);
        System.out.println(dao.findAll());
        System.out.println("\nOk.\n");
    }
}
