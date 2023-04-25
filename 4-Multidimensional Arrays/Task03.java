public class Task03 {
    /*
    Задача 3:
Имате двумерен масив от числа, чийто стойности са въведени
предварително. Да се отпечатат сумата на елементите на масива.
     */
    public static void main(String[] args) {
        int[][] array = {
                {1, 4, 6, 3},
                {5, 9, 7, 2},
                {4, 8, 1, 9},
                {2, 3, 4, 6}
        };
        int sumOfAllElements = 0;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                sumOfAllElements += array[row][col];
            }
        }
        System.out.println("The sum of all elements is: " + sumOfAllElements);
    }
}