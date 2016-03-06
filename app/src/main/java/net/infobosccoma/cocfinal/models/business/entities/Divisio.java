package net.infobosccoma.cocfinal.models.business.entities;

/**
 * Created by eyague on 17/02/2016.
 */
public class Divisio {
    private String nom;
    private int nivell;
    private String tropes;
    private String urlImatgeDivisio;

    public Divisio(String nom, int nivell, String tropes, String urlImatgeDivisio) {
        this.nom = nom;
        this.nivell = nivell;
        this.tropes = tropes;
        this.urlImatgeDivisio = urlImatgeDivisio;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNivell() {
        return nivell;
    }

    public void setNivell(int nivell) {
        this.nivell = nivell;
    }

    public String getTropes() {
        return tropes;
    }

    public void setTropes(String tropes) {
        this.tropes = tropes;
    }

    public String getUrlImatgeDivisio() {
        return urlImatgeDivisio;
    }

    public void setUrlImatgeDivisio(String urlImatgeDivisio) {
        this.urlImatgeDivisio = urlImatgeDivisio;
    }
}
