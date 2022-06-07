package fr.univ_amu.iut.dao.jpa;

import fr.univ_amu.iut.dao.DAORegionAcademique;
import fr.univ_amu.iut.model.Academie;
import fr.univ_amu.iut.model.RegionAcademique;

import java.util.List;

public class DAORegionAcademiqueJPA implements DAORegionAcademique {
    @Override
    public boolean delete(RegionAcademique obj) {
        return false;
    }

    @Override
    public List<Academie> findAll() {
        return null;
    }

    @Override
    public RegionAcademique getById(int id) {
        return null;
    }

    @Override
    public RegionAcademique insert(RegionAcademique obj) {
        return null;
    }

    @Override
    public boolean update(RegionAcademique obj) {
        return false;
    }

    @Override
    public List<RegionAcademique> findByNom(int id) {
        return null;
    }

    @Override
    public List<RegionAcademique> findByNom(String nom) {
        return null;
    }
}
