import java.util.Scanner;

public class Task03 {
    /*
    Задача 3:
Да се въведе число, след което да се създаде масив с 10
елемента по следния начин:
Първите 2 елемента на масива са въведеното число.
Всеки следващ елемент на масива е равен на сбора от
предишните 2 елемента в масива.
След това изведете масива .
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];
        System.out.println("Please, enter the array's first element: ");
        array[0] = scanner.nextInt();
        array[1] = array[0];

        for (int i = 2; i < array.length; i++) {
            array[i] = array[i-1] + array[i-2];
        }
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
    }
}