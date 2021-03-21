package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.

        printFlavors(flavors);
        flavors.sort(new FlavorComparator());
        printFlavors(flavors);

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
        printCones(cones);
        cones.sort(new ConeComparator());
        printCones(cones);

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }

    public static void printFlavors(ArrayList<Flavor> flavors) {
        System.out.println();
        for (Flavor flavor : flavors)
            System.out.println(flavor.getName() + ": $" + flavor.getCost());
    }

    public static void printCones(ArrayList<Cone> cones) {
        System.out.println();
        for (Cone cone : cones)
            System.out.println(cone.getName() + ": $" + cone.getCost());
    }
}
