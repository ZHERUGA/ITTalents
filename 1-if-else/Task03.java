import java.util.Scanner;

public class Task03 {
    /*
    Задача 3: Въведете 2 различни числа от конзолата и разменете
стойността им. Разпечатайте новите стойности.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter digit 1: ");
        int digit1 = scanner.nextInt();
        System.out.println("Enter digit 2: ");
        int digit2 = scanner.nextInt();

        int digit3 = digit1;
        digit1 = digit2;
        digit2 = digit3;

        System.out.println("Digit 1 new: " + digit1);
        System.out.println("Digit 2 new: " + digit2);
    }
}
