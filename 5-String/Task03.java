import java.util.Scanner;

public class Task03 {
    /*
    Задача 3:
Да се състави програма, чрез която се въвеждат последователно две
редици от символи без интервали.
Програмата да извежда съобщение за резултата от сравнението им по
позиции.
Пример: хипопотам, хипопотук
Изход:
Двата низа са с равна дължина.
Разлика по позиции:
8 а-у
9 м-к
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter first char sequence without any spaces:");
        String text1 = scanner.next();
        System.out.println("Please, enter second char sequence without any spaces:");
        String text2 = scanner.next();

        for (int i = 0; i < text2.length(); i++) {
            if (!(text1.charAt(i) == text2.charAt(i))) {
                System.out.print(i + 1 + " ");
                System.out.println(text1.charAt(i) + "-" + text2.charAt(i));
            }
        }
    }
}