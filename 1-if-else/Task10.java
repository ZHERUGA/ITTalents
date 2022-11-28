import java.util.Scanner;

public class Task10 {

    /*
    Задача 10: Трябва да се напълни цистерна с вода. Имате 2 кофи с
вместимост 2 и 3 литра и ги ползвате едновременно. Да се
състави програма, която по даден обем извежда как ще прелеете
течността с тези кофи, т.е. по-колко пъти ще се пълни всяка от
кофите. Кофите не могат да се ползват с частично количество
вода, но могат инцидентно да се ползват по една.
Входни данни: естествено число от интервала [10..9999].
Пример: 107
– Изход: 21 пъти по 2 литра, 21 пъти по 3 литра, допълнително
кофа от 2 литра
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter digit between 10 and 9999: ");
        int amountLiters = scanner.nextInt();
        int numberCourses = amountLiters / 5;
        int coursesBucket2liters = 0;
        int coursesBucket3liters = 0;

        if (amountLiters < 10 || amountLiters > 9999) {
            System.out.println("The number is not correct!");
        } else if ((amountLiters % 10 == 0) || (amountLiters % 10 == 5)) {
            coursesBucket2liters = numberCourses;
            coursesBucket3liters = numberCourses;
            System.out.println(coursesBucket2liters + " times bucket with 2 liters.");
            System.out.println(coursesBucket3liters + " times bucket with 3 liters.");
        } else if (amountLiters % 10 == 1) {
            coursesBucket2liters = --numberCourses;
            coursesBucket3liters = numberCourses + 2;
            System.out.println(coursesBucket2liters + " times bucket with 2 liters.");
            System.out.println(coursesBucket3liters + " times bucket with 3 liters.");
        } else if (amountLiters % 10 == 2) {
            coursesBucket2liters = numberCourses;
            coursesBucket3liters = numberCourses;
            System.out.println(coursesBucket2liters + " times bucket with 2 liters.");
            System.out.println(coursesBucket3liters + " times bucket with 3 liters.");
            System.out.println("Extra bucket of 2 liters.");
        } else if (amountLiters % 10 == 3) {
            coursesBucket2liters = numberCourses;
            coursesBucket3liters = numberCourses + 1;
            System.out.println(coursesBucket2liters + " times bucket with 2 liters.");
            System.out.println(coursesBucket3liters + " times bucket with 3 liters.");
        } else if (amountLiters % 10 == 4) {
            coursesBucket2liters = numberCourses + 2;
            coursesBucket3liters = numberCourses;
            System.out.println(coursesBucket2liters + " times bucket with 2 liters.");
            System.out.println(coursesBucket3liters + " times bucket with 3 liters.");
        } else if (amountLiters % 10 == 6) {
            coursesBucket2liters = numberCourses + 2;
            coursesBucket3liters = numberCourses - 1;
            System.out.println(coursesBucket2liters + " times bucket with 2 liters.");
            System.out.println(coursesBucket3liters + " times bucket with 3 liters.");
        } else if (amountLiters % 10 == 7) {
            coursesBucket2liters = numberCourses + 1;
            coursesBucket3liters = numberCourses;
            System.out.println(coursesBucket2liters + " times bucket with 2 liters.");
            System.out.println(coursesBucket3liters + " times bucket with 3 liters.");
            System.out.println("Extra bucket of 2 liters.");
        } else if (amountLiters % 10 == 8) {
            coursesBucket2liters = numberCourses;
            coursesBucket3liters = numberCourses + 1;
            System.out.println(coursesBucket2liters + " times bucket with 2 liters.");
            System.out.println(coursesBucket3liters + " times bucket with 3 liters.");
            System.out.println("Extra bucket of 3 liters.");
        } else {
            coursesBucket2liters = numberCourses + 2;
            coursesBucket3liters = numberCourses;
            System.out.println(coursesBucket2liters + " times bucket with 2 liters.");
            System.out.println(coursesBucket3liters + " times bucket with 3 liters.");
        }
    }
}

