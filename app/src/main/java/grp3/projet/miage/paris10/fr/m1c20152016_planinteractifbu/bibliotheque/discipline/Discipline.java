package grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.discipline;

import java.util.HashSet;
import java.util.Set;

public class Discipline {
    private String nom;
    private Set<SousDiscipline> sousDisciplines;

    public Discipline(String nom) {
        this.nom = nom;
        sousDisciplines = new HashSet<>();
    }

    public String getNom() {
        return nom;
    }

    public void addSousDiscipline(SousDiscipline sousDiscipline) {
        sousDisciplines.add(sousDiscipline);
    }
}
