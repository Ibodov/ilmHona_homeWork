package Ibodov;

public class Main {

    public static void main(String[] args) {

        // 3. Написать метод sumOfSquares(int a, int b), где a<b и вернуть сумму
        // квадратов всех целых чисел от a до b включительно.

        int result = sumOfSquares(1,3);
        System.out.println("сумма квадратов всех целых чисел от a до b включительно составляет: " + result);
    }
    public static int sumOfSquares ( int a, int b){

        int result = 0;
        for (int i = a; i <= b; i++) {
            result = result + i * i;
        }
        return result;
    }
}
