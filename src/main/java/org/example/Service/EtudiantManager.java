package org.example.Service;

import org.example.DAO.Etudiant;
import org.example.DAO.IEtudiant;

import java.util.List;

public class EtudiantManager implements IEtudiantManager {
    IEtudiant etudiantInterface;

    public EtudiantManager(IEtudiant etudiantInterface) {
        this.etudiantInterface = etudiantInterface;
    }

    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        if(etudiantInterface.getEtudiantByEmail(etudiant.getEmail())==null){
            return etudiantInterface.addEtudiant(etudiant);
        }
        return null;
    }

    @Override
    public List<Etudiant> AllEtudiants() {
        return etudiantInterface.getAllEtudiants();
    }
}
