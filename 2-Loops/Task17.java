import java.util.Scanner;

public class Task17 {
    /*
    Задача 17:
Да се състави програма, която извежда квадрат, чийто страни са
оформени със знака *, а вътрешността е запълнена със въведен
знак.
Входни данни b - дължина на страната число от интервала
[3..20], c - желан знак.
Програмата да използва цикъл for.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter integer for side between 3 and 20: ");
        int b = scanner.nextInt();

        System.out.println("Please, enter char for the inside of the square: ");
        char c = scanner.next().charAt(0);

        for (int i = 1; i <= b; i++) {
            for (int j = 1; j <= b; j++) {
                if (i == 1 || i == b || j == 1 || j == b) {
                    System.out.print("*");
                } else {
                    System.out.print(c);
                }
            }
            System.out.println();
        }
    }
}