# Изучение языка Java | Learning Java

Version 1.0 © MiFucii
___
<a id="Start"></a>
[![Университет ИТМО](https://upload.wikimedia.org/wikipedia/commons/thumb/4/43/ITMO_University_official_logo_horizontal.png/1200px-ITMO_University_official_logo_horizontal.png)](https://en.itmo.ru)
|Оглавление|
|---|
|[Лабораторная работа 1. Введение.](#lb1)
|[Лабораторная работа 2. Базовый синтаксис.](#lb2)|
|[Лабораторная работа 3. Простые алгоритмы.](#lb3)|
|[Лабораторная работа 4. String && StringBuilder.](#lb4)|
|[Лабораторная работа 5. Классы и объекты.](#lb5)|
|[Лабораторная работа 6. Классы и объекты (часть 2).](#lb6)|
|[Лабораторная работа 7. Наследование и полиморфизм.](#lb7)|
|[Лабораторная работа 8. Coming soon.](#lb8)|
|[Лабораторная работа 9. Работа с матрицами.](#lb9)|
|[Лабораторная работа 10. Наборы и коллекции.](#lb10)|
|[Лабораторная работа 11. Работа с файлами.](#lb11)|
|[Лабораторная работа 12. Работа с потоками.](#lb12)|
|[Лабораторная работа 13. Coming soon.](#lb13)|
___
<a id="lb1"></a>
## Лабораторная работа 1. 
#### Упражнение 1. Выведите строки в следующем порядке:
Я
хорошо
знаю
Java.
#### Упражнение 2. Посчитайте результат выражения
(46 + 10) * (10 / 3)
(29) * (4) * (-15)
#### Упражнение 3. В переменной number, лежит целое число 10500. В переменной result посчитайте следующее выражение: 
(number / 10) / 10. Результат выведите на консоль.
#### Упражнение 4. Даны три числа: 3.6, 4.1, 5.9. В переменной result посчитайте произведение этих чисел.
#### Упражнение 5. В этой задаче вы должны считать целые числа из стандартного ввода, а затем вывести. Каждое целое число нужно печатать с новой строки. Формат ввода:
42
100
125
#### Упражнение 6. Для целого числа b выполните следующие условные действия:
- Если b нечетное, выведите “Нечетное”
- Если b четное, выведите “Четное”
- Если b четное и больше 100, выведите “Выход за пределы диапазона”

[К оглавлению](#Start)
___
<a id="lb2"></a>
## Лабораторная работа 2
#### Упражнение 1. Напишите программу, которая выводит на консоль нечетные числа от 1 до 99. Каждое число печатается с новой строки.
#### Упражнение 2. Напишите программу, которая выводит числа от 1 до 100, которые делятся на 3, 5 и на то и другое (то есть и на 3 и на 5). Пример вывода:
Делится на 3: ….
Делится на 5: ….
Делится на 3 и на 5: ….
##### Упражнение 3. Напишите программу, чтобы вычислить сумму двух целых чисел и вернуть true, если сумма равна третьему целому числу. Пример вывода:
Введите первое число: 5
Введите второе число: 10
Введите третье число: 15
Результат: true
##### Упражнение 4. Напишите программу, которая принимает от пользователя три целых числа и возвращает true, если второе число больше первого числа, а третье число больше второго числа. Пример вывода:
Введите первое число: 5
Введите второе число: 10
Введите третье число: 15
Результат: true

#### Упражнение 5. Напишите программу, чтобы проверить, является ли число 3 как первый или последний элемент массива целых чисел. Длина массива должна быть больше или равна двум.
Пример вывода:
array = 3, -3, 7, 4, 5, 4, 3
true
#### Упражнение 6. Напишите программу, чтобы проверить, что массив содержит число 1 или 3.

[К оглавлению](#Start)
____
<a id="lb3"></a>
## Лабораторная работа 3
#### Упражнение 1. Напишите программу, которая проверяет отсортирован ли массив по возрастанию. Если он отсортирован по возрастанию то выводится “OK”если нет, то будет выводиться текст “Please, try again”

#### Упражнение 2. Напишите программу, которая считывает с клавиатуры длину массива (например, пользователь вводит цифру 4), затем пользователь вводит 4 числа и на новой строке выводится массив из 4 элементов. Пример вывода:
Array length: 4
Numbers of array:
5
6
7
2
Result: [5, 6, 7, 2]
#### Упражнение 3. Напишите метод, который меняет местами первый и последний элемент массива.
Пример вывода:
Array 1: [5, 6, 7, 2]
Array 2: [2, 6, 7, 5]

#### Упражнение 4. Дан массив чисел. Найдите первое уникальное в этом массиве число.
Например, для массива [1, 2, 3, 1, 2, 4] это число 3.

#### Упражнение 5. Вычислить N-е число Фибоначчи. Не использовать рекурсию и массивы, только циклы.

#### Упражнение 6. Заполните массив случайным числами и отсортируйте его. Используйте сортировку слиянием.

[К оглавлению](#Start)
___
<a id="lb4"></a>
## Лабораторная работа 4
#### Упражнение 1. Написать метод для поиска самой длинной строки.
#### Упражнение 2. Написать метод, который проверяет является ли слово палиндромом.
#### Упражнение 3. Напишите метод, заменяющий в тексте все вхождения слова «бяка» на «[вырезано цензурой]».
#### Упражнение 4. Имеются две строки. Найти количество вхождений одной (являющейся подстрокой) в другую.
#### Упражнение 5. Напишите метод, который инвертирует слова в строке. Предполагается, что в строке нет знаков препинания, и слова разделены пробелами.
Sample Output:
The given string is: This is a test string
The string reversed word by word is:
sihT si a tset gnirts

[К оглавлению](#Start)
___
<a id="lb5"></a>
## Лабораторная работа 5
#### Создайте класс, который описывает вектор (в трёхмерном пространстве). У него должны быть:
- Конструктор с параметрами в виде списка координат х, у, z

- Метод, вычисляющий длину вектора.

- Метод, вычисляющий скалярное произведение.

- Метод, вычисляющий векторное произведение с другим вектором.

- Метод, вычисляющий угол между векторами (или косинус угла): косинус угла между векторами равен скалярному произведению векторов, деленному на роизведение модулей (длин) векторов.

- Методы для суммы и разности.

- Статический метод, который принимает целое число N, и возвращает массив случайных векторов размером N.

[К оглавлению](#Start)
___
<a id="lb6"></a>
## Лабораторная работа 6
#### Упражнение 1. Допишите в класс «Study» конструктор, что будет принимать один параметр и будет устанавливать значение этого параметра в поле «course». Создайте объект класса «Study». В качестве значения для поля «course» установите текст: «Изучение Java - это просто!». Обратитесь к методу «printCourse» для вывода значения поля «course».

```
class Study {
    private String course;

    public String printCourse() {
        return this.course;
    }
}
class JavaProgram {
    public static void main(String[] args) {
    }
}
```
#### Упражнение 2. Создайте класс Дом. Добавьте в него следующие данные:
- поля: количество этажей, год постройки, наименование;
- метод для установки всех значений;
- метод для вывода всех значений;
- метод, возвращающий количество лет с момента постройки.

На основе класса создайте два объекта и пропишите для каждого характеристики. Добавление характеристик реализуйте через метод класса.
Выведите информацию про каждый объект.

#### Упражнение 3. Создайте класс Tree. Добавьте в него поля: возраст, живое ли дерево и название дерева. Создайте три конструктора:
- Конструктор, который устанавливает только возраст и название;
- Конструктор, который устанавливает все переменные в классе;
- Конструктор, который ничего не устанавливает, но выводит сообщение «Пустой конструктор без параметров сработал».

Создайте три объекта на основе класса и используйте по одному конструктору на каждый.
#### Упражнение 4. Создайте класс Самолет. В классе создайте вложенный класс - крыло. Внутри класса Крыло, реализуйте:
- поле для хранения информации про вес крыла;
- метод, который будет показывать вес крыла.

В главном классе создайте объект и добавьте во вложенный класс данные про вес крыла и выведите информацию на экран. Создайте два объекта и добавьте разный вес.

[К оглавлению](#Start)
___
<a id="lb7"></a>
## Лабораторная работа 7
#### Упражнение 1. Есть класс автомобиль. Добавьте класс Грузовик, который будет наследовать все от класса Автомобиль.
В классе Грузовик создайте поля:
- количество колес;
- максимальный вес.

Также создайте метод newWheels, который устанавливает новое значение в поле «количество колес» и выводит его в консоль.

В класс Грузовик сделайте конструктор, устанавливающий все значения в конструктор главного класса и все значения в класс Грузовик.
#### Упражнение 2. Реализовать следующую иерархию классов:
                            Shape
                            -(volume:double)
                            +(getVolume():double)
                    _____________________________
                    |              |             |
        SolidOfRevolution       Pyramid         Box
        -(radius:double)         -(s:double)      +(Box(double):void)
        +(getRadius():double)    -(h:double)      +(Add(Shape):boolean)
        _______________
        |             |
    Cylinder        Ball
    -(height:double)
Здесь метод Add() принимает на вход Shape. Класс Box является контейнером, в нем лежат другие фигуры и мы добавляем в него фигуры до тех пор, пока у него есть место (считать только объем). Если мест для фигур нет, то нужно вернуть false.


[К оглавлению](#Start)
___
<a id="lb9"></a>
## Лабораторная работа 9
#### Упражнение 1. Написать метод для поиска наибольшего элемента в двумерном массиве.
#### Упражнение 2. Написать метод, который проверяет, является ли двумерный массив квадратным.
#### Упражнение 3. Написать метод, который, в двумерном массиве (матрице) ищет строку, сумма элементов которой является максимальной среди всех строк матрицы.
#### Упражнение 4. Двумерный​ ​массив​ ​MxN​ ​заполнить​ ​случайными​ ​символами​ ​алфавита
#### Упражнение 5. Дан массив чисел numbers, и дан массив weight такой же длины. Задача: написать метод, который бы случайно выбирал число из первого массива, которое есть во втором массиве.

[К оглавлению](#Start)
___
<a id="lb10"></a>
## Лабораторная работа 10
#### Упражнение 1. Написать метод, который на входе получает коллекцию объектов, а возвращает коллекцию уже без дубликатов. Для решения этой задачи пригодится Set.
#### Упражнение 2. Напишите метод, который добавляет 1млн элементов в ArrayList и LinkedList. Напишите метод, который выбирает из заполненного списка элемент наугад 100000 раз. Замерьте время, которое потрачено на это. Сравните результаты, предположите, почему они именно такие.
#### Упражнение 3. Опишите класс User с одним полем name. Добавьте конструктор и геттер. Создайте Map, в котором для каждого пользователя хранится количество очков, заработанных в какой-то игре (Map<User, Integer>) Напишите программу, которая считывает с консоли имя и показывает, сколько очков у такого пользователя. Сами данные можно добавить в Map при создании или сгенерировать случайно.
#### Упражнение 4. Метод получает на вход массив элементов типа К. Вернуть нужно объект Map<K, Integer>, где K — Значение из массива, а Integer количество вхождений в массив:
```
<K> Map<K, Integer> arrayToMap(K[] ks);
```

[К оглавлению](#Start)
___
<a id="lb11"></a>
## Лабораторная работа 11
#### Упражнение 1. Написать метод, который читает текстовый файл и возвращает его в виде списка строк.
#### Упражнение 2. Написать метод, который записывает в файл строку, переданную параметром.
#### Упражнение 3. Используя решение 1 и 2, напишите метод, который склеивает два текстовый файла один.
#### Упражнение 4. Написать метод для копирования файла (побайтно, или массивами байт).
#### Упражнение 5. Написать метод, который в каталоге ищет текстовые файлы, в которых содержится определенная строка, и которая возвращает список имен таких файлов. (FilenameFilter)

[К оглавлению](#Start)
___