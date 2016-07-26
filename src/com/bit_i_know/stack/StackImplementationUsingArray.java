package com.bit_i_know.stack;

/**
 * 
 * @author pradeep
 * 
 * 
 *         Stack Implementation in generic way.
 * 
 * 
 *         Inspired by the book "Algorithms, 4th Edition"
 * 
 * @see <a href="http://algs4.cs.princeton.edu/home/">Algorithms, 4th
 *      Edition</a>
 */
public class StackImplementationUsingArray<Item> {

	/**
	 * 
	 */
	private Item[] a ;
	private int size;

	public StackImplementationUsingArray() {
		a= (Item[]) new Object[10];
		size=0;
	}
	/**
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * 
	 * @return
	 */
	public int size() {
		return size;
	}

	/**
	 * 
	 * @param size
	 */
	private void resize(int size) {
		Item[] temp = (Item[]) new Object[size];
		for (int i = 0; i < size; i++) {
			temp[i] = a[i];
		}
		a = temp;
	}

	/**
	 * 
	 * @param item
	 */
	public void push(Item item) {
		if (size == a.length)
			resize(2 * a.length);
		a[size++] = item;

	}

	/**
	 * 
	 * @return
	 */
	public Item pop() {
		Item item = a[--size];
		a[size] = null;// for garbage collection use.
		if (size > 0 && size == a.length / 4)
			resize(a.length / 2);
		return item;

	}

	public static void main(String[] args) {
		StackImplementationUsingArray<String> stack = new StackImplementationUsingArray<>();
		stack.push("Pradeep");
		stack.push("Chandan");
		System.out.println(stack.size);
		String poppedValue = stack.pop();
		System.out.println("Removed value is : " + poppedValue);
		System.out.println(stack.size);
		System.out.println(stack.isEmpty());

	}
}
