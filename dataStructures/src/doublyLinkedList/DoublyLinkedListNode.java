package doublyLinkedList;

public class DoublyLinkedListNode<T> {

	private Integer key;
	private T value;
	private DoublyLinkedListNode<T> previous;
	private DoublyLinkedListNode<T> next;

	public DoublyLinkedListNode() {
		this.key = null;
		this.value = null;
		this.previous = null;
		this.next = null;
	}

	public DoublyLinkedListNode(T newElement) {
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

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public DoublyLinkedListNode<T> getPrevious() {
		return previous;
	}

	public void setPrevious(DoublyLinkedListNode<T> previous) {
		this.previous = previous;
	}

	public DoublyLinkedListNode<T> getNext() {
		return next;
	}

	public void setNext(DoublyLinkedListNode<T> next) {
		this.next = next;
	}
}
