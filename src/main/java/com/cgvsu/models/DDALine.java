package com.cgvsu.models;

import com.cgvsu.Interface.Object;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class DDALine implements Object {

    private List<Point> points = new ArrayList<>();
    private int x_start;
    private int y_start;
    private int x_end;
    private int y_end;

    public DDALine(int x_start, int y_start,
                   int x_end, int y_end
    ) {
        this.x_start = x_start;
        this.y_start = y_start;
        this.x_end = x_end;
        this.y_end = y_end;

        points = getPoints();
    }

    public int getX_start() {
        return x_start;
    }

    public int getY_start() {
        return y_start;
    }

    public int getX_end() {
        return x_end;
    }

    public int getY_end() {
        return y_end;
    }

    public int getLength(){
        return (int) Math.sqrt(Math.pow((x_end-x_start), 2) + Math.pow((y_end-y_start), 2));
    }
    @Override
    public void draw(GraphicsContext gc){
        for(Point c1: points){
            new Pixel(c1, Color.BLACK).draw(gc);
        }
    }

    @Override
    public List<Point> getPoints() { // sector color
        List<Point> ans = new ArrayList<>();

        int dx = x_end - x_start;
        int dy = y_end - y_start;

        int step;

        // If dx > dy we will take step as dx
        // else we will take step as dy to draw the complete
        // line
        if (Math.abs(dx) > Math.abs(dy))
            step = Math.abs(dx);
        else
            step = Math.abs(dy);

        // Calculate x-increment and y-increment for each step
        float x_incr = (float) dx / step;
        float y_incr = (float) dy / step;

        // Take the initial points as x and y
        float x = x_start;
        float y = y_start;

        for (int i = 0; i < step; i++) {

            // putpixel(round(x), round(y), WHITE);
            ans.add(new Point((int) x, (int) y));
            x += x_incr;
            y += y_incr;
            // delay(10);
        }

        return ans;
    }


}
