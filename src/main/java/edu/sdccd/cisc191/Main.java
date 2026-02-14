package edu.sdccd.cisc191;

import java.util.Arrays;
import java.util.stream.Collectors;

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
                new Student("Nishka",  4.0, 10),
                new Student("    ",   2.7, 47),
                new Student("Tony",    3.3, 5),
                new Student("Vanesa", 3.7, 16),
                new Student("Danny",    0.4, 23),
                new Student("Eva",     4.0, 31)
        };
//
//        System.out.printf(
//                "Original Order of Students:\n%s\n\n",
//                getStudentsAsLines(students)
//        );
//
//        Student[] sortedStudents = StudentArrayToolkit.copySortedByGpaDesc(students);
//        System.out.printf(
//                "Student Order When Sorted by GPA:\n%s\n\n",
//                getStudentsAsLines(sortedStudents)
//        );
//
//        Student[] topThreeStudents = StudentArrayToolkit.topNByGpa(students, 3);
//        System.out.printf(
//                "Top 3 Students by GPA:\n%s\n\n",
//                getStudentsAsLines(topThreeStudents)
//        );
//
//        System.out.printf("Student with ID 47: %s\n",
//                StudentArrayToolkit.findByIdLinear(students, 47)
//        );
//
//        System.out.printf("Student with non-existent ID 19: %s\n",
//                StudentArrayToolkit.findByIdLinear(students, 19) == null?
//                        "N/A" :
//                        StudentArrayToolkit.findByIdLinear(students,19)
//        );
//    }
//    private static String getStudentsAsLines(Student[] s) {
//        if (s == null) {
//            throw new IllegalArgumentException("Cannot supply an empty Student Array.");
//        }
//
//        return Arrays.stream(s)
//                .map(Student::toString)
//                .collect(Collectors.joining("\n"));
  }
}
