package com.cgvsu.Interface;
import com.cgvsu.models.Point;
import javafx.scene.canvas.GraphicsContext;

import java.util.List;

public interface Object {
    public List<Point> getPoints();
    public void draw(GraphicsContext gc);
}
