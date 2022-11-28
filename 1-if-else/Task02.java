import java.util.Scanner;

public class Task02 {
    /*
    Задача 2: Въведете 2 различни цели числа от конзолата. Запишете
тяхната сума, разлика, произведение, остатък от деление и
целочислено деление в отделни променливи и разпечатайте тези
резултати в конзолата. Опитайте същото с числа с плаваща запетая.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter num1:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter num2:");
        double num2 = scanner.nextDouble();
//		double subtraction=Math.abs(num1-num2);
        double subtraction = num1 - num2;
        double addition = num1 + num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;
        double remainderOfDivision = num1 % num2;

        System.out.println("Subtraction: " + subtraction);
        System.out.println("Addition: " + addition);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("RemainderOfDivision: " + remainderOfDivision);
    }
}
