package exercises.lsn2controlflowandcollections;

import java.util.Arrays;

public class ArrayInline {
    public static void main(String[] args) {
        int[] values = {1, 1, 2, 3, 5, 8};

        for(int i=0; i<values.length; i++) {
            if((values[i] & 1) != 0)
                System.out.println(values[i]);
        }

        String text = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = text.split("\\.");
        System.out.println(Arrays.toString(words));
//        for(String word : words)
//            System.out.println(word);
    }
}
