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
			return;
		}

		while (current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(newItem);
	}
	
	public void addAsFirst(Integer newElement) {
		LinkedListNode newItem = new LinkedListNode(newElement);
		
		newItem.setNext(head);
		head = newItem;
	}

	public void remove() {
		LinkedListNode current = head;

		if (head == null) {
			return;
		} else if (head.getNext() == null) {
			head = null;
			return;
		}

		while (current.getNext().getNext() != null) {
			current = current.getNext();
		}
		current.setNext(null);

	}
	
	public void remove(Integer element) {
		LinkedListNode current = head;
		
		while (current.getNext().getValue() != element) {
			if (current.getNext().getValue() != element && current.getNext().getNext() == null) {
				return;
			}
			current = current.getNext();
		}
		
		current.setNext(current.getNext().getNext());
	}
	
	public void removeFirst() {
		if (head == null) {
			return;
		}
		
		head = head.getNext();
	}

	public void insertAfter(Integer place, Integer element) {
		LinkedListNode current = head;
		Integer count = new Integer(0);

		if (head == null) {
			head = new LinkedListNode(element);
			return;
		}

		while (!count.equals(place)) {
			current = current.getNext();
			count++;
		}

		LinkedListNode newItem = new LinkedListNode(element);

		newItem.setNext(current.getNext());
		current.setNext(newItem);
	}

	public Integer find(Integer element) {
		LinkedListNode current = head;
		Integer count = new Integer(0);

		if (head == null) {
			return null;
		}

		while (current != null) {
			if (current.getValue().equals(element)) {
				return count;
			}
			current = current.getNext();
			count++;
		}

		return null;
	}

	public LinkedListNode getLastElement() {
		LinkedListNode current = head;

		if (head == null || head.getNext() == null) {
			return head;
		}
		
		while (current.getNext() != null) {
			current = current.getNext();
		}
		return current;
	}
	
	public String listToString() {
		LinkedListNode current = head;
		StringBuffer sb = new StringBuffer();
		
		while (current != null) {
			sb.append(current.getValue() + ", ");
			current = current.getNext();
		}
		
		return sb.toString();
	}

	public LinkedListNode getHead() {
		return head;
	}

	public void setHead(LinkedListNode head) {
		this.head = head;
	}

}
