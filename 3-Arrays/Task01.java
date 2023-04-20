import java.util.Scanner;
public class Task01 {
    /*
    Задача 1:
Да се прочете масив и да се намери най-малкото число кратно на
3 от масива.
10, 3, 5, 8, 6, -3, 7
Най-малкото число кратно на 3 е -3
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minDivisibleBy3 = Integer.MAX_VALUE;
        int[] array = new int[4];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Please, enter digit for cell " + i);
            array[i] = scanner.nextInt();
            if (array[i] % 3 == 0 && array[i] <= minDivisibleBy3){
                minDivisibleBy3 = array[i];
            }
        }
        System.out.println(minDivisibleBy3);
    }
}