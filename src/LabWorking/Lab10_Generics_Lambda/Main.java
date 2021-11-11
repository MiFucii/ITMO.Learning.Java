package LabWorking.Lab10_Generics_Lambda;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Exercise1();
        Exercise2();
        Exercise3();
        Exercise4();

    }
    private static void Exercise1() {
        List<Object> objects = new ArrayList<>();
        //Добавляем объекты в коллекцию
        for (int i = 1; i < 5; i++) {
            for (int j = 5; j < 7; j++) {
                objects.add(j);
            }
            objects.add(i);
        }
        System.out.printf("Упражнение 1.\nПолучаем коллекцию объектов: %s\n", objects);
        System.out.printf("Преобразуем коллекцию в набор и получаем объекты без дубликатов: %s\n", RemoveDuplicate(objects));

    }
    private static void Exercise2() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        long start, end, n;

        start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add((int) (Math.random() * 10));
        }
        end = System.currentTimeMillis();
        System.out.printf("\nУпражнение 2.\nВремя заполнения ArrayList: %d мс.\n", end - start);

        start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add((int) (Math.random() * 10));
        }
        end = System.currentTimeMillis();
        System.out.printf("Время заполнения LinkedList: %d мс.\n", end - start);

        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            n = arrayList.get((int) (Math.random() * 1000000));
        }
        end = System.currentTimeMillis();
        System.out.printf("Время выполнения ArrayList: %d мс.\n", end - start);

        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            n = linkedList.get((int) (Math.random() * 1000000));
        }
        end = System.currentTimeMillis();
        System.out.printf("Время выполнения LinkedList: %d мс.\n", end - start);
        //Разница во времени в том что поиск элемента у ArrayList занимает O(1) времени.
        //А у LinkedList занимает O(n) времени.

    }
    private static void Exercise3() {
        Scanner scanner = new Scanner(System.in);
        Map<User, Integer> map = new HashMap<>();
        map.put(new User("MifUcii"), (int)(Math.random() * 100));
        map.put(new User("Phantom"), (int)(Math.random() * 100));
        map.put(new User("Simple"), (int)(Math.random() * 100));
        map.put(new User("Zeus"), (int)(Math.random() * 100));
        System.out.print("\nУпражнение 3.\nВведите имя игрока: ");
        String name = scanner.nextLine();

        for (var entry : map.entrySet()) {
            //Сравниваем имена
            if (entry.getKey().getName().equals(name)) {
                System.out.printf("Результат игрока: %d очков\n", entry.getValue());
                return;
            }
        }
        System.out.println("Пользователь с таким именем не найден.");
    }

    private static void Exercise4() {
        Integer[] array = new Integer[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 10);
        }
        System.out.printf("\nУпражнение 4. Генерируем массив:\n%s\n", Arrays.toString(array));

        for (var element : ArrayToMap(array).entrySet()){
            System.out.printf("Значение %d имеет %d вхождений.\n", element.getKey(), element.getValue());
        }

    }

    private static Set<Object> RemoveDuplicate(List<Object> objects){
        return new HashSet<>(objects);
    }

    public static <K> Map<K, Integer> ArrayToMap(K[] list) {
        Map<K, Integer> map = new HashMap<K, Integer>();
        int count;
        //Проходим по массиву и сравниваем каждый элемент со всеми элементами массива
        for (int i = 0; i < list.length; i++) {
            count = 0;
            for (int j = 0; j < list.length; j++) {
                //Если элементы равны прибавляем счетчик вхождений
                if (list[i] == list[j]) count++;
            }
            map.put(list[i], count);
        }
        return map;
    }

    static class User {
        private String name;

        public User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
