package Ibodov.main;


import Ibodov.another.Customer;

public class Main {

    public static void main(String[] args) {

        //C2. получение значений атрибутов ("геттер"), вывод информации.

        Customer customer = new Customer("Muhammad", "Eshonov", "Abdulloevich",
                "Dushanbe", 22440066, 12);
        System.out.println("Покупатель №1:");
        System.out.println("Имя: " + customer.getName());
        System.out.println("Фамилия: " + customer.getLastName());
        System.out.println("Отчество: " + customer.getMiddleName());
        System.out.println("Адрес: " + customer.getAddress());
        System.out.println("Номер кредитной карточки: " + customer.getCreditCardNumber());
        System.out.println("Идентификационный номер: " + customer.getIdNumber());

        System.out.println();

        System.out.println("Покупатель №2:");
        Customer customer1 = new Customer("Ahmad", "Firuzov", "Nabievich",
                "Dushanbe", 33551177, 13);
        System.out.println("Имя: " + customer1.getName());
        System.out.println("Фамилия: " + customer1.getLastName());
        System.out.println("Отчество: " + customer1.getMiddleName());
        System.out.println("Адрес: " + customer1.getAddress());
        System.out.println("Номер кредитной карточки: " + customer1.getCreditCardNumber());
        System.out.println("Идентификационный номер: " + customer1.getIdNumber());

        System.out.println();

        System.out.println("Покупатель №3:");
        Customer customer3 = new Customer("Ahmadjon", "Firuzov", "Nabievich",
                "Dushanbe", 33551166, 14);
        System.out.println("Имя: " + customer3.getName());
        System.out.println("Фамилия: " + customer3.getLastName());
        System.out.println("Отчество: " + customer3.getMiddleName());
        System.out.println("Адрес: " + customer3.getAddress());
        System.out.println("Номер кредитной карточки: " + customer3.getCreditCardNumber());
        System.out.println("Идентификационный номер: " + customer3.getIdNumber());

        System.out.println();


        //    D.  В Main создать массив объектов данного класса.
        Customer[] customers = new Customer[3];
        customers[0] = new Customer ("Muhammad", "Eshonov", "Abdulloevich", "Dushanbe", 22440066, 12);
        customers[1] = new Customer("Ahmad", "Firuzov", "Nabievich",
                "Dushanbe", 33551177, 13);
        customers[2] = new Customer("Ahmadjon", "Firuzov", "Nabievich",
                "Dushanbe", 33551166, 14);


        //    E.  Вывести из этого массива покупателей, у которых идентификационный номер чётный.*/
        for (int i=0; i<customers.length; i++) {

            if (customers[i].getIdNumber() %2 == 0) {

                System.out.println("Покупатель с чётным идентификационным номером: " + customers[i].getName()
                        + " " + customers[i].getLastName()  );
            }
        }

    }
}
