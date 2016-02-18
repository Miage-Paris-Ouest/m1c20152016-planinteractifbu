package m1c20152016_planinteractifbu.fr.paris10.miage.projet.grp3.planbu.bibliotheque.cote;

/**
 * Created by clement on 13/02/2016.
 */
public class RacineCote implements Comparable {
    private String racine;
    private Etagere etagere;

    public RacineCote(String racine) {
        this.racine = racine;
    }

    public RacineCote(String racine, Etagere etagere) {
        this.racine = racine;
        this.etagere = etagere;
    }

    public String getRacine() {
        return racine;
    }

    public Etagere getEtagere() {
        return etagere;
    }

    public void setEtagere(Etagere etagere) {
        this.etagere = etagere;
    }

    public boolean matches(String cote) {
        return false;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
