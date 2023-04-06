import java.util.Scanner;

public class Task19 {
    /*
    Задача 19: Да се състави програма, чрез която по въведено
естествено число от интервала [10..99] се извежда поредица
числа, при спазване на следните изисквания:
1) ако предходното число е четно се извежда 0.5*числото;
2) ако предходното число е нечетно се извежда 3*числото +1.
Извеждането продължава докато не се получи стойност 1.
Пример: 11
Изход: 34 17 52 26 13 40 20 10 5 16 8 4 2 1.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a digit between 10 and 99: ");
        int digit = scanner.nextInt();

        while (digit != 1) {
            if ((digit - 1) % 2 != 0) {
                digit = digit/2;
            } else {
                digit = 3 * digit + 1;
            }
            System.out.println(digit);
        }
    }
}