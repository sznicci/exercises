package circularLinkedList;

import singlyLinkedList.LinkedListNode;

public class CircularLinkedList {

	LinkedListNode head;

	public CircularLinkedList() {
		head = null;
	}

	public CircularLinkedList(Integer newElement) {
		head = new LinkedListNode(newElement);
		head.setNext(head);
	}

	public void add(Integer newElement) {
		LinkedListNode newItem = new LinkedListNode(newElement);
		LinkedListNode current = head;

		if (head == null) {
			head = newItem;
			head.setNext(head);
			return;
		} else if (current.getNext() == head) {
			newItem.setNext(head);
			current.setNext(newItem);
			return;
		}

		current = current.getNext();
		while (current.getNext() != head) {
			current = current.getNext();
		}
		newItem.setNext(current.getNext());
		current.setNext(newItem);
	}

	public void insertAfter(Integer place, Integer newElement) {
		LinkedListNode current = head;
		Integer count = new Integer(0);
		LinkedListNode newItem = new LinkedListNode(newElement);

		if (head == null) {
			head = newItem;
			head.setNext(head);
			return;
		} else if (current.getNext() == head) {
			newItem.setNext(head);
			current.setNext(newItem);
			return;
		}

		while (!count.equals(place)) {
			current = current.getNext();
			count++;
		}

		if (current.getNext() != head) {
			newItem.setNext(current.getNext());
			current.setNext(newItem);
			return;
		}

		newItem.setNext(head);
		current.setNext(newItem);
	}

	public void remove() {
		LinkedListNode current = head;

		if (head == null) {
			return;
		} else if (current.getNext() == head) {
			head = null;
			return;
		}

		while (current.getNext().getNext() != head) {
			current = current.getNext();
		}
		current.setNext(head);
	}

	public Integer find(Integer element) {
		LinkedListNode current = head;
		Integer count = new Integer(0);

		if (head == null) {
			return null;
		} else if (current.getValue().equals(element)) {
			return count;
		}

		count++;
		current = current.getNext();

		while (!current.getValue().equals(element)) {
			current = current.getNext();
			count++;
		}

		return count;
	}

	public LinkedListNode getLastElement() {
		LinkedListNode current = head;

		if (head == null) {
			return null;
		} else if (current.getNext() == head) {
			return head;
		}
		
		while (current.getNext() != head) {
			current = current.getNext();
		}

		return current;
	}

	public LinkedListNode getHead() {
		return head;
	}

	public void setHead(LinkedListNode head) {
		this.head = head;
	}
}
