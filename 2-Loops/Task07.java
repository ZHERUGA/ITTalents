import java.util.Scanner;

public class Task07 {
    /*
    Задача 7: Започвайки от 3, да се изведат на екрана първите n
числа които се делят на 3. Числата да са разделени със запетая.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter a number for the first n numbers: ");
        int n = sc.nextInt();
        int count = 0;

        for (int i = 3; count < n; i+=3) {
            System.out.print(i + ",");
            count++;
        }

    }
}