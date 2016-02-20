package m1c20152016_planinteractifbu.fr.paris10.miage.projet.grp3.planbu.bibliotheque.salle;

import m1c20152016_planinteractifbu.fr.paris10.miage.projet.grp3.planbu.bibliotheque.discipline.Discipline;
/**
 * Created by clement on 13/02/2016.
 */
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
