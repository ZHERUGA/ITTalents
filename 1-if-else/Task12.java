import java.util.Scanner;

public class Task12 {
    /*
    Задача 12: Високосни години са всички години кратни на 4 с
изключения столетията, но без столетия кратни на 400, т.е. 1900
не е високосна, но 1600 и 2000 са високосни.Съставете програма,
която по дадени ден, месец и година, отпечатва следващата дата.
– Входни данни: три числа за ден, месец, година.
– Пример: 28, 2, 2021
– Изход: 1,3,2021
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a DAY: ");
        int day = scanner.nextInt();
        System.out.println("Please, enter a MONTH: ");
        int month = scanner.nextInt();
        System.out.println("Please, enter a YEAR: ");
        int year = scanner.nextInt();
        day++;

        boolean leapYear = false;

        if (year % 4 == 0) {
            leapYear = true;
        }
        if (year % 100 == 0) {
            leapYear = false;
        }
        if (year % 400 == 0) {
            leapYear = true;
        }


        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            if (day > 31) {
                day = 1;
                month++;
                if (month > 12) {
                    month = 1;
                    year++;
                }
            }
            System.out.println(day + "." + month + "." + year);
        } else {
            if (month == 4 || month == 6 || month == 9 || month == 11) {
                if (day > 30) {
                    day = 1;
                    month++;
                    System.out.println(day + "." + month + "." + year);
                }
            } else {
                if (month == 2 && leapYear){
                    if (day > 29){
                        day = 1;
                        month++;
                    }
                    System.out.println(day + "." + month + "." + year);
                } else {
                    if (day > 28){
                        day = 1;
                        month++;
                        System.out.println(day + "." + month + "." + year);
                    }

                }
            }

        }


    }
}
