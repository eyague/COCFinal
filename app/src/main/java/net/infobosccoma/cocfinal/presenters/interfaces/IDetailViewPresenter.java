package net.infobosccoma.cocfinal.presenters.interfaces;


import net.infobosccoma.cocfinal.models.business.entities.Tropa;
import net.infobosccoma.cocfinal.views.interfaces.IDetailView;

public interface IDetailViewPresenter {

	public void onCreate(IDetailView view, Tropa tropa);

}
