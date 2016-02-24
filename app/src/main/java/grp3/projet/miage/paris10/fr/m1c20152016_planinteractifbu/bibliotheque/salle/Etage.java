package grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.salle;

import java.util.HashSet;
import java.util.Set;

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
}
