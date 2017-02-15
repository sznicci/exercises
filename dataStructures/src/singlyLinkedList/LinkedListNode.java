package singlyLinkedList;


public class LinkedListNode {
	
	private Integer value;
	private LinkedListNode next;
	
	public LinkedListNode() {
		value = null;
		next = null;
	}
	
	public LinkedListNode(Integer newValue) {
		value = newValue;
		next = null;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public LinkedListNode getNext() {
		return next;
	}

	public void setNext(LinkedListNode next) {
		this.next = next;
	}

}
