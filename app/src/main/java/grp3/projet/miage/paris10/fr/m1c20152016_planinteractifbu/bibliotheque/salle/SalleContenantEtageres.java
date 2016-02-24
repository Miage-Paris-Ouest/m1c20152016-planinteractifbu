package grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.salle;

import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.discipline.Discipline;

public class SalleContenantEtageres extends Salle {
    private Discipline discipline;

    public SalleContenantEtageres(String nom, int left, int top, int right, int bottom, int color, float borderWidth, int borderColor, boolean afficherNom, Discipline discipline) {
        super(nom, left, top, right, bottom, color, borderWidth, borderColor, afficherNom);
        this.discipline = discipline;
    }

    public Discipline getDiscipline() {
        return discipline;
    }
}
