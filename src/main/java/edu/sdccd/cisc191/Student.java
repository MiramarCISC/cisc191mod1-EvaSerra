package edu.sdccd.cisc191;

/**
 * Module 1 - Part B
 * Student data model with validation.
 */
public class Student {

    private final String name;
    private final double gpa;
    private final int id;

    /**
     * Validation rules:
     * - name must not be null or blank
     * - gpa must be in [0.0, 4.0]
     * - id must be > 0
     *
     * @throws IllegalArgumentException if any argument is invalid
     */
    public Student(String name, double gpa, int id) {
        // TODO: validate and assign fields
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public String getName() {
        // TODO
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public double getGpa() {
        // TODO
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public int getId() {
        // TODO
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public String toString() {
        // TODO: return readable summary, e.g. "Student{id=..., name='...', gpa=...}"
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
