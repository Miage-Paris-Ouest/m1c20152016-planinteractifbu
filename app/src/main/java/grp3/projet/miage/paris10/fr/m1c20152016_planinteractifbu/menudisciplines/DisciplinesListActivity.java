package grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.menudisciplines;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.R;
import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.csvreader.CSVFile;
import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.plan.PlanActivity;

public class DisciplinesListActivity extends Activity {
    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDiscipline;
    Map<String, List<String>> listSousDiscipline;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disciplines);

        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExpDisciplines);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDiscipline, listSousDiscipline);

        // setting list adapter
        expListView.setAdapter(listAdapter);

        Toast.makeText(getApplicationContext(), "Si vous souhaitez afficher les étagères des disciplines " +
                "(Philosophie, Histoire, etc.), maintenez appuyez longuement.", Toast.LENGTH_LONG).show();

        expListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                Intent intentPlanInteractif = new Intent(DisciplinesListActivity.this, PlanActivity.class);
                intentPlanInteractif.putExtra("nomSousDiscipline", listSousDiscipline.
                        get(listDiscipline.get(groupPosition)).get(childPosition));
                startActivity(intentPlanInteractif);
                return false;
            }
        });

        expListView.setOnItemLongClickListener(new ExpandableListView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intentPlanInteractif = new Intent(DisciplinesListActivity.this, PlanActivity.class);
                intentPlanInteractif.putExtra("nomDiscipline", listDiscipline.get(position));
                startActivity(intentPlanInteractif);
                return false;
            }
        });

    }

    /*
     * Preparing the list data
     */
    private void prepareListData() {
        listDiscipline = new ArrayList<>();
        listSousDiscipline = new TreeMap<>();
        SortedSet<String> sortedListDiscipline = new TreeSet<>();

        List<String[]> cotesList = new CSVFile(getResources().openRawResource(R.raw.cotes), "_").read();
        for (int i = 1; i < cotesList.size(); i++) {
            String nomDiscipline = cotesList.get(i)[2];
            String currentNomDiscipline = nomDiscipline;
            List<String> allSousDiscipline = new ArrayList<>();
            while (i < cotesList.size() && nomDiscipline.equals(currentNomDiscipline)) {
                allSousDiscipline.add(cotesList.get(i)[3]);
                i++;
                if (i < cotesList.size()) currentNomDiscipline = cotesList.get(i)[2];
            }
            sortedListDiscipline.add(nomDiscipline);
            listSousDiscipline.put(nomDiscipline, allSousDiscipline);
            i--;
        }
        listDiscipline.addAll(sortedListDiscipline);
    }
}
