package doublyLinkedList;

public class DoublyLinkedListNode {

	private Integer key;
	private Integer value;
	private DoublyLinkedListNode previous;
	private DoublyLinkedListNode next;

	public DoublyLinkedListNode() {
		this.key = null;
		this.value = null;
		this.previous = null;
		this.next = null;
	}

	public DoublyLinkedListNode(Integer newElement) {
		this.key = new Integer(0);
		this.value = newElement;
		this.previous = null;
		this.next = null;
	}

	public Integer getKey() {
		return key;
	}

	public void setKey(Integer key) {
		this.key = key;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public DoublyLinkedListNode getPrevious() {
		return previous;
	}

	public void setPrevious(DoublyLinkedListNode previous) {
		this.previous = previous;
	}

	public DoublyLinkedListNode getNext() {
		return next;
	}

	public void setNext(DoublyLinkedListNode next) {
		this.next = next;
	}
}
