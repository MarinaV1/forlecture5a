package Lecture4;

public class SampleForArrays3 {
    public static void main(String[] args) {
        int[]elements = {61, 97, 4, 37, 12, -1, -4, 6, 340};
        int min = elements[0];
        for (int i = 0; i < elements.length; i++){
            if (elements[i] < min) {
                min = elements[i];
            }

        }
        System.out.println("Minimal numbers is   " + min);
    }
}
