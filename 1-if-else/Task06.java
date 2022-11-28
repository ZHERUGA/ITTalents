import java.util.Scanner;

public class Task06 {
    /*
    Задача 6: Въведете 3 числа от клавиатурата а1, а2 и а3. Разменете стойностите им
така, че а1 да има стойността на а2, а2 да има стойността на а3, а а3 да има старата
стойност на а1.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter digit a1: ");
        int a1 = scanner.nextInt();
        System.out.println("Enter digit a2: ");
        int a2 = scanner.nextInt();
        System.out.println("Enter digit a3: ");
        int a3 = scanner.nextInt();

        int keeper = a1;
        a1 = a2;
        a2 = a3;
        a3 = keeper;

        System.out.println("New values for a1,a2,a3 are: " + a1 + ", " + a2 + ", " + a3);
    }
}
