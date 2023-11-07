package com.cgvsu.interpolation;

import com.cgvsu.models.Pixel;
import com.cgvsu.models.Point;
import javafx.scene.paint.Color;

import java.util.List;

public interface Interpolation {
    Pixel getInterpolationPixel(int x, int y);
    List<Pixel> getInterpolation(List<Point> p);


}
