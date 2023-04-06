import java.util.Scanner;

public class Task21 {
    /*
    Задача 21:
Дадено е наредено тесте карти.
Наредбата по тежест на карта е: 2,3,4,5,6,7,8,9,10, Вале, Дама,
Поп, Асо.
Наредбата по цвят на картите е: спатия, каро, купа, пика.
Да се създаде програма, чрез която се въвежда N - число от
интервала [1..52] и се извеждат въведения номер карта и
останалите по-големи карти от тестето.
Пример: 47.
Изход: Поп купа, Поп пика, Асо спатия, Асо каро, Асо купа, Асо
пика
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a number between 1 and 51:");
        int number = scanner.nextInt();

        for (int i = number; i <= 52; i++) {
            switch (i) {
                case 1, 2, 3, 4 -> System.out.print("2 ");
                case 5, 6, 7, 8 -> System.out.print("3 ");
                case 9, 10, 11, 12 -> System.out.print("4 ");
                case 13, 14, 15, 16 -> System.out.print("5 ");
                case 17, 18, 19, 20 -> System.out.print("6 ");
                case 21, 22, 23, 24 -> System.out.print("7 ");
                case 25, 26, 27, 28 -> System.out.print("8 ");
                case 29, 30, 31, 32 -> System.out.print("9 ");
                case 33, 34, 35, 36 -> System.out.print("10 ");
                case 37, 38, 39, 40 -> System.out.print("J ");
                case 41, 42, 43, 44 -> System.out.print("Q ");
                case 45, 46, 47, 48 -> System.out.print("K ");
                case 49, 50, 51, 52 -> System.out.print("A ");
            }
            switch (i){
                case 1, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45, 49 -> System.out.println("Спатия");
                case 2, 6, 10, 14, 18, 22, 26, 30, 34, 38, 42, 46, 50 -> System.out.println("Каро");
                case 3, 7, 11, 15, 19, 23, 27, 31, 35, 39, 43, 47, 51 -> System.out.println("Купа");
                case 4, 8, 12, 16, 20, 24, 28, 32, 36, 40, 44, 48, 52 -> System.out.println("Пика");
            }
        }
    }
}