/**
 * @author Sara Loucks
 * CSE 360 11369
 * Assignment 2
 * 
 * cse360assign2 package contains calculator class
 * to perform mathematical operations
 */
package cse360assign2;

/**
 * Calculator class keeps track of total variable
 * and performs operations on total.
 */
public class Calculator {

	private int total;
	private String history;
	
	/**
	 * Constructor sets total to 0 initially and
	 * saves the initial value of total (0) to the history string.
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	/**
	 * Returns the current total.
	 * 
	 * @return total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Adds value to total
	 * and updates history.
	 * @param value    value to add
	 */
	public void add (int value) {
		total = total + value;
		history += " + " + value;
	}
	/**
	 * Subtracts value from total
	 * and updates history.
	 * 
	 * @param value    value to subtract
	 */
	public void subtract (int value) {
		total = total - value;
		history += " - " + value;
	}
	
	/**
	 * Multiplies total by a value
	 * and updates history.
	 * 
	 * @param value    value to multiply by
	 */
	public void multiply (int value) {
		total = total * value;
		history += " * " + value;
	}
	
	/**
	 * Divides total by value if not zero.
	 * If dividing by zero, sets total to 0.
	 * At end, updates history.
	 * 
	 * @param value    value to divide by
	 */
	public void divide (int value) {
		if (value == 0) {
			total = 0;
		}
		else {
			total = total / value;
		}
		history += " / " + value;
	}
	
	/**
	 * Returns the history of operations on total as a string.
	 * 
	 * @return    string of operations performed
	 */
	public String getHistory () {
		return history;
	}
}