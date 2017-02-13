package doublyLinkedList;

public class DoublyLinkedList {

	private DoublyLinkedListNode head;
	private DoublyLinkedListNode tail;

	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public DoublyLinkedList(Integer newElement) {
		this.head = new DoublyLinkedListNode(newElement);
		this.tail = this.head;
	}

	public void add(Integer newElement) {
		if (this.head == null) {
			this.head = DoublyLinkedListNode.add(newElement, this.head);
			this.tail = this.head;
		} else {
			this.tail = DoublyLinkedListNode.add(newElement, this.tail);

		}
	}

	public void removeLast() {
		if (this.head == null) {
			return;
		} else if (this.head == this.tail) {
			DoublyLinkedListNode.removeLast(this.tail);
			this.head = null;
			this.tail = null;
		} else {
			DoublyLinkedListNode.removeLast(this.tail);
			this.tail = this.tail.getPrevious();
		}
	}

	public Integer find(Integer element) {
		return DoublyLinkedListNode.find(element, this.head);
	}

	public DoublyLinkedListNode getHead() {
		return head;
	}

	public void setHead(DoublyLinkedListNode head) {
		this.head = head;
	}

	public DoublyLinkedListNode getTail() {
		return tail;
	}

	public void setTail(DoublyLinkedListNode tail) {
		this.tail = tail;
	}

}
