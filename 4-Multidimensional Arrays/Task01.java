public class Task01 {
    /*
    Задача 1:
Имате двумерен масив 6х5 от естествени числа, чийто стойности са
въведени предварително.
Да се състави програма, чрез която се извеждат елементите от масива
с най-малката и най-голямата стойност.
Пример:
48,72,13,14,15
21,22,53,24,75
31,57,33,34,35
41,95,43,44,45
59,52,53,54,55
61,69,63,64,65
Изход:
най-малко 13;
най-голямо 95
     */
    public static void main(String[] args) {
        int[][] array = {
                {48, 72, 13, 14, 15},
                {21, 22, 53, 24, 75},
                {31, 57, 33, 34, 35},
                {41, 95, 43, 44, 45},
                {59, 52, 53, 54, 55},
                {61, 69, 63, 64, 65}
        };
        int minValue = array[0][0];
        int maxValue = array[0][0];
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] > maxValue) {
                    maxValue = array[row][col];
                }
                if (array[row][col] < minValue) {
                    minValue = array[row][col];
                }
            }
        }
        System.out.println("Minimal value is: " + minValue);
        System.out.println("Maximal value is: " + maxValue);
    }
}