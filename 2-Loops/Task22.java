import java.util.Scanner;

public class Task22 {
    /*
    Задача 22:
Да се състави програма, която извежда първите 10 най-малки
числа, които се делят на 2, 3 или на 5 и които са по-големи от
въведено естествено число.
Числата се извеждат, заедно с техния пореден номер.
Входни данни: число от интервала [1..999]
Пример: 1
Изход: 1:2; 2:3, 3:4, 4:5, 5:6, 6:8, 7:9, 8:10, 9:12, 10:14
Използвайте цикъл while.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a number between 1 and 999:");
        int number = scanner.nextInt();

        int counter = 0;
        int div = number;
        while (counter != 10) {

            if (div % 2 == 0 || div % 3 == 0 || div % 5 == 0) {
                counter++;
                System.out.println(counter + ":" + div);
            }
            div++;
        }
    }
}