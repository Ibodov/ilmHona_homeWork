package Ibodov.another;

public class Constructor {
    /*
    A. Создать класс с двумя переменными.
    B. Добавить конструктор с входными параметрами.
    C. Добавить конструктор, инициализирующий свойства
       класса по умолчанию.
    */

    //   A. Создать класс с двумя переменными.
    public String webAddress;
    public String Email;

    // B. Добавить конструктор с входными параметрами.
    public Constructor(String webAddresss, String email) {
        webAddress = webAddresss;
        Email = email;
    }

    //     C. Добавить конструктор, инициализирующий свойства
    //       класса по умолчанию.
    public Constructor() {
        webAddress = "www.tajsmile.com";
        Email = "info@tajsmile.com";
    }

}
