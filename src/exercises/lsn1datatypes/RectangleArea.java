package exercises.lsn1datatypes;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the rectangle length:");
        Double length = input.nextDouble();
        System.out.println("Enter the rectangle width:");
        Double width = input.nextDouble();
        input.close();

        System.out.println("The area of the rectangle is " + (length * width));
    }

}
