package sample;

/*
Good morning! Here's your coding interview problem for today.
This problem was asked by Stripe.
Given an array of integers, find the first missing positive integer in linear time and constant space.
In other words, find the lowest positive integer that does not exist in the array.
The array can contain duplicates and negative numbers as well.
For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
You can modify the input array in-place.
 */
public class Daily_Problem_29_05 {
    public static void main(String[] args) {
        int[] a = new int[]{3, 4, -1, 1, 2, 7};

        System.out.println(returnInteger(a));
    }

    private static int returnInteger(int[] a) {
        int minimum = 1;

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if( a[i] > a[j]) {
                    int aux = a[i];
                    a[i] = a[j];
                    a[j] = aux;
                }
            }

        }

        for (int i = 0; i < a.length; i++) {
            if( a[i] > 0) {
                if(a[i] - minimum == 0 || a[i] - minimum == 1) {
                    minimum = a[i];
                }
                else {
                    break;
                }

            }
        }
        return minimum + 1;
    }

}

