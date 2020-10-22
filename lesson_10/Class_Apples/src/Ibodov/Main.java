package Ibodov;

public class Main {

    public static void main(String[] args) {

        Apple williams = new Apple();
        williams.grade = "Вильямс Прайд";
        williams.color = "Красное";
        williams.sour = "нет";
        System.out.println("Яблока сорта Вильямс Прайд: ");
        System.out.println("Сорт: " + williams.grade);
        System.out.println("Цвет: " + williams.color);
        System.out.println("Кислое: " + williams.sour);

        System.out.println();

        Apple antonovka = new Apple();
        antonovka.grade = "Антоновка";
        antonovka.color = "Зелёное";
        antonovka.sour = "да";

        System.out.println("Яблока сорта Антоновка:");
        System.out.println("Сорт: " + antonovka.grade);
        System.out.println("Цвет: " + antonovka.color);
        System.out.println("Кислое: " + antonovka.sour);
        System.out.println();

        Apple star = new Apple();
        star.grade = "Звёздочка";
        star.color = "Насыщенно-красный румянец";
        star.sour = "нет";

        System.out.println("Яблока сорта Звёздочка:");
        System.out.println("Сорт: " + star.grade);
        System.out.println("Цвет: " + star.color);
        System.out.println("Кислое: " + star.sour);


    }
}
class Apple {
    String grade;
    String color;
    String sour;
}
