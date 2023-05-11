import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
    /*
    Да се състави програма, която по даден низ връща друг,
символите, на който са получени като към всеки код на символ
от ASCII таблицата е добавеното числото 5 и е записан
новополучения символ.
Пример :
Вход: Hello
Изход: Mjqqt
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder newString = new StringBuilder();
        char[] input = scanner.nextLine().toCharArray();

        for (int i = 0; i < input.length; i++) {
            input[i] += 5;
            newString.append(input[i]);
        }

        String output = newString.toString();
        System.out.println(output);
    }
}