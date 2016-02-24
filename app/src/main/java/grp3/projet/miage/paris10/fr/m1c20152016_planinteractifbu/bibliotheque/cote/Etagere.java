package grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.cote;

import java.util.HashSet;
import java.util.Set;

import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.discipline.SousDiscipline;

public class Etagere {
    private int numero;
    private Set<SousDiscipline> sousDisciplines;

    public Etagere(int numero) {
        this.numero = numero;
        sousDisciplines = new HashSet<>();
    }

    public void addSousDiscipline(SousDiscipline sousDiscipline) {
        sousDisciplines.add(sousDiscipline);
    }

    public int getNumero() {
        return numero;
    }

    public SousDiscipline getSousDisciplinesByName(String nom) {
        for(SousDiscipline s : sousDisciplines) {
            if(s.getNom().equals(nom)) {
                return s;
            }
        }
        return null;//@TODO throw NoSuchElementException
    }

    public Set<SousDiscipline> getSousDisciplines() {
        return sousDisciplines;
    }
}
