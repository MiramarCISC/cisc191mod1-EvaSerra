package edu.sdccd.cisc191;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentArrayToolkitTest {

    private Student[] sample() {
        return new Student[]{
                new Student("Zoe", 3.2, 10),
                new Student("Ada", 3.9, 42),
                new Student("Bob", 3.9, 7),
                new Student("Cal", 2.5, 3),
                new Student("Eve", 3.2, 99),
                new Student("Amy", 3.9, 100)
        };
    }

    @Test
    void copySortedByGpaDesc_returns_new_sorted_array_and_does_not_mutate_original() {
        Student[] original = sample();
        Student[] sorted = StudentArrayToolkit.copySortedByGpaDesc(original);

        assertEquals("Zoe", original[0].getName());

        assertEquals(3.9, sorted[0].getGpa(), 0.000001);
        assertEquals(3.9, sorted[1].getGpa(), 0.000001);
        assertEquals(3.9, sorted[2].getGpa(), 0.000001);

        assertEquals("Ada", sorted[0].getName());
        assertEquals("Amy", sorted[1].getName());
        assertEquals("Bob", sorted[2].getName());

        assertEquals(3.2, sorted[3].getGpa(), 0.000001);
        assertEquals(3.2, sorted[4].getGpa(), 0.000001);
        assertEquals("Eve", sorted[3].getName());
        assertEquals("Zoe", sorted[4].getName());

        Student tmp = sorted[0];
        sorted[0] = sorted[sorted.length - 1];
        sorted[sorted.length - 1] = tmp;
        assertEquals("Zoe", original[0].getName());
    }

    @Test
    void findByIdLinear_returns_match_or_null() {
        Student[] students = sample();
        Student found = StudentArrayToolkit.findByIdLinear(students, 42);
        assertNotNull(found);
        assertEquals("Ada", found.getName());

        assertNull(StudentArrayToolkit.findByIdLinear(students, 123456));
    }

    @Test
    void topNByGpa_negative_n_throws() {
        assertThrows(IllegalArgumentException.class, () -> StudentArrayToolkit.topNByGpa(sample(), -1));
    }

    @Test
    void topNByGpa_n_zero_returns_empty_array() {
        Student[] top0 = StudentArrayToolkit.topNByGpa(sample(), 0);
        assertNotNull(top0);
        assertEquals(0, top0.length);
    }

    @Test
    void topNByGpa_returns_top_n_sorted_and_new_array() {
        Student[] original = sample();
        Student[] top3 = StudentArrayToolkit.topNByGpa(original, 3);

        assertEquals(3, top3.length);
        assertEquals(3.9, top3[0].getGpa(), 0.000001);
        assertEquals(3.9, top3[1].getGpa(), 0.000001);
        assertEquals(3.9, top3[2].getGpa(), 0.000001);

        assertEquals("Ada", top3[0].getName());
        assertEquals("Amy", top3[1].getName());
        assertEquals("Bob", top3[2].getName());

        top3[0] = new Student("Hacker", 4.0, 555);
        assertNotEquals("Hacker", original[0].getName());
    }

    @Test
    void topNByGpa_n_greater_than_length_returns_all_sorted() {
        Student[] students = sample();
        Student[] all = StudentArrayToolkit.topNByGpa(students, 999);
        assertEquals(students.length, all.length);
        assertEquals("Ada", all[0].getName());
        assertEquals("Cal", all[all.length - 1].getName());
    }
}
