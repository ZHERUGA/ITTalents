import java.util.Scanner;

public class Task11 {
    /*
    Задача 11: Съставете програма, която по дадено трицифренo
число проверява дали числото се дели на всяка своя цифра.
Във въведеното число да няма цифра 0.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter some three digit number without zero in it: ");
        int threeDigitNumber = scanner.nextInt();
        int firstDigit = threeDigitNumber / 100 % 10;
        int secondDigit = threeDigitNumber / 10 % 10;
        int thirdDigit = threeDigitNumber % 10;

        if (firstDigit != 0 && secondDigit != 0 && thirdDigit != 0) {
            if (threeDigitNumber % firstDigit == 0 &&
                    threeDigitNumber % secondDigit == 0 &&
                    threeDigitNumber % thirdDigit == 0){
                System.out.println(threeDigitNumber + " is dividible of everyone of his digits!");
            } else {
                System.out.println(threeDigitNumber + " is NOT dividible of everyone of his digits!");
            }
        }else{
            System.out.println("There is some zeroes in the three digit number! Try again.");
        }
    }
}
