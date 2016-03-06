package net.infobosccoma.cocfinal.models.persistence.utilities;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import net.infobosccoma.cocfinal.models.business.entities.Tropa;

/**
 * Created by eyague on 29/02/2016.
 */
public class SQLiteUtils {
    static final String NOM_DB = "TropasDB.db";
    static final int VERSIO_BD = 4;

    public static SQLiteDatabase getConnection(Context context) {

        return new TropasSQLiteHelper(context, NOM_DB, null, VERSIO_BD).getWritableDatabase();
    }
    public static Tropa getTropa(Cursor reader) {
        Tropa tropa = new Tropa();

        tropa.setCodi(reader.getLong(reader.getColumnIndex("codi")));
        tropa.setNom(reader.getString(reader.getColumnIndex("nom")));
        tropa.setDivisio(reader.getString(reader.getColumnIndex("divisio")));
        tropa.setNivells(reader.getString(reader.getColumnIndex("nivells")));
        tropa.setObjPref(reader.getString(reader.getColumnIndex("objPref")));
        tropa.setTipusAtac(reader.getString(reader.getColumnIndex("tipusAtac")));


        return tropa;

    }
}
