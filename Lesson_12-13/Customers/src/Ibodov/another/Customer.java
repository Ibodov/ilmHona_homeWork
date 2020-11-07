package Ibodov.another;

/*
    A.  Создать класс "Покупатель":
    A1. Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Идентификационный номер.
    B.  Инициализировать его свойства через конструктор.
    C.  Создать методы:
    C1. установка значений атрибутов ("сеттер"),
    C2. получение значений атрибутов ("геттер"), вывод информации.
    D.  В Main создать массив объектов данного класса.
    E.  Вывести из этого массива покупателей, у которых идентификационный номер чётный.*/

// A.  Создать класс "Покупатель":
public class Customer {
    // A1. Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки,
    //Идентификационный номер.
    private String name;
    private String lastName;
    private String middleName;
    private String address;
    private int creditCardNumber;
    private int idNumber;


    // B.  Инициализировать его свойства через конструктор.
    public Customer(String name, String lastName, String middleName,
                    String address, int creditCardNumber, int idNumber) {
        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.idNumber = idNumber;
    }

    public Customer() {
        name = "Ivan";
        lastName = "Ivanov";
        middleName = "Ivanovich";
        address = "Moscow";
        creditCardNumber = 5115552;
        idNumber = 11;
    }

    //C.  Создать методы:
    //C1. установка значений атрибутов ("сеттер"),
    // Сеттеры
    public void setName() {
        this.name = name;
    }

    public void setLastName() {
        this.lastName = lastName;
    }

    public void setPatronymic() {
        this.middleName = middleName;
    }

    public void setAddress() {
        this.address = address;
    }

    public void setCreditCardNumber() {
        this.creditCardNumber = creditCardNumber;
    }

    public void setIdNumber() {
        this.idNumber = idNumber;
    }

    //C2. получение значений атрибутов ("геттер"), вывод информации.

    // Геттеры
    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public String getAddress() {
        return this.address;
    }

    public int getCreditCardNumber() {
        return this.creditCardNumber;
    }

    public int getIdNumber() {
        return this.idNumber;
    }
}