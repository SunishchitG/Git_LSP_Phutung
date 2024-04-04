package org.howard.edu.lsp.assignment5;

/**
 * Exception thrown when an operation is performed on an empty set.
 */
public class IntegerSetException extends Exception {
	    /**
	     * Constructs a new IntegerSetException with the specified detail message.
	     *
	     * @param message the detail message
	     */
  public IntegerSetException(String message) {
    super(message);
  }
}
