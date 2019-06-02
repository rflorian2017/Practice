package sample;

public class Coding02_06_Strings {

    public static void main(String[] args) {
        String str = "amaaamab";
        System.out.println(findPosition(str, "c"));

        // this is correct
        System.out.println(str.lastIndexOf("ma"));
    }

    static int findPosition(String text, String pattern) {

        int position = text.indexOf(pattern);
        int counter = 0;
        if(position != -1 ) {
            counter = position + pattern.length();
            counter += findPosition(text.substring(position + 1), pattern);
        }
        else {
            return -1;
        }

        return counter;
    }
}
