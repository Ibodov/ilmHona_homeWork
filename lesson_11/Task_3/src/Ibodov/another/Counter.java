package Ibodov.another;

public class Counter {

    /*  A. Создать класс "Счётчик" со свойством currentNumber (currentNumber >= 0)
           целого типа.
        B. Предусмотреть задание значения currentNumber по умолчанию (пусть будет 0).
        C. Предусмотреть инициализацию currentNumber через конструктор.
        D. Написать метод, который увеличит значение currentNumber на 1.
        E. Написать метод, который уменьшит значение currentNumber на 1(но только если
           currentNumber не станет меньше 0 при уменьшении).
        F. Написать метод, который вернёт текущее значение currentNumber.
*/

    // A. Создать класс "Счётчик" со свойством currentNumber (currentNumber >= 0)
    //    целого типа.
    // B. Предусмотреть задание значения currentNumber по умолчанию (пусть будет 0).

    public static int currentNumber = 0;


    // C. Предусмотреть инициализацию currentNumber через конструктор.
    public Counter(int currentNumber1) {
        currentNumber = currentNumber1;
        System.out.println("currentNumber = " + currentNumber1);
    }

    // D. Написать метод, который увеличит значение currentNumber на 1.
    public static void CurrentNumber2() {

        if (currentNumber >= 0) {
            currentNumber = currentNumber+1;
            System.out.println("currentNumber увеличен на 1: currentNumber=" + currentNumber);
        }else {
            System.out.println("Значание currentNumber меньше 0");
        }
    }

    // E. Написать метод, который уменьшит значение currentNumber на 1(но только если
    //    currentNumber не станет меньше 0 при уменьшении).
    public static void CurrentNumber3() {
        if (currentNumber > 0) {
            currentNumber = currentNumber-1;
            System.out.println("currentNumber уменьшен на 1: currentNumber=" + currentNumber);
        } else {
            System.out.println("Значание currentNumber меньше 0");
        }
    }

    // F. Написать метод, который вернёт текущее значение currentNumber.
    public static int CurrentNumber4() {
        int currentNumber2 = currentNumber;
        return currentNumber2;

    }

}
