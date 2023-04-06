import java.util.Scanner;

public class Task09 {
    /*
    Задача 9: Да се прочетат 2 числа от клавиатурата А и В.
Да се изведат всички числа от А до В на степен 2(разделени със
запетая).Ако някое число е кратно на 3, да се изведе съобщение че
числото се пропуска „skip 3“.Ако сумата от всички изведени числа (без
пропуснатите) стане по-голяма от 200, да се прекрати извеждането.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter digit A: ");
        int a = scanner.nextInt();
        System.out.println("Please, enter digit B: ");
        int b = scanner.nextInt();
        int sum = 0;

        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                System.out.println("skip 3");
                continue;
            }
            sum += i * i;
            System.out.print(i * i + ", ");
            if (sum > 200) {
                System.out.println("Sum is over 200!");
                break;
            }
        }
    }
}