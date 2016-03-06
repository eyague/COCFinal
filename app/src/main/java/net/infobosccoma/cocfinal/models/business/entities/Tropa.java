package net.infobosccoma.cocfinal.models.business.entities;

import android.widget.TextView;

import org.parceler.Parcel;

@Parcel
public class Tropa {

    private String nom;
    private String nivells;
    private String divisio;
    private String objPref;
    private String tipusAtac;
    private String urlImatgeTropa;
    private Long codi;

    public Tropa() {

    }

    public Tropa(String nom, String nivells, String divisio, String objPref, String tipusAtac) {
        this.nom = nom;
        this.nivells = nivells;
        this.divisio = divisio;
        this.objPref = objPref;
        this.tipusAtac = tipusAtac;

    }



    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNivells() {
        return nivells;
    }

    public void setNivells(String nivells) {
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

    public String getUrlImatge() {
        return urlImatgeTropa;
    }

    public void setUrlImatge(String urlImatgeTropa) {
        this.urlImatgeTropa = urlImatgeTropa;
    }

    public Long getCodi() {
        return codi;
    }

    public void setCodi(Long codi) {
        this.codi = codi;
    }
}
