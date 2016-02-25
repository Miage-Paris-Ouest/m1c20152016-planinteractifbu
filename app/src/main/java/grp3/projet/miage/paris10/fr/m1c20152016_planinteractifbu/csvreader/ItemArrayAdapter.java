package grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.csvreader;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.R;

/**
 * Created by Mohamed on 20/02/2016.
 */
public class ItemArrayAdapter extends ArrayAdapter<String[]> {
    private List<String[]> scoreList = new ArrayList<String[]>();

    static class ItemViewHolder {
        TextView salle;
        TextView etagere;
        TextView secteur;
        TextView sous_discipline;
        TextView cote;
    }

    public ItemArrayAdapter(Context context, int textViewResourceId) {
        super(context, textViewResourceId);
    }

    @Override
    public void add(String[] object) {
        scoreList.add(object);
        super.add(object);
    }

    @Override
    public int getCount() {
        return this.scoreList.size();
    }

    @Override
    public String[] getItem(int index) {
        return this.scoreList.get(index);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        ItemViewHolder viewHolder;
        if (row == null) {
            LayoutInflater inflater = (LayoutInflater) this.getContext().
                    getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.item_layout, parent, false);
            viewHolder = new ItemViewHolder();
            viewHolder.salle = (TextView) row.findViewById(R.id.salle);
            viewHolder.etagere = (TextView) row.findViewById(R.id.etagere);
            viewHolder.secteur = (TextView) row.findViewById(R.id.secteur);
            viewHolder.sous_discipline = (TextView) row.findViewById(R.id.sous_discipline);
            viewHolder.cote = (TextView) row.findViewById(R.id.cote);
            row.setTag(viewHolder);
        } else {
            viewHolder = (ItemViewHolder)row.getTag();
        }
        String[] stat = getItem(position);
        viewHolder.salle.setText(stat[0]);
        viewHolder.etagere.setText(stat[1]);
        viewHolder.secteur.setText(stat[2]);
        viewHolder.sous_discipline.setText(stat[3]);
        viewHolder.cote.setText(stat[4]);
        return row;
    }
}
