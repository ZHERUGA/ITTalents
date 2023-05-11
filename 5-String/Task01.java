import java.util.Scanner;

public class Task01 {
    /*
    Задача 1:
Да се състави програма, чрез която се въвеждат два низа съдържащи
до 40 главни и малки букви.
Като резултат на екрана да се извеждат низовете само с главни и само
с малки букви.
Пример: Abcd Efgh
Изход: ABCD abcd EFGH efgh
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter a String 1: ");
        String text1 = scanner.nextLine();
        System.out.println("Please, enter a String 2: ");
        String text2 = scanner.nextLine();

        System.out.print(text1.toUpperCase() + " " + text1.toLowerCase());
        System.out.println();
        System.out.print(text2.toUpperCase() + " " + text2.toLowerCase());
    }
}