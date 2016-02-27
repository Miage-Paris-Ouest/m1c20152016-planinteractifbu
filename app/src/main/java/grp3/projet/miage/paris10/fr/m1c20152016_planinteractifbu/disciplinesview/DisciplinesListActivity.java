package grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.disciplinesview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.R;
import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.csvreader.CSVFile;

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
            while(i < cotesList.size() && nomDiscipline.equals(currentNomDiscipline)) {
                allSousDiscipline.add(cotesList.get(i)[3]);
                i++;
                if(i < cotesList.size()) currentNomDiscipline = cotesList.get(i)[2];
            }
            sortedListDiscipline.add(nomDiscipline);
            listSousDiscipline.put(nomDiscipline, allSousDiscipline);
            i--;
        }
        listDiscipline.addAll(sortedListDiscipline);
    }
}
