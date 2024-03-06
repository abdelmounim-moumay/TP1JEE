package org.example.DAO;

import java.util.List;

public interface IEtudiant {


    Etudiant addEtudiant(Etudiant etudiant);

    public Etudiant getEtudiantByEmail(String email);
    public List<Etudiant> getAllEtudiants();
}
