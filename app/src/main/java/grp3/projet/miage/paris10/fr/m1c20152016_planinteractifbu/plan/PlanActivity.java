package grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.plan;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.R;
import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.Bibliotheque;

/**
 * Created by Kiki on 20/02/16.
 */
public class PlanActivity extends Activity {
    Button boutonEtage;
    Bibliotheque bu;
    int numEtageRepresente;
    PlanView plan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plan_interactif);

        plan = (PlanView) findViewById(R.id.plan_view);
        boutonEtage = (Button) findViewById(R.id.buttonChangementEtage);
        bu = new Bibliotheque(getResources());
        plan.setBu(bu);
        numEtageRepresente = plan.getEtageRepresente();
        setBoutonEtageTexte(numEtageRepresente);

        plan.setBackgroundColor(Color.WHITE);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("nomSousDiscipline")) {
                plan.setEtageRepresente(bu.getEtagesWithSousDiscipline(extras.getString("nomSousDiscipline")).getNum());
                Toast.makeText(getApplicationContext(), extras.getString("nomSousDiscipline"), Toast.LENGTH_SHORT).show();
                bu.faireRessortirEtageresSousDiscipline(extras.getString("nomSousDiscipline"));
            } else if (extras.containsKey("nomDiscipline")) {
                plan.setEtageRepresente(bu.getEtagesWithDiscipline(extras.getString("nomDiscipline")).getNum());
                Toast.makeText(getApplicationContext(), extras.getString("nomDiscipline"), Toast.LENGTH_SHORT).show();
                bu.faireRessortirEtageres(bu.getIndex().getDiscipline(extras.getString("nomDiscipline")).getEtageres());
            }
            numEtageRepresente = plan.getEtageRepresente();
            setBoutonEtageTexte(numEtageRepresente);
        }

        boutonEtage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(numEtageRepresente == 0) {
                    plan.setEtageRepresente(1);
                    plan.invalidate();
                    numEtageRepresente = 1;
                } else {
                    plan.setEtageRepresente(0);
                    plan.invalidate();
                    numEtageRepresente = 0;
                }
                setBoutonEtageTexte(numEtageRepresente);
            }
        });
    }

    public void setBoutonEtageTexte(int numEtageRepresente) {
        if (numEtageRepresente == 0) {
            boutonEtage.setText("Aller au Niveau 1");
        } else {
            boutonEtage.setText("Aller au Niveau 0");
        }
    }
}