package grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.salle;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;

import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.cote.Etagere;
import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.discipline.Discipline;
import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.discipline.SousDiscipline;

public class SalleContenantEtageres extends Salle {
    private Set<Discipline> disciplines;

    public SalleContenantEtageres(String nom, int left, int top, int right, int bottom, int color, float borderWidth, int borderColor, boolean afficherNom) {
        super(nom, left, top, right, bottom, color, borderWidth, borderColor, afficherNom);
        disciplines = new HashSet<>();
    }

    public void addDiscipline(Discipline discipline) {
        disciplines.add(discipline);
    }

    public boolean hasDiscipline(String nom) {
        for (Discipline d : disciplines) {
            if (d.getNom().equals(nom)) return true;
        }
        return false;
    }

    public boolean hasEtagere(int n) {
        for (Discipline d : disciplines) {
            if (d.hasEtagere(n)) return true;
        }
        return false;
    }

    public Etagere getEtagere(int n) {
        for (Discipline d : disciplines) {
            if (d.hasEtagere(n)) d.getEtagere(n);
        }
        throw new NoSuchElementException();
    }

    public Discipline getDiscipline(String nom) {
        for (Discipline d : disciplines) {
            if (d.getNom().equals(nom)) return d;
        }
        throw new NoSuchElementException();
    }

    public boolean hasSousDiscipline(String nom) {
        for (Discipline d : disciplines) {
            if (d.hasSousDiscipline(nom)) return true;
        }
        return false;
    }

    public SousDiscipline getSousDiscipline(String nom) {
        for(Discipline d : disciplines) {
            if(d.hasSousDiscipline(nom)) return d.getSousDiscipline(nom);
        }
        throw new NoSuchElementException();
    }
}
