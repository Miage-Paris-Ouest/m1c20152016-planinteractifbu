package grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.leplan.representations;

import android.graphics.Paint;
import android.graphics.Rect;

public class Rectangle {
    private Rect bounds;
    private Paint paint;
    private float borderWidth;
    private int borderColor;

    public Rectangle(int left, int top, int right, int bottom, int color, float borderWidth, int borderColor) {
        bounds = new Rect(left, top, right, bottom);
        paint = new Paint();
        paint.setColor(color);
        this.borderWidth = borderWidth;
        this.borderColor = borderColor;
    }

    public Rect getBounds() {
        return bounds;
    }

    public Paint getPaint() {
        return paint;
    }

    public float getBorderWidth() {
        return borderWidth;
    }

    public int getBorderColor() {
        return borderColor;
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
}
