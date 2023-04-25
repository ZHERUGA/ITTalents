public class Task05 {
    /*
    Задача 5:
Да се състави програма, при която предварително са въведени
естествени числа в двумерен масив 4*4 елемента.
Програмата да извежда резултат от проверката какво е съотношението
на най-голямата сума по редове спрямо най-голямата сума по колони.
Пример:
1,2,3,4
5,6,7,8
9,10,11,12
13,14,15,16
Изход:
най-голяма сума по редове 58
най-голяма сума по колони 40
Максималната сума по редове е > от максималната сума по колони
     */
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int totalRowSum = 0;
        int totalColSum = 0;
        int rowSum = 0;
        int colSum = 0;

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                rowSum += array[row][col];
                colSum += array[col][row];
            }

            if (rowSum > totalRowSum) {
                totalRowSum = rowSum;
            }
            if (colSum > totalColSum) {
                totalColSum = colSum;
            }
            rowSum = 0;
            colSum = 0;
        }

        System.out.println("Highest value for rows: " + totalRowSum);
        System.out.println("Highest value for cols: " + totalColSum);

        if (totalRowSum > totalColSum) {
            System.out.println("Value by rows is bigger than cols.");
        } else if (totalRowSum < totalColSum) {
            System.out.println("Value by rows is smaller than cols.");
        } else {
            System.out.println("Equals.");
        }
    }
}