package grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.menucote.SaisieCoteActivity;
import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.menudisciplines.DisciplinesListActivity;
import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.plan.PlanActivity;
import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.plan.PlanImage;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Toast.makeText(getApplicationContext(),"Perspective d'évolution !!",Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

       if (id == R.id.nav_plan_image) {
           Intent it_plan_im = new Intent(MainActivity.this, PlanImage.class);
           startActivity(it_plan_im);
       } else if (id == R.id.nav_plan_interactif) {
           Intent it_plan_inter = new Intent(MainActivity.this, PlanActivity.class);
           startActivity(it_plan_inter);
       } else if (id == R.id.nav_cote){
           Intent it_saisie_cote = new Intent(MainActivity.this, SaisieCoteActivity.class);
           startActivity(it_saisie_cote);
       } else if (id == R.id.nav_dis) {
           Intent it_fichier_csv = new Intent(MainActivity.this, DisciplinesListActivity.class);
           startActivity(it_fichier_csv);
       }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
