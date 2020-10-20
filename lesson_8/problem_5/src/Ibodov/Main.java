package Ibodov;

public class Main {

    public static void main(String[] args) {

        // 5. Написать метод, который удалит все отрицательные числа в переданном
        // массиве и вернёт новый массив без отрицательных чисел.

        int[] arr = {1, 2, 4, -4, 12, -90};
        System.out.println("Новый массив без отрицательных чисел:");
        int[] result2 = deleteNegativeNumbers(arr);
        for (int i = 0; i < result2.length; i++) {
            System.out.print(result2[i] + " ");
        }

        
    }
    public static int[] deleteNegativeNumbers(int[] array) {
        int count = 0; //Создаём счетчик

        for (int i = 0; i < array.length; i++) { // проход по массиву
            if (array[i] > 0) {     //если array i > 0
                count++;            //увеличить count на 1 раз
            }
        }
        int[] newArray = new int[count]; //новый массив (длина массива count)
        int index = 0;      // создаем перменную index
        for (int i = 0; i < array.length; i++) { // проход по массиву
            if (array[i] > 0) { //если array i > 0
                newArray[index] = array[i]; //тогда индексу массива назначить array i
                index++; // увеличить индекс
            }
        }
        return newArray; //возврат нового массива
    }
}
