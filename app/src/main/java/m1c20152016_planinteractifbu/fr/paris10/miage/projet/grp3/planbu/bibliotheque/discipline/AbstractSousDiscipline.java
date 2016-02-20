package m1c20152016_planinteractifbu.fr.paris10.miage.projet.grp3.planbu.bibliotheque.discipline;

import m1c20152016_planinteractifbu.fr.paris10.miage.projet.grp3.planbu.bibliotheque.cote.RacineCote;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by clement on 13/02/2016.
 */
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
