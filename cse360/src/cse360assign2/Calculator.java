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
 * and performs operations on total
 */
public class Calculator {

	private int total;
	
	/**
	 * Constructor sets total to 0 initially
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * returns the current total
	 * @return total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * adds value to total
	 * @param value    value to add
	 */
	public void add (int value) {
		total = total + value;
	}
	/**
	 * subtracts value from total
	 * @param value    value to subtract
	 */
	public void subtract (int value) {
		total = total - value;
	}
	
	/**
	 * multiplies total by a value
	 * @param value    value to multiply by
	 */
	public void multiply (int value) {
		total = total * value;
	}
	
	/**
	 * divides total by a value
	 * @param value    value to divide by
	 */
	public void divide (int value) {
		if (value == 0) {
			total = 0;
		}
		else {
			total = total / value;
		}
	}
	
	/**
	 * keep track of operations on total as a string
	 * @return    string of operations performed
	 */
	public String getHistory () {
		return "";
	}
}