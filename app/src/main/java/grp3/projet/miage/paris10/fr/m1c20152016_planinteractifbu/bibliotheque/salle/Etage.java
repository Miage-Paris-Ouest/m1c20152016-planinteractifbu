package grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.salle;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;

import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.discipline.Discipline;

public class Etage {
    private int num;
    private Set<Salle> salles;
    private Set<SalleContenantEtageres> sallesEtageres;

    public Etage(int num) {
        this.num = num;
        salles = new HashSet<>();
        sallesEtageres = new HashSet<>();
    }

    public int getNum() {
        return num;
    }

    public void addSalle(Salle salle) {
        salles.add(salle);
    }

    public void addSalleContenantEtagere(SalleContenantEtageres salle) {
        sallesEtageres.add(salle);
    }

    public Set<Salle> getSalles() {
        return salles;
    }

    public Set<SalleContenantEtageres> getSallesEtageres() {
        return sallesEtageres;
    }

    public boolean hasSalle(String nom) {
        for (SalleContenantEtageres s : sallesEtageres) {
            if (s.getNom().equals(nom)) return true;
        }
        for (Salle s : salles) {
            if (s.getNom().equals(nom)) return true;
        }
        return false;
    }

    public Salle getSalle(String nom) {
        for (Salle s : salles) {
            if (s.getNom().equals(nom)) return s;
        }
        throw new NoSuchElementException("La salle specifiee n'existe pas a cet etage.");
    }

    public SalleContenantEtageres getSalleContenantEtageres(String nom) {
        for (SalleContenantEtageres s : sallesEtageres) {
            if (s.getNom().equals(nom)) return s;
        }
        throw new NoSuchElementException("La salle specifiee n'existe pas a cet etage.");
    }

    public boolean hasDiscipline(String nomDiscipline) {
        for (SalleContenantEtageres s : sallesEtageres) {
            if(s.hasDiscipline(nomDiscipline)) return true;
        }
        return false;
    }

    public boolean hasSousDiscipline(String nomSousDiscipline) {
        for(SalleContenantEtageres s : sallesEtageres) {
            if(s.hasSousDiscipline(nomSousDiscipline)) return true;
        }
        return false;
    }
}