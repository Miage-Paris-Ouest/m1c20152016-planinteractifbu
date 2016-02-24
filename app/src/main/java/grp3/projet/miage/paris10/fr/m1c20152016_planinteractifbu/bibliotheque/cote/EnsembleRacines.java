package grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.cote;

import java.util.Set;
import java.util.TreeSet;

import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.discipline.SousDiscipline;

public class EnsembleRacines {
    private Set<RacineCote> racines;
    private SousDiscipline sousDiscipline;

    public EnsembleRacines() {
        racines = new TreeSet<>();
    }

    public EnsembleRacines(SousDiscipline sousDiscipline) {
        racines = new TreeSet<>();
        this.sousDiscipline = sousDiscipline;
    }

    public void addRacineCote(RacineCote racine) {
        racines.add(racine);
    }

    public Set<RacineCote> getRacines() {
        return racines;
    }

    public SousDiscipline getSousDiscipline() {
        return sousDiscipline;
    }

    public void setSousDiscipline(SousDiscipline sousDiscipline) {
        this.sousDiscipline = sousDiscipline;
    }

    public boolean containsRacine(String racine) {
        for(RacineCote r : racines) {
            if(r.matches(racine)) return true;
        }
        return false;
    }
}
