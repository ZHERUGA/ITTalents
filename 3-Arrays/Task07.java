import java.util.Scanner;

public class Task07 {
    /*
    Задача 7:
Напишете програма, която първо чете масив и после създава нов
масив със същия размер по следния начин: стойността на всеки
елемент от втория масив да е равна на сбора от предходния и
следващият елемент на съответния елемент от първия масив. Първият
и последният елемент на втория масив трябва да си останат равни на
първият и последният от елемент от първия масив.
Да се изведе получения масив.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter the length of the array1: ");
        int[] array1 = new int[scanner.nextInt()];
        for (int i = 0; i <= array1.length - 1; i++) {
            System.out.println("Please, enter a digit for cell " + i);
            array1[i] = scanner.nextInt();
        }

        int[] array2 = new int[array1.length];
        array2[0] = array1[0];
        array2[array2.length - 1] = array1[array1.length - 1];

        for (int i = 1; i <= array2.length - 2; i++) {
            array2[i] = array1[i - 1] + array1[i + 1];
        }
        for (int i = 0; i <= array2.length - 1; i++) {
            System.out.print(array2[i] + ", ");
        }
    }
}