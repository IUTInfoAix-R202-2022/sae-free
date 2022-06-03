package fr.univ_amu.iut.dao;


import fr.univ_amu.iut.model.RegionAcademique;

import java.util.List;

public interface DAORegionAcademique extends DAO<RegionAcademique>{
    List<RegionAcademique> findByNom(int id);

    List<RegionAcademique> findByNom(String nom);
}
