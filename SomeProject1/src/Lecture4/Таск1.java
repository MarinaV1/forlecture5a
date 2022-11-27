package Lecture4;

import java.util.Random;

public class Таск1 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber1 = random.nextInt(145);
        int randomNumber2 = random.nextInt(1090);
        int randomNumber3 = random.nextInt(888);
        int sum = randomNumber1  + randomNumber2 + randomNumber3;

        System.out.println(randomNumber1 + randomNumber2);

    }

}
