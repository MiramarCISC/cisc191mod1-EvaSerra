package edu.sdccd.cisc191;

import org.xml.sax.ext.LexicalHandler;

import java.util.Arrays;

/**
 * Module 1 - Part A
 * Utility methods for working with int[].
 *
 * IMPORTANT:
 * - Do not print inside these methods.
 * - Do not modify input arrays unless the method explicitly says so.
 */
public class IntArrayToolkit {

    /**
     * Returns the sum of all values in the array.
     * @throws IllegalArgumentException if a is null
     */
    public static int sum(int[] a) {
        // TODO: implement
        if (a == null)  {
            throw new IllegalArgumentException("Array is null");
        } else {
            int sum = 0;
            for (int i : a) {
                sum += i;
            }
            return sum;
        }
    }

    /**
     * Returns the maximum value in the array.
     * @throws IllegalArgumentException if a is null or empty
     */
    public static int max(int[] a) {
        // TODO: implement
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("Array is null");
        } else {
            int max = a[0];
            for (int i : a) {
                    if (i > max) {
                        max = i;
                    }
            }
            return max;
        }
    }

    /**
     * Returns the index of the first occurrence of target, or -1 if not found.
     * @throws IllegalArgumentException if a is null
     */
    public static int indexOf(int[] a, int target) {
        // TODO: implement
        if (a == null) {
            throw new IllegalArgumentException("Array is null");
        } else {
            int index = 0;
            for (int i : a) {
                if (i == target) {
                    return index;
                }
                index++;
            }
            return -1;
        }
    }

    /**
     * Returns a NEW array containing the same values as a, sorted ascending.
     * Must not modify the original array.
     * @throws IllegalArgumentException if a is null
     */
    public static int[] copySortedAscending(int[] a) {
        // TODO: implement (hint: defensive copy + Arrays.sort)
        if (a == null) {
            throw new IllegalArgumentException("Array is null");
        } else {
            int[] result = new int[a.length];
            System.arraycopy(a, 0, result, 0, a.length);
            Arrays.sort(result);
            return result;
        }
    }
}
