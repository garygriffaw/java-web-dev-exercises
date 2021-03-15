package exercises.lsn2controlflowandcollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapStudents {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String studentName;

        System.out.println("Enter your students (or ENTER to finish):");

        do {
            System.out.println("Student name:");
            studentName = input.nextLine();

            if(!studentName.equals("")) {
                System.out.println("Student ID:");
                int studentId = input.nextInt();
                students.put(studentId, studentName);
                input.nextLine();
            }
        } while (!studentName.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " - " + student.getValue());
        }

    }
}
