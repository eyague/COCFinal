package net.infobosccoma.cocfinal.views.interfaces;

import net.infobosccoma.cocfinal.models.business.entities.Tropa;
import net.infobosccoma.cocfinal.views.impl.adapters.TropaListAdapter;

import java.util.List;


public interface IMainView {

    public void createList(TropaListAdapter adapter);

    public TropaListAdapter createTropaAdapter(List<Tropa> tropa);

    public void goToDetailActivity(Tropa tropa);

    public void showProgressBar();

    public void hideProgressBar();

    public void showRetryButton();

    public void hideRetryButton();

    public void showList();

    public void hideList();

    public void showMessage(String message);

}
