public class Task07 {
    /*
    Задача 7: Въведете 3 променливи от клавиатурата – час (целочислен тип), сума пари
(число с плаваща запетая), дали съм здрав – булев тип. Съставете програма, която
взема решения на базата на тези данни по следния начин:
– ако съм болен, няма да излизам
– ако съм здрав, ще отида на кино с приятели
– ако имам пари, ще си купя лекарства
– ако нямам – ще стоя вкъщи и ще пия чай
– ако имам по-малко от 10 лв, ще отида на кафе.
Полученото решение покажете като съобщение в конзолата.
     */
    public static void main(String[] args) {
        double money = 55;
        boolean isHealthy = true;

        if (!isHealthy){
            System.out.println("I am not going out!");
            if (money>0 && money <10){
                System.out.println("I am going to buy some medicine!");
            }else{
                System.out.println("I am staing at home! I will make some tea...!");
            }
        }
        if (isHealthy){
            if (money > 9){
                System.out.println("I am going to the cinema with friends!");
            } else {
                System.out.println("I am going to starbux");
            }

        }

    }
}
