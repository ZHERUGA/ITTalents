import java.util.Scanner;

public class Task17 {
    /*
    Задача 17:
Една редица от естествени числа ще наричаме зигзагообразна нагоре,
ако за елементите и са изпълняват условията:
N1 < N2 > N3 < N4 > N5 <..
Съставете програма, която проверява дали въведени в едномерен
масив редица от числа изпълняват горните изисквания.
Пример: 1 3 2 4 3 7
Изход: изпълнява изискванията за зигзагообразна нагоре редица
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[9];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Please, enter digit for cell: " + i);
            array[i] = scanner.nextInt();
        }

        boolean isPerforming = false;
        for (int i = 1; i < array.length - 1; i += 2) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                isPerforming = true;
            } else {
                isPerforming = false;
                break;
            }
        }

        if (isPerforming) {
            System.out.println("Fulfills the requirements for a zigzag up row!");
        } else {
            System.out.println("It doesn't fulfills the requirements for a zigzag up row!");
        }
    }
}