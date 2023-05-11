import java.util.Scanner;

public class Task07 {
    /*
    Задача 7:
Да се състави програма, която чете набор от думи разделени с
интервал.
Като резултат да се извеждат броя на въведените думи, както и броя
знаци в най-дългата дума.
Пример: asd fg hjkl
Изход: 3 думи, най-дългата е с 4 символа.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter some words separated with space: ");
        String[] words = scanner.nextLine().split(" ");

        int charCounter = 0;

        for (int i = 0; i < words.length; i++) {
            int temp = 0;
            for (int j = 0; j < words[i].length(); j++) {
                temp++;
                if (temp > charCounter) {
                    charCounter = temp;
                }
            }
        }
        System.out.print(words.length + " words, the longest is ");
        System.out.println(charCounter + " chars");
    }
}