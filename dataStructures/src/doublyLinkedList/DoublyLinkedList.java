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
		DoublyLinkedListNode newItem = new DoublyLinkedListNode(newElement);

		if (head == null) {
			head = newItem;
			tail = head;
			return;
		}

		newItem.setKey(tail.getKey() + 1);
		tail.setNext(newItem);
		newItem.setPrevious(tail);
		tail = newItem;
	}
	
	public void addAsFirst(Integer newElement) {
		DoublyLinkedListNode newItem = new DoublyLinkedListNode(newElement);
		
		if (head == null) {
			add(newElement);
			return;
		}
				
		newItem.setNext(head);
		head.setPrevious(newItem);
		head = newItem;
	}

	public void insertAfter(Integer key, Integer newElement) {
		DoublyLinkedListNode current = head;
		DoublyLinkedListNode newItem = new DoublyLinkedListNode(newElement);

		if (current == null) {
			return;
		} else if (tail.getKey().equals(key)) {
			newItem.setKey(tail.getKey() + 1);
			tail.setNext(newItem);
			newItem.setPrevious(tail);
			tail = newItem;
			return;
		}
		while (!current.getKey().equals(key)) {
			current = current.getNext();
		}

		newItem.setKey(current.getKey() + 1);
		current.getNext().setPrevious(newItem);
		newItem.setNext(current.getNext());
		current.setNext(newItem);
		newItem.setPrevious(current);

		DoublyLinkedListNode currentForKeysUpdate = newItem.getNext();
		while (currentForKeysUpdate != null) {
			currentForKeysUpdate.setKey(currentForKeysUpdate.getKey() + 1);
			currentForKeysUpdate = currentForKeysUpdate.getNext();
		}

	}

	public Integer removeLast() {
		if (head == null) {
			return null;
		} else if (head == tail) {
			Integer removeItem = tail.getValue();
			head = null;
			tail = null;
			return removeItem;
		}

		Integer removeItem = tail.getValue();

		tail = tail.getPrevious();
		tail.setNext(null);

		return removeItem;
	}

	public Integer find(Integer element) {
		DoublyLinkedListNode current = head;

		if (current == null) {
			return -1;
		}

		while (!current.getValue().equals(element)) {
			if (current == tail) {
				return -1;
			}
			current = current.getNext();
		}

		return current.getKey();
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
