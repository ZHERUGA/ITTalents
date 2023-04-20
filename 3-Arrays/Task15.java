import java.util.Arrays;

public class Task15 {
    /*
    Задача 15:
Да се състави програма, която въвежда в едномерен масив реални
числа.
Като изход: програма извежда онези 3 различни числа, чиято
абсолютна стойност формира максималната обща сума.
Пример: 7.13; 0.2; 4.9; 5.1; 6.34; 1.12
Изход: 5.1; 6.34; 7.13
     */
    public static void main(String[] args) {
        double[] array = {7.13, 0.2, 5.1, 4.9, 6.34, 1.12};
        double totalSum = 0;
        for (int i = 0; i < array.length; i++) {
            totalSum += array[i];
        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    double x = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = x;
                }
            }
        }
        double total3numbers = array[array.length - 1] + array[array.length - 2] + array[array.length - 3];
        System.out.println(totalSum);
        System.out.println(total3numbers);
        System.out.println(Arrays.toString(array));
    }
}