package m1c20152016_planinteractifbu.fr.paris10.miage.projet.grp3.planbu.bibliotheque.salle;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by clement on 13/02/2016.
 */
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

    public Set<Salle> getSalles() {
        return salles;
    }

    public Set<SalleContenantEtageres> getSallesEtageres() {
        return sallesEtageres;
    }

    public void addSalle(Salle salle) {
        salles.add(salle);
    }

    public void addSalleContenantEtagere(SalleContenantEtageres salle) {
        sallesEtageres.add(salle);
    }
}
