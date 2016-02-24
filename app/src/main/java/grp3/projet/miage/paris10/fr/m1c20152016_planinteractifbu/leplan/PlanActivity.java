package grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.leplan;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;

import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.R;

/**
 * Created by Kiki on 20/02/16.
 */
public class PlanActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plan_interactif);
        PlanView plan = (PlanView) findViewById(R.id.plan_view);
        plan.setBackgroundColor(Color.RED);
    }
}
