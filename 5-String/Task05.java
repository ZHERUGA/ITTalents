import java.util.Scanner;

public class Task05 {
    /*
    Задача 5:
Да се състави програма, чрез която се въвеждат 2 редици от знаци
(думи).
Ако в двете редици участва един и същи знак, да се изведе на екрана
първата редица хоризонтално, а втората вертикално, така че да се
пресичат в общия си знак.
Ако редиците нямат общ знак да се изведе само уведомително
съобщение.
Пример :
м
а
шапка
и
н
а
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the first word: ");
        String firstWord = scanner.next();
        System.out.println("Please, enter the second word: ");
        String secondWord = scanner.next();

        for (int i = 0; i < secondWord.length(); i++) {
            if (secondWord.charAt(i) == firstWord.charAt(0)) {
                System.out.println(firstWord);
            } else {
                if (secondWord.charAt(i) != firstWord.charAt(0)) {
                    System.out.println(secondWord.charAt(i));
                } else {
                    System.out.println("There isn't common char!");
                }
            }
        }
    }
}