package com.example.shape;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("square")
public class Square implements Shape {

    private double side;
    private String colour;

    public Square() {
        System.out.println("Square instance created.");
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String colour) {
        this.side = side;
        this.colour = colour;
    }

    @PostConstruct
    public void init() {
        System.out.println("Square init()");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Square destroy()");
    }

    @Override
    public void draw() {
        System.out.println("Square.");
    }

    @Override
    public void area() {
        System.out.println("Side = " + side + ". Area = " + (side * side));
    }
}
