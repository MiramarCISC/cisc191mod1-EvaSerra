package edu.sdccd.cisc191;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Module 1 - Part C
 * Utility methods for working with Student[].
 *
 * IMPORTANT:
 * - Methods that return Student[] must return NEW arrays (defensive copy).
 * - For sorting, use a Comparator created with a lambda or method references.
 */
public class StudentArrayToolkit {

    /**
     * Returns a NEW array sorted by:
     * 1) GPA descending
     * 2) name ascending (tie-breaker)
     *
     * Must not modify the original array.
     */
    public static Student[] copySortedByGpaDesc(Student[] students) {
        // TODO: defensive copy + Arrays.sort with Comparator lambda
        Student[] arrayCopy = Arrays.stream(Arrays.copyOf(students, students.length)).sorted(Comparator.comparingDouble(Student::getGpa)
                .thenComparing(Student::getName)).toArray(Student[]::new);
        return arrayCopy;
    }

    /**
     * Linear search for a student by id.
     * Returns the Student if found, otherwise null.
     */
    public static Student findByIdLinear(Student[] students, int id) {
        // TODO: implement
        for(Student i : students){
            if(i.getId() == id){
                return i;
            }
        }
        return null;
    }

    /**
     * Returns a NEW array containing the top N students by GPA desc (ties: name asc).
     * If n > students.length, return all students (sorted).
     * If n == 0, return an empty array.
     * @throws IllegalArgumentException if n < 0
     */
    public static Student[] topNByGpa(Student[] students, int n) {
        // TODO: validate n, sort copy, return first n in a new array
//        Student[] sortedCopy = copySortedByGpaDesc(students);
//        return Arrays.copyOf(sortedCopy, n);
        if (n < 0) {
            throw new IllegalArgumentException("n should be greater than 0");
        } else if (n == 0) {
            return new Student[0];
        } else if (n >= students.length) {
            return copySortedByGpaDesc(students);
        }  else {
            Student[] sortedCopy = copySortedByGpaDesc(students);
            return Arrays.copyOf(sortedCopy, n);
        }
    }
}
