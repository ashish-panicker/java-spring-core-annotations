package com.example;

import com.example.config.ShapeConfig;
import com.example.shape.Circle;
import com.example.shape.Shape;
import com.example.shape.ShapeManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        try (ConfigurableApplicationContext context =
                     new AnnotationConfigApplicationContext(ShapeConfig.class)) {
            ShapeManager sm = context.getBean(ShapeManager.class);
            sm.drawShape();
        }

    }
}