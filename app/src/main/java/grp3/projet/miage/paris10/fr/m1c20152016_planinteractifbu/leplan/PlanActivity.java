package grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.leplan;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;

import java.io.InputStream;

import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.R;
import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.Bibliotheque;
import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.salle.Etage;
import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.csvreader.CSVFile;

/**
 * Created by Kiki on 20/02/16.
 */
public class PlanActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bibliotheque bu = new Bibliotheque();
        bu.addEtage(new Etage(0));
        bu.addEtage(new Etage(1));

        InputStream inputStream = getResources().openRawResource(R.raw.infos_salles);
        CSVFile csvFile = new CSVFile(inputStream);

        bu.buildAllSallesFromCSV(csvFile.read());

        setContentView(R.layout.plan_interactif);

        PlanView plan = (PlanView) findViewById(R.id.plan_view);
        plan.setBu(bu);
        plan.setBackgroundColor(Color.WHITE);
    }
}
