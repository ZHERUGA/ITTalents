import java.util.Scanner;

public class Task15 {
    /*
    Задача 15: Да се състави програма, която въвежда естествено
число от интервала [0..24]. Програмата да изведе съответстващо
съобщение съобразно въведения час.Периодите са:
– [18..4] - Добър вечер;
– [4..9] - Добро утро;
– [9..18] - Добър ден
– Пример: 10
– Изход: Добър ден
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter an hour (24); 24 = 0:");
        int hour = scanner.nextInt();

        if (0 < hour && hour <= 4) {
            System.out.println("Good evening!");
        } else if (4 < hour && hour <= 9) {
            System.out.println("Good morning!");
        } else if (9< hour && hour <= 18 ){
            System.out.println("Good day!");
        } else if (18 < hour && hour < 23){
            System.out.println("Good evening!");
        }
    }
}
