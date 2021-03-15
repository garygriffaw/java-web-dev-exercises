package exercises.lsn1datatypes;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of miles driven:");
        Double miles = input.nextDouble();
        System.out.println("Enter the amount of gas used (in gallons):");
        Double gallons = input.nextDouble();
        input.close();
        System.out.println("The miles per gallon is " + miles / gallons);
    }
}
