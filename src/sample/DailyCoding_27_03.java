package sample;

public class DailyCoding_27_03 {
    /*
    Good morning! Here's your coding interview problem for today.

This problem was asked by Twitter.

Implement an autocomplete system.
That is, given a query string s and a set of all possible query strings,
return all strings in the set that have s as a prefix.

For example, given the query string de and the set of strings [dog, deer, deal],
return [deer, deal].

Hint: Try preprocessing the dictionary into a more efficient data structure to speed up queries.
     */
    public static void main(String[] args) {
        String[] strings = {"dog", "deer", "deal"}; 
        String query = "de";

        for (int i = 0; i < strings.length; i++) {
            if(strings[i].startsWith(query)) {
                System.out.println(strings[i]);
            }
        }

    }
}
