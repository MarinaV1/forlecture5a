package Lecture4;

import java.util.Arrays;
import java.util.Random;

public class Statistics {


    public static int minValue(int[] massive) {
        int min = massive[0];
        for (int j : massive) {
            if (min > j) {
                min = j;
            }
        }
        return min;

    }

    public static int maxValue(int[] massive) {
        int max = massive[0];
        for (int j : massive) {
            if (max < j) {
                max = j;
            }
        }
        return max;
    }


    public static int average(int[] massive) {
        int sum = 0;
        for (int j : massive) {
            sum += j;
        }
        return sum / massive.length;
    }


    public static int[] generateArray(int length) {

        Random randomGenerator = new Random();
        int[] ourArray = new int[length];
        for (int i = 0; i < length; i++) {
            ourArray[i] = randomGenerator.nextInt(100);
        }
        return ourArray;
    }

    public static void main(String[] args) {


        int[] elements = {1, 2, 3, 4, 5, 6, 7, 8, 92, 2, 1, 14, 21, 12, -1};
        int min = minValue(elements);
        int max = maxValue(elements);
        int averageNumber = average(elements);
        System.out.println("Min value " + min);
        System.out.println("Max value " + max);
        System.out.println("Average value " + averageNumber);

        int[] myElements = generateArray(10);
        int min1 = minValue(myElements);
        int max1 = maxValue(myElements);
        int averageNumber1 = average(myElements);
        System.out.println(Arrays.toString(myElements));
        System.out.println("Min value " + min1);
        System.out.println("Max value " + max1);
        System.out.println("Average value " + averageNumber1);

    }

}





