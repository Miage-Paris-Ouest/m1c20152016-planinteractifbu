package grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.discipline;

import java.util.HashSet;
import java.util.Set;

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
