package stacks;

import singlyLinkedList.*;

public class StackWithLinkedList {
	
	private SinglyLinkedList list;
	
	public StackWithLinkedList() {
		list = null;
	}
	
	public StackWithLinkedList(Integer newElement) {
		list = new SinglyLinkedList(newElement);
	}
	
	public void push(Integer newElement) {
		if (list == null) {
			list = new SinglyLinkedList(newElement);
			return;
		}
		
		list.addAsFirst(newElement);
	}
	
	public Integer peek() {
		if (list == null || list.getHead() == null) {
			return null;
		}
		
		return list.getHead().getValue();
	}
	
	public Integer pop() {
		if (list == null || list.getHead() == null) {
			return null;
		}
		
		Integer popItem = peek();
		
		list.removeFirst();
		
		return popItem;
	}

}
