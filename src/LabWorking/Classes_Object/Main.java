package LabWorking.Classes_Object;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arraySize;
        Vector vctr = new Vector(2,3,5);
        Vector vctrSecond = new Vector(7,3,4);
        Scanner scanner = new Scanner(System.in);

        System.out.println(String.format("1. Длина вектора равна: %.5f", vctr.VectorLength(vctr)));
        System.out.println(String.format("2. Скалярное произведение векторов равна: %d", vctr.ScalarMultiplication(vctrSecond)));
        System.out.println(String.format("3. Векторное произведение векторов равно: %s", vctr.VectorsMultiplication(vctrSecond)));
        System.out.println(String.format("4. Косинус угла между векторами равен: %.5f", vctr.CosAngle(vctrSecond)));
        System.out.println(String.format("5.1 Сумма векторов равна: %s", vctr.Sum(vctrSecond)));
        System.out.println(String.format("5.2 Разность векторов равна: %s", vctr.Difference(vctrSecond)));
        System.out.print("6. Введите кол-во векторов которые Вы хотите создать: ");
        arraySize = scanner.nextInt();
        System.out.println("Были получены слудующие вектора:");
        for (Vector vector: Vector.RandomVector(arraySize, -10,30)) {
            System.out.println(vector.toString());
        }

    }
}

class Vector {
    private int x;
    private int y;
    private int z;
    //Конструктор по умолчанию
    public Vector(){
        x = 0;
        y = 0;
        z = 0;
    }
    //Пользовательский конструктор
    public Vector(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return String.format("{%d, %d, %d}", x,y,z);
    }

    //Рассчет длины вектора с помощью функции Math
    public double VectorLength(Vector vector){
        return Math.sqrt(Math.pow(vector.x,2)+Math.pow(vector.y,2)+Math.pow(vector.z,2));
    }

    //Рассчет скалярного произведения вектора с помощью подстановки значений в формулу
    public int ScalarMultiplication (Vector vector){
        return ((x * vector.x) + (y * vector.y) + (z * vector.z));
    }

    //Рассчет произведения вектора с другим вектором с помощью подстановки значений в формулу
    public String VectorsMultiplication (Vector vector){
        int x, y, z;
        x = this.y * vector.z - this.z * vector.y;
        y = this.z * vector.x - this.x * vector.z;
        z = this.x * vector.y - this.y * vector.x;

        return String.format("{%d, %d, %d}",x,y,z);
    }

    //Рассчет косинус угла между векторами с помощью подстановки значений в формулу
    public double CosAngle (Vector vector){
        return ScalarMultiplication(vector)/(VectorLength(this) * VectorLength(vector));

    }

    //Рассчет суммы векторов с помощью подстановки значений в формулу
    public String Sum(Vector vector){
        int x, y, z;
        x = this.x + vector.x;
        y = this.y + vector.y;
        z = this.z + vector.z;

        return String.format("{%d, %d, %d}",x,y,z);
    }

    //Рассчет разности векторов с помощью подстановки значений в формулу
    public String Difference(Vector vector){
        int x, y, z;
        x = this.x - vector.x;
        y = this.y - vector.y;
        z = this.z - vector.z;

        return String.format("{%d, %d, %d}",x,y,z);
    }

    //Функция создания случайных векторов
    public static Vector[] RandomVector(int arraySize, int beginRandomNumber, int endRandomNumber){
        Vector[] vectors = new Vector[arraySize];
        Random rnd = new Random();
        for (int i = 0; i < arraySize; i++) {
            vectors[i] = new Vector(
                    rnd.nextInt((endRandomNumber - beginRandomNumber) + 1) + beginRandomNumber,
                    rnd.nextInt((endRandomNumber - beginRandomNumber) + 1) + beginRandomNumber,
                    rnd.nextInt((endRandomNumber - beginRandomNumber) + 1) + beginRandomNumber
            );
        }
        return vectors;
    }
}
