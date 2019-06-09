package sample;

public class Coding_08_06 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = a;
        print(a);
        System.out.println();
        print(b);

        System.out.println();
        a[2] = a[2] + 1;
        print(a);
        System.out.println();
        print(b);

        System.out.println("Change a");
        a = new int[]{0, 0, 0, 0};
        print(a);
        print(b);

        System.out.println("Change b = a");
        b = a;
        print(a);
        print(b);

        String test1 = "My string";
        String test2 = test1;
        System.out.println(test1);
        System.out.println(test2);

        test1 = test1 + " new";
        System.out.println(test1);
        System.out.println(test2);

        test2 = test1;
        System.out.println(test2);


    }

    static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
