package queue;

import doublyLinkedList.*;

public class QueueWithLinkedList<T> {
	
	private DoublyLinkedList<T> list;
	
	public QueueWithLinkedList() {
		list = null;
	}
	
	public QueueWithLinkedList(T newElement) {
		list = new DoublyLinkedList<T>(newElement);
	}
	
	public void enqueue(T newElement) {
		if (list == null) {
			list = new DoublyLinkedList<T>(newElement);
			return;
		}
		
		list.addAsFirst(newElement);
	}
	
	public T dequeue() {
		if (list == null) {
			return null;
		}
		
		return list.removeLast();
	}
	
	public T examine() {
		if (list == null) {
			return null;
		}
		
		return list.getTail().getValue();
	}
	
	public T getFirst() {
		if (list == null) {
			return null;
		}
		
		return list.getHead().getValue();
	}

	public DoublyLinkedList<T> getList() {
		return list;
	}
	
}
