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
		} else if (current.getNext() == head) {
			newItem.setNext(head);
			current.setNext(newItem);
		} else {
			current = current.getNext();
			while (current != head) {
				if (current.getNext() == head) {
					newItem.setNext(current.getNext());
					current.setNext(newItem);
					return;
				}
				current = current.getNext();
			}
		}
	}
	
	public void insertAfter(Integer place, Integer newElement) {
		LinkedListNode current = head;
		Integer count = new Integer(0);
		LinkedListNode newItem = new LinkedListNode(newElement);
		
		if (head == null) {
			head = newItem;
			head.setNext(head);
		} else if (current.getNext() == head) {
			newItem.setNext(head);
			current.setNext(newItem);
		} else {
			while (current.getNext() != head) {
				if (count.equals(place)) {
					newItem.setNext(current.getNext());
					current.setNext(newItem);
					return;
				}
				current = current.getNext();
			}
			newItem.setNext(head);
			current.setNext(newItem);
		}
	}
	
	public void remove() {
		LinkedListNode current = head;
		
		if (head == null) {
			return;
		} else if (current.getNext() == head) {
			head = null;
		} else {
			while (current.getNext() != head) {
				if (current.getNext().getNext() == head) {
					current.setNext(head);
					return;
				}
				current = current.getNext();
			}
		}
	}
	
	public Integer find(Integer element) {
		LinkedListNode current = head;
		Integer count = new Integer(0);
		
		if (head == null) {
			return null;
		} else if (current.getValue().equals(element)) {
			return count;
		} else {
			count++;
			current = current.getNext();
			while (current != head) {
				if (current.getValue().equals(element)) {
					return count;
				}
				current = current.getNext();
				count++;
			}
			return count;
		}
	}
	
	public LinkedListNode getLastElement() {
		LinkedListNode current = head;
		
		if (head == null) {
			return null;
		} else if (current.getNext() == head) {
			return head;
		} else {
			while (current.getNext() != head) {
				if (current.getNext() == head) {
					return current;
				}
				current = current.getNext();
			}
			return current;
		}
	}

	public LinkedListNode getHead() {
		return head;
	}

	public void setHead(LinkedListNode head) {
		this.head = head;
	}
}
