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
		if (list == null || list.getHead() == null) {
			list = new SinglyLinkedList(newElement);
			return;
		}
		
		list.add(newElement);
	}
	
	public Integer peek() {
		if (list == null || list.getHead() == null) {
			return null;
		}
		
		return list.getLastElement().getValue();
	}
	
	public Integer pop() {
		if (list == null || list.getHead() == null) {
			return null;
		}
		
		Integer popItem = list.getLastElement().getValue();
		
		list.remove();
		
		return popItem;
	}

	public SinglyLinkedList getList() {
		return list;
	}

	public void setList(SinglyLinkedList list) {
		this.list = list;
	}

}
