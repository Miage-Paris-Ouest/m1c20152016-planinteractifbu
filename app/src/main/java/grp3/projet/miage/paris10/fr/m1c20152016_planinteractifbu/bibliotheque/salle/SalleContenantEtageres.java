package grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.salle;

import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.discipline.Discipline;

public class SalleContenantEtageres extends ConcreteSalle {
    private String nom;
    private Discipline discipline;

    public SalleContenantEtageres(String nom, Discipline discipline) {
        super();
        this.nom = nom;
        this.discipline = discipline;
    }

    public String getNom() {
        return nom;
    }

    public Discipline getDiscipline() {
        return discipline;
    }
}
