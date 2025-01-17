package com.example.shape;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Fallback;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("circle")
//@Primary
//@Fallback
public class Circle implements Shape {
    private double radius;

    public Circle() {
        System.out.println("Circle object created.");
    }

    @PostConstruct
    public void init() {
        System.out.println("Circle init.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Circle pre destroy");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public void draw() {
        System.out.println("Circle.");
    }

    @Override
    public void area() {
        System.out.println("Radius = " + radius + ". Area = " + (3.14 * (radius * radius)));
    }
}
