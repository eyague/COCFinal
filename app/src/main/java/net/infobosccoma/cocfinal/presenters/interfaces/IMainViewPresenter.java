package net.infobosccoma.cocfinal.presenters.interfaces;


import android.content.Context;

import net.infobosccoma.cocfinal.views.interfaces.IMainView;

public interface IMainViewPresenter {

    public void onCreate(IMainView view, Context context);

    public void getPersonsFromService();

    public void showList();

    public void onItemClicked(int position);

}
