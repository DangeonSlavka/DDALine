package com.cgvsu.interpolation;

import com.cgvsu.models.Pixel;
import com.cgvsu.models.Point;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class RadialInterpolation implements Interpolation{
    private int xCenter;
    private int yCenter;
    private int radius;
    private Color centerColor;
    private Color endColor;

    public RadialInterpolation(int xCenter, int yCenter, int radius, Color centerColor, Color endColor) {
        this.xCenter = xCenter;
        this.yCenter = yCenter;
        this.radius = radius;
        this.centerColor = centerColor;
        this.endColor = endColor;
    }

    public Pixel getInterpolationPixel(int x, int y){
        double distance = Math.sqrt(Math.pow(xCenter - x , 2)+Math.pow(yCenter - y, 2));
        return new Pixel(x, y, centerColor.interpolate(endColor, distance/radius));
    }

    public List<Pixel> getInterpolation(List<Point> p){
        List<Pixel> pixels = new ArrayList<>();
        for(Point p1:p){
            pixels.add(
                    getInterpolationPixel(p1.x, p1.y)
            );
        }
        return pixels;
    }

}
