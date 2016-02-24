package grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.discipline;

import java.util.HashSet;
import java.util.Set;

public class SousDisciplineComposite extends AbstractSousDiscipline {
    private Set<SousDiscipline> sousDisciplines;

    public SousDisciplineComposite(EnumSousDiscipline sousDiscipline) {
        super(sousDiscipline);
        sousDisciplines = new HashSet<>();
    }

    public void addSousDiscipline(SousDiscipline sousDiscipline) {
        sousDisciplines.add(sousDiscipline);
    }

    public Set<SousDiscipline> getChildren() {
        return sousDisciplines;
    }
}
