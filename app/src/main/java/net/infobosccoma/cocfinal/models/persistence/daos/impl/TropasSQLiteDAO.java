package net.infobosccoma.cocfinal.models.persistence.daos.impl;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import net.infobosccoma.cocfinal.models.business.entities.Tropa;
import net.infobosccoma.cocfinal.models.persistence.daos.interfaces.TropasDAO;
import net.infobosccoma.cocfinal.models.persistence.utilities.SQLiteUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eyague on 29/02/2016.
 */
public class TropasSQLiteDAO implements TropasDAO {

    private Context context;

    public TropasSQLiteDAO(Context context) {
        this.context = context;
    }

    public Tropa getById(long id) {
        Tropa tropa = null;
        SQLiteDatabase conn = SQLiteUtils.getConnection(context);
        Cursor result = conn.query(true, "Tropas",
                new String[]{"codi", "nom","divisio", "nivells", "objPref", "tipusAtac"},
                "codi = ?", new String[]{String.valueOf(id)}, null, null, null, null, null);

        tropa = SQLiteUtils.getTropa(result);
        conn.close();

        return tropa;
    }

    public Tropa getTropa(String nom, String divisio, String nivell) {
        Tropa tropa = null;
        SQLiteDatabase conn = SQLiteUtils.getConnection(context);
        Cursor result = conn.query(true, "Tropas",
                new String[]{"codi", "nom","divisio", "nivells", "objPref", "tipusAtac"},
                "nom = ?", new String[]{nom}, null, null, null, null, null);

        tropa = SQLiteUtils.getTropa(result);
        conn.close();

        return tropa;
    }
    @Override
    public List<Tropa> getAll() {
        List<Tropa> tropas = new ArrayList<>();

        SQLiteDatabase conn = SQLiteUtils.getConnection(context);

        Cursor result = conn.query(true, "Tropas",
                new String[]{"codi", "nom", "nivells", "divisio", "objPref", "tipusAtac"},
                null, null, null, null, null, null, null);
        while (result.moveToNext()) {
            tropas.add(SQLiteUtils.getTropa(result));
        }

        conn.close();

        return tropas;
    }

    @Override
    public boolean save(Tropa tropa) {
        ContentValues dades = new ContentValues();
        SQLiteDatabase conn = SQLiteUtils.getConnection(context);

        dades.put("nom", tropa.getNom());
        dades.put("nivells", tropa.getNivells());
        dades.put("divisio", tropa.getDivisio());
        dades.put("objPref", tropa.getObjPref());
        dades.put("tipusAtac", tropa.getTipusAtac());

        try{
            long index = conn.insertOrThrow("Tropas",null,dades);
            tropa.setCodi(index);
            return true;

        }catch(SQLException e){
            Log.e("Tropas", e.getMessage());
            return false;
        }

    }

    @Override
    public boolean update(Tropa tropa) {
        ContentValues dades = new ContentValues();
        SQLiteDatabase conn = SQLiteUtils.getConnection(context);

        dades.put("nom", tropa.getNom());
        dades.put("nivell", tropa.getNivells());
        dades.put("divisio", tropa.getDivisio());
        dades.put("objPref", tropa.getObjPref());
        dades.put("tipusAtac", tropa.getTipusAtac());

        return conn.update("Tropas", dades, "codi = ?", new String[] {String.valueOf(tropa.getCodi())}) > 0;


    }

    @Override
    public boolean delete(Tropa tropa) {
        SQLiteDatabase conn = SQLiteUtils.getConnection(context);
        return conn.delete("Tropas", "codi = ?", new String[] {String.valueOf(tropa.getCodi())})> 0;
    }

}
