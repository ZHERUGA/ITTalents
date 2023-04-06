import java.util.Scanner;

public class Task08 {
    /*
    Задача 8: По зададено число n, да се изведе на екрана таблица по
следния начин:
Въведете n:
1
0
Въведете n:
2
11
33
...
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter number for n: ");
        int n = scanner.nextInt();
        int count = n - 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(count);
            }
            System.out.println();
            count += 2;
        }

    }
}