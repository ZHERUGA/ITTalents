public class Task08 {
    /*
    Задача 8:
Напишете програма, която намира и извежда най-дългата редица от
еднакви поредни елементи в даден масив.
     */
    public static void main(String[] args) {

        int[] array = {1, 2, 2, 2, 3, 4, 5, 6, 6, 6, 5, 1};
        int number = 0;
        int counter = 1;
        int finalNumber = 0;
        int finalCounter = 1;

        for (int i = 0; i <= array.length - 2; i++) {
            if (array[i] != array[i + 1]) {
                number = 0;
                counter = 1;
            } else {
                if (array[i] == array[i + 1]) {
                    number = array[i];
                    counter++;
                    if (counter > finalCounter) {
                        finalNumber = number;
                        finalCounter = counter;
                    }
                }
            }
        }
        System.out.println("Number " + finalNumber);
        System.out.println(finalCounter + " times");
    }
}