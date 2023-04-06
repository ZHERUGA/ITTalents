import java.util.Scanner;

public class Task18 {
    /*
    Задача 18:
Да се състави програма, чрез която се въвежда две числа от
интервала [1..9].
Програмата да извежда таблицата за умножение.
Максималната стойност на множителите е определена от 2-те
числа.
Пример: 2 2
Изход:
1*1= 1;
1*2= 2;
2*1= 2;
2*2= 4;
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter the first digit between 0 and 9:");
        int a = scanner.nextInt();
        System.out.println("Please, enter the first second between 0 and 9:");
        int b = scanner.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
               int result = i * j;
                System.out.println(i + " * " + j + " = " + result + ";");

            }
        }
    }
}