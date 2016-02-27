package grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.cote;

import android.graphics.Color;

import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.representations.Rectangle;

public class Etagere {
    private int num;
    private Rectangle representation;
    public static int COULEUR = Color.WHITE;
    public static float LARGEUR_CONTOUR = 2;
    public static int COULEUR_CONTOUR = Color.BLACK;

    public Etagere(int num) {
        this.num = num;
    }

    public Etagere(int num, int x, int y, int l, int h, int color, float largeurContour, int couleurContour) {
        this.num = num;
        representation = new Rectangle(x, y, l, h, color, largeurContour, couleurContour);
    }

    public int getNum() {
        return num;
    }

    public Rectangle getRepresentation() {
        return representation;
    }

    public void setRepresentation(Rectangle representation) {
        this.representation = representation;
    }

    public void faireRessortir() {
        representation.setColor(Color.rgb(255, 127, 39));
        //representation.setCouleurContour(Color.rgb(255, 127, 39));
    }
}
