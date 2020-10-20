package Ibodov;

public class Main {

    public static void main(String[] args) {


        // 2. Написать метод max(int x, int y), который вернёт максимальное из x и y.

        int result = max(5, 6); // Вызов метода max  в переменной result
        System.out.println("Максимальное число из x и y: " + result);
    }

    public static int max ( int x, int y){ // инициализация метода max
        int result = 0;
        if (x > y) {
            result = x;
        } else if (x < y) {
            result = y;
        }
        return result;
    }
}
