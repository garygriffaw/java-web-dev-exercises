package exercises.lsn2controlflowandcollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListWordLength {
    public static void main(String[] args) {
//        ArrayList<String> words = new ArrayList<>();
//        words.add("one");
//        words.add("two");
//        words.add("three");
//        words.add("four");
//        words.add("five");
//        words.add("six");
//        words.add("seven");
//        words.add("eight");
//        words.add("nine");
//        words.add("ten");

        String text = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having " +
                "nothing to do: once or twice she had peeped into the book her sister was reading, but it had no " +
                "pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures " +
                "or conversation?'";
        String wordsSplit[] = text.split("[ ,:'?]+");
        List<String> words = new ArrayList<>();
        words = Arrays.asList(wordsSplit);
        System.out.println(words);

        Scanner input = new Scanner(System.in);
        int length = 0;
        while(true) {
            System.out.println("Enter the length of word to display:");
            if(input.hasNextInt()) {
                length = input.nextInt();
                if(length > 0)
                    break;
            } else
                input.next();

            System.out.println("Invalid length");
        }

        input.close();
        printWordsOfLength(words, length);
    }

    public static void printWordsOfLength(List<String> words, int length) {
        for(String word : words)
            if(word.length() == length)
                System.out.println(word);
    }
}
