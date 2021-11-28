package LabWorking.Lab08_AbstractClasses_Interfaces;

import java.util.*;
import java.util.function.Supplier;

public class Parking {
    private static Map<Integer, Vehicle> parkingMap = new HashMap<>();

    //Конструктор парковки с диапазоном мест 1...40
    public Parking() {
        for (int i = 1; i < 41; i++) {
            parkingMap.put(i, null);
        }
    }

    //Метод вывода схемы всей парковки
    public void GetAllPlaces() {
        int countToEnter = 10;
        System.out.println("Схема парковки:");

        System.out.println("******************************************************************************");
        for (var entry : parkingMap.entrySet()) {
            //Если место свободно то выводи его номер
            if (entry.getValue() == null) System.out.printf("| %s |\t",entry.getKey());
            //Иначе название ТС которое в нем находится
            else {
                switch (entry.getValue().GetVehicleName()) {
                    case "Автомобиль" -> System.out.print("|Авт|" + "\t");
                    case "Грузовик" -> System.out.print("|Грз|" + "\t");
                    case "Автобус" -> System.out.print("|Атб|" + "\t");
                    case "Прицеп" -> System.out.print("|Прц|" + "\t");
                }
            }

            if (entry.getKey() == countToEnter) {
                System.out.print("\n-----------------------------------------------------------------------------|\n\t\t\tПроезд\t\t\t\t\t\t\t\t\t\tПроезд\t\t\t\t |\n-----------------------------------------------------------------------------|\n");
                countToEnter *= 3;
            }
            if (entry.getKey() == 20) System.out.println();
        }
        System.out.println("\n******************************************************************************");
    }

    //Метод взаимодействия пользователя с системой
    public void ActionQuery() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("|Доступные действия:");
        System.out.println("|[ 1 ] - Добавить новое ТС.");
        System.out.println("|[ 2 ] - Удалить существующее ТС.");
        System.out.println("|[ 3 ] - Информация о парковочном месте.");
        System.out.println("|[ 4 ] - Список ТС на парковке.");
        System.out.println("|[ 0 ] - Выход из приложения.");
        System.out.print("Введите значение: ");
        try {
            int in = scanner.nextInt();
            System.out.println();

            //В зависимости от выбранного пункта вызываем методы
            switch (in) {
                case 1 -> EnterParking();
                case 2 -> QuitParking();
                case 3 -> InfoPlace();
                case 4 -> InfoParking();
                case 0 -> System.exit(0);
                default -> {
                    System.out.println("Ошибка: В меню нет такого пункта.\n");
                    ActionQuery();
                }
            }
        }
        catch (Exception error){
            System.out.println("Ошибка ввода.\n");
            ActionQuery();
        }
    }

    //Метод получения информации о находящихся на парковки ТС
    public void InfoParking(){
        boolean flag = true;
        for (var entry : parkingMap.entrySet()) {
            //Если значение не пустое выводим информацию
            if (entry.getValue() != null) {
                if (flag) System.out.println("ТС\t\t\tГосномер\t\tПарковочное место");
                flag = false;
                System.out.printf("%s\t\t%s\t\t%d\n", entry.getValue().GetVehicleName(), entry.getValue().GetGosNumber(), entry.getKey());
                }
            }
        if(flag) System.out.println("На стоянке нет ТС.\n");
        System.out.println();
        ActionQuery();
    }

    //Метод получения информации о находящихся на выбранном парковочном месте ТС
    public void InfoPlace() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите парковочное место: ");
        int placeNumber = scanner.nextInt();

        if (parkingMap.get(placeNumber) != null) {
            System.out.printf("Место занято ТС: %s, госномер %s.\n", parkingMap.get(placeNumber).GetVehicleName(), parkingMap.get(placeNumber).GetGosNumber());
        }
        else System.out.println("Парковочное место свободно.\n");

        System.out.println();
        ActionQuery();
    }
    //Метод удаления ТС с парковки
    public void QuitParking() {
        boolean flag = false;
        System.out.print("Введите госномер ТС:");
        Scanner scanner = new Scanner(System.in);
        String gosNomer = scanner.nextLine();
        //Проверяем на ввод некорректных данных
        if (gosNomer.length() == 9) {

            for (var entry : parkingMap.entrySet()) {
                //Отбрасываем пустые места на парковки
                if (entry.getValue() != null) {
                    //А занятые проверяем на совпадение с введеным госномером
                    if (entry.getValue().GetGosNumber().equals(gosNomer)) {
                        //Удаляем
                        parkingMap.put(entry.getKey(), null);
                        flag = true;
                    }
                }
            }
            if (flag) {
                System.out.printf("ТС с госномером %s был удален с парковки.\n", gosNomer);
                GetAllPlaces();
            } else System.out.printf("ТС с госномером %s НЕ найден на парковки.\n", gosNomer);
        }
        else System.out.println("Ошибка: Введен некорректный госномер!");
        ActionQuery();
    }

    //Метод добавления нового ТС на парковку
    public void EnterParking() {
        //Создаем массив с функциональным интерфейсом который будет принимать подклассы ТС
        ArrayList<Supplier<? extends Vehicle>> randomVehicle = new ArrayList<>();
        //Закидываем в него все наши ТС
        randomVehicle.add(Car::new);
        randomVehicle.add(Bus::new);
        randomVehicle.add(Truck::new);
        randomVehicle.add(Trailer::new);

        //Создаем новый случайный объект подкласса Vehicle
        Vehicle auto = randomVehicle.get((int)(Math.random() * 4)).get();

        //Узнаем размерность созданного ТС
        int autoSize = auto.GetVehicleSize();
        //Выводим сообщение в зависимости от размера ТС
        if (autoSize == 2) System.out.printf("Подъехало ТС: %s госномер %s оно должно быть размещено на %d-х порковочных местах\n", auto.GetVehicleName(), auto.GetGosNumber(), autoSize);
        else System.out.printf("Подъехало ТС: %s госномер %s оно должно быть размещено на %d-ом порковочном месте\n", auto.GetVehicleName(), auto.GetGosNumber(), autoSize);

        //Пользователь программы определяет есть ли место\возможность для добавления нового ТС на парковку
        System.out.print("Есть ли место ТС-ву? (Y / N): ");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        if (choice.toUpperCase(Locale.ROOT).equals("Y")) {
            //Вызываем методы добавления нового ТС в зависимости от его размера
            if (autoSize == 2){
                int place1, place2;
                System.out.print("Выберите 2-ва парковочных места:\n");
                System.out.print("Место 1: ");
                place1 = scanner.nextInt();
                System.out.print("Место 2: ");
                place2 = scanner.nextInt();

                //Вызов метода. Если ошибок нет печатает схему парковки.
                if(SetTwoPlaceParking(auto, place1, place2)) GetAllPlaces();
            }
            else {
                System.out.print("Выберите парковочное место: ");

                //Вызов метода. Если ошибок нет печатает схему парковки.
                if(SetOnePlaceParking(auto, scanner.nextInt())) GetAllPlaces();
            }
        }
        else {
            if (choice.toUpperCase(Locale.ROOT).equals("N")) {
                System.out.println("ТС покинуло КПП.");
            }
            else {
                System.out.println("Ошибка ввода.");
            }
        }
        System.out.println();
        ActionQuery();
    }

    //Метод для размещения ТС с размером 1. Возвращает истину если в методе не произошла ошибка
    private boolean SetOnePlaceParking(Vehicle auto, int placeF) {
        boolean flag = true;
        if (placeF < 1 || placeF > 40) {
            System.out.println("Ошибка: Указанного места на парковки не существует.");
            flag = false;
        }
        else {
            //Если место свободно записываем в него тс
            if (parkingMap.get(placeF) == null) {
                parkingMap.put(placeF, auto);
            } else {
                flag = false;
                System.out.println("Ошибка: Выбранное место уже занято другим ТС.");
            }
        }
        return flag;
    }

    //Метод для размещения ТС с размером 2. Возвращает истину если в методе не произошла ошибка
    private boolean SetTwoPlaceParking(Vehicle auto, int placeF, int placeT) {
        boolean flag = true;
        if (placeF < 1 || placeF > 40) {
            System.out.println("Ошибка: Указанного места на парковки не существует.");
            flag = false;
        }
        else {
            //Большие тс можно размещать только в центральном ряду. Производим проверку этого условия.
            if ((placeF > 10 && placeF < 30) && ((placeF + 10 == placeT) || (placeF - 10 == placeT))) {
                //Если все верно проверяем не заняты ли места и записываем тс в них
                if (parkingMap.get(placeF) == null && parkingMap.get(placeT) == null) {
                    parkingMap.put(placeF, auto);
                    parkingMap.put(placeT, auto);
                } else {
                    System.out.println("Ошибка: Одно или оба выбранных места уже заняты другими ТС.");
                    flag = false;
                }
            }
            else {
                System.out.println("Ошибка: Места должны распологаться в центральном ряду (с 11 - по 30) и должны находится в одной колонки (Например 11-21).");
                flag = false;
            }
        }
        return flag;
    }
}
