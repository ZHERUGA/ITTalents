import java.util.Arrays;
import java.util.Scanner;

public class Task09 {
    /*
    Задача 9:
Да се състави програма, чрез която по въведен низ съдържащ букви,
цифри, знак минус '-' се извежда сборът на въведените числа като се
отчита знакът '-' пред съответното число.
Вход: asd-12sdf45-56asdf100
Изход:
-12
45
-56
100
Сума = 77
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().replace("-", "h-").split("[a-zA-Z]");
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            if (!(input[i].isEmpty() || input[i].equals("-"))){
                System.out.println(input[i]);
                sum += Integer.parseInt(input[i]);
            }
        }
        System.out.println("Sum = " + sum);
    }
}