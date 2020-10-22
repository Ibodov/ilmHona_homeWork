package Ibodov;

public class Main {

    public static void main(String[] args) {

        System.out.println("Пластиковый ящик:");
        Box plasticBox = new Box();
        plasticBox.height = 40.0;
        plasticBox.width = 60.0;
        plasticBox.material = "Пластик";
        plasticBox.weight = 100.0;

        System.out.println("Высота: " + plasticBox.height);
        System.out.println("Ширина: " + plasticBox.weight);
        System.out.println("Материал: " + plasticBox.material);
        System.out.println("Вес: " + plasticBox.weight);

        System.out.println();

        System.out.println("Деревянный ящик:");
        Box woodBox = new Box();
        woodBox.height = 20.0;
        woodBox.width = 20.0;
        woodBox.material = "Дерево";
        woodBox.weight = 30.0;

        System.out.println("Высота: " + woodBox.height);
        System.out.println("Ширина: " + woodBox.width);
        System.out.println("Материал: " + woodBox.material);
        System.out.println("Вес: " + woodBox.weight);


    }
}
class Box {
    double height;
    double width;
    String material;
    double weight;
}