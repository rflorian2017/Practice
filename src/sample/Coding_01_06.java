package sample;

import java.util.Arrays;

public class Coding_01_06 {
    public static void main(String[] args) {
        int [] a ={1, 2, 3, 4, 5};
        long startTimeNanos = System.nanoTime();
//        displayArray(copyArray(a));
//        displayArray(copyArray2(a));

        displayArray(copyArray3(a)); //1071652
        System.out.println();
        System.out.println((System.nanoTime() - startTimeNanos));
    }
    public static void displayArray(int [] a)
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
    }

    public static int[] copyArray2(int []a )
    {
        int b[]= Arrays.copyOf(a, a.length);

        for(int i=0;i < a.length;i++)
        {
            int prod=1;
            for(int j=0;j <a.length;j++)
            {
                if(i!=j)
                {
                    prod*=b[j];
                }
            }

            a[i]=prod;
        }
        return a;
    }

    public static int[] copyArray(int []a )
    {
        int b[]=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            b[i]=a[i];
        }
        for(int i=0;i < a.length;i++)
        {
            int prod=1;
            for(int j=0;j <a.length;j++)
            {
                if(i!=j)
                {
                    prod*=b[j];
                }
            }

            a[i]=prod;
        }
        return a;
    }

    public static int[] copyArray3(int []a )
    {
//        int b[]= Arrays.copyOf(a, a.length);
        int b[]=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            b[i]=a[i];
        }
        for(int i=0;i < a.length;i++)
        {
            a[i] = product(b, 0, i - 1) * product(b, i+1, b.length - 1);
        }
        return a;
    }

    private static int product(int[] a, int left, int right) {
        int product = 1;

        if(right == -1 || left == a.length) {
            return 1;
        }

        for (int i = left; i <= right ; i++) {
            product *= a[i];
        }
        return product;
    }
}