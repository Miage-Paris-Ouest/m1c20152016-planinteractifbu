package grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu;

/**
 * Created by Mohamed on 11/02/2016.
 */
public class Livre {

    private String salle;
    private String etagere;
    private String discipline;
    private String sousDiscipline;
    private String cote;

    public Livre(String salle, String etagere, String discipline, String sousDiscipline, String cote) {
        this.salle = salle;
        this.etagere = etagere;
        this.discipline = discipline;
        this.sousDiscipline = sousDiscipline;
        this.cote = cote;
    }

    public String getSalle() {
        return salle;
    }

    public void setSalle(String salle) {
        this.salle = salle;
    }

    public String getEtagere() {
        return etagere;
    }

    public void setEtagere(String etagere) {
        this.etagere = etagere;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public String getSousDiscipline() {
        return sousDiscipline;
    }

    public void setSousDiscipline(String sousDiscipline) {
        this.sousDiscipline = sousDiscipline;
    }

    public String getCote() {
        return cote;
    }

    public void setCote(String cote) {
        this.cote = cote;
    }
}
