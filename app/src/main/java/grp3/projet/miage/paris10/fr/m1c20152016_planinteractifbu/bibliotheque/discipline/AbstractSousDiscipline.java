package grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.discipline;

import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.cote.RacineCote;

import java.util.Set;
import java.util.TreeSet;

public abstract class AbstractSousDiscipline implements SousDiscipline {
    private EnumSousDiscipline sousDiscipline;
    private Set<RacineCote> racines;

    public AbstractSousDiscipline(EnumSousDiscipline sousDiscipline) {
        this.sousDiscipline = sousDiscipline;
        racines = new TreeSet<>();
    }

    @Override
    public EnumSousDiscipline getSousDiscipline() {
        return sousDiscipline;
    }

    @Override
    public Set<RacineCote> getRacines() {
        return racines;
    }

    public void addRacine(RacineCote racine) {
        racines.add(racine);
    }
}
