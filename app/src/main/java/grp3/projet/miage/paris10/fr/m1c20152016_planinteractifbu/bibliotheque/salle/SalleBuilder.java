package grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.salle;

import android.graphics.Color;

public class SalleBuilder {
    String[] s;
    private static final float BORDER_WIDTH = 4;
    private static final int BORDER_COLOR = Color.BLACK;

    public SalleBuilder(String[] s) {
        this.s = s;
    }

    public static Salle buildSalle(String[] s) {
        String nom = s[2];
        int left = Integer.parseInt(s[3]);
        int top = Integer.parseInt(s[4]);
        int right = Integer.parseInt(s[5]);
        int bottom = Integer.parseInt(s[6]);
        int color = Integer.parseInt(s[7]);
        boolean afficherNom = (Integer.parseInt(s[7]) != 0);

        return new Salle(nom, left, top, right, bottom, color, BORDER_WIDTH, BORDER_COLOR, afficherNom);
    }

    public static  SalleContenantEtageres buildSalleContenantEtageres(String[] s) {
        String nom = s[2];
        int left = Integer.parseInt(s[3]);
        int top = Integer.parseInt(s[4]);
        int right = Integer.parseInt(s[5]);
        int bottom = Integer.parseInt(s[6]);
        int color = Integer.parseInt(s[7]);
        boolean afficherNom = (Integer.parseInt(s[7]) != 0);

        return new SalleContenantEtageres(nom, left, top, right, bottom, color, BORDER_WIDTH, BORDER_COLOR, afficherNom);
    }
}
