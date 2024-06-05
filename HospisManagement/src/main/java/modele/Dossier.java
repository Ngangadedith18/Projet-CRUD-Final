/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modele;

/**
 *
 * @author ideal
 */
public class Dossier {
    int Id;
    String dateCreation;
    String nature_Examen;
    String date_Examen;
    String Observations;
    int codeP;
    
    //constructeurs 

    public Dossier() {
    }

    public Dossier(int Id, String dateCreation, String nature_Examen, String date_Examen, String Observations, int codeP) {
        this.Id = Id;
        this.dateCreation = dateCreation;
        this.nature_Examen = nature_Examen;
        this.date_Examen = date_Examen;
        this.Observations = Observations;
        this.codeP = codeP;
    }

    public Dossier(String dateCreation, String nature_Examen, String date_Examen, String Observations, int codeP) {
        this.dateCreation = dateCreation;
        this.nature_Examen = nature_Examen;
        this.date_Examen = date_Examen;
        this.Observations = Observations;
        this.codeP = codeP;
    }
    
    //methode getter

    public int getId() {
        return Id;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public String getNature_Examen() {
        return nature_Examen;
    }

    public String getDate_Examen() {
        return date_Examen;
    }

    public String getObservations() {
        return Observations;
    }

    public int getCodeP() {
        return codeP;
    }
    
    //methode setter 

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    public void setNature_Examen(String nature_Examen) {
        this.nature_Examen = nature_Examen;
    }

    public void setDate_Examen(String date_Examen) {
        this.date_Examen = date_Examen;
    }

    public void setObservations(String Observations) {
        this.Observations = Observations;
    }

    public void setCodeP(int codeP) {
        this.codeP = codeP;
    }
    
    
}
