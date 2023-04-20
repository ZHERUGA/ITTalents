import java.util.Arrays;

public class Task18 {
    /*
    Задача 18:
Дадени са два едномерни масива с естествени числа.
Да се състави програма, която сравнява всички числа с еднакви
индекси от двата масива и записва в трети масив, по-голямото от
двете числа.
Да се изведе съдържанието и на трите масива
Пример:
18,19,32,1,3, 4, 5, 6, 7, 8
1, 2, 3,4,5,16,17,18,27,11
Изход:
18,19,32 ,4,5,16,17,18,27,11
     */
    public static void main(String[] args) {
        int[] arrayOne = {18, 19, 32, 1, 3, 4, 5, 6, 7, 8};
        int[] arrayTwo = {1, 2, 3, 4, 5, 16, 17, 18, 27, 11};
        int[] arrayThree = new int[10];

        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] > arrayTwo[i]) {
                arrayThree[i] = arrayOne[i];
            } else {
                arrayThree[i] = arrayTwo[i];
            }
        }
        System.out.println(Arrays.toString(arrayOne));
        System.out.println(Arrays.toString(arrayTwo));
        System.out.println(Arrays.toString(arrayThree));

    }
}