package org.example.DAO;

public class Etudiant {
    Long Id;
    String nom;
    String prenom;
    String email;

    public Etudiant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "Id_user=" + Id +
                ", name='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getName() {
        return nom;
    }

    public void setName(String name) {
        this.nom = name;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


