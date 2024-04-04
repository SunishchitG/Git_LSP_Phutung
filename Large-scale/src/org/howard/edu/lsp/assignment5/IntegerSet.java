package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;
import java.util.List;

public class IntegerSet {
    private List<Integer> set = new ArrayList<>();

    // Clears the internal representation of the set
    public void clear() {
        set.clear();
    }

    // Returns the length of the set
    public int length() {
        return set.size();
    }

    /*
     * Returns true if the 2 sets are equal, false otherwise; Two sets are equal if
     * they contain all of the same values in ANY order.
     */
    public boolean equals(IntegerSet b) {
        if (this.length() != b.length())
            return false;

        for (int i = 0; i < this.length(); i++) {
            if (!b.contains(this.set.get(i)))
                return false;
        }
        return true;
    }

    // Returns true if the set contains the value, otherwise false
    public boolean contains(int value) {
        return set.contains(value);
    }

    // Returns the largest item in the set; Throws a IntegerSetException if the set is empty
    public int largest() throws IntegerSetException {
        if (isEmpty()) {
            throw new IntegerSetException("Cannot find largest element in an empty set");
        }

        int max = set.get(0);
        for (int i = 1; i < set.size(); i++) {
            if (set.get(i) > max) {
                max = set.get(i);
            }
        }
        return max;
    }

    // Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
    public int smallest() throws IntegerSetException {
        if (isEmpty()) {
            throw new IntegerSetException("Cannot find smallest element in an empty set");
        }

        int min = set.get(0);
        for (int i = 1; i < set.size(); i++) {
            if (set.get(i) < min) {
                min = set.get(i);
            }
        }
        return min;
    }

    // Adds an item to the set or does nothing it already there
    public void add(int item) {
        if (!contains(item)) {
            set.add(item);
        }
    }

    // Removes an item from the set or does nothing if not there
    public void remove(int item) {
        set.remove((Integer) item); // Remove the Integer object, not int value
    }

    // Set union
    public void union(IntegerSet intSetb) {
        for (int i = 0; i < intSetb.length(); i++) {
            int item = intSetb.set.get(i);
            if (!this.contains(item)) {
                this.add(item);
            }
        }
    }

    // Set intersection
    public void intersect(IntegerSet intSetb) {
        List<Integer> intersection = new ArrayList<>();
        for (int i = 0; i < this.length(); i++) {
            int item = this.set.get(i);
            if (intSetb.contains(item)) {
                intersection.add(item);
            }
        }
        this.set = intersection;
    }

    // Set difference, i.e., s1 –s2
    public void diff(IntegerSet intSetb) {
        List<Integer> difference = new ArrayList<>();
        for (int i = 0; i < this.length(); i++) {
            int item = this.set.get(i);
            if (!intSetb.contains(item)) {
                difference.add(item);
            }
        }
        this.set = difference;
    }

    // Set complement, all elements not in s1
    public void complement(IntegerSet intSetb) {
        List<Integer> complement = new ArrayList<>();
        for (int i = 0; i < intSetb.length(); i++) {
            int item = intSetb.set.get(i);
            if (!this.contains(item)) {
                complement.add(item);
            }
        }
        this.set = complement;
    }

    // Returns true if the set is empty, false otherwise
    public boolean isEmpty() {
        return set.isEmpty();
    }

    // Return String representation of your set
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int i = 0; i < set.size(); i++) {
            sb.append(set.get(i));
            if (i < set.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }
}