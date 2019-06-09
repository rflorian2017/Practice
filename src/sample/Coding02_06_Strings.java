package sample;

public class Coding02_06_Strings {

    public static void main(String[] args) {
        String str = "amaaamab";
        System.out.println(findPosition(str, "a", 0));

        // this is correct
        System.out.println(str.lastIndexOf("a"));
    }

    static int findPosition(String text, String pattern, int start) {

        int position = text.indexOf(pattern, start);

        if (position == -1)
            return position;
        else if (text.indexOf(pattern, position + 1) != -1) {
            position = findPosition(text, pattern, position + 1);
        } else {
            return position;
        }

        return position;
    }
}
