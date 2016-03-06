package net.infobosccoma.cocfinal.models.persistence.utilities;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by eyague on 29/02/2016.
 */
public class TropasSQLiteHelper extends SQLiteOpenHelper {

    private final String SQL_CREATE_TROPA = "CREATE TABLE Tropas(" +
            "	codi INTEGER PRIMARY KEY AUTOINCREMENT, " +
            "	nom TEXT, " +
            "	divisio TEXT," +
            "   nivells TEXT," +
            "   objPref TEXT," +
            "   tipusAtac TEXT)";

    public TropasSQLiteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
    sqLiteDatabase.execSQL(SQL_CREATE_TROPA);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS Tropas");
        sqLiteDatabase.execSQL(SQL_CREATE_TROPA);
        sqLiteDatabase.execSQL("INSERT INTO TROPAS(nom, divisio, nivells, objPref, tipusAtac) VALUES ('Barbar', 'Divisió 1', '7', 'Qualsevol', 'Cos a cos')");
        sqLiteDatabase.execSQL("INSERT INTO TROPAS(nom, divisio, nivells, objPref, tipusAtac) VALUES ('Arquera', 'Divisió 1', '7', 'Qualsevol', 'A distancia')");
        sqLiteDatabase.execSQL("INSERT INTO TROPAS(nom, divisio, nivells, objPref, tipusAtac) VALUES ('Goblin', 'Divisió 1', '6', 'Recolectores i mines', 'Cos a cos')");
        sqLiteDatabase.execSQL("INSERT INTO TROPAS(nom, divisio, nivells, objPref, tipusAtac) VALUES ('Gegant', 'Divisió 2', '7', 'Defenses', 'Cos a cos')");
        sqLiteDatabase.execSQL("INSERT INTO TROPAS(nom, divisio, nivells, objPref, tipusAtac) VALUES ('Trencamurs', 'Divisió 2', '6' , 'Muralles', 'Cos a cos')");
        sqLiteDatabase.execSQL("INSERT INTO TROPAS(nom, divisio, nivells, objPref, tipusAtac) VALUES ('Globus Bombastic', 'Divisió 2', '6', 'Defenses', 'A distancia, en area')");
        sqLiteDatabase.execSQL("INSERT INTO TROPAS(nom, divisio, nivells, objPref, tipusAtac) VALUES ('Mags', 'Divisió 2', '6', 'Qualsevol', 'A distancia, en area')");
        sqLiteDatabase.execSQL("INSERT INTO TROPAS(nom, divisio, nivells, objPref, tipusAtac) VALUES ('Remeiera', 'Divisió 3', '4', 'Tropes', 'En area a les tropes terrestres')");
        sqLiteDatabase.execSQL("INSERT INTO TROPAS(nom, divisio, nivells, objPref, tipusAtac) VALUES ('Drac', 'Divisió 3', '5', 'Qualsevol', 'A distancia, en area')");
        sqLiteDatabase.execSQL("INSERT INTO TROPAS(nom, divisio, nivells, objPref, tipusAtac) VALUES ('P.E.K.K.A', 'Divisió 3', '5', 'Qualsevol', 'Cos a cos')");
        sqLiteDatabase.execSQL("INSERT INTO TROPAS(nom, divisio, nivells, objPref, tipusAtac) VALUES ('Esbirro', 'Tropes Fosques', '7', 'Qualsevol', 'A distancia')");
        sqLiteDatabase.execSQL("INSERT INTO TROPAS(nom, divisio, nivells, objPref, tipusAtac) VALUES ('Muntaporcs', 'Tropes Fosques', '5', 'Defenses', 'Cos a cos')");
        sqLiteDatabase.execSQL("INSERT INTO TROPAS(nom, divisio, nivells, objPref, tipusAtac) VALUES ('Valquiria', 'Tropes Fosques', '4', 'Qualsevol', 'Cos a cos, en area')");
        sqLiteDatabase.execSQL("INSERT INTO TROPAS(nom, divisio, nivells, objPref, tipusAtac) VALUES ('Golem', 'Tropes Fosques', '5', 'Defenses', 'Cos a cos')");
        sqLiteDatabase.execSQL("INSERT INTO TROPAS(nom, divisio, nivells, objPref, tipusAtac) VALUES ('Bruixes', 'Tropes Fosques', '3', 'Qualsevol', 'A distancia')");
        sqLiteDatabase.execSQL("INSERT INTO TROPAS(nom, divisio, nivells, objPref, tipusAtac) VALUES ('Gos de lava', 'Tropes Fosques', '3', 'Anti-Aeris', 'A distancia')");
    }
}
