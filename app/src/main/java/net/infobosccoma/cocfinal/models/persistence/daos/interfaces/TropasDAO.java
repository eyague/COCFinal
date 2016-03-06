package net.infobosccoma.cocfinal.models.persistence.daos.interfaces;

import net.infobosccoma.cocfinal.models.business.entities.Tropa;

import java.util.List;

/**
 * Created by eyague on 29/02/2016.
 */
public interface TropasDAO {
    Tropa getById(long id);
    List<Tropa> getAll();
    boolean save(Tropa tropa);
    boolean update(Tropa tropa);
    boolean delete(Tropa tropa);
}
