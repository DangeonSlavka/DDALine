package com.cgvsu.Interface;

import com.cgvsu.models.Pixel;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.PixelWriter;

import java.util.List;

public interface Drawable {
    public void draw(final GraphicsContext gc);
}
