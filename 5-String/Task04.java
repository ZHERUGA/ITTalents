import java.util.Scanner;

public class Task04 {
    /*
    Задача 4:
Да се състави програма, чрез която по въведени трите имена на двама
човека разделени със запетая, се извежда чие име има по-голям сбор
от ASCII кодовете на съставящите името букви.
Пример: Anna Dosewa Asenowa, Iwo Peew Peew
Изход: Anna Dosewa Asenowa
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the names of two persons separated with coma: ");
        String names = scanner.nextLine();

        String[] name = names.split(", ");
        int sumName1 = 0;
        int sumName2 = 0;

        for (int i = 0; i < name[0].length(); i++) {
            sumName1 += name[0].charAt(i);
        }
        for (int i = 0; i < name[1].length(); i++) {
            sumName2 += name[1].charAt(i);
        }
        if (sumName1 > sumName2) {
            System.out.println(name[0]);
        } else {
            if (sumName2 > sumName1) {
                System.out.println(name[1]);
            } else {
                System.out.println("Both names are equal by their sum of ASCII!");
            }
        }
    }
}