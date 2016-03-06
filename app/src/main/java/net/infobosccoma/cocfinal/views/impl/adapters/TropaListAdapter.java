package net.infobosccoma.cocfinal.views.impl.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import net.infobosccoma.cocfinal.R;
import net.infobosccoma.cocfinal.models.business.entities.Tropa;

import org.w3c.dom.Text;

/**
 * Created by marc on 25/01/2016.
 */
public class TropaListAdapter extends ArrayAdapter<Tropa> {
    private Context context;
    private LayoutInflater inflater;

    public TropaListAdapter(Context context, List<Tropa> comments) {
        super(context, 0, comments);

        this.context = context;
        this.inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        TropaHolder holder;

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.main_listitem_layout, parent, false);

            holder = new TropaHolder();
            addViewsToHolder(convertView, holder);
            convertView.setTag(holder);
        } else {
            holder = (TropaHolder) convertView.getTag();
        }
        Tropa tropa = getItem(position);
        setDataIntoHolder(holder, tropa);

        return convertView;
    }

    private void addViewsToHolder(View convertView, TropaHolder holder) {
        holder.nom = (TextView) convertView.findViewById(R.id.main_listitem_titol);

        holder.divisio = (TextView) convertView.findViewById(R.id.main_listitem_subtitol);

/*        holder.nivell =  (TextView) convertView.findViewById(R.id.textViewNivell);
        holder.objPref = (TextView) convertView.findViewById(R.id.textViewObjectiu);
        holder.tipusAtac = (TextView) convertView.findViewById(R.id.textViewTipus);*/
    }

    private void setDataIntoHolder(TropaHolder holder, Tropa tropa) {
        //Picasso.with(context).load(image.getUrl()).fit().into(holder.image);
        holder.nom.setText(tropa.getNom());
        holder.divisio.setText(tropa.getDivisio());
/*        holder.nivell.setText(tropa.getNivells());
        holder.objPref.setText(tropa.getObjPref());
        holder.tipusAtac.setText(tropa.getTipusAtac());*/
    }

    class TropaHolder {
        TextView nom;
        TextView divisio;
/*        TextView nivell;
        TextView objPref;
        TextView tipusAtac;*/
    }

}
