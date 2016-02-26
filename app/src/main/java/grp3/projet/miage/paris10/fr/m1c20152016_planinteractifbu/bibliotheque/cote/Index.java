package grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.cote;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.discipline.Discipline;

public class Index {
    private Set<Discipline> disciplines;
    private Set<RacineCote> racines;

    public Index() {
        disciplines = new TreeSet<>();
        racines = new HashSet<>();
    }

    public void addDiscipline(Discipline discipline) {
        disciplines.add(discipline);
    }

    public void addRacine(RacineCote racine){
        racines.add(racine);
    }


}
