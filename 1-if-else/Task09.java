import java.util.Scanner;

public class Task09 {
    /*
    Задача 9: Да се състави програма, която чете от конзолата 2
естествени двуцифрени числа a,b. Програмата да изведе в
конзолата дали последната цифра от произведението на двете
числа е четна, както и самата цифра.
– Входни данни: a,b - естествени числа от интервала [10..99].
– Пример: 15, 25
– Изход: 375, 5 нечетна
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter number a:");
        int numberA = scanner.nextInt();
        System.out.println("Please, enter number b:");
        int numberB = scanner.nextInt();

        int numberC = numberA * numberB;
        int lastDigit = numberC % 10;

        if (lastDigit % 2 == 0){
            System.out.println("Number C: "+ numberC +"; "+ "Last Digit: " + lastDigit);
            System.out.println("The last digit of numberC is even.");
        }else{
            System.out.println("Number C: "+ numberC +"; "+ "Last Digit: " + lastDigit);
            System.out.println("The last digit of numberC is not even.");
        }
    }
}
