public class Task12 {
    /*
    Задача 12: Да се състави програма, която извежда всички
естествени трицифрени числа, които нямат еднакви цифри т.е.
100,101, 606 и т.н. не се извеждат.
     */
    public static void main(String[] args) {

        for (int i = 102; i < 987; i++) {
            int digit3 = i / 10 % 10;
            int digit2 = i / 100 % 10;
            int digit1 = i % 10;

            if (digit1 != digit2 && digit2 != digit3 && digit1 != digit3) {
                System.out.println(i);
            }
        }
    }
}