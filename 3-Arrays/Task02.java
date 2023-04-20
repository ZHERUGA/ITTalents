import java.util.Arrays;

public class Task02 {
    /*
    Задача 2:
Нека по въведен масив да се конструира нов, като половината му
елементи са точно като на оригиналния, а другите да са тези
елементи, но в обратен ред. Последно, да се изведе новия масив
на екрана.
     */
    public static void main(String[] args) {

        int[] array1 = {1, 5, 10, 12,};
        int[] array2 = new int[array1.length * 2];

        for (int i = 0; i < array2.length; i++) {
            if (i < array1.length) {
                array2[i] = array1[i];
            } else {
                array2[i] = array1[array2.length -i -1 ];
            }
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}