package Ibodov.another;

/* A.   Создать класс "Абонент":
   A1.  Идентификационный номер, Фамилия, Имя, Отчество, Адрес, Время междугородных
        и городских переговоров;
   B.   Конструктор;
   C.   Методы:
   C1.  установка значений атрибутов, получение значений атрибутов, вывод информации.
   D.   Создать массив объектов данного класса.
   E.   Вывести сведения относительно абонентов, у которых время городских переговоров превышает заданное.
   F.   Сведения относительно абонентов, которые ипользовались междугородной связью.*/

    // A.   Создать класс "Абонент":
public class Subscriber {
    // A1.  Идентификационный номер, Фамилия, Имя, Отчество, Адрес, Время междугородных
    //      и городских переговоров;
    private int idNumber;
    private String lastName;
    private String name;
    private String middleName;
    private String address;
    private int interCountryConversation;
    private int cityConversation;

    // B.   Конструктор;
    public Subscriber(int idNumber, String lastName, String name, String middleName,
                      String address, int interCountryConversation, int cityConversation) {
        this.idNumber = idNumber;
        this.lastName = lastName;
        this.name = name;
        this.middleName = middleName;
        this.address = address;
        this.interCountryConversation = interCountryConversation;
        this.cityConversation = cityConversation;
    }

    public Subscriber() {
        idNumber = 1;
        lastName = "Ivanov";
        name = "Ivan";
        middleName = "Ivanovich";
        address = "Dushanbe";
        interCountryConversation = 5;
        cityConversation = 3;
    }

        // C.   Методы:
        // C1.  установка значений атрибутов.
        // Сеттеры

    public void setIdNumber() {
        this.idNumber=idNumber;
    }
    public void setLastName() {
        this.lastName = lastName;
    }
    public void setName() {
        this.name = name;
    }
    public void setPatronymic() {
        this.middleName = middleName;
    }
    public void  setAddress() {
        this.address = address;
    }
    public void setInterCountryConversation() {
        this.interCountryConversation = interCountryConversation;
    }
    public void setCityConversation() {
        this.cityConversation = cityConversation;
    }

    // // C1.  получение значений атрибутов, вывод информации.
    //геттеры
    public int getIdNumber() {
        return this.idNumber;
    }
    public String getLastName() {
        return this.lastName;
    }
    public String getName() {
        return this.name;
    }
    public String getMiddleName() {
        return this.middleName;
    }
    public String getAddress() {
        return this.address;
    }
    public int getInterCountryConversation() {
        return this.interCountryConversation;
    }
    public int getCityConversation() {
        return this.cityConversation;
    }
}
