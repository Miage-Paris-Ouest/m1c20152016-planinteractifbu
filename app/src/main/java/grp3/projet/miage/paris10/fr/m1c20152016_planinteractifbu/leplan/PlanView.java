package grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.leplan;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.salle.Etage;

public class PlanView extends View {
    /**
     * Cette classe permettra de DESSINER un plan intéractif.
     **/
    private List<Etage> etages;
    private int etageRepresente;
    private static final int delaiRafraichissementVue = 1000;

    public PlanView(Context context) {
        super(context);
        etages = new ArrayList<>();
        etageRepresente = 0;
    }

    /**
     * Il est nécessaire d'implémenter ce constructeur pour pouvoir AVOIR LE DROIT de créer le
     * layout (XML) utilisant une PlanView. Normalement on aura pas besoin de l'utiliser puisque les seuls
     * paramètres de la classe n'ont pas besoin d'être initialisés à des valeurs particulières.
     **/
    public PlanView(Context context, AttributeSet attrs) {
        super(context, attrs);
        etages = new ArrayList<>();
        etageRepresente = 0;
    }
    /**
     * Idem constructeur nécessaire à implémenter pour avoir le droit de créer le layout utilisant une
     * PlanView.
     **/
    public PlanView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        etages = new ArrayList<>();
        etageRepresente = 0;
    }

    public void addEtage(Etage etage) {
        etages.add(etage);
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

        try {
            Thread.sleep(delaiRafraichissementVue);
        } catch (InterruptedException e) {
        }

        invalidate();
    }


}
