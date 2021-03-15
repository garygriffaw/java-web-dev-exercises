package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radius = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius:");

        boolean validRadius = false;
        while (!validRadius) {
            if(input.hasNextDouble()) {
                radius = input.nextDouble();
                if (radius >= 0) {
                    validRadius = true;
                }
            } else
                input.next();

            if(!validRadius) {
                System.out.println("Invalid radius value");
                System.out.println("Enter a radius:");
            }
        }
        input.close();

        System.out.println("The area of a circle of radius " + radius + " is: " + Circle.getArea(radius));
    }
}
