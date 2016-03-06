package net.infobosccoma.cocfinal.views.impl.activities;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.parceler.Parcels;

import net.infobosccoma.cocfinal.R;
import net.infobosccoma.cocfinal.models.business.entities.Tropa;
import net.infobosccoma.cocfinal.models.persistence.daos.impl.TropasSQLiteDAO;
import net.infobosccoma.cocfinal.presenters.impl.DetailViewPresenterImpl;
import net.infobosccoma.cocfinal.presenters.interfaces.IDetailViewPresenter;
import net.infobosccoma.cocfinal   .views.interfaces.IDetailView;


public class DetailActivity extends AppCompatActivity implements IDetailView {

    final int INTENT_REQUEST = 1;
    private TextView txtNom;
    private TextView txtNivell;
    private TextView txtDivisio;
    private TextView txtObjPref;
    private TextView txtTipusAtac;
    private ImageView urlImatgeTropa;

    private IDetailViewPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detall_tropa);

        txtNom = (TextView) findViewById(R.id.textViewNom);
        txtDivisio = (TextView) findViewById(R.id.textViewDivisio);
        txtNivell = (TextView) findViewById(R.id.textViewNivell);
        txtObjPref = (TextView) findViewById(R.id.textViewObjectiu);
        txtTipusAtac = (TextView) findViewById(R.id.textViewTipus);
        urlImatgeTropa = (ImageView) findViewById(R.id.imageView);


        presenter = new DetailViewPresenterImpl();
        presenter.onCreate(this, getPersonFromIntent(getIntent()));
    }


    @Override
    public void setImage(String url) {
        // per si tinguessim un ImageView, per exemple...
        Bitmap bImage = BitmapFactory.decodeResource(this.getResources(), Integer.parseInt(url));
        urlImatgeTropa.setImageBitmap(bImage);
    }

    @Override
    public void setNom(String text) {
        txtNom.setText(text);
    }

    @Override
    public void setDivisio(String text) {
        txtDivisio.setText(text);
    }

    @Override
    public void setNivell(String text) {
        txtNivell.setText(String.valueOf(text));

    }

    @Override
    public void setObjPref(String text) {
        txtObjPref.setText(text);
    }

    @Override
    public void setTipusAtac(String text) {
        txtTipusAtac.setText(text);
    }

    /*@Override
    public void setUrlImatge(String text){}
*/
    private Tropa getPersonFromIntent(Intent intent) {
        return (Tropa) Parcels.unwrap(intent.getParcelableExtra("TROPA"));
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.main_context_menu, menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_delete:
                eliminar();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void eliminar() {
        Intent i = new Intent(this, MainActivity.class);
//
////        txtNom = (TextView) findViewById(R.id.textViewNom);
////        txtDivisio = (TextView) findViewById(R.id.textViewDivisio);
////        txtNivell = (TextView) findViewById(R.id.textViewNivell);
////        txtTipusAtac = (TextView) findViewById(R.id.textViewTipus);
////        txtObjPref = (TextView) findViewById(R.id.textViewObjectiu);
//
//        Tropa tropa = new Tropa();
//
//        tropa.setCodi(tropa.getCodi());
//        tropa.setNom(txtNom.getText().toString());
//        tropa.setDivisio(txtDivisio.getText().toString());
//        tropa.setNivells(txtNivell.getText().toString());
//        tropa.setTipusAtac(txtTipusAtac.getText().toString());
//        tropa.setObjPref(txtObjPref.getText().toString());
        TropasSQLiteDAO tropasql = new TropasSQLiteDAO(getBaseContext());

        tropasql.delete(tropasql.getTropa(txtNom.getText().toString(), txtDivisio.getText().toString(), txtNivell.getText().toString()));
        startActivityForResult(i, INTENT_REQUEST);
    }

}
