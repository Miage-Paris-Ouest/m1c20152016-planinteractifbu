package grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.leplan.representations;

import android.graphics.Paint;

public class Texte {
    private String text;
    private float left;
    private float top;
    private Paint paint;

    public Texte(String text, float left, float top, float textSize) {
        this.left = left;
        this.top = top;
        this.text = text;
        paint = new Paint();
        paint.setTextSize(textSize);
    }

    public String getText() {
        return text;
    }

    public float getLeft() {
        return left;
    }

    public float getTop() {
        return top;
    }

    public Paint getPaint() {
        return paint;
    }
}
