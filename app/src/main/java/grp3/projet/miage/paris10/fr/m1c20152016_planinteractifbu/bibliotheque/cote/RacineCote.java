package grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.cote;

public class RacineCote implements Comparable {
    private String racine;

    public RacineCote(String racine) {
        this.racine = racine;
    }

    public String getRacine() {
        return racine;
    }

    public boolean matches(String cote) {
        return false;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
