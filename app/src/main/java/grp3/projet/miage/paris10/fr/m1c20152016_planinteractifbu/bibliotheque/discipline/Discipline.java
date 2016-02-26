package grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.discipline;

import android.support.annotation.NonNull;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.cote.Etagere;

public class Discipline implements Comparable {
    private String nom;
    private SortedSet<SousDiscipline> sousDisciplines;

    public Discipline(String nom) {
        this.nom = nom;
        sousDisciplines = new TreeSet<>();
    }

    @Override
    public int compareTo(@NonNull Object another) {
        Discipline d = (Discipline) another;
        return nom.compareTo(d.getNom());
    }

    public String getNom() {
        return nom;
    }

    public void addSousDiscipline(SousDiscipline sousDiscipline) {
        sousDisciplines.add(sousDiscipline);
    }

    public boolean hasSousDiscipline(String nom) {
        for(SousDiscipline d : sousDisciplines) {
            if(d.getNom().equals(nom)) return true;
        }
        return false;
    }

    public SousDiscipline getSousDiscipline(String nom) {
        for(SousDiscipline d : sousDisciplines) {
            if(d.getNom().equals(nom)) return d;
        }
        throw new NoSuchElementException("La sous-discipline specifiee ne fait pas partie de cette discipline.");
    }

    public SortedSet<SousDiscipline> getSousDisciplines() {
        return sousDisciplines;
    }

    public Set<Etagere> getEtageres() {
        Set<Etagere> etageres = new HashSet<>();
        for(SousDiscipline d : sousDisciplines) {
            for(Etagere e : d.getEtageres()) {
                if(!etageres.contains(e)) etageres.add(e);
            }
        }
        return etageres;
    }


}
