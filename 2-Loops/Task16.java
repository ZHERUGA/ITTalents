import java.util.Scanner;

public class Task16 {
    /*
Задача 16:
Да се състави програма, чрез която се въвеждат 2 естествени
числа N, M от интервала [10..5555].
Програмата, чрез цикъл for, да извежда всички числа от
интервала, които са кратни на 50 в низходящ ред.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter digit from 10 to 5555 for N: ");
        int digitN = scanner.nextInt();
        System.out.println("Please enter digit from 10 to 5555 for M: ");
        int digitM = scanner.nextInt();

        int min = Math.min(digitN, digitM);
        int max = Math.max(digitN, digitM);

        for (int i = max; i >= min; i--) {
            if (i % 50 == 0) {
                System.out.println(i);
            }
        }
    }
}