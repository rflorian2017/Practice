package sample;

public class Main {

    static String showFactorial(int n) {
        if (n == 0)
            return "" + 1;
        if (n == 1)
            return 1 + "";
        return n + " * " + showFactorial(n - 1);
    }

    static int factorial(int n) {
        if (n == 0)
            return 1;
        if (n == 1)
            return 1;
        return n * factorial(n - 1);
    }


    public static void main1(String[] args) {
        //launch(args);
        System.out.println(showFactorial(3) + " = " + factorial(3));
        // 3 * 2 * 1 = 6

        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        MyLinkedList<String> list2 = new MyLinkedList<>();

        list2.add("e");
        list2.add("2e");

        list.printList();
        list2.printList();

    }

    public static void main(String[] args) {
        int[] a = {89, 45, 33, 31, 25, 24, 11, 8, 1};
        bubbleSort(a);
        int[] b = {89, 45, 33, 31, 25, 24, 11, 8, 1};
        bubbleSort2(b);
    }

    public static void bubbleSort(int[] a) {
        int count = 0;
        int interschimb = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] >= a[j]) {
                    int aux = a[i];
                    a[i] = a[j];
                    a[j] = aux;
                    interschimb++;
                }
                count++;
            }
        }
        System.out.println(count);
        System.out.println(interschimb);
    }

    public static void bubbleSort2(int[] a) {
        int count = 0;
        int interschimb = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] >= a[j+1]) {
                    int aux = a[j];
                    a[j] = a[j+1];
                    a[j+1] = aux;
                    interschimb++;
                }
                count++;
            }
        }
        System.out.println(count);
        System.out.println(interschimb);
    }
}
