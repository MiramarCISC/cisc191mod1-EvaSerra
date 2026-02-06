package edu.sdccd.cisc191;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void constructor_valid_creates_student() {
        Student s = new Student("Ada", 3.9, 42);
        assertEquals("Ada", s.getName());
        assertEquals(3.9, s.getGpa(), 0.000001);
        assertEquals(42, s.getId());
        assertNotNull(s.toString());
    }

    @Test
    void constructor_invalid_name_throws() {
        assertThrows(IllegalArgumentException.class, () -> new Student(null, 3.0, 1));
        assertThrows(IllegalArgumentException.class, () -> new Student("", 3.0, 1));
        assertThrows(IllegalArgumentException.class, () -> new Student("   ", 3.0, 1));
    }

    @Test
    void constructor_invalid_gpa_throws() {
        assertThrows(IllegalArgumentException.class, () -> new Student("A", -0.01, 1));
        assertThrows(IllegalArgumentException.class, () -> new Student("A", 4.01, 1));
        assertDoesNotThrow(() -> new Student("A", 0.0, 1));
        assertDoesNotThrow(() -> new Student("A", 4.0, 1));
    }

    @Test
    void constructor_invalid_id_throws() {
        assertThrows(IllegalArgumentException.class, () -> new Student("A", 3.0, 0));
        assertThrows(IllegalArgumentException.class, () -> new Student("A", 3.0, -5));
    }
}
