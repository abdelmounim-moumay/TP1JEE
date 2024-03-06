package org.example.Service;

import org.example.DAO.Etudiant;

import java.util.List;

public interface IEtudiantManager {
    public Etudiant addEtudiant(Etudiant etudiant);
    public List<Etudiant> AllEtudiants();
}
