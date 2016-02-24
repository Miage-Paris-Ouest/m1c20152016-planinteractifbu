package grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.discipline;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;

import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.cote.Etagere;

public class Discipline {
    private String nom;
    private Set<SousDiscipline> sousDisciplines;
    private Set<Etagere> etageres;

    public Discipline(String nom) {
        this.nom = nom;
        sousDisciplines = new HashSet<>();
    }

    public void addEtagere(Etagere etagere) {
        etageres.add(etagere);
    }

    public String getNom() {
        return nom;
    }

    public Set<Etagere> getEtageres() {
        return etageres;
    }

    public Set<SousDiscipline> getSousDisciplines() {
        return sousDisciplines;
    }

    public SousDiscipline getSousDiscipline(String nom) {
        for (SousDiscipline s : sousDisciplines) {
            if (s.getNom().equals(nom)) return s;
        }
        throw new NoSuchElementException();
    }

    public void addSousDiscipline(SousDiscipline sousDiscipline) {
        sousDisciplines.add(sousDiscipline);
    }

    public boolean hasSousDiscipline(String nom) {
        for (SousDiscipline s : sousDisciplines) {
            if (s.getNom().equals(nom)) return true;
        }
        return false;
    }

    public boolean hasEtagere(int num) {
        for(Etagere e : etageres) {
            if(e.getNumero() == num) return true;
        }
        return false;
    }

    public Etagere getEtagere(int num) {
        for(Etagere e : etageres) {
            if(e.getNumero() == num) return e;
        }
        throw new NoSuchElementException();
    }

    public void addEtageresSet(Set<Etagere> etageres) {
        this.etageres.addAll(etageres);
    }
}
