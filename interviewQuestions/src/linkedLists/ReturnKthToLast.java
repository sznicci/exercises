package linkedLists;

import singlyLinkedList.LinkedListNode;
import singlyLinkedList.SinglyLinkedList;

public class ReturnKthToLast {

	public static LinkedListNode returnKthToLast(SinglyLinkedList list, int k) {
		
		LinkedListNode current = list.getHead();
		LinkedListNode fast = current;
		
		for (int i = 0 ; i < k; i++) {
			if (fast.getNext() == null) {
				return null;
			}
			fast = fast.getNext();
		}
		
		while (fast != null) {
			current = current.getNext();
			fast = fast.getNext();
		}
		
		return current;
	}
	
}
