package grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.menucote;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.R;
import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.plan.PlanActivity;

public class SaisieCoteActivity extends Activity {
    EditText editTextSaisie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_cote);

        editTextSaisie = (EditText) findViewById(R.id.editTextCote);
        Button validateCoteButton = (Button) findViewById(R.id.buttonValidCote);

        validateCoteButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(!editTextSaisie.getText().toString().isEmpty()) {
                    Intent intentPlanInteractif = new Intent(SaisieCoteActivity.this, PlanActivity.class);
                    intentPlanInteractif.putExtra("coteSaisie", editTextSaisie.getText().toString());
                    startActivity(intentPlanInteractif);
                }else {
                    Toast.makeText(getApplicationContext(),"Attention, il faut indiquer la cote voulue",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
