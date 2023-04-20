import java.util.Arrays;

public class Task12 {
    /*
    Задача 12:
Да се състави програма, чрез която по предварително въведени 7
числа в едномерен масив се разменят местата на елементи с индекси:
- 0 и 1 чрез трета променлива;
- 2 и 3 чрез събиране;
- 4 и 5 чрез умножение.
Пример: 1,2,3,4,5,6,7
Изход: 2,1,4,3,6,5,7
     */
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        int x = array[0];
        array[0] = array[1];
        array[1] = x;
        array[2] += array[1];
        array[3] -= array[1];
        array[4] *= 1.2;
        array[5] /= 1.2;
        System.out.println(Arrays.toString(array));
    }
}