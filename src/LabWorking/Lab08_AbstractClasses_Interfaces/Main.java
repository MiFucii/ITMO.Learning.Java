package LabWorking.Lab08_AbstractClasses_Interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Exercise1();
        Exercise2();

    }

    private static void Exercise1(){
        System.out.println("Упражнение 1.");
        List<Shape> shapes = new ArrayList<>();
        Box box = new Box(23.5);

        Ball ball = new Ball();
        ball.setParameters(2.3,"Круг");
        shapes.add(ball);

        Cylinder cylinder = new Cylinder();
        cylinder.setParameters(10.32,"Цилиндр");
        shapes.add(cylinder);

        Pyramid pyramid = new Pyramid();
        pyramid.setParameters(5.04,"Пирамида");
        shapes.add(pyramid);

        Cylinder cylinder2 = new Cylinder();
        cylinder2.setParameters(15.34,"Цилиндр");
        shapes.add(cylinder2);

        Ball ball1 = new Ball();
        ball1.setParameters(26.22,"Круг");
        shapes.add(ball1);

        for (Shape shape: shapes) {
            if (box.Add(shape)) System.out.printf("Фигура %s добавлена в коробку.\n", shape.name);
            else System.out.printf("Фигура %s НЕ добавлена в коробку.\n", shape.name);
        };
    }
    private static void Exercise2(){
        Parking parking = new Parking();
        parking.GetAllPlaces();
        parking.ActionQuery();
    }
}
