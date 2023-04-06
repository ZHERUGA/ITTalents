public class Task20 {
    /*
    Задача 20:
Да се състави програма, чрез която се извежда квадрат от
цифри. Сумите от елементите на произволен ред или стълб са
равни на 45.
     */
    public static void main(String[] args) {

        int count = 2;
        for (int i = 1; i <= 10; i++) {
            if (i == 10) {
                System.out.print("0");
            } else {
                System.out.print(i);
            }
            for (int j = 1; j <= 10; j++) {
                if (count>9){
                    count=1;
                }
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }
}