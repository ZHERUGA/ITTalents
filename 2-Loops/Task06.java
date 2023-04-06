import java.sql.SQLOutput;
import java.util.Scanner;

public class Task06 {
    /*
    Задача 6: Да се прочете число от екрана(конзолата) и да се
изведе сбора на всички числа между 1 и въведеното число.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter a number: ");
        int x = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= x; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}