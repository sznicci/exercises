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

	protected static DoublyLinkedListNode add(Integer newElement, DoublyLinkedListNode node) {
		DoublyLinkedListNode newItem = new DoublyLinkedListNode(newElement);

		if (node == null) {
			return newItem;
		} else {
			newItem.setKey(node.key + 1);
			newItem.setPrevious(node);
			node.setNext(newItem);

			return newItem;
		}

	}

	protected static void removeLast(DoublyLinkedListNode node) {
		if (node == null) {
			return;
		} else if (node.previous == null) {
			node = null;
		} else {
			node.previous.next = null;
			node = node.previous;
		}
	}
	
//	protected static void remove(Integer element, DoublyLinkedListNode node) {
//		DoublyLinkedListNode current = node;
//		Integer key = find(element, node);
//		
//		if (current == null) {
//			return;
//		} else if (key.equals(0)) {
//			
//		} else {
//			while (current != null) {
//				if (current.value.equals(element)) {
//				}
//			}
//		}
//	}

	protected static Integer find(Integer element, DoublyLinkedListNode node) {
		DoublyLinkedListNode current = node;

		if (current == null) {
			return -1;
		} else {
			while (current != null) {
				if (current.value.equals(element)) {
					return current.key;
				}
				current = current.next;
			}
			return -1;
		}

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
