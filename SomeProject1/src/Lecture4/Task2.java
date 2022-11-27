package Lecture4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
       // Random randomGenerator = new Random();
       // int rundomNumber1 = randomGenerator.nextInt(6);
       // int dice1 = (int) (Math.random() * 6) + 1;
       // int rundomNumber2 = randomGenerator.nextInt(6);
       // int dice2 = (int) (Math.random() * 6) + 1;
       // int rundomNumber3 = randomGenerator.nextInt(6);
       // int dice3 = (int) (Math.random() * 6) + 1;
       // System.out.println("Dice1: " + dice1 + " Dice2:" + dice2 + " Dice3: " + dice3);
        int dice1, dice2, dice3;
        int counter = 0;
        do {
            dice1 = (int) (Math.random() * 6) + 1;
            dice2 = (int) (Math.random() * 6) + 1;
            dice3 = (int) (Math.random() * 6) + 1;
            System.out.print("Dice1: " + dice1 + " Dice2: " + dice2 + " Dice3: " + dice3);
            counter++;
            System.out.println(" Try number: " + counter);
        } while (dice1 != dice2 || dice2 != dice3);
        System.out.println("You have won the game. It took " + counter + " tries");

    }

}
