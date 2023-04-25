public class Task02 {
    /*
    Задача 2:
Имате квадратен двумерен масив от естествени числа, чийто стойности
се въвеждат от конзолата. Да се отпечатат диагоналите на масива.
Пример:
1,4,6,3
5,9,7,2
4,8,1,9
2,3,4,5
Изход:
1 9 1 5
3 7 8 2
     */
    public static void main(String[] args) {
        int[][] array = {
                {1, 4, 6, 3},
                {5, 9, 7, 2},
                {4, 8, 1, 9},
                {2, 3, 4, 5}
        };
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][array.length - i - 1] + " ");
        }
    }
}