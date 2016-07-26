/**
 * 
 */
package com.bit_i_know.queue;

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
public class QueueImplementationUsingLinkedList<Item> {
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
	 * Three instance variable for referencing the first node and to store the
	 * size of the linked list.
	 * 
	 */
	private Node first; // remove for first.
	private Node last; // Add to last .
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
	 * Adding an item.
	 * 
	 * 
	 * Current last will become oldLast. oldLast.next will be referred to
	 * newLast newLast.next will be null
	 * 
	 * @param item
	 */
	public void enqueue(Item item) {
		Node oldLast = last;
		last = new Node();
		last.item = item;
		last.next = null;

		if (isEmpty()) {
			first = last;
		} else {
			oldLast.next = last;
		}
		size++;
	}

	/**
	 * Removing an item.
	 * 
	 * 
	 * Similar to stack.
	 * 
	 * @param item
	 */
	public Item dequeue() {
		Item dequeuedItem = first.item;
		first = first.next;
		size--;
		if (isEmpty()) {
			last = null;
		}
		return dequeuedItem;
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
	 * @param args
	 */
	public static void main(String[] args) {
		QueueImplementationUsingLinkedList<Integer> queue = new QueueImplementationUsingLinkedList<>();

		System.out.println("Queue size is : " + queue.size);
		System.out.println("Is Queue empty: " + queue.isEmpty());

		// Adding 100 first and 200 next.
		queue.enqueue(100);
		queue.enqueue(200);

		System.out.println("Queue size is : " + queue.size);
		System.out.println("Is Queue empty: " + queue.isEmpty());

		// First in First out.
		int removedItem = queue.dequeue();
		System.out.println("Item removed: " + removedItem);
		System.out.println("Queue size is : " + queue.size);
		System.out.println("Is Queue empty: " + queue.isEmpty());

	}

}
