package fr.iut.pm.anbrousse1.ouafff;

/**
 * Created by anbrousse1 on 29/09/17.
 */

public class Chien {

    private String nom;
    private String race;
    private int agressivite;
    private double poids;
    private Sexe sexe;

    public Chien(String nom, String race, int agressivite, double poids, Sexe sexe) {
        this.nom = nom;
        this.race = race;
        this.agressivite = agressivite;
        this.poids = poids;
        this.sexe = sexe;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getAgressivite() {
        return agressivite;
    }

    public void setAgressivite(int agressivite) {
        this.agressivite = agressivite;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public Sexe getSexe() {
        return sexe;
    }

    public void setSexe(Sexe sexe) {
        this.sexe = sexe;
    }
}
