package net.infobosccoma.cocfinal.helpers;

import net.infobosccoma.cocfinal.models.business.entities.Pocio;

import java.util.ArrayList;
import java.util.List;


public class PocioBuilder {
    public PocioBuilder() {
    }

    public List<Pocio> getPocio() {

        List<Pocio> persons = new ArrayList<>();

        persons.add(new Pocio("Poció de raig", 7, "Poció", "Qualsevol tropa o edifici enemic", "Mal a enemic", "@drawable/lightning.png"));
        persons.add(new Pocio("Poció de curació", 6, "Poció", "Qualsevol tropa aliada", "Curació a tropa aliada", "@drawable/healing.png"));
        persons.add(new Pocio("Poció de furia", 5, "Poció", "Qualsevol tropa aliada", "Augment de mal i velocitat a tropes aliades", "@drawable/rage.png"));
        persons.add(new Pocio("Poció de salt", 3, "Poció", "Qualsevol tropa aliada", "Saltar la muralla que hi ha al rang de la pocio per les tropes aliades", "@drawable/jump.png"));
        persons.add(new Pocio("Poció de congelació", 5, "Poció", "Qualsevol tropa o edifici enemic", "Congela les tropes o edificis enemics i deixen d'atacar", "@drawable/freeze.png"));
        persons.add(new Pocio("Poció de verí", 4, "Poció Fosca", "Qualsevol tropa enemiga", "Enverina a les tropes enemigas i les pot arrivar a matar", "@drawable/poison.png"));
        persons.add(new Pocio("Poció de terratremol", 4, "Poció Fosca", "Defenses", "Treu un % de vida als edificis enemics i x4 a les muralles", "@drawable/earthquake.png"));
        persons.add(new Pocio("Poció de velocitat", 4, "Poció Fosca", "Tropes aliades", "Augmenta la velocitat de les propes aliades", "@drawable/haste.png"));

        return persons;
    }
}
