import java.util.Scanner;

public class Task13 {
    /*
    Задача 13: Да се състави програма, която извежда всички
естествени трицифрени числа, които имат сбор на цифрите равен
на дадено число.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter sum between 1 and 27 for all tree digits: ");
        int sum = scanner.nextInt();

        for (int i = 100; i < 999; i++) {
            int digit1 = i / 100 % 10;
            int digit2 = i / 10 % 10;
            int digit3 = i % 10;

            if (digit1 + digit2 + digit3 == sum) {
                System.out.println(i);
            }
        }
    }
}