package singlyLinkedList;

public class SinglyLinkedListNode {
	
	private Integer value;
	private SinglyLinkedListNode next;
	
	public SinglyLinkedListNode() {
		value = null;
		next = null;
	}
	
	public SinglyLinkedListNode(Integer newValue) {
		value = newValue;
		next = null;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public SinglyLinkedListNode getNext() {
		return next;
	}

	public void setNext(SinglyLinkedListNode next) {
		this.next = next;
	}

}
