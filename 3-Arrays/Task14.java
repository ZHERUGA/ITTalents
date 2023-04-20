public class Task14 {
    /*
    Задача 14:
Имате предварително въведен едномерен масив, съдържащ реални
числа.
Да се състави програма, чрез която се избират само елементи от
масива със стойности от интервала [-2.99..2.99] и се отпечатват в нов
масив. Новият масив да се извежда на екрана.
Пример: 7.1,8.5,0.2,3.7,0.99,1.4,-3.5,-110,212,341,1.2
Изход: 0.2; 0.99; 1.4; 1.2
     */
    public static void main(String[] args) {

        double[] array = {7.1, 8.5, 0.2, 3.7, 0.99, 1.4, -3.5, -110, 212, 341, 1.2};
        double[] arrayCopy = new double[array.length];

        for (int i = 0; i < array.length; i++) {
            if (-2.99 < array[i] && array[i] < 2.99) {
                arrayCopy[i] = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (arrayCopy[i] != 0.0){
                System.out.print(arrayCopy[i] + ", ");
            }
        }
    }
}