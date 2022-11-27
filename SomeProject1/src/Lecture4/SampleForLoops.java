package Lecture4;

public class SampleForLoops {
    public static void main(String[] args) {
        int n = 0;
        while (n < 5) {
            System.out.println(" While Element: " + n + " value: " + n);
            n++;
            if (n == 3){
                break;
            }
        }
        for (int i = 0; i<7; i ++){
            if (i==3){
                continue;
            }
            System.out.println(" For Element: " + i + " value: " + i);
        }
        int m = 0 ;
        do {
            if (m== 3){
                break;
            }
            System.out.println(" Do while Element: " + m + " value: " + m);
            m++;

        }while (m < 5);
    }

}
