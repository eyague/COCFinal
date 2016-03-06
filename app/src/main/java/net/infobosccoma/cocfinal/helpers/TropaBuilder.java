package net.infobosccoma.cocfinal.helpers;

import net.infobosccoma.cocfinal.models.business.entities.Tropa;

import java.util.ArrayList;
import java.util.List;


public class TropaBuilder {
    public TropaBuilder() {
    }

    public List<Tropa> getTropa() {

        List<Tropa> persons = new ArrayList<>();

        persons.add(new Tropa("Barbar", "7", "Divisió 1", "Qualsevol", "Cos a cos"));
        persons.add(new Tropa("Arquera", "7", "Divisió 1", "Qualsevol", "A distancia"));
        persons.add(new Tropa("Goblin"," 6", "Divisió 1", "Recolectores i mines", "Cos a cos"));
        persons.add(new Tropa("Gegant", "7", "Divisió 2", "Defenses", "Cos a cos"));
        persons.add(new Tropa("Trencamurs", "6", "Divisió 2", "Muralles", "Cos a cos"));
        persons.add(new Tropa("Globus Bombastic", "6", "Divisió 2", "Defenses", "A distancia, en area"));
        persons.add(new Tropa("Mags", "6", "Divisió 2", "Qualsevol", "A distancia, en area"));
        persons.add(new Tropa("Remeiera", "4", "Divisió 3", "Tropes", "En area a les tropes terrestres"));
        persons.add(new Tropa("Drac", "5", "Divisió 3", "Qualsevol", "A distancia, en area"));
        persons.add(new Tropa("P.E.K.K.A", "5", "Divisió 3", "Qualsevol", "Cos a cos"));
        persons.add(new Tropa("Esbirro", "7", "Tropes Fosques", "Qualsevol", "A distancia"));
        persons.add(new Tropa("Muntaporcs", "5", "Tropes Fosques", "Defenses", "Cos a cos"));
        persons.add(new Tropa("Valquiria", "4", "Tropes Fosques", "Qualsevol", "Cos a cos, en area"));
        persons.add(new Tropa("Golem", "5", "Tropes Fosques", "Defenses", "Cos a cos"));
        persons.add(new Tropa("Bruixes", "3", "Tropes Fosques", "Qualsevol", "A distancia"));
        persons.add(new Tropa("Gos de lava", "3", "Tropes Fosques", "Anti-Aeris", "A distancia"));

        return persons;
    }
}
