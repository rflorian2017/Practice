package sample;

import java.util.Arrays;

public class Coding_01_06_odd_elem {
    public static void main(String[] args) {
        int[] a = {2, 3, 4, 3, 2};

        System.out.println(displayOdd(a)); // 4

    }

    public static int displayOdd(int[] a) {
        int aux = 0;
        for (int i = 0; i < a.length; i++) {
            aux ^= a[i];
        }

        return aux;
    }

}