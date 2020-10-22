package Ibodov;

public class Main {

    public static void main(String[] args) {
                /*----------*/
        Car range = new Car(); //создали объект range из класса Car
        range.name = "Range rover";
        range.year = 1970;
        range.color = "Белый";
        range.type = "Внедорожник";

        System.out.println("Автомобиль от компании Land Rover:");
        System.out.println("Название: " + range.name);
        System.out.println("Год основания: " + range.year);
        System.out.println("Цвет: " + range.color);
        System.out.println("Тип: " + range.type);

                /*------------------*/
        System.out.println();

        Car rolls = new Car();
        rolls.name = "Rolls-Royce";
        rolls.year = 1904;
        rolls.color = "Черный";
        rolls.type = "Комби";

        System.out.println("Автомобиль от компании BMW AG:");
        System.out.println("Название: " + rolls.name);
        System.out.println("Год основания: " + rolls.year);
        System.out.println("Цвет: " + rolls.color);
        System.out.println("Тип: " + rolls.type);
                /*-----------------*/
        System.out.println();

        Car opel = new Car();
        opel.name = "Opel Mokka";
        opel.year = 1863;
        opel.color = "Красный";
        opel.type = "Кроссовер";

        System.out.println("Автомобиль от компании Opel:");
        System.out.println("Название: " + opel.name);
        System.out.println("Год основания: " + opel.year);
        System.out.println("Цвет: " + opel.color);
        System.out.println("Тип: " + opel.type);

                /*---------------*/
        System.out.println();

        Car mercedes = new Car();
        mercedes.name = "Mercedes-AMG G 63  ";
        mercedes.year = 1926;
        mercedes.color = "Серый";
        mercedes.type = "Внедорожник";

        System.out.println("Автомобиль от компании Mercedes-Benz:");
        System.out.println("Название: " + mercedes.name);
        System.out.println("Год основания: " + mercedes.year);
        System.out.println("Цвет: " + mercedes.color);
        System.out.println("Тип: " + mercedes.type);


    }
}

class Car { //создали класс Car
    String name;
    int year;
    String color;
    String type;
}
