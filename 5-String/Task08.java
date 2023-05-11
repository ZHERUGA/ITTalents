import java.util.Scanner;

public class Task08 {
    /*
    Задача 8:
Да се състави програма, чрез която се въвежда ред от символи
(стринг, низ).
Програмата да изведе на екрана дали въведения стринг е палиндром,
т.е. дали четен отляво-надясно и отдясно-наляво е един и същ.
Вход: капак
Изход: да.
Вход: тенджера
Изход: не.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a word: ");
        String word = scanner.nextLine();

        boolean isPalindrome = false;
        for (int i = 0; i < word.length(); i++) {
            if (!(word.charAt(i) == word.charAt(word.length() - 1 - i))) {
                isPalindrome = false;
                break;
            } else {
                isPalindrome = true;
            }
        }
        if (isPalindrome) {
            System.out.println("It is palindrome!");
        } else {
            System.out.println("It is not palindrome!");
        }
    }
}