package exercises.lsn2controlflowandcollections;

import java.util.ArrayList;

public class ArrayListSum {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(34);
        numbers.add(11);
        numbers.add(35);
        numbers.add(4);
        numbers.add(8);
        numbers.add(9);
        numbers.add(4765);
        numbers.add(34);
        numbers.add(99);
        numbers.add(66);
        numbers.add(45);
        numbers.add(22);
        numbers.add(12);

        System.out.println("The sume of the even numbers is: " + sumEvenNumbers(numbers));
    }

    public static int sumEvenNumbers(ArrayList<Integer> numbers) {
        int sum = 0;

        for(Integer number : numbers) {
            if((number & 1) == 0)
                sum+=number;
        }

        return sum;
    }
}
