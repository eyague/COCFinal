package net.infobosccoma.cocfinal.presenters.impl;


import android.content.Context;

import java.util.List;

import net.infobosccoma.cocfinal.helpers.TropaBuilder;
import net.infobosccoma.cocfinal.models.business.entities.Tropa;
import net.infobosccoma.cocfinal.models.persistence.daos.impl.TropasSQLiteDAO;
import net.infobosccoma.cocfinal.models.persistence.daos.interfaces.TropasDAO;
import net.infobosccoma.cocfinal.presenters.interfaces.IMainViewPresenter;
import net.infobosccoma.cocfinal.views.interfaces.IMainView;

public class MainViewPresenterImpl implements IMainViewPresenter {


    private IMainView view;
    private List<Tropa> tropa;
    private Context context;

    @Override
    public void onCreate(IMainView view, Context context) {
        this.view = view;
        this.context = context;
    }

    @Override
    public void getPersonsFromService() {
        view.hideList();
        // Aquí, és on demanem les dades
        // En aquest exemple, agafo les dades d'un "creador" de persones
        TropasDAO personBuiler = new TropasSQLiteDAO(context);
        tropa = personBuiler.getAll();

        showList();
    }

    @Override
    public void showList() {
        /*view.hideProgressBar();*/
        view.createList(view.createTropaAdapter(tropa));
        view.showList();
    }

    @Override
    public void onItemClicked(int position) {
        view.goToDetailActivity(tropa.get(position));
    }
}

