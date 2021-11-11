package LabWorking.Lab09_twoDimensionalArrays;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Exercise1();
        Exercise2();
        Exercise3();
        Exercise4();
        Exercise5();
    }

    private static void Exercise1() {
        int [][] array2d = new int[3][4];
        int max = 0;
        try {

            System.out.println("Упражнение 1.\nПолучаем двумерный массив:");
            Random random = new Random();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 4; j++) {
                    array2d[i][j] = random.nextInt(301);
                    if (max < array2d[i][j]) max = array2d[i][j];
                    System.out.print(array2d[i][j] + " ");
                }
                System.out.println();
            }
            System.out.printf("Максимальное число в этом массиве: %d\n\n", max);
        }
        catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    private static void Exercise2() {
        Scanner scanner = new Scanner(System.in);
        try {

            System.out.print("Упражнение 2. \nПожалуйста, введите кол-во строк в массиве: ");
            int row = scanner.nextInt();
            System.out.print("Пожалуйста, введите кол-во столбцов в массиве: ");
            int column = scanner.nextInt();

            int[][] array2d = new int[row][column];
            //Вычесляем кол-во строк
            int countRow = array2d.length;
            //Вычесляем кол-во столбцов
            int countColumn = array2d[0].length;

            if (countRow == countColumn) System.out.println("Вы создали двумерный квадратный массив.\n");
            else System.out.println("Вы создали двумерный НЕ квадратный массив.\n");
        }
        catch (Exception error){
            System.out.println(error.getMessage());
        }
    }
    private static void Exercise3() {
        int [][] array2d = new int[7][4];
        int maxSum, resRow = 0, resMaxSum = 0;
        try {

            System.out.println("Упражнение 3.\nПолучаем двумерный массив:");
            Random random = new Random();
            for (int i = 0; i < 7; i++) {
                maxSum = 0;
                for (int j = 0; j < 4; j++) {
                    //Генерируем случайное число от -30 до 30
                    array2d[i][j] = random.nextInt((30 - (-30) + 1)) + (-30);
                    //Считаем сумму чисел строки
                    maxSum += array2d[i][j];
                    System.out.print(array2d[i][j] + " ");
                }
                System.out.printf(" =%d\n", maxSum);
                //Сравниваем со стракой с наибольшей суммой
                if (resMaxSum < maxSum) {
                    resMaxSum = maxSum;
                    resRow = i;
                }
            }
            System.out.printf("Максимальная сумма чисел находится в %d строке и равна: %d\n\n", resRow + 1, resMaxSum);
        }
        catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }
    private static void Exercise4() {
        char [][] array2d = new char[5][6];
        try {

            System.out.println("Упражнение 4.\nПолучаем двумерный массив символов:");
            Random random = new Random();
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 6; j++) {
                    array2d[i][j] = (char) (random.nextInt(37) + 'а');
                    System.out.print(array2d[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }
    private static void Exercise5() {
        List<Integer> arrayCoincidence = new ArrayList();
        Random random = new Random();
        try {

            int[] numbers = {3, 6, 1, 8, 3, 0, 5, 13, 19, 21};
            int[] weight = {10, 4, 8, 5, 2, 7, 11, 19, 20, 12};
            System.out.printf("Упражнение 5.\nМассив numbers = %s\nМассив weight = %s\n", Arrays.toString(numbers), Arrays.toString(weight));

            for (int number : numbers) {
                for (int i : weight) {
                    //Сравниваем числа и если есть совпадения записываем в ArrayList
                    if (number == i) {
                        arrayCoincidence.add(number);
                        break;
                    }
                }
            }
            //Получаем случайным образом индекс элемента и выводим его
            System.out.printf("Было выбрано число: %d", arrayCoincidence.get(random.nextInt(arrayCoincidence.size())));
        }
        catch (Exception error){
            System.out.println(error.getMessage());
        }
    }
}
