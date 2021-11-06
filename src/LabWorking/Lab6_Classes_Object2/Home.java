package LabWorking.Lab6_Classes_Object2;

import java.time.LocalDate;

public class Home {
    private String name;
    private int yearOfConstruction;
    private int floors;

    public void SetInformation (String name, int yearOfConstruction, int floors){
        this.name = name;
        this.yearOfConstruction = yearOfConstruction;
        this.floors = floors;
    }

    public String PrintInformation(){
        return String.format("Название здания: %s\nГод постройки: %s\nКол-во этажей в здании: %s", name, yearOfConstruction, floors);
    }

    public int HomeAge(){
        LocalDate date = LocalDate.now();
        return date.getYear() - yearOfConstruction;
    }
}
