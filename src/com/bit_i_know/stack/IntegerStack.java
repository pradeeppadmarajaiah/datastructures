package com.bit_i_know.stack;

/**
 * 
 * @author pradeep
 * 
 *         Inspired by the book "Algorithms, 4th Edition"
 * 
 * @see <a href="http://algs4.cs.princeton.edu/home/">Algorithms, 4th
 *      Edition</a>
 * 
 *
 */
public class IntegerStack {

	private int[] stack;
	private int intialcapacity = 10;
	private int size;

	/**
	 * Default constructor.
	 */
	public IntegerStack() {
		stack = new int[intialcapacity];
	}

	/**
	 * Constructor where intialcapacity is specified by the user.
	 */
	public IntegerStack(int intialcapacity) {
		stack = new int[intialcapacity];
	}

	/**
	 * Add int to the stack.
	 * 
	 * @param value
	 */
	public void push(int value) {
		stack[size++] = value;
	}

	/**
	 * Remove int from the stack.
	 * 
	 * @param value
	 */
	public int pop() {
		return stack[--size];
	}

	/**
	 * Check if stack is empty.
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * Check the size of stack.
	 * 
	 * @return
	 */
	public int size() {
		return size;
	}

	/**
	 * Test the stack.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		IntegerStack stack = new IntegerStack();
		System.out.println("Initial size is  : " + stack.size);

		stack.push(100);
		stack.push(200);
		System.out.println("After adding : " + stack.size);

		int removedValue = stack.pop();
		System.out.println("After removing : " + stack.size);
		System.out.println("Removed value is : " + removedValue);

		System.out.println("Is stack Empty ??? : " + stack.isEmpty());

	}

}
