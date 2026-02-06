package edu.sdccd.cisc191;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntArrayToolkitTest {

    @Test
    void sum_null_throws() {
        assertThrows(IllegalArgumentException.class, () -> IntArrayToolkit.sum(null));
    }

    @Test
    void sum_basic() {
        assertEquals(0, IntArrayToolkit.sum(new int[]{}));
        assertEquals(6, IntArrayToolkit.sum(new int[]{1, 2, 3}));
        assertEquals(-2, IntArrayToolkit.sum(new int[]{-1, -1, 0}));
    }

    @Test
    void max_null_or_empty_throws() {
        assertThrows(IllegalArgumentException.class, () -> IntArrayToolkit.max(null));
        assertThrows(IllegalArgumentException.class, () -> IntArrayToolkit.max(new int[]{}));
    }

    @Test
    void max_basic() {
        assertEquals(7, IntArrayToolkit.max(new int[]{7}));
        assertEquals(9, IntArrayToolkit.max(new int[]{1, 9, 3, 9, 2}));
        assertEquals(-1, IntArrayToolkit.max(new int[]{-5, -1, -3}));
    }

    @Test
    void indexOf_null_throws() {
        assertThrows(IllegalArgumentException.class, () -> IntArrayToolkit.indexOf(null, 5));
    }

    @Test
    void indexOf_first_occurrence_or_minus_one() {
        assertEquals(-1, IntArrayToolkit.indexOf(new int[]{}, 10));
        assertEquals(-1, IntArrayToolkit.indexOf(new int[]{1, 2, 3}, 10));
        assertEquals(0, IntArrayToolkit.indexOf(new int[]{5, 1, 5}, 5));
        assertEquals(2, IntArrayToolkit.indexOf(new int[]{1, 2, 3}, 3));
    }

    @Test
    void copySortedAscending_null_throws() {
        assertThrows(IllegalArgumentException.class, () -> IntArrayToolkit.copySortedAscending(null));
    }

    @Test
    void copySortedAscending_returns_new_sorted_array_and_does_not_mutate_original() {
        int[] original = {3, 1, 2, 2};
        int[] sorted = IntArrayToolkit.copySortedAscending(original);

        assertArrayEquals(new int[]{1, 2, 2, 3}, sorted);
        assertArrayEquals(new int[]{3, 1, 2, 2}, original);

        sorted[0] = 999;
        assertArrayEquals(new int[]{3, 1, 2, 2}, original);
    }
}
