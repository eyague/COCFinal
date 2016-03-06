package net.infobosccoma.cocfinal.models.business.entities;

/**
 * Created by eyague on 25/02/2016.
 */
public class Hero {

    private String nom;
    private int nivells;
    private String divisio;
    private String objPref;
    private String tipusAtac;
    private String urlImatgeHero;

    public Hero() {

    }

    public Hero(String nom, int nivells, String divisio, String objPref, String tipusAtac, String urlImatgeHero) {
        this.nom = nom;
        this.nivells = nivells;
        this.divisio = divisio;
        this.objPref = objPref;
        this.tipusAtac = tipusAtac;
        this.urlImatgeHero = urlImatgeHero;

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNivells() {
        return nivells;
    }

    public void setNivells(int nivells) {
        this.nivells = nivells;
    }

    public String getDivisio() {
        return divisio;
    }

    public void setDivisio(String divisio) {
        this.divisio = divisio;
    }

    public String getObjPref() {
        return objPref;
    }

    public void setObjPref(String objPref) {
        this.objPref = objPref;
    }

    public String getTipusAtac() {
        return tipusAtac;
    }

    public void setTipusAtac(String tipusAtac) {
        this.tipusAtac = tipusAtac;
    }

    public String getUrlImatgeHero() {
        return urlImatgeHero;
    }

    public void setUrlImatgeHero(String urlImatgeHero) {
        this.urlImatgeHero = urlImatgeHero;
    }
}
