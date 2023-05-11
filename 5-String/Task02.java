import java.util.Scanner;

public class Task02 {
    /*
    Задача 2:
Да се състави програма, чрез която от клавиатурата се въвеждат
последователно две думи с дължина 10-20 знака.
Програмата да размени първите им 5 знака и да изведе дължината на
по-дългата, както и новото им съдържание.
Пример: uchilishte uchenik
Изход: 10 uchenishte
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter two words separated with space :");
        String text = scanner.nextLine();

        String[] x = text.split(" ");
        String firstWord = x[0];
        String secondWord = x[1];

        String firstChange = firstWord.substring(0, 5).concat(secondWord.substring(5));
        String secondChange = secondWord.substring(0, 5).concat(firstWord.substring(5));

        if (firstChange.length() > secondChange.length()) {
            System.out.print(firstChange.length() + " ");
            System.out.print(firstChange);
        } else {
            System.out.print(secondChange.length() + " ");
            System.out.println(secondChange);
        }
    }
}