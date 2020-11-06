package Ibodov.main;

import Ibodov.another.Constructor;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*Задание №2 Constructor.java */

        Constructor constructor = new Constructor("lala.ru", "mail.ru");
        System.out.println(constructor.webAddress);
        System.out.println(constructor.Email);

        Constructor constructor1 = new Constructor();
        System.out.println(constructor1.webAddress);
        System.out.println(constructor1.Email);

    }
}
