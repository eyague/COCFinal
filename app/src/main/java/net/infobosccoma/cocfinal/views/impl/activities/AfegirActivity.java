package net.infobosccoma.cocfinal.views.impl.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import net.infobosccoma.cocfinal.R;
import net.infobosccoma.cocfinal.models.business.entities.Tropa;
import net.infobosccoma.cocfinal.models.persistence.daos.impl.TropasSQLiteDAO;

import org.w3c.dom.Text;

/**
 * Created by eyague on 06/03/2016.
 */
public class AfegirActivity extends AppCompatActivity {
    private EditText nom;
    private EditText divisio;
    private EditText nivells;
    private EditText tipusAtac;
    private EditText objPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.afegir_main);



    }

    protected void onClic(View v) {
        nom = (EditText) findViewById(R.id.editText_nom);
        divisio = (EditText) findViewById(R.id.editText_divisio);
        nivells = (EditText) findViewById(R.id.editText_nivell);
        tipusAtac = (EditText) findViewById(R.id.editText_tipusAtac);
        objPref = (EditText) findViewById(R.id.editText_objPref);

        Tropa tropa = new Tropa();

        tropa.setNom(nom.getText().toString());
        tropa.setDivisio(divisio.getText().toString());
        tropa.setNivells(nivells.getText().toString());
        tropa.setTipusAtac(tipusAtac.getText().toString());
        tropa.setObjPref(objPref.getText().toString());
        TropasSQLiteDAO tropasql = new TropasSQLiteDAO(getBaseContext());

        tropasql.save(tropa);

    }
}
