import java.util.Scanner;

public class Task14 {
    /*
    Задача 14: Да се състави програма, която по въведени
координати на 2 позиции от шахматната дъска извежда отговор
дали квадратчетата на тези позиции са оцветени в еднакъв или
различен цвят. Шахматната дъска е квадратна. Въвеждат се две
двойки числа от интервала [1..8].
– Пример: 2 2 3 2
– Изход: Позициите са с различен цвят
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter first coordinates:");
        System.out.println("Enter x1:");
        int x1 = scanner.nextInt();
        System.out.println("Enter y1:");
        int y1 = scanner.nextInt();
        System.out.println("Please, enter second coordinates:");
        System.out.println("Enter x2:");
        int x2 = scanner.nextInt();
        System.out.println("Enter y2:");
        int y2 = scanner.nextInt();

        int position1 = 0; //0 black; 2 white
        int position2 = 0;

        if (x1 % 2 != 0) {
            if (y1 % 2 != 0) {
                position1 = 1;
            } else {
                position1 = 2;
            }
        } else {
            if (y1 % 2 != 0) {
                position1 = 2;
            } else {
                position1 = 1;
            }
        }
        if (x2 % 2 != 0) {
            if (y2 % 2 != 0) {
                position2 = 1;
            } else {
                position2 = 2;
            }
        } else {
            if (y2 % 2 != 0) {
                position2 = 2;
            } else {
                position2 = 1;
            }
        }
        if (position1 == position2) {
            System.out.println("Same color");
        } else {
            System.out.println("Different color");
        }
    }
}
