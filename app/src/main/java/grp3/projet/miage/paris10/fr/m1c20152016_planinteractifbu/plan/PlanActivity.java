package grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.plan;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;

import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.R;
import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.Bibliotheque;

/**
 * Created by Kiki on 20/02/16.
 */
public class PlanActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plan_interactif);


        PlanView plan = (PlanView) findViewById(R.id.plan_view);
        Bibliotheque bu = new Bibliotheque(getResources());
        plan.setBu(bu);
        plan.setBackgroundColor(Color.WHITE);
        plan.setEtageRepresente(1);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if(extras.containsKey("nomSousDiscipline")) {
                Toast.makeText(getApplicationContext(), extras.getString("nomSousDiscipline"), Toast.LENGTH_SHORT).show();
                bu.faireRessortirEtageresSousDiscipline(extras.getString("nomSousDiscipline"));
            }
            else if (extras.containsKey("nomDiscipline")) {
                Toast.makeText(getApplicationContext(), extras.getString("nomDiscipline"), Toast.LENGTH_SHORT).show();
                bu.faireRessortirEtageres(bu.getIndex().getDiscipline(extras.getString("nomDiscipline")).getEtageres());
            }
        }
    }
}
