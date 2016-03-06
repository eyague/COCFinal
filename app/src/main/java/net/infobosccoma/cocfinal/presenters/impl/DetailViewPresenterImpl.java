package net.infobosccoma.cocfinal.presenters.impl;

import net.infobosccoma.cocfinal.models.business.entities.Tropa;
import net.infobosccoma.cocfinal.presenters.interfaces.IDetailViewPresenter;
import net.infobosccoma.cocfinal.views.interfaces.IDetailView;

public class DetailViewPresenterImpl implements IDetailViewPresenter {

	private IDetailView view;
	private Tropa tropa;

	@Override
	public void onCreate(IDetailView detailView, Tropa tropa) {
		view = detailView;
		this.tropa = tropa;

		view.setNom(tropa.getNom());
		view.setDivisio(tropa.getDivisio());
		view.setNivell(tropa.getNivells());
		view.setObjPref(tropa.getObjPref());
		view.setTipusAtac(tropa.getTipusAtac());
	}

}
