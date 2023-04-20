import java.util.Scanner;
public class Task04 {
    /*
    Задача 4:
Да се прочете масив и да се отпечата дали е огледален.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array1 = new int[4];
        boolean isMirror = false;

        for (int i = 0; i < array1.length; i++) {
            System.out.println("Please, enter digit for cell " + i);
            array1[i] = scanner.nextInt();
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array1[array1.length - i - 1]) {
                System.out.println("Not mirror!");
                break;
            } else {
                isMirror = true;
            }
        }
        if (isMirror) {
            System.out.println("MIRROR ARRAY");
        }
    }
}