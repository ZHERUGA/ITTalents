import java.util.Scanner;

public class Task04 {
    /*
    Задача 4: Въведете 2 различни числа от конзолата и ги разпечатайте в
нарастващ ред.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter digit 1: ");
        int digit1 = scanner.nextInt();
        System.out.println("Enter digit 2: ");
        int digit2 = scanner.nextInt();

        if (digit1 < digit2) {
            System.out.printf("%d\n%d", digit1, digit2);
        } else {
            System.out.println(digit2+"\n"+digit1);
        }
    }
}
