package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
//        String text = "If the product of two terms is zero then common sense says at least one of the two terms has " +
//                "to be zero to start with. So if you move all the terms over to one side, you can put the quadratics " +
//                "into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done " +
//                "that, it’s pretty straightforward from there.";
        HashMap<Character, Integer> characterCounts = new HashMap<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the text to count:");
        String text = input.nextLine();
        characterCounts = StringUtil.countCharacters(text.toLowerCase());

        for(Map.Entry<Character, Integer> characterCount : characterCounts.entrySet()) {
            System.out.println(characterCount.getKey() + " " + characterCount.getValue());
        }
    }
}
