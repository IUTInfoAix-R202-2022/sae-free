package fr.univ_amu.iut.dao;

import fr.univ_amu.iut.model.Academie;
import fr.univ_amu.iut.model.Discipline;
import fr.univ_amu.iut.model.RegionAcademique;

import java.util.List;


public interface DAOAcademie extends DAO<Academie>{

    Academie getById(String id);

    List<Academie> findByNom(String nom);

    List<Academie> findByCode(String code);

    List<Academie> findByRegion(RegionAcademique regionAcademique);

    List<Academie> findByDiscipline(Discipline nom);

}
