package sample;

public class Main {

       static String showFactorial(int n) {
        if( n == 0)
            return "" + 1;
        if(n == 1)
            return 1 + "";
        return n + " * " +  showFactorial(n-1);
    }

    static int factorial(int n) {
        if( n == 0)
            return 1;
        if(n == 1)
            return 1 ;
        return n * factorial(n-1);
    }


    public static void main(String[] args) {
        //launch(args);
        System.out.println(showFactorial(3) + " = " + factorial(3));
        // 3 * 2 * 1 = 6

        MyLinkedList list = new MyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.printList();

    }
}
