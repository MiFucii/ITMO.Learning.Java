package LabWorking.Lab07_Inheritance_Polymorphism;

public class Car {
    protected int weight;
    protected String model;
    protected String color;
    protected double speed;

    public Car () {}
    public Car (int w, String m, String c, double s) {
        weight = w;
        model = m;
        color = c;
        speed = s;
    }
    public void OutPut () {
        System.out.printf("%s весит %d кг.\n",model, weight);
        System.out.printf("Цвет машины - %s и её скорость %.2f км/ч\n", color, speed);
    }
}
