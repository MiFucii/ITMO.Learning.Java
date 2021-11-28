package LabWorking.Lab08_AbstractClasses_Interfaces;

abstract class Vehicle {
    protected int vehicleSize;
    protected String vehicleName;
    protected String gosNumber = RandomGosNumber();

    public Integer GetVehicleSize() {
        return vehicleSize;
    }

    public String GetVehicleName() {
        return vehicleName;
    }

    public String GetGosNumber() { return gosNumber; }

    //Метод создания случайного номера для автомобиля
    protected String RandomGosNumber(){
        StringBuilder sb = new StringBuilder();
        //Объявляем 2-ва массива откуда случайным образом будем извлекать значения
        char[] letter = {'А','В','С','Е','О','Р','Т','Н','М','У','Л','К','Х'};
        int[] number = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        //Собираем номер
        for (int i = 0; i < 6; i++) {
            switch (i) {
                case 0, 4, 5 -> sb.append(letter[(int) (Math.random() * 13)]);
                default -> sb.append(number[(int) (Math.random() * 10)]);
            }
        }
        sb.append("178");
        return sb.toString();
    }
}

class Car extends Vehicle{
    public Car(){
        vehicleName = "Автомобиль";
        vehicleSize = 1;
    }
}

class Bus extends Vehicle{
    public Bus(){
        vehicleName = "Автобус";
        vehicleSize = 2;
    }
}

class Trailer extends Vehicle{
    public Trailer(){
        vehicleName = "Прицеп";
        vehicleSize = 1;
    }
}

class Truck extends Vehicle{
    public Truck(){
        vehicleName = "Грузовик";
        vehicleSize = 2;
    }
}
