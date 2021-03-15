package exercises.lsn1datatypes;

import java.util.Locale;
import java.util.Scanner;

public class StringContains {
    public static void main(String[] args) {
        String text = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having " +
                "nothing to do: once or twice she had peeped into the book her sister was reading, but it had no " +
                "pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures " +
                "or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the text to search for:");
        String search = input.nextLine();
        input.close();
        if (text.toLowerCase().contains(search.toLowerCase())) {
            System.out.println("The text has been found.");
            System.out.println("The index position of the text is " + text.toLowerCase().indexOf(search.toLowerCase()));
            System.out.println("The length of the search text is " + search.length());
            System.out.println("Below is the text with the search text removed:");
            String replaceText = text.toLowerCase().replace(search.toLowerCase(), "");
            System.out.println(replaceText);
        }
        else
            System.out.println("The text was not found.");
    }
}
