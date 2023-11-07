package com.cgvsu.rasterizationfxapp;

import com.cgvsu.Interface.Object;
import com.cgvsu.interpolation.RadialInterpolation;
import com.cgvsu.models.DDALine;
import com.cgvsu.models.Pixel;
import com.cgvsu.models.Point;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class RasterizationController {

    @FXML
    AnchorPane anchorPane;
    @FXML
    private Canvas canvas;

    @FXML
    private void initialize() {
        anchorPane.prefWidthProperty().addListener((ov, oldValue, newValue) -> canvas.setWidth(newValue.doubleValue()));
        anchorPane.prefHeightProperty().addListener((ov, oldValue, newValue) -> canvas.setHeight(newValue.doubleValue()));


        ArrayList<Object> d = new ArrayList<>();
        d.add(new DDALine(100, 100, 500, 500));

        for (Object o:d){
            List<Point> p= o.getPoints();
            List<Pixel> pix = new RadialInterpolation(100, 100, 500, Color.AQUA, Color.CRIMSON).getInterpolation(p);
            for(Pixel p1:pix){
                p1.draw(canvas.getGraphicsContext2D());
            }
        }
    }

}