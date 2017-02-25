package doublyLinkedList;

public class DoublyLinkedList<T> {

	private DoublyLinkedListNode<T> head;
	private DoublyLinkedListNode<T> tail;

	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public DoublyLinkedList(T newElement) {
		this.head = new DoublyLinkedListNode<T>(newElement);
		this.tail = this.head;
	}

	public void add(T newElement) {
		DoublyLinkedListNode<T> newItem = new DoublyLinkedListNode<T>(newElement);

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

	public void addAsFirst(T newElement) {
		DoublyLinkedListNode<T> newItem = new DoublyLinkedListNode<T>(newElement);

		if (head == null) {
			add(newElement);
			return;
		}

		newItem.setNext(head);
		head.setPrevious(newItem);
		head = newItem;
	}

	public void insertAfter(Integer key, T newElement) {
		DoublyLinkedListNode<T> current = head;
		DoublyLinkedListNode<T> newItem = new DoublyLinkedListNode<T>(newElement);

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

		DoublyLinkedListNode<T> currentForKeysUpdate = newItem.getNext();
		while (currentForKeysUpdate != null) {
			currentForKeysUpdate.setKey(currentForKeysUpdate.getKey() + 1);
			currentForKeysUpdate = currentForKeysUpdate.getNext();
		}

	}

	public T removeLast() {
		if (head == null) {
			return null;
		} else if (head == tail) {
			T removeItem = tail.getValue();
			head = null;
			tail = null;
			return removeItem;
		}

		T removeItem = tail.getValue();

		tail = tail.getPrevious();
		tail.setNext(null);

		return removeItem;
	}

	public T remove(T element) {
		DoublyLinkedListNode<T> current = head;
		
		if (current == null) {
			return null;
		}

		while (!current.getValue().equals(element)) {
			if (current == tail && !current.getValue().equals(element)) {
				return null;
			}
			current = current.getNext();
		}
		
		if (current == head && head == tail) {
			head = null;
			tail = null;
			return current.getValue();
		}
		
		if (current.getNext() != null) {
			current.getNext().setPrevious(current.getPrevious());
			if (current == head) {
				head = current.getNext();
			}
			updateKey(current);
		}
		
		if (current.getPrevious() != null) {
			current.getPrevious().setNext(current.getNext());
			if (current == tail) {
				tail = current.getPrevious();
			}
		}

		return current.getValue();
	}
	
	private void updateKey(DoublyLinkedListNode<T> current) {
		current = current.getNext();
		
		while (current != null) {
			current.setKey(current.getKey() - 1);
			current = current.getNext();
		}
	}

	public Integer find(T element) {
		DoublyLinkedListNode<T> current = head;

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

	public DoublyLinkedListNode<T> getHead() {
		return head;
	}

	public void setHead(DoublyLinkedListNode<T> head) {
		this.head = head;
	}

	public DoublyLinkedListNode<T> getTail() {
		return tail;
	}

	public void setTail(DoublyLinkedListNode<T> tail) {
		this.tail = tail;
	}

}
