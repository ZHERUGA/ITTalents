import java.util.Scanner;

public class Task15 {
    /*
    Задача 15: Да се състави програма, която да изчисли сумата на
всички числа от 1 до въведено число N.
Пример: 5
Изход: 15
Използвайте цикъл do-while.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter digit for N: ");
        int n = scanner.nextInt();
        int count = 1;
        int sum = 0;

        do {
            sum += count;
            count++;
        } while (count <= n);

        System.out.println(sum);
    }
}