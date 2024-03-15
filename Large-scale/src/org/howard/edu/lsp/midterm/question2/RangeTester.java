package org.howard.edu.lsp.midterm.question2;

/**
 * Tester class for the IntegerRange class.
 */
public class RangeTester {
    public static void main(String[] args) {
        // Create IntegerRange objects
        IntegerRange range1 = new IntegerRange(1, 10);
        IntegerRange range2 = new IntegerRange(5, 15);
        IntegerRange range3 = new IntegerRange(11, 20);
        
        // Test contains method
        System.out.println("Range 1 contains 5: " + range1.contains(5));
        System.out.println("Range 1 contains 15: " + range1.contains(15));
        
        // Test overlaps method
        System.out.println("Range 1 overlaps with Range 2: " + range1.overlaps(range2));
        System.out.println("Range 1 overlaps with Range 3: " + range1.overlaps(range3));
        
        // Test size method
        System.out.println("Size of Range 1: " + range1.size());
        System.out.println("Size of Range 2: " + range2.size());
        System.out.println("Size of Range 3: " + range3.size());
        
        // Test equals method
        System.out.println("Range 1 equals Range 2: " + range1.equals(range2));
        System.out.println("Range 1 equals Range 3: " + range1.equals(range3));
    }
}
