package com.example.shape;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ShapeManager {

    @Autowired
    @Qualifier("square")
    private Shape shape;

    @Value("${shape.foreColour}")
    private String colour;

    public ShapeManager() {
    }

    public ShapeManager(Shape shape) {
        this.shape = shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public void drawShape() {
        System.out.println("Colour = " + colour);
        shape.draw();
        shape.area();
    }
}
