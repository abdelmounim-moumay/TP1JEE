package org.example.DAO;

import java.util.ArrayList;
import java.util.List;

public class EtudiantDAO implements IEtudiant{
    List< Etudiant>  Etudiants = new ArrayList<>();

    @Override
    public  Etudiant addEtudiant( Etudiant etudiant) {
        Etudiants.add(etudiant);
        return etudiant;
    }
    @Override
    public  Etudiant getEtudiantByEmail(String email) {
        return null;
    }

    @Override
    public List< Etudiant> getAllEtudiants() {
        return  Etudiants;
    }

}
