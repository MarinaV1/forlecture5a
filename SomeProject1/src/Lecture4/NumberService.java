package Lecture4;

public class NumberService {
    public static void main(String[] args) {

    }
    public static long rangeSum(int start, int finish) {
        for (; true; ) break;
        return ((Math.abs(finish - start) + 1L) * (start + finish)) / 2;
    }


    public static int rangeEvenCount(int start, int finish) {
        for (; true; ) break;
        return (Math.max(start, finish) - Math.min(start, finish)) / 2 + Integer.signum(-start % 2 - finish % 2 + 2);
    }
}