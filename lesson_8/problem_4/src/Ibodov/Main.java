package Ibodov;

public class Main {

    public static void main(String[] args) {

        // 4. Написать метод maxInArray(int[] array), который вернёт максимальное
        // число в массиве array.

        int[] array = {15, -6, 7, 9, 25, 0};

        System.out.println("Максимальное число в массиве array: " + maxInArray(array));

    }
    public static int maxInArray ( int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
