package grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.plan;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.Bibliotheque;
import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.cote.Etagere;
import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.salle.Salle;
import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.salle.SalleContenantEtageres;
import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.representations.Rectangle;

public class PlanView extends View {
    /**
     * Cette classe permettra de DESSINER un plan intéractif.
     **/
    private Bibliotheque bu;
    private int etageRepresente;
    private static final int DELAI_RAFRAICHISSEMENT_VUE = 1000;

    public PlanView(Context context) {
        super(context);
        etageRepresente = 0;
    }

    /**
     * Il est nécessaire d'implémenter ce constructeur pour pouvoir AVOIR LE DROIT de créer le
     * layout (XML) utilisant une PlanView. Normalement on aura pas besoin de l'utiliser puisque les seuls
     * paramètres de la classe n'ont pas besoin d'être initialisés à des valeurs particulières.
     **/
    public PlanView(Context context, AttributeSet attrs) {
        super(context, attrs);
        etageRepresente = 0;
    }

    /**
     * Idem constructeur nécessaire à implémenter pour avoir le droit de créer le layout utilisant une
     * PlanView.
     **/
    public PlanView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        etageRepresente = 0;
    }

    public int getEtageRepresente() {
        return etageRepresente;
    }

    public void setBu(Bibliotheque bu) {
        this.bu = bu;
    }

    public void setEtageRepresente(int numEtage) {
        etageRepresente = numEtage;
    }

    private void drawRectangleWithBorder(Canvas canvas, Rect bounds, float borderWidth, int color, int borderColor) {
        Rect r = new Rect(bounds);
        Paint p = new Paint();

        p.setColor(borderColor);
        canvas.drawRect(r, p);

        r.left += borderWidth;
        r.top += borderWidth;
        r.right -= borderWidth;
        r.bottom -= borderWidth;

        p.setColor(color);
        canvas.drawRect(r, p);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        for (Salle s : bu.getEtage(etageRepresente).getSalles()) {
            Rectangle r = s.getRepresentation();
            drawRectangleWithBorder(canvas, r.getBounds(), r.getBorderWidth(), r.getPaint().getColor(), r.getBorderColor());
        }

        for (SalleContenantEtageres s : bu.getEtage(etageRepresente).getSallesEtageres()) {
            Rectangle r = s.getRepresentation();
            drawRectangleWithBorder(canvas, r.getBounds(), r.getBorderWidth(), r.getPaint().getColor(), r.getBorderColor());
        }

        for (SalleContenantEtageres s : bu.getEtage(etageRepresente).getSallesEtageres()) {
            for (Etagere e : s.getEtageres()) {
                Rectangle r = e.getRepresentation();
                if (r != null)
                    drawRectangleWithBorder(canvas, r.getBounds(), r.getBorderWidth(), r.getPaint().getColor(), r.getBorderColor());
            }
        }
/*
        try {
            Thread.sleep(DELAI_RAFRAICHISSEMENT_VUE);
        } catch (InterruptedException e) {
        }
        invalidate();*/
    }


}