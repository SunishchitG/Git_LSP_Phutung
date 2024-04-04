package org.howard.edu.lsp.assignment5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;


public class IntegerSetTest {

    @Test
    @DisplayName("Test case for clear")
    public void testClear() {
        IntegerSet set = new IntegerSet();
        set.add(5);
        set.clear();
        assertTrue(set.isEmpty());
    }

    @Test
    @DisplayName("Test case for length")
    public void testLength() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(2);
        set.add(3);
        assertEquals(3, set.length());
    }

    @Test
    @DisplayName("Test case for equals")
    public void testEquals() {
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        IntegerSet set2 = new IntegerSet();
        set2.add(2);
        set2.add(1);
        assertTrue(set1.equals(set2));
    }

    @Test
    @DisplayName("Test case for contains")
    public void testContains() {
        IntegerSet set = new IntegerSet();
        set.add(5);
        assertTrue(set.contains(5));
        assertFalse(set.contains(10));
    }

    @Test
    @DisplayName("Test case for largest")
    public void testLargest() {
        IntegerSet set = new IntegerSet();
        set.add(3);
        set.add(7);
        set.add(5);
        try {
            assertEquals(7, set.largest());
        } catch (IntegerSetException e) {
            fail("Unexpected exception");
        }
    }

    @Test
    @DisplayName("Test case for largest with empty set")
    public void testLargestEmpty() {
        IntegerSet set = new IntegerSet();
        assertThrows(IntegerSetException.class, () -> {
            set.largest();
        });
    }

    @Test
    @DisplayName("Test case for smallest")
    public void testSmallest() {
        IntegerSet set = new IntegerSet();
        set.add(3);
        set.add(7);
        set.add(5);
        try {
            assertEquals(3, set.smallest());
        } catch (IntegerSetException e) {
            fail("Unexpected exception");
        }
    }

    @Test
    @DisplayName("Test case for smallest with empty set")
    public void testSmallestEmpty() {
        IntegerSet set = new IntegerSet();
        assertThrows(IntegerSetException.class, () -> {
            set.smallest();
        });
    }

    @Test
    @DisplayName("Test case for add")
    public void testAdd() {
        IntegerSet set = new IntegerSet();
        set.add(5);
        assertTrue(set.contains(5));
        set.add(5); // Adding duplicate
        assertEquals(1, set.length()); // Length should remain same
    }

    @Test
    @DisplayName("Test case for remove")
    public void testRemove() {
        IntegerSet set = new IntegerSet();
        set.add(5);
        set.remove(5);
        assertFalse(set.contains(5));
    }

    @Test
    @DisplayName("Test case for union")
    public void testUnion() {
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        IntegerSet set2 = new IntegerSet();
        set2.add(2);
        set2.add(3);
        set1.union(set2);
        assertEquals(3, set1.length()); // Union should contain all unique elements from both sets
    }

    @Test
    @DisplayName("Test case for intersect")
    public void testIntersect() {
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        IntegerSet set2 = new IntegerSet();
        set2.add(2);
        set2.add(3);
        set1.intersect(set2);
        assertEquals(1, set1.length()); // Intersection should contain only common elements
    }

    @Test
    @DisplayName("Test case for diff")
    public void testDiff() {
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        IntegerSet set2 = new IntegerSet();
        set2.add(2);
        set2.add(3);
        set1.diff(set2);
        assertEquals(1, set1.length()); // Difference should contain elements only in set1
    }

    @Test
    @DisplayName("Test case for complement")
    public void testComplement() {
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        IntegerSet set2 = new IntegerSet();
        set2.add(2);
        set1.complement(set2);
        assertEquals(1, set1.length()); // Complement should contain elements not in set2
    }

    @Test
    @DisplayName("Test case for isEmpty")
    public void testIsEmpty() {
        IntegerSet set = new IntegerSet();
        assertTrue(set.isEmpty());
        set.add(5);
        assertFalse(set.isEmpty());
    }

    @Test
    @DisplayName("Test case for toString")
    public void testToString() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(2);
        assertEquals("{1, 2}", set.toString());
    }
}
