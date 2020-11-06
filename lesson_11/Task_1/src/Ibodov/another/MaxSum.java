package Ibodov.another;

public class MaxSum {
    /*
A. Создать класс с двумя переменными.
B. Добавить метод вывода на экран значений этих переменных.
C. Добавить метод, который находит сумму
   значений этих переменных,
D. и метод который находит наибольшее значение из этих
   двух переменных.
   */

    //A. Создать класс с двумя переменными.
    public static int x = 6;
    public static int y = 4;

    //B. Добавить метод вывода на экран значений этих переменных.
    public static void out() {
        System.out.println("Значение переменной X: " + x);
        System.out.println("Значение переменной Y: " + y);
    }

    //C. Добавить метод, который находит сумму
    //   значений этих переменных,
    public static void sum() {
        int sum1 = x + y;
        System.out.println("Сумма переменных: " + sum1);
    }

    //D. и метод который находит наибольшее значение из этих
    //   двух переменных.

    public static int max () { // инициализация метода max
        int result = 0;
        if (x > y) {
            result = x;
        } else if (x < y) {
            result = y;
        }
        return result;
    }

    public static void exmsum() {
        System.out.println("Наибольшое число: " + max() + " (второй вариант вывода)");
    }

}
