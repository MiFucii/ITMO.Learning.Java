package LabWorking.Lab07_Inheritance_Polymorphism;

public class Truck extends Car {
    private int numberOfWheels;
    private int maxWeight;

    //Совмещаем два конструктора
    public Truck(int weight, String model, String color, double speed, int countWheels, int maxWeight) {
        super(weight, model, color, speed);
        this.numberOfWheels = countWheels;
        this.maxWeight = maxWeight;
    }

    public void NewWheels(int count){
        System.out.printf("Количество колес у автомобиля %s было изменено с %d до %d: \n",model,numberOfWheels,count);
        numberOfWheels = count;
    }
    //Переопределяем метод вывода в консоль
    @Override
    public void OutPut(){
        System.out.printf("%s весит %d кг. а её максимальный вес %d кг.\n",model, weight, maxWeight);
        System.out.printf("Цвет машины - %s количество колес - %d а скорость %.2f км/ч\n", color, numberOfWheels, speed);
    }
}
