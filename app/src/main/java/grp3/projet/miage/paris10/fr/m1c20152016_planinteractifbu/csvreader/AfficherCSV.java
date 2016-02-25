package grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.csvreader;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.ListView;

import java.io.InputStream;
import java.util.List;

import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.R;

/**
 * Created by Mohamed on 25/02/2016.
 */
public class AfficherCSV extends Activity {

    private ListView listView;
    private ItemArrayAdapter itemArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_layout);
        listView = (ListView) findViewById(R.id.listView);
        itemArrayAdapter = new ItemArrayAdapter(getApplicationContext(), R.layout.item_layout);

        Parcelable state = listView.onSaveInstanceState();
        listView.setAdapter(itemArrayAdapter);
        listView.onRestoreInstanceState(state);

        InputStream inputStream = getResources().openRawResource(R.raw.livres);
        CSVFile csvFile = new CSVFile(inputStream);
        List<String[]> scoreList = csvFile.read();

        for(String[] scoreData:scoreList ) {
            itemArrayAdapter.add(scoreData);
        }
    }
}
