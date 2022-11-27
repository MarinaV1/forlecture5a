package Lecture4;

public class SampleForArrays2 {
    public static void main(String[] args) {
        int[] elements = {1, 2, 3, 4, 5, 6, 7, 9, 13, 543, 234, 1};
        int sum = 0;
        for (int i = 0; i < elements.length; i++) {
            sum += elements[i];
            System.out.println("Current element is " + i + " Sum is " + sum);
        }
        sum = 0;
        for (int element : elements){
            sum += element;
            System.out.println(" Sum is " + sum);
        }
    }
}
