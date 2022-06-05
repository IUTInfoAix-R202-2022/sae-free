package fr.univ_amu.iut.dao;

import fr.univ_amu.iut.model.Academie;
import fr.univ_amu.iut.model.Discipline;

import java.util.List;

public interface DAODiscipline extends DAO<DAODiscipline, Number>{
    List<Discipline> findByNom(String nom);

    List<Discipline> findById(String id);

    List<Discipline> findByAcademie(Academie nom);
}
