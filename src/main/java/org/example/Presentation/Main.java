package org.example.Presentation;

import org.example.DAO.Etudiant;
import org.example.DAO.EtudiantDAO;
import org.example.Service.EtudiantManager;
import org.example.Service.IEtudiantManager;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        EtudiantDAO etudiantDAO = new EtudiantDAO();
        EtudiantManager etudiantManager = new EtudiantManager(etudiantDAO);
        Etudiant S= new Etudiant("Abdelmonim","moumay");

        etudiantManager.addEtudiant(S);
        System.out.println(etudiantManager.AllEtudiants());
        }
    }
