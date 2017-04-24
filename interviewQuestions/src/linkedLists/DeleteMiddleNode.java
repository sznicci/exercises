package linkedLists;

import singlyLinkedList.LinkedListNode;
import singlyLinkedList.SinglyLinkedList;

public class DeleteMiddleNode {
	
	public static SinglyLinkedList deleteMiddleNode(SinglyLinkedList list, Integer c) {
		LinkedListNode current = list.getHead();
		
		if (current.getValue() == c) {
			return list;
		}
		
		while (current.getNext().getValue() != c) {
			current = current.getNext();
		}
		
		if (current.getNext().getNext() == null) {
			return list;
		}
		
		current.setNext(current.getNext().getNext());
		
		return list;
	}

}
