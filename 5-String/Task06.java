import java.util.Scanner;

public class Task06 {
    /*
    Задача 6:
Да се състави програма, чрез която се въвежда изречение с отделни
думи.
Като резултат на екрана да се извежда същия текст, но всяка отделна
дума да започва с главна буква, а следващите я букви да са малки.
Пример: супер яката задача
Изход: Супер Яката Задача
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter some words or sentence separated by space: ");
        String[] sentence = scanner.nextLine().toLowerCase().split(" ");

        for (int i = 0; i < sentence.length; i++) {
            sentence[i] = sentence[i].substring(0, 1).toUpperCase() + sentence[i].substring(1);
            System.out.print(sentence[i] + " "); //this is if we just have to print the modified result
        }
        //if the result has to be a NEW String:
        //String result = String.join(" ", sentence);
        //System.out.println(result);
    }
}