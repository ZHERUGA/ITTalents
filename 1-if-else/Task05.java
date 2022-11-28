import java.util.Scanner;

public class Task05 {
    /*
    Задача 5: Въведете 3 различни числа от конзолата и ги разпечатайте в
низходящ ред.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter digit 1");
        int digit1 = scanner.nextInt();
        System.out.println("Please, enter digit 2");
        int digit2 = scanner.nextInt();
        System.out.println("Please, enter digit 3");
        int digit3 = scanner.nextInt();

        if (digit1 > digit2 && digit1 > digit3 && digit2 > digit3) {
            System.out.println("In descending order:\n" + digit1 + "\n" + digit2 + "\n" + digit3);
        } else if (digit2 > digit1 && digit2 > digit3 && digit1 > digit3) {
            System.out.println("In descending order:\n" + digit2 + "\n" + digit1 + "\n" + digit3);
        } else if (digit3>digit1 && digit3>digit2 && digit1>digit2){
            System.out.println("In descending order:\n" + digit3 + "\n" + digit1 + "\n" + digit2);
        } else if (digit3>digit1 && digit3>digit2 && digit2>digit1){
            System.out.println("In descending order:\n" + digit3 + "\n" + digit2 + "\n" + digit1);
        } else{
            System.out.println("Enter 3 different numbers.");
        }


    }

}
