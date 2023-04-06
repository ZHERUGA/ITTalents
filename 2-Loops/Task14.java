import java.util.Scanner;

public class Task14 {
    /*
    Задача 14: Да се състави програма, която по въведено
естествено число N от интервала [10..200] извежда в обратен
ред всички числа, които са кратни на 7 и са по-малки от N.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a digit between 10 and 200: ");
        int digit = scanner.nextInt();

        for (int i = digit; i >= 0; i--) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
    }
}