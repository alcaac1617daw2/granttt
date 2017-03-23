/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabeans;

import java.util.ArrayList;

/**
 *
 * @author alcampo
 */
public class Projecte {
    
    private Integer codi;
    private String nom;
    private ArrayList<Tasca> tasques = new ArrayList<>();

    public Projecte(Integer codi, String nom) {
        this.codi = codi;
        this.nom = nom;
    }
    
    public Projecte(Integer codi, String nom, ArrayList<Tasca> tasques) {
        this.codi = codi;
        this.nom = nom;
        this.tasques = tasques;
    }

    public Integer getCodi() {
        return codi;
    }

    public void setCodi(Integer codi) {
        this.codi = codi;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Tasca> getTasques() {
        return tasques;
    }

    public void setTasques(ArrayList<Tasca> tasques) {
        this.tasques = tasques;
    }
    
     public void EliminarTasques() {
        this.tasques.clear();
    }
  
    
    public void setNewTasca(Tasca tasca) {
        try{
        this.tasques.add(tasca);}
        catch(Exception e){
            System.out.println(e);
        }
    }
/*
    @Override
    public String toString() {
        return "Projecte{" + "amb codi=" + codi + ", nom=" + nom + "i tasques=" + tasques + '}';
    }
 */   
    

   

    
    
    
    
}
