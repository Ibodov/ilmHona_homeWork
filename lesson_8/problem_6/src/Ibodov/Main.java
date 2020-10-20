package Ibodov;

public class Main {

    public static void main(String[] args) {

        // 6. Написать метод, который вернёт сумму цифр переданного массива.
        int[] array1 = {-2, 5, 8, -1, 15, -14, 4};
        System.out.println ("Сумма массива: " + summa(array1));
    }
    public static int summa ( int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

}
