package LabWorking.Lab6_Classes_Object2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Exercise1();
        System.out.println();
        Exercise2();
        System.out.println();
        Exercise3();
        System.out.println();
        Exercise4();
    }

    private static void Exercise1(){
        Study study = new Study("Изучение Java - это просто!");
        System.out.printf("Упражнение 1. %s\n", study.printCourse());
    }
    private static void Exercise2(){
        Home library = new Home();
        Home tc = new Home();
        library.SetInformation("Библиотека",1960,3);
        tc.SetInformation("Торговый центр", 2000, 1);

        System.out.printf("Упражнение 2:\nЗдание 1: \n%s\nВозраст здания: %d год(а)\nЗдание 2: \n%s\nВозраст здания: %d год(а)\n",
                library.PrintInformation(),library.HomeAge(),tc.PrintInformation(),tc.HomeAge());

    }
    private static void Exercise3(){
        List<Tree> trees = new ArrayList<>();
        System.out.println("Упражнение 3.");
        Tree firTree = new Tree();
        trees.add(new Tree(11,"Береза"));
        trees.add(new Tree(138, "Тополь", false));

        for (Tree tree:trees) {
            System.out.println(tree.toString());
        }
    }

    private static void Exercise4(){
        Airplane airplane = new Airplane();
        Airplane.Wing wing1 = airplane.new Wing(73);
        Airplane.Wing wing2 = airplane.new Wing(74);

        System.out.println("Упражнение 4.\nЛевое крыло:");
        wing1.PrintWeight();
        System.out.println("\nПравое крыло:");
        wing2.PrintWeight();

    }
}
