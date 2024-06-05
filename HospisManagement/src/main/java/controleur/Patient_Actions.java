/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controleur;

import Dao.ConnexionBase;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modele.Patient;

/**
 *
 * @author ideal
 */
public class Patient_Actions {
    //methode Patient_Add
    public void Patient_Add(Patient p){
        //connexion à la base
        ConnexionBase cb=new ConnexionBase();
        cb.connection();
        //requete sql
        String rep="insert into patient (nom, prenom,age ,sexe ,adresse)values('"+p.getNom()+"','"+p.getPrenom()+"','"+p.getAge()+"','"+p.getSexe()+"','"+p.getAdresse()+"')";
    
        try {
            //execution
            cb.st.executeUpdate(rep);
            JOptionPane.showMessageDialog(null, "Le patient est ajouté avec succès");
        } catch (SQLException ex) {
            Logger.getLogger(Patient_Actions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
        
    //methode Patient_Update
    public void Patient_Update(Patient p){
       //connexion
        ConnexionBase cb=new ConnexionBase();
        cb.connection();
        
        //requete
        String rep="update patient set nom='"+p.getNom()+"',prenom='"+p.getPrenom()+"',age='"+p.getAge()+"',sexe='"+p.getSexe()+"',adresse='"+p.getAdresse()+"' where codeP='"+p.getCodeP()+"'";
        
        try {
            //execution
            cb.st.executeUpdate(rep);
        } catch (SQLException ex) {
            Logger.getLogger(Patient_Actions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //methode Patient_Del
    public void Patient_Del(int codeP){
        ConnexionBase cb=new ConnexionBase();
        cb.connection();
        
        String rep="Delete from patient where codeP='"+codeP+"'";
        try {
            cb.st.executeUpdate(rep);
            JOptionPane.showMessageDialog(null, "Patient supprimé avec succès");
        } catch (SQLException ex) {
            Logger.getLogger(Patient_Actions.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    //methode Patient_Find
    public Patient Patient_Find  (int codeP){
    Patient p=null;
    p=new Patient();
    ResultSet rs=null;
    ConnexionBase cb=new ConnexionBase();
    cb.connection();
    String req="select*from patient where codeP='"+codeP+"'";
        try {
          rs= cb.st.executeQuery(req);
          if(rs.next()){
              p.setCodeP(rs.getInt("codeP"));
              p.setNom(rs.getString("nom"));
              p.setPrenom(rs.getString("prenom"));
              p.setAge(rs.getString("age"));
              p.setSexe(rs.getString("sexe"));
              p.setAdresse(rs.getString("adresse"));
          }
          else{
            JOptionPane.showMessageDialog(null, "aucun patient trouvé");
        }
        } catch (SQLException ex) {
            Logger.getLogger(Patient_Actions.class.getName()).log(Level.SEVERE, null, ex);
        }
        return p;
        
}
    
    
    //methode Patient_Liste
    public ResultSet Patient_Liste(){
        ResultSet rs=null;
        Patient p=new Patient();
        ConnexionBase cb=new ConnexionBase();
        cb.connection();
        
        String rep="Select * from patient ";

        try {
            rs=cb.st.executeQuery(rep);
        } catch (SQLException ex) {
            Logger.getLogger(Patient_Actions.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
        
    }
    
}
