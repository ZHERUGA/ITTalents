import java.util.Scanner;

public class Task13 {
    /*
    Задача 13: Да се състави програма, която да отгатне колко е
студено/топло по въведената температура t в градус Целзий.
Температурните интервали са:
– под -20 - ледено студено;
– между 0 и -20 - студено;
– между 15 и 0 - ok;
– между 25 и 15 - топло;
– над 25 – горещо.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter a temperature in celsius: ");
        int temperature = scanner.nextInt();

        if (temperature < -20) {
            System.out.println("It's icy cold outside...or inside :D");
        } else if (temperature <= 0) {
            System.out.println("It's cold!");
        } else if (temperature < 15) {
            System.out.println("it's ok!");
        } else if (temperature < 25) {
            System.out.println("It's warm!");
        } else {
            System.out.println("It's hot!");
        }
    }
}
