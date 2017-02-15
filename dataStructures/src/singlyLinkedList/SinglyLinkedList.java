package singlyLinkedList;

public class SinglyLinkedList {

	private LinkedListNode head;
	
	public SinglyLinkedList() {
		head = null;
	}
	
	public SinglyLinkedList(Integer newElement) {
		head = new LinkedListNode(newElement);
	}
	
	public void add(Integer newElement) {
		LinkedListNode newItem = new LinkedListNode(newElement);
		LinkedListNode current = head;
		
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
		LinkedListNode current = head;
		
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
	
	public void insertAfter(Integer place, Integer element) {
		LinkedListNode current = head;
		Integer count = new Integer(0);
		
		if (head == null) {
			head = new LinkedListNode(element);
		} else {
			while (current != null) {
				if (count.equals(place)) {
					LinkedListNode newItem = new LinkedListNode(element);
					
					newItem.setNext(current.getNext());
					current.setNext(newItem);
				}
				current = current.getNext();
				count++;
			}
		}
	}
	
	public Integer find(Integer element) {
		LinkedListNode current = head;
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
	
	public LinkedListNode getLastElement() {
		LinkedListNode current = head;
		
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

	public LinkedListNode getHead() {
		return head;
	}

	public void setHead(LinkedListNode head) {
		this.head = head;
	}

}
