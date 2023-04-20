import java.util.Scanner;

public class Task06 {
    /*
    Задача 6:
Напишете програма, която първо чете 2 масива и после извежда
съобщение дали са еднакви, и дали са с еднакъв размер.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the length of array1: ");
        int arr1 = scanner.nextInt();
        int[] array1 = new int[arr1];

        System.out.println("Please enter the length of array2: ");
        int arr2 = scanner.nextInt();
        int[] array2 = new int[arr2];

        boolean isEqual = true;

        if (array1.length != array2.length) {
            System.out.println("Arrays are not equal!");
        } else {
            for (int index1 = 0; index1 < array1.length; index1++) {
                System.out.println("Please, enter a digit for array1 cell " + index1);
                array1[index1] = scanner.nextInt();
            }
            for (int index2 = 0; index2 < array2.length; index2++) {
                System.out.println("Please, enter a digit for array2 cell " + index2);
                array2[index2] = scanner.nextInt();
            }
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    isEqual = false;
                    break;
                }
            }
            if (isEqual) {
                System.out.println("Arrays are equal!");
            } else {
                System.out.println("Arrays are NOT equal!");
            }
        }
    }
}