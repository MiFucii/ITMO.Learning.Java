package LabWorking.Inheritance_Polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Exercise1();
        Exercise2();
    }

    private static void Exercise1(){
        System.out.println("Упражнение 1.");
        Car auto = new Car(1300,"Lada","Красный",173.2);
        auto.OutPut();
        Truck truck = new Truck(2900,"Газель","Серый",109.3,6,3500);
        System.out.println();
        truck.OutPut();
        System.out.println();
        truck.NewWheels(5);
        truck.OutPut();
    }

    private static void Exercise2() {
        System.out.println("Упражнение 2.");
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
}
