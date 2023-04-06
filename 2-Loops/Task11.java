import java.util.Scanner;

public class Task11 {
    /*
    Задача 11: Въведете число N чрез конзолата и изкарайте като
резултат следния триъгълник с височина N:
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter integer for N: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}