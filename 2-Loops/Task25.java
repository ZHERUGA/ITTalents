import java.util.Scanner;

public class Task25 {
    /*
    Задача 25:
Да се направи програма, която по дадено число N, да изчислява
N!, т.е. 1*2*3*4...*N.
Пример: 5
Изход: 120
Използвайте цикъл do-while.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter N");

        int n = scanner.nextInt();
        int counter = 1;
        int sum = counter;

        do {
            sum = sum * counter;
            counter++;
        } while (counter <= n);
        System.out.println(sum);
    }
}