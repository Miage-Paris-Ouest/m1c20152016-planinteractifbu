package m1c20152016_planinteractifbu.fr.paris10.miage.projet.grp3.planbu.bibliotheque.discipline;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by clement on 13/02/2016.
 */
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
