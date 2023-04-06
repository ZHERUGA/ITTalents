import java.util.Scanner;

public class Task24 {
    /*
    Задача 24:
Едно число X е палиндром, aко се чете еднакво отпред назад и
отзад напред.
Да се състави програма, която проверява дали въведено число е
палиндром.
Входни данни: N - естествено число от интервала [10 .. 30000].
Пример: 17571
Изход: числото е палиндром
Използвайте цикъл do-while.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a number between 10 and 30000:");
        int number = scanner.nextInt();

        int reversedNumber = 0;
        int originalNumber = number;

        do {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        } while (number != 0);

        if (originalNumber == reversedNumber) {
            System.out.println("It's Palindrom!");
        } else {
            System.out.println("It's not Palindrom!");
        }
    }
}