/**
 * 
 */
package com.bit_i_know.stack;

/**
 * Stack Implementation Using LinkedList.
 * 
 * @author pradeep
 * 
 *         Example : to add a integer value 100, 200, 300 when 100 is added.
 * 
 * 
 *         Inspired by the book "Algorithms, 4th Edition"
 * 
 * @see <a href="http://algs4.cs.princeton.edu/home/">Algorithms, 4th
 *      Edition</a>
 *
 */
public class StackImplementationUsingLinkedList<Item> {
	/**
	 * 
	 * @author pradeep
	 * 
	 *         Internal class for creating a linked list , which contains a data
	 *         (Item) and reference to next node.
	 */
	private class Node {
		Item item;
		Node next;
	}

	/**
	 * Two instance variable for referencing the first node and to store the
	 * size of the linked list.
	 * 
	 */
	private Node first;
	private int size;

	/**
	 * Check if list is empty. Since Node "first" is used to build the list
	 * which acts similar as an array of Item[] when creating via Arrays.
	 * 
	 * @return boolean value true if first node is empty.
	 */
	public boolean isEmpty() {
		return first == null;
	}

	/**
	 * Size of the list.
	 * 
	 * @return int .
	 */
	int size() {
		return size;
	}

	/**
	 * Pushing an item in to stack.
	 * 
	 * Save the current first node to temp node. Create a new node.Assign item
	 * and new node.next to temp node. Increase the size;
	 * 
	 * @param item
	 */
	public void push(Item item) {
		Node oldFirst = first;
		first = new Node();
		first.item = item;
		first.next = oldFirst;
		size++;

	}

	/**
	 * Save the first item to temp Item. Assign first reference of node to
	 * second reference .That is node.next
	 * 
	 * @return removed Item value.
	 */
	public Item pop() {
		Item poppedItem = first.item;
		first = first.next;
		size--;
		return poppedItem;
	}

	public static void main(String[] args) {
		StackImplementationUsingLinkedList<Integer> stack = new StackImplementationUsingLinkedList<>();
		System.out.println("Initial size is : " + stack.size);
		System.out.println("check is empty: " + stack.isEmpty());
		stack.push(100);
		stack.push(200);
		System.out.println("Afer adding : " + stack.size);
		System.out.println("check is empty: " + stack.isEmpty());
		int popped = stack.pop();
		System.out.println("Removed value is : " + popped);
		System.out.println("Afer removing : " + stack.size);
		System.out.println("check is empty: " + stack.isEmpty());

		stack.push(100);
		stack.push(200);
	}

}
