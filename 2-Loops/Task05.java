import java.util.Scanner;

public class Task05 {
    /*
    Задача 5: Да се въведат от потребителя 2 числа. И да се
изведат на екрана всички числа от по-малкото до по-голямото.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter number 1: ");
        int number1 = scanner.nextInt();
        System.out.println("Please, enter number 2: ");
        int number2 = scanner.nextInt();

        if (number1 < number2) {
            for (int i = number1; i <= number2; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = number2; i <= number1; i++) {
                System.out.println(i);
            }
        }

    }
}