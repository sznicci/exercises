package singlyLinkedList;

public class SinglyLinkedList {

	private SinglyLinkedListNode head;
	
	public SinglyLinkedList() {
		head = null;
	}
	
	public SinglyLinkedList(Integer newElement) {
		head = new SinglyLinkedListNode(newElement);
	}
	
	public void add(Integer newElement) {
		SinglyLinkedListNode newItem = new SinglyLinkedListNode(newElement);
		SinglyLinkedListNode current = head;
		
		if (head == null) {
			head = newItem;
		} else if (head.getNext() == null) {
			head.setNext(newItem);
		} else {
			while (current != null) {
				if (current.getNext() == null) {
					current.setNext(newItem);
					return;
				}
				current = current.getNext();
			}
		}
	}
	
	public void remove() {
		SinglyLinkedListNode current = head;
		
		if (head == null) {
			return;
		} else if (head.getNext() == null) {
			head = null;
		} else {
			while (current != null) {
				if (current.getNext().getNext() == null) {
					current.setNext(null);
				}
				current = current.getNext();
			}
		}
	}
	
	public Integer find(Integer element) {
		SinglyLinkedListNode current = head;
		Integer count = new Integer(0);
		
		if (head == null) {
			return null;
		} else {
			while (current != null) {
				if (current.getValue().equals(element)) {
					return count;
				}
				current = current.getNext();
				count++;
			}
			return null;
		}
	}
	
	public SinglyLinkedListNode getLastElement() {
		SinglyLinkedListNode current = head;
		
		if (head == null || head.getNext() == null) {
			return head;
		} else {
			while (current != null) {
				if (current.getNext() == null) {
					return current;
				}
				current = current.getNext();
			}
			return current;
		}
	}

	public SinglyLinkedListNode getHead() {
		return head;
	}

	public void setHead(SinglyLinkedListNode head) {
		this.head = head;
	}

}
