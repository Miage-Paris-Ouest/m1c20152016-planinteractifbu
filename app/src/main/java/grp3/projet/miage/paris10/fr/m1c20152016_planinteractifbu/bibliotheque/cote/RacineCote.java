package grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.cote;

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
