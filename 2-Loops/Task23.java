public class Task23 {
    /*
Задача 23:
Да се състави програма, която чрез цикъл while извежда
таблицата за умножение, но без повторение.
Т.е. ако е изведено 4*5 не се извежда 5*4.
     */
    public static void main(String[] args) {

        int i = 1;
        int a;
        while (i <= 9) {
            a = 1;
            while (a <= 9) {
                if (a >= i) {
                    System.out.print(i + " * " + a + " = " + i*a + "; ");
                }
                a++;
            }
            i++;
            System.out.println(" ");
        }
    }
}