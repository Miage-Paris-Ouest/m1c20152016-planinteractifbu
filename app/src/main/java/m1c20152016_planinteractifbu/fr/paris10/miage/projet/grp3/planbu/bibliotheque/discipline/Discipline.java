package m1c20152016_planinteractifbu.fr.paris10.miage.projet.grp3.planbu.bibliotheque.discipline;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by clement on 13/02/2016.
 */
public class Discipline {
    private EnumDiscipline discipline;
    private Set<SousDiscipline> sousDisciplines;

    public Discipline(EnumDiscipline discipline) {
        this.discipline = discipline;
        sousDisciplines = new HashSet<>();
    }

    public EnumDiscipline getDiscipline() {
        return discipline;
    }

    public Set<SousDiscipline> getSousDisciplines() {
        return sousDisciplines;
    }

    public void addSousDiscipline(SousDiscipline sousDiscipline) {
        sousDisciplines.add(sousDiscipline);
    }
}
