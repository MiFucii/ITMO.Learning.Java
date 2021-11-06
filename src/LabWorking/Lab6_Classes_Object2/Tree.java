package LabWorking.Lab6_Classes_Object2;

public class Tree {
    private int age;
    private boolean life = true;
    private String name;

    public Tree(){
        System.out.println("Пустой конструктор без параметров сработал!");
    }

    public Tree(int age, String name){
        this.age = age;
        this.name = name;
    }

    public  Tree(int age, String name, boolean life){
        this.age = age;
        this.name = name;
        this.life = life;
    }

    @Override
    public String toString() {
        return "Название дерева: " + name + " его возраст: " + age + " лет, растет ли дерево: " + life;
    }
}
