package LabWorking.Lab11_Files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final String path = "src\\LabWorking\\Lab11_Files\\files\\";
    public static void main(String[] args) {

        for (String line : Exercise1("Ex1.txt")) {
            System.out.println(line);
        }
        Exercise2("Передаем строку в фаил...");
        Exercise3();
        Exercise4("Ex3.txt","Ex4.txt","");
        Exercise5();

    }

    private static List<String> Exercise1(String fileName) {
        List<String> stringLine = new ArrayList<>();
        File file = new File(path + fileName);

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                //Записываем строки в массив
                stringLine.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return stringLine;

    }
    private static void Exercise2(String string) {
        File file = new File(path + "Ex2.txt");

        try (FileWriter writer = new FileWriter(file)) {
            writer.write(string);
        }
        catch (IOException error) {
            System.out.println(error.getMessage());
        }
    }
    private static void Exercise3() {
        File file = new File(path + "Ex3.txt");
        System.out.print("Упражнение 3. Начинаем склеивание.\nИдет склеивание.");

        try (FileWriter writer = new FileWriter(file)) {
            //Цикл для перебора имен
            for (int i = 1; i < 3; i++) {
                //Передаем фаил для считывания в метод упражнения 1
                for (String line: Exercise1(String.format("Ex%d.txt",i))) {

                    //Склеиваем\Пишем в новый файл пришедшие строки
                    writer.write(line + "\n");
                    //Эмитация загрузки\работы
                    Thread.sleep(200);
                    System.out.print(".");
                }
            }
            System.out.println("\nСклеивание файлов успешно завершено.");
        }
        catch (IOException | InterruptedException error) {
            System.out.println(error.getMessage());
        }

    }
    private static void Exercise4(String fileNameOld, String fileNameNew, String newPath) {
        //Если не указали папку для копирования, копируем в текущий каталог
        if(newPath.equals("")) newPath = path;
        System.out.print("Упражнение 4. Начинаем копирование...");

        try(FileInputStream fis = new FileInputStream(path + fileNameOld);
            FileOutputStream fos = new FileOutputStream(newPath + fileNameNew);
            //Используем буфер по 100 символов
            BufferedInputStream bis = new BufferedInputStream(fis, 100)) {

            int i;
            //Считываем последующий символ и приравниваем его к i делаем это до того момента пока есть символы
            while((i = bis.read())!= -1){
                //Переписываем символ из старого файла в новый
                fos.write(i);
            }
        }
        catch (IOException error) {
            System.out.println(error.getMessage());
        }
        System.out.printf("\nКопирование успешно завершено!\n");
    }
    private static void Exercise5() {
        //Вспомогательный флаг
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Упражнение 5. Пожалуйста, введите строку для поска: ");
        String string = scanner.nextLine();
        System.out.println("Начинаем поиск...");

        //Определяем директорию
        File directory = new File(path);

        //В массив будем складывать только файлы с расширением txt
        FilenameFilter filter = (f, name) -> {
            return name.endsWith(".txt");
        };

        //Создаем массив имен файлов txt формата
        File[] files = directory.listFiles(filter);
        for (File fl : files) {
            //Считывать файлы будем через BufferedReader
            try (BufferedReader bufReader = new BufferedReader(new FileReader(fl))) {
                //Пока есть что считывать...
                while (bufReader.ready()) {
                    //...Считываем строку из файла и сравниваем с нашей строкой
                    if (string.equals(bufReader.readLine())) {
                        if(flag) System.out.println("Найдены совпадения в файлах:");
                        //Выводим имена файлов
                        System.out.println(fl.getName());
                        flag = false;
                    }
                }
            } catch (IOException error) {
                System.out.println(error.getMessage());
            }
        }
        if(flag) System.out.println("Совпадений не найдено!");
    }
}
