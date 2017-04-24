package linkedLists;

import singlyLinkedList.LinkedListNode;
import singlyLinkedList.SinglyLinkedList;

public class RemoveDups {

	public static SinglyLinkedList removeDups(SinglyLinkedList list) {
		LinkedListNode current = list.getHead();
		LinkedListNode secondCurrent = current;

		while (current != null) {
			while (secondCurrent.getNext() != null) {
				if (secondCurrent.getNext().getValue() == current.getValue()) {
					secondCurrent.setNext(secondCurrent.getNext().getNext());
					continue;
				}
				secondCurrent = secondCurrent.getNext();
			}
			current = current.getNext();
			secondCurrent = current;
		}

		return list;
	}

}
