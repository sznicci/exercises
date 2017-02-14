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
		} else {
			newItem.setKey(tail.getKey() + 1);
			tail.setNext(newItem);
			newItem.setPrevious(tail);
			tail = newItem;

		}
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
		} else {
			while (current != null) {
				if (current.getKey().equals(key)) {
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
				current = current.getNext();
			}
		}
	}

	public void removeLast() {
		if (head == null) {
			return;
		} else if (head == tail) {
			head = null;
			tail = null;
		} else {
			tail = tail.getPrevious();
			tail.setNext(null);
		}
	}

	public Integer find(Integer element) {
		DoublyLinkedListNode current = head;

		if (current == null) {
			return -1;
		} else {
			while (current != null) {
				if (current.getValue().equals(element)) {
					return current.getKey();
				}
				current = current.getNext();
			}
			return -1;
		}
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
