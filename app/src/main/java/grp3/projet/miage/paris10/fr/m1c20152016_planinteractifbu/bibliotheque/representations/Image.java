package grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.representations;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Paint;

public class Image {
    private float left;
    private float top;
    private Paint paint;
    private Bitmap img;

    public Image(float left, float top, Resources res, int drawable) {
        this.left = left;
        this.top = top;
        paint = new Paint();
        img = BitmapFactory.decodeResource(res, drawable);
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

    public Bitmap getImg() {
        return img;
    }

    public void setLeft(float left) {
        this.left = left;
    }

    public void setTop(float top) {
        this.top = top;
    }

    public void setPaint(Paint paint) {
        this.paint = paint;
    }

}
