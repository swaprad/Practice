package org;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();

		// Adding elements to the linked list
		ll.add("A"); //A
		ll.add("B"); // A B
		ll.addLast("C"); // A B C
		ll.addFirst("D"); // D A B C
		ll.add(2, "E"); // D A B E C

		System.out.println(ll); // D A B E C

		ll.remove("B"); // D A E C
		ll.remove(3); // D A E 
		ll.removeFirst(); // A E
		ll.removeLast(); // A

		System.out.println(ll);
	}

}
