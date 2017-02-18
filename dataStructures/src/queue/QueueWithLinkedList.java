package queue;

import doublyLinkedList.*;

public class QueueWithLinkedList {
	
	private DoublyLinkedList list;
	
	public QueueWithLinkedList() {
		list = null;
	}
	
	public QueueWithLinkedList(Integer newElement) {
		list = new DoublyLinkedList(newElement);
	}
	
	public void enqueue(Integer newElement) {
		if (list == null) {
			list = new DoublyLinkedList(newElement);
			return;
		}
		
		list.addAsFirst(newElement);
	}
	
	public Integer dequeue() {
		if (list == null) {
			return null;
		}
		
		return list.removeLast();
	}
	
	public Integer examine() {
		if (list == null) {
			return null;
		}
		
		return list.getTail().getValue();
	}
	
	public Integer getFirst() {
		if (list == null) {
			return null;
		}
		
		return list.getHead().getValue();
	}

	public DoublyLinkedList getList() {
		return list;
	}
	
}
