import java.util.Scanner;

public class Task08 {
    /*
    Задача 8: Да се състави програма, която чете от конзолата 4-
цифренo естествено число от интервала [1000.. 9999]. От това
число се формират 2 нови 2-цифрени числа. Първото число се
формира от 1-та и 4-та цифра на въведеното число. Второто число
се формира от 2-рa - 3-та цифра на въведеното число. Като
резултат да се изведе дали 1-то ново число e по-малко, равно или
по-голямо от 2-то число.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 4 digit number: ");
        int number = scanner.nextInt();

        int firstDigit = number / 1000 % 10;
        int secondDigit = number / 100 % 10;
        int thirdDigit = number / 10 % 10;
        int fourthDigit = number % 10;

        int number1 = (firstDigit * 10) + (fourthDigit);
        System.out.println(number1);
        int number2 = (secondDigit * 10) + (thirdDigit);
        System.out.println(number2);

        if (number1 > number2) {
            System.out.println("The first number is bigger than the second.");
        } else if (number1 < number2) {
            System.out.println("The second number is bigger than the first.");
        } else {
            System.out.println("The numbers are equal!");
        }

    }
}