package grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.discipline;

import android.support.annotation.NonNull;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;

import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.cote.Etagere;

public class SousDiscipline implements Comparable {
    private String nom;
    private Set<Etagere> etageres;

    public SousDiscipline(String nom) {
        this.nom = nom;
        etageres = new HashSet<>();
    }

    public SousDiscipline(String nom, Set<Etagere> etageres) {
        this.nom = nom;
        this.etageres = etageres;
    }

    @Override
    public int compareTo(@NonNull Object another) {
        SousDiscipline s = (SousDiscipline) another;
        return nom.compareTo(s.getNom());
    }

    public String getNom() {
        return nom;
    }
    public void addEtagere(Etagere etagere) {
        etageres.add(etagere);
    }

    public boolean hasEtagere(int n) {
        for(Etagere e : etageres) {
            if(e.getNum() == n) return true;
        }
        return false;
    }

    public Etagere getEtagere(int n) {
        for(Etagere e : etageres) {
            if(e.getNum() == n) return e;
        }
        throw new NoSuchElementException("L'etagere specifiee ne fait pas partie de la sous-discipline.");
    }

    public Set<Etagere> getEtageres() {
        return etageres;
    }

    public void setEtageres(Set<Etagere> etageres) {
        this.etageres = etageres;
    }
}
