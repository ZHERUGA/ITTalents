import java.util.Scanner;

public class Task01 {
    /*
    Задача 1: Да се изведат съобщения към потребителя и да се
прочетат 2 числа от клавиатурата A и B.
После да се прочете 3-то число C и да се
провери дали то е м/у A и B. Да се изведе подходящо съобщение
за това дали C е между A и B.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter digit A: ");
        int digitA = scanner.nextInt();
        System.out.println("Enter digit B: ");
        int digitB = scanner.nextInt();
        System.out.println("Enter digit C: ");
        int digitC = scanner.nextInt();

        if ((digitA < digitC && digitC < digitB) || (digitB < digitC && digitC < digitA)) {
            System.out.println("Digit C: " + digitC + " is between digit A and digit B.");
        } else {
            System.out.println("Digit C:" + digitC + " is not between digit A and digit B.");
        }

    }
}
