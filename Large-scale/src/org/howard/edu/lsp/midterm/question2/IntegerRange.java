package org.howard.edu.lsp.midterm.question2;

/**
 * Implementation of the Range interface representing a range of integers.
 */
public class IntegerRange implements Range {
    private int lowerBound;
    private int upperBound;
    
    /**
     * Constructs a new IntegerRange with the specified lower and upper bounds.
     * 
     * @param lowerBound The lower bound of the range
     * @param upperBound The upper bound of the range
     */
    public IntegerRange(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }
    
    @Override
    public boolean contains(int value) {
        return value >= lowerBound && value <= upperBound;
    }
    
    @Override
    public boolean overlaps(Range other) {
        int otherLowerBound = Integer.MAX_VALUE;
        int otherUpperBound = Integer.MIN_VALUE;
        
        // Find the lower and upper bounds of the other range
        for (int i = lowerBound; i <= upperBound; i++) {
            if (other.contains(i)) {
                otherLowerBound = Math.min(otherLowerBound, i);
                otherUpperBound = Math.max(otherUpperBound, i);
            }
        }
        
        // Check if there is an overlap
        return otherLowerBound <= upperBound && otherUpperBound >= lowerBound;
    }
    
    @Override
    public int size() {
        return upperBound - lowerBound + 1;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntegerRange)) {
            return false;
        }
        IntegerRange other = (IntegerRange) obj;
        return lowerBound == other.lowerBound && upperBound == other.upperBound;
    }
}
