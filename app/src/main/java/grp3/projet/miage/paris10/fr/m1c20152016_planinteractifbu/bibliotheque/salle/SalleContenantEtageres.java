package grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.salle;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.cote.Etagere;
import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.discipline.Discipline;
import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.discipline.SousDiscipline;

public class SalleContenantEtageres extends Salle {
    private SortedSet<Discipline> disciplines;
    private SortedSet<SousDiscipline> sousDisciplines;
    private Set<Etagere> etageres;

    public SalleContenantEtageres(String nom, int x, int y, int l, int h, int color, float largeurContour, int couleurContour, boolean afficherNom) {
        super(nom, x, y, l, h, color, largeurContour, couleurContour, afficherNom);
        disciplines = new TreeSet<>();
        sousDisciplines = new TreeSet<>();
        etageres = new HashSet<>();
    }

    public void addDiscipline(Discipline discipline) {
        disciplines.add(discipline);
    }

    public boolean hasDiscipline(String nom) {
        for(Discipline d : disciplines) {
            if(d.getNom().equals(nom)) return true;
        }
        return false;
    }

    public Discipline getDiscipline(String nom) {
        for(Discipline d : disciplines) {
            if(d.getNom().equals(nom)) return d;
        }
        throw new NoSuchElementException("La discipline \"" + nom + "\" ne fait pas partie de cette salle.");
    }

    public Set<Discipline> getDisciplines() {
        return disciplines;
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
        throw new NoSuchElementException("La sous-discipline \"" + nom + "\" ne fait pas partie de cette salle.");
    }

    public Set<SousDiscipline> getSousDisciplines() {
        return sousDisciplines;
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
        throw new NoSuchElementException("L'etagere " + n + " ne fait pas partie de cette salle.");
    }

    public Set<Etagere> getEtageres() {
        return etageres;
    }
}
