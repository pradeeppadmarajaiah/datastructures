package com.bit_i_know.array_list;

import java.util.Arrays;

/**
 * Custom Array creation.
 * 
 * @author pradeep
 *
 * @param <E>
 */
public class PradeepArayList<E> {

	transient Object[] elementData;
	int size;
	int intialCapacity;

	/*
	 * Default constructor.
	 */
	public PradeepArayList() {
		elementData = new Object[10];
		intialCapacity = 10;
	}

	/**
	 * 
	 * @param initialCapacity
	 *            Initial Capacity of the array.
	 */
	public PradeepArayList(int initialCapacity) {
		if (initialCapacity > 0) {
			elementData = new Object[initialCapacity];
			this.intialCapacity = initialCapacity;
		}

	}

	/**
	 * 
	 * @return Size of the array.
	 */
	public int size() {
		return size;
	}

	/**
	 * Get the value at specific position.
	 * 
	 * @param index
	 * @return
	 */
	public E get(int index) {
		return (E) elementData[index];
	}

	/**
	 * Add the value. Check the current size of the existing array. if it is
	 * about to fill, create a new array and assign it back.
	 * 
	 * @param e
	 */
	public void add(E e) {
		if (size >= intialCapacity) {
			intialCapacity = (elementData.length * 3) / 2 + 1;
			elementData = Arrays.copyOf(elementData, intialCapacity);
		}
		elementData[size++] = e;

	}

	public Object remove(int index) {
		Object removedObject = elementData[index];
		for (int i = index; i < size; i++) {
			elementData[i] = elementData[i + 1];
		}
		size--;
		return removedObject;
	}

	@Override
	public String toString() {
		return "PradeepArayList [" + (elementData != null ? "elementData=" + Arrays.toString(elementData) : "") + "]";
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		PradeepArayList<String> list = new PradeepArayList<>(2);
		list.add("P");
		list.add("Pradeep");
		list.add(" IBM ");
		System.out.println(list.size());
		System.out.println(list);

	}

}
