import java.util.Arrays;

public class Task04 {
    /*
    Задача 4:
Имате предварително въведени стойности на елементи в двумерен
масив - естествени числа.
Да се състави програма, чрез която се извеждат стойностите на
елементите в двумерен масив след обръщането му на +90 градуса.
Пример:
1,2,3,4
5,6,7,8
9,10,11,12
13,14,15,16
Изход
13,9,5,1
14,10,6,2
15,11,7,3
16,12,8,4
     */
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int[][] arrayRotated90 = new int[array.length][array.length];

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                arrayRotated90[row][col] = array[array.length - 1 - col][row];
            }
        }
        for (int row = 0; row < arrayRotated90.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                System.out.print(arrayRotated90[row][col] + " ");
            }
            System.out.println();
        }
    }
}