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
        if ((name == null || name.isBlank()) || !(gpa >= 0.0 && gpa <= 4.0) || id <= 0){
            throw new IllegalArgumentException("Invalid Values"); // maybe provide more specific message like "name can't be null/blank" or "gpa must range between 0-4", helps whoever is debugging figure out what is wrong
        }
        this.name = name;
        this.gpa = gpa;
        this.id = id;

        }

    public String getName() {
        // TODO
        return name;
    }

    public double getGpa() {
        // TODO
        return gpa;
    }

    public int getId() {
        // TODO
        return id;
    }

    @Override
    public String toString() {
        // TODO: return readable summary, e.g. "Student{id=..., name='...', gpa=...}"
        return  "Student{" + "name=" + name + ", gpa=" + gpa + ", id=" + id + '}';
    }
}
