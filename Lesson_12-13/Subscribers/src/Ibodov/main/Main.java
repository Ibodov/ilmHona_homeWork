package Ibodov.main;

import Ibodov.another.Subscriber;

public class Main {

    public static void main(String[] args) {

        // D.   Создать массив объектов данного класса.

        Subscriber subscriber = new Subscriber(5, "Ibodov", "Parviz",
                "Azamjonovich", "Dushanbe", 22, 12);
        Subscriber[] subscribers = new Subscriber[3];
        subscribers[0] = new Subscriber(5, "Ibodov", "Parviz",
                "Azamjonovich", "Dushanbe", 22, 12);
        subscribers[1] = new Subscriber(6, "Ibodov", "Muhammad",
                "Parvizovich", "Dushanbe", 3, 1);
        subscribers[2] = new Subscriber(7, "Ibodov", "Abubakr",
                "Parvizovich", "Dushanbe", 2, 2);


        //   E.   Вывести сведения относительно абонентов, у которых время городских переговоров превышает заданное.


        System.out.println("Заданное время для городской связи: 3 мин");
        for (int i=0;i< subscribers.length; i++) {
            if (subscribers[i].getCityConversation() > 3) {
                System.out.println("Абонент " + subscribers[i].getName() + " " + subscribers[i].getLastName()
                        + " " + "говорил по городской, на " + (subscribers[i].getCityConversation() - 5)
                        + " " + "мин больше заданого времени");
                System.out.println("Время разговора составило: " + subscribers[i].getCityConversation() + " мин");
            }
        }

        System.out.println();

        System.out.println("Заданное время для междугародной связи: 5 мин");

        //   F.   Сведения относительно абонентов, которые ипользовались междугородной связью.*/
        for (int i=0;i< subscribers.length; i++) {
            if (subscribers[i].getInterCountryConversation() > 5) {
                System.out.println("Абонент " + subscribers[i].getName() + " " + subscribers[i].getLastName()
                        + " " + "говорил по междугародной, на " + (subscribers[i].getInterCountryConversation() - 5)
                        + " " + "мин больше заданого времени");
                System.out.println("Время разговора составило: " + subscribers[i].getInterCountryConversation() + " мин");
            }
        }

    }
}
