package client1;


import fr.univ_amu.iut.dao.DAOActeur;
import fr.univ_amu.iut.dao.factory.DAOFactoryProducer;
import fr.univ_amu.iut.dao.factory.DAOType;



public class AfficheActeur {

    public static void main(String[] args) {



        DAOActeur dao = DAOFactoryProducer.getFactory(DAOType.JPA).createDAOActeur();
        System.out.println(dao.findAll());
        System.out.println("\nOk.\n");
    }
}
