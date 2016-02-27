package grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.salle;

import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.representations.Rectangle;

public class Salle {
    private String nom;
    private Rectangle representation;
    private boolean afficherNom;

    public Salle(String nom, int x, int y, int l, int h, int color, float largeurContour, int couleurContour, boolean afficherNom) {
        this.nom = nom;
        representation = new Rectangle(x, y, l, h, color, largeurContour, couleurContour);
        this.afficherNom = afficherNom;
    }

    public String getNom() {
        return nom;
    }

    public Rectangle getRepresentation() {
        return representation;
    }

    public boolean afficherNom() {
        return afficherNom;
    }
}
