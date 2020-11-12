package Ibodov;

public class Main {

    public static void main(String[] args) {

        /*
                Все Задачи:
            1)  Дана строка. Вывести первые три символа и
                последний три символа, если длина строки больше 5.
                Иначе вывести первый символ столько раз, какова длина строки.

            2)  Дана строка. Показать номера символов,
                совпадающих с последним символом строки.

            3)  Дана строка. Определите, какой символ в ней
                встречается раньше: 'x' или 'w'. Если какого-то
                из символов нет, вывести сообщение об этом.

            4)  Дана строка. Если ее длина больше 10, то оставить
                в строке только первые 6 символов, иначе дополнить
                строку символами 'o' до длины 12.

            5)  Замените в строке все вхождения 'word' на 'letter'.

            6)  Даны два слова. Найдите только те символы слов,
                которые встречаются в обоих словах только один раз.
        */




        	/*
        1) Дана строка. Вывести первые три символа и
        последний три символа, если длина строки больше 5.
        Иначе вывести первый символ столько раз, какова
        длина строки.
	*/
        System.out.println("Задача №1:");
        String myString = "They are working";
        String threeFirst = "";
        String threeLast = "";
        threeFirst = myString.substring(0,3);
        threeLast = myString.substring(myString.length() - 3);

        int count = 0;

        if (myString.length() > 5) {
            System.out.print(threeFirst + " " + threeLast + " ");
        } else {
            for (int i =0; i <myString.length(); i++){
                count++;
                System.out.print(myString.substring(0,1) + " ");
            }
        }

        /* 2) Дана строка. Показать номера символов,
           совпадающих с последним символом строки.
        */

        System.out.println();
        System.out.println();
        System.out.println("Задача №2:");

        String newString = "LaFaGalaKa";
        char lastChar = newString.charAt(newString.length() - 1);
        System.out.println("Последний символ строки: " + lastChar);
        int index = newString.charAt(newString.length()-1);
        System.out.println("Номера символов, совпадающих с последним символом строки: ");
        for (int i =0; i<newString.length(); i++) {
            if (index == newString.charAt(i)) {
                System.out.print(i + 1 + " ");
            }
        }

        System.out.println();

        /* 3) Дана строка. Определите, какой символ в ней
              встречается раньше: 'x' или 'w'. Если какого-то
              из символов нет, вывести сообщение об этом.
        */

        System.out.println();
        System.out.println("Задача №3:");
        String xw = "Welcome to xxx world";
        String xw1 = new String();
        xw1 = xw.toLowerCase();


        if (xw1.indexOf('w') < xw1.indexOf('x')) {
            System.out.println("В данной строке раньше встречается: " + "w");
        } else if (xw1.indexOf('w')  > xw1.indexOf('x')) {
            System.out.println("В данной строке раньше встречается: " + "x");
        } else {
            System.out.println("В данной строке нет -x- и -w-");
        }

        /*4) Дана строка. Если ее длина больше 10, то оставить
             в строке только первые 6 символов, иначе дополнить
             строку символами 'o' до длины 12.
        */
        System.out.println();
        System.out.println("Задача №4:");

        String longString = "Long String, maybe ten symbols";
        String newLongString ="";

        if (longString.length() > 10 ) {
            newLongString = longString.substring(0,6);
            longString = newLongString;
            System.out.println("Так как длина строки больше 10 символов, в строке оставили первые 6 символов: " + longString);
        } else  {

            for (int i=longString.length(); i <12; i++) {
                longString = longString + 'o';
                newLongString = longString;
            }
            longString = newLongString;
            System.out.println("Так как в строке меньше 10 символов, строку дополнили символами 'o' до длины 12: " + longString);
        }


        /* 5) Замените в строке все вхождения 'word' на 'letter'.*/

        System.out.println();
        System.out.println("Задача №5:");

        String wordString = "There are five hundred words in this letter.";
        String letterString =   wordString.replaceAll("word","letter");

        System.out.println(letterString);

            /*6) Даны два слова. Найдите только те символы слов,
                 которые встречаются в обоих словах только один раз.*/

        System.out.println();
        System.out.println("Задача №6:");

        String firstWord = "London";
        String secondWord = "Word";
        String allWords = firstWord + secondWord;
        String emptyString = "";

        char chars[] = allWords.toCharArray();

        int counter=0;


        for (int i=0; i<allWords.length(); i++) {
            for (int j=0; j<allWords.length(); j++) {
                if (chars[i] == chars[j] && i != j) {
                    counter++;
                }
            }
            if (counter < 1) {
                emptyString = emptyString + allWords.charAt(i);
            }else {
                counter = 0;
            }
        }

        System.out.println("Символы, которые встречаются в обоих словах только один раз: " + emptyString);



    }
}
