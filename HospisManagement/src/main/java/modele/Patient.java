/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modele;

/**
 *
 * @author ideal
 */
public class Patient {
    int codeP;
    String nom;
    String prenom;
    String age;
    String sexe;
    String adresse;
    
    //contructeurs 

    public Patient() {
    }

    public Patient(int codeP, String nom, String prenom, String age, String sexe, String adresse) {
        this.codeP = codeP;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.sexe = sexe;
        this.adresse = adresse;
    }

    public Patient(String nom, String prenom, String age, String sexe, String adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.sexe = sexe;
        this.adresse = adresse;
    }
    
    //methode getter

    public int getCodeP() {
        return codeP;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAge() {
        return age;
    }

    public String getSexe() {
        return sexe;
    }

    public String getAdresse() {
        return adresse;
    }
    
    //methode setter 

    public void setCodeP(int codeP) {
        this.codeP = codeP;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    
}
