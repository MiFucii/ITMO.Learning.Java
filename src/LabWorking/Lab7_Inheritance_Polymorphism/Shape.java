package LabWorking.Lab7_Inheritance_Polymorphism;

public class Shape {
    protected double volume;
    protected String name;

    public double getVolume() {
        return volume;
    }

    public void setParameters(double volume, String name) {
        this.volume = volume;
        this.name = name;
    }
}

class  SolidOfRevolution extends Shape{
    protected double radius;

    public double getRadius() {
        return radius;
    }
}

class Cylinder extends SolidOfRevolution{
    private double height;
}

class Ball extends SolidOfRevolution{

}

class Pyramid extends Shape{
    private double s;
    private double h;
}
class Box extends Shape {
    private double shapeInBoxVolume = 0;

    public Box(double volume) {
        this.volume = volume;
    }

    public boolean Add(Shape newShape) {
        //Прибавляем размер фигуры к общему размеру элементов в коробке
        this.shapeInBoxVolume += newShape.getVolume();
        boolean flag;
        //Сравниваем если размер фигуры меньше помешаем ее в коробку
        if (volume <= shapeInBoxVolume) {
            shapeInBoxVolume -= newShape.getVolume();
            flag = false;
        }
        else flag = true;

        return flag;
    }
}



