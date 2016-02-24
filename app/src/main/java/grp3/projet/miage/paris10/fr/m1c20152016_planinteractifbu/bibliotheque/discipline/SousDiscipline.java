package grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.discipline;

import java.util.HashSet;
import java.util.Set;

import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.cote.EnsembleRacines;
import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.cote.Etagere;

public class SousDiscipline {
    private String nom;
    private Set<Etagere> etageres;
    private EnsembleRacines ensembleRacines;

    public SousDiscipline(String nom) {
        this.nom = nom;
        etageres = new HashSet<>();
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

    public EnsembleRacines getEnsembleRacines() {
        return ensembleRacines;
    }

    public void setEnsembleRacines(EnsembleRacines ensembleRacines) {
        this.ensembleRacines = ensembleRacines;
    }

    public void addEtageresSet(Set<Etagere> etageres) {
        this.etageres.addAll(etageres);
    }
}
