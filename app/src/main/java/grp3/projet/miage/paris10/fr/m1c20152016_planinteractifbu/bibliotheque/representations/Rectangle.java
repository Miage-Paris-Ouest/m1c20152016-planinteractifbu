package grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.representations;

import android.graphics.Paint;
import android.graphics.Rect;

public class Rectangle {
    private Rect bounds;
    private Paint paint;
    private float largeurContour;
    private int couleurContour;

    public Rectangle(int x, int y, int l, int h, int color, float largeurContour, int couleurContour) {
        bounds = new Rect(x, y, x + l, y + h);
        paint = new Paint();
        paint.setColor(color);
        this.largeurContour = largeurContour;
        this.couleurContour = couleurContour;
    }

    public Rect getBounds() {
        return bounds;
    }

    public Paint getPaint() {
        return paint;
    }

    public float getBorderWidth() {
        return largeurContour;
    }

    public int getBorderColor() {
        return couleurContour;
    }

    public void setBounds(Rect bounds) {
        this.bounds = bounds;
    }

    public void setPaint(Paint paint) {
        this.paint = paint;
    }

    public void setColor(int color) {
        paint.setColor(color);
    }

    public void setCouleurContour(int couleurContour) {
        this.couleurContour = couleurContour;
    }
}
