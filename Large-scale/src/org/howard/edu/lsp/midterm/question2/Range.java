package org.howard.edu.lsp.midterm.question2;

/**
 * Interface representing a range of integers.
 */
public interface Range {
    
    /**
     * Checks if the range contains the specified value.
     * 
     * @param value The value to check
     * @return true if the value is within the range, false otherwise
     */
    public boolean contains(int value);
    
    /**
     * Checks if the range overlaps with another range.
     * 
     * @param other The other range to check
     * @return true if there is an overlap, false otherwise
     */
    public boolean overlaps(Range other);
    
    /**
     * Returns the number of integers in the range.
     * 
     * @return The size of the range
     */
    public int size();
}

