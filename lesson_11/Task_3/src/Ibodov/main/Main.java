package Ibodov.main;

import Ibodov.another.Counter;

public class Main {

    public static void main(String[] args) {

        // Вывод C:
        Counter currentNumber = new Counter(5);
        //System.out.println(currentNumber.currentNumber);

        // Вывод D:
        Counter.CurrentNumber2();

        // Вывод E:
        Counter.CurrentNumber3();

        // Вывод F:
        //Counter.CurrentNumber4();
        System.out.println("текущее значение currentNumber: " + Counter.CurrentNumber4());

    }
}
