package com.cgvsu.models;

import com.cgvsu.Interface.Drawable;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.PixelWriter;
import javafx.scene.paint.Color;

public class Pixel implements Drawable {
    private int x;
    private int y;
    private Color c0;

    public Pixel(int x, int y, Color c0){
        this.x = x;
        this.y = y;
        this.c0 = c0;
    }

    public Pixel(Point c, Color c0){
        this.x = c.x;
        this.y = c.y;
        this.c0 = c0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Color getC0() {
        return c0;
    }

    @Override
    public void draw(GraphicsContext gc) {
        final PixelWriter px = gc.getPixelWriter();
        px.setColor(x, y, c0);
    }


}
