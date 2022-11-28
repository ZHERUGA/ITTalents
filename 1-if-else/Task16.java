import java.util.Scanner;

public class Task16 {
    /*
    Задача 16: Въведено е трицифрено естествено число от вида
abc.Трябва да се провери дали:
– ако a = b = c, Изход: цифрите са равни;
– ако a>b>c, Изход: цифрите са във възходящ ред;
– ако a<b<c, Изход: цифрите са в низходящ ред;
– и изход: цифрите са ненаредени, за неописаните случаи.
Да се състави програма, която извежда резултата от проверката за
наредба на цифрите в числото.
– Пример: 345
– Изход: възходящ ред.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a three digit number:");
        int threeDigitNumber = scanner.nextInt();

        if (threeDigitNumber < 100 || threeDigitNumber > 999) {
            System.out.println("It is not three digit number!");
        } else {
            int firstDigit = threeDigitNumber / 100 % 10;
            int secondDigit = threeDigitNumber / 10 % 10;
            int thirdDigit = threeDigitNumber % 10;

            if (firstDigit == thirdDigit && secondDigit == thirdDigit) {
                System.out.println("The digits are equal.");
            } else if (firstDigit < secondDigit && secondDigit < thirdDigit) {
                System.out.println("The digits are in ascending order.");
            } else if (firstDigit > secondDigit && secondDigit > thirdDigit) {
                System.out.println("The digits are in descending order.");
            } else {
                System.out.println("The digits are not sorted for undescribe cases.");
            }
        }
    }
}