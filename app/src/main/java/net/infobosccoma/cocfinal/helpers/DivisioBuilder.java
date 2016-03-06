package net.infobosccoma.cocfinal.helpers;


import net.infobosccoma.cocfinal.models.business.entities.Divisio;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eyague on 17/02/2016.
 */
public class DivisioBuilder {
    public DivisioBuilder() {
    }

    public List<Divisio> get() {

        List<Divisio> persons = new ArrayList<>();

        persons.add(new Divisio("Divisió 1", 1, "Barbar, Arquera, Goblin", "@drawable/troopt1.png"));
        persons.add(new Divisio("Divisió 2", 2, "Gegant, trencamurs, Globus bombastic, Mag","@drawable/troopt2.png"));
        persons.add(new Divisio("Divisió 3", 3, "Remaiera, Drac, P.E.K.K.A","@drawable/troopt3.png"));
        persons.add(new Divisio("Tropas Fosques", 4, "Esbirro, Montaporcs, Valquiria, Golem, Bruixa, Gos de lava","@drawable/troopdep.png"));
        persons.add(new Divisio("Pocions", 5, "Poció de raig, Poció de curació, Poció de furia, Poció de salt, Poció de congelació","@drawable/troopspells.png"));
        persons.add(new Divisio("Pocions fosques", 6, "Poció de verí, Pocio de terratremol, Poció de velocitat","@drawable/troopspells.png"));

        return persons;
    }
}
