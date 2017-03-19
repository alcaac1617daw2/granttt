/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabeans;

/**
 *
 * @author alcampo
 */
public class Tasca {
    
    private String nom;
    private String descripcio;
    private Integer Ndies;
    private Boolean realitzada;

    public Tasca(String nom, String descripcio, Integer Ndies, Boolean realitzada) {
        this.nom = nom;
        this.descripcio = descripcio;
        this.Ndies = Ndies;
        this.realitzada = realitzada;
    }
    
    

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public Integer getNdies() {
        return Ndies;
    }

    public void setNdies(Integer Ndies) {
        this.Ndies = Ndies;
    }

    public Boolean isRealitzada() {
        return realitzada;
    }

    public void setRealitzada(Boolean realitzada) {
        this.realitzada = realitzada;
    }

    @Override
    public String toString() {
        return "Tasca{" + "amb nom=" + nom + ", descripcio=" + descripcio + ",durada=" + Ndies + ", realitzada=" + realitzada + '}';
    }
    
    
    
    
}
