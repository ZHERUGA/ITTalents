import java.util.Scanner;

public class Task10 {
    /*
    Задача 10:
Да се състави програма, чрез която се въвеждат 7 цели числа в
едномерен масив.
Програмата да изведе числото, което е най-близко до средната
стойност на въведените числа.
Пример: 1,2,3,4,5,6,7
Изход: средна стойност 4, най-близка стойност 4
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int median = 0;
        int[] array = new int[7];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Please, enter values for cell " + i);
            array[i] = scanner.nextInt();
            median += array[i];
        }
        median /= 7;
        int closestToTheMedian = array[0];

        for (int i = 0; i < array.length; i++) {
            if (Math.abs(array[i] - median) < Math.abs(closestToTheMedian - median)) {
                closestToTheMedian = array[i];
            }
        }
        System.out.println("Median is " + median);
        System.out.println("Closest to the median is " + closestToTheMedian);
    }
}