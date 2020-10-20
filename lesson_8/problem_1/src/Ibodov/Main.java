package Ibodov;

public class Main {

    public static void main(String[] args) {


        // 1. Написать метод, который принимает параметр строку (пусть это
        // будет имя человека) и эта функция должна вывести на экран фразу
        // "Привет ИМЯ_ЧЕЛОВЕКА".

        userName("Parviz");  // Вызов метода.


    }

    public static void userName (String name){
        System.out.println("Hello" + " " + name);
    }

}
