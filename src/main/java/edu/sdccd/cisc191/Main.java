package edu.sdccd.cisc191;

import java.util.Arrays;
import java.util.stream.Collectors;

import static edu.sdccd.cisc191.StudentArrayToolkit.*;

/**
 * Module 1 - Demo runner.
 * This is primarily for your video demo.
 */
public class Main {
    public static void main(String[] args) {
        // TODO: Create at least 6 students and demonstrate:
        // - original order
        // - sorted-by-GPA order
        // - topNByGpa with N=3
        // - findByIdLinear with existing and non-existing id
        Student[] students = new Student[]{
                new Student("Nishka", 4.0, 10), //Same GPA, name tie-breaker
                new Student("Jose",   2.7, 47),
                new Student("Tony",   3.3, 15),
                new Student("Vanesa", 3.7, 16),
                new Student("Danny",  0.4, 23),
                new Student("Eva",    4.0, 19)
        };

        System.out.println("Original Order");
        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println("\nSorted by GPA (Descending with Name Ascending Tie-breaker)");
        Student[] sorted = copySortedByGpaDesc(students);
        for (Student s : sorted) System.out.println(s);

        System.out.println("\nTop 3 Students");
        Student[] top3 = topNByGpa(students, 3);
        for (Student s : top3) System.out.println(s);

        System.out.println("\nSearch Results");
        Student found = findByIdLinear(students, 16);
        System.out.println("Searching for ID 16: " + found);
        Student notFound = findByIdLinear(students, 67);
        System.out.println("Searching for ID 67: " + notFound);
  }
}
