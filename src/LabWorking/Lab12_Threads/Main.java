package LabWorking.Lab12_Threads;


public class Main {
    public static void main(String[] args) {
        Exercise1();
        Exercise2();
        Exercise3();
        Exercise4();

    }

    private static void Exercise1() {
        System.out.println("Упражнение 1.");
        for (int i = 1; i < 11; i++) {
            System.out.printf("Поток номер %d создан и запущен.\n", i);
            //Записываем i
            int tempI = i;
            //Создаем потоки и прописываем их алгоритм через лямбду выражения
            new Thread(() -> {
                for (int j = 0; j <= 100; j++) {
                    System.out.printf("Поток: %d число: %d\n", tempI, j);
                }
            }).start();
        }
    }

    private static void Exercise2() {
        try {
            Thread ex2Thread = new Ex2Thread();
            System.out.printf("Упражнение 2.\nСтатус потока: %s\n", ex2Thread.getState());
            System.out.println("Запускаем поток.");
            ex2Thread.start();
            System.out.printf("Статус потока: %s\n", ex2Thread.getState());
            //Приостанавливаем главный поток
            Thread.sleep(1000);
            System.out.printf("Статус потока: %s\n", ex2Thread.getState());
            ex2Thread.join();
            System.out.printf("Статус потока: %s\n", ex2Thread.getState());
        }
        catch (InterruptedException error) {
            System.out.println(error.getMessage());
        }
    }

    private static void Exercise3() {
        try {
            System.out.println("Упражнение 3. Запускаем потоки...");
            for (int i = 0; i < 100; i++) {
                Thread thread = new Thread(() -> {
                    for (int j = 0; j < 1000; j++) {
                        Counter.Increment();
                    }
                });
                thread.start();
                //Ожидаем пока предыдущий поток посчитает инкремент
                thread.join();
            }
            System.out.printf("Итоговое число: %d\n", Counter.getCount());
        }
        catch (InterruptedException error) {
            System.out.println(error.getMessage());
        }
    }

    private static void Exercise4() {
        //Создаем объект монитора
        Object objectMonitor = new Object();
        System.out.println("Упражнение 4.");
        try {
            //Создаем 2-ва потока
            Thread threadOne = new Ex4Thread(objectMonitor);
            Thread threadTwo = new Ex4Thread(objectMonitor);

            //Запускаем
            threadOne.start();
            threadTwo.start();
            //Останавливаем главный поток
            Thread.sleep(8000);

            //Останавливаем созданые потоки и завершаем работу
            threadOne.interrupt();
            threadTwo.interrupt();
        }
        catch (InterruptedException error) {
            error.getStackTrace();
        }

    }

    //Вспомогательный клас для 2 упражнения
    static class Ex2Thread extends Thread {
        @Override
        public void run() {
            System.out.println("Поток начал свою работу");
            //Эмитируем работу потока
            for (long i = 0; i < 910000000L; i++) {
                if (i % 23634384 == 0) System.out.println("Работаем..");
            }
        }
    }

    //Вспомогательный клас для 4 упражнения
    static class Ex4Thread extends Thread {
        private Object monitor;

        //Конструктор принимающий монитор
        Ex4Thread(Object monitor) {
            this.monitor = monitor;
        }

        @Override
        public void run() {
            try {
                while (!isInterrupted()) {
                    synchronized (monitor) {
                        //Выводим сообщение каждую секунду
                        System.out.printf("Выполняется %s\n", getName());
                        sleep(1000);
                        //Разрешаем остановленному потоку запустится
                        monitor.notify();
                        //И запрещаем работать другому потоку
                        monitor.wait();
                    }
                }
            } catch (InterruptedException error) {
                System.out.printf("Поток %s завершен.\n",getName());
            }
        }
    }


    static class Counter {
        private static volatile int count = 0;

        public static int getCount() { return count; }

       synchronized public static void Increment() {
            count += 1;
        }
    }
}
