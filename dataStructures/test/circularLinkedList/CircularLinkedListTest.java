package circularLinkedList;

import static org.junit.Assert.*;

import org.junit.Test;

import singlyLinkedList.LinkedListNode;

public class CircularLinkedListTest {
	
	@Test
	public void circularLinkedListFindTest() {
		// In an empty list
		CircularLinkedList cList1 = new CircularLinkedList();
		
		assertNull("cList1 find 3 should be null.", cList1.find(3));
		
		// In a list with one element
		
		cList1.add(12);
		assertEquals("cList1 find 12 should be 0.", new Integer(0), cList1.find(12));
		
		// In a list with more than one element
		cList1.add(28);
		cList1.add(78);
		assertEquals("cList1 find 28 should be 1.", new Integer(1), cList1.find(28));
		assertEquals("cList1 find 78 should be 2.", new Integer(2), cList1.find(78));
	}
	
	@Test
	public void circularLinkedListInsertAfter() {
		// Into an empty list
		CircularLinkedList cList1 = new CircularLinkedList();
		
		cList1.insertAfter(5, 13);
		assertEquals("cList1 head value should be 13.", new Integer(13), cList1.getHead().getValue());
		
		// Into a list with one element
		
		cList1.insertAfter(0, 45);
		assertEquals("cList1 lastElement value should be 45.", new Integer(45), cList1.getLastElement().getValue());
		
		// Into a list with more than one element
		cList1.add(28);
		cList1.add(78);
		
		cList1.insertAfter(1, 35);
		
	}
	
	@Test
	public void circularLinkedListRemoveTest() {
		// From an empty list
		CircularLinkedList cList1 = new CircularLinkedList();
		
		cList1.remove();
		assertNull("cList1 head should be null.", cList1.getHead());
		
		// From a list with one element
		cList1.add(15);
		
		cList1.remove();
		assertNull("cList1 head should be null.", cList1.getHead());
		
		// From a list with more than one element
		cList1.add(28);
		cList1.add(45);
		cList1.add(78);
		
		cList1.remove();
		assertEquals("cList1 lastElement value should be 45.", new Integer(45), cList1.getLastElement().getValue());
		assertEquals("cList1 lastElement next value should be 28.", new Integer(28), cList1.getLastElement().getNext().getValue());
	}
	
	@Test
	public void circularLinkedListAddTest() {
		// To an empty list
		CircularLinkedList cList1 = new CircularLinkedList();
		
		cList1.add(13);
		assertEquals("cList1 head value should be 13.", new Integer(13), cList1.getHead().getValue());
		assertEquals("cList1 head next value should be 13.", new Integer(13), cList1.getHead().getNext().getValue());
		
		// To a list with one element
		cList1.add(16);
		assertEquals("cList1 head next value should be 16.", new Integer(16), cList1.getHead().getNext().getValue());
		assertEquals("cList1 head next next value should be 13.", new Integer(13), cList1.getHead().getNext().getNext().getValue());
		
		// To a list with more than one element
		cList1.add(28);
		assertEquals("cList1 astElement value should be 28.", new Integer(28),cList1.getLastElement().getValue());
		
		cList1.add(46);
		assertEquals("cList1 lastElement value should be 46.", new Integer(46), cList1.getLastElement().getValue());
	}

	@Test
	public void circularLinkedListCreateTest() {
		CircularLinkedList cList1 = new CircularLinkedList();
		
		assertNull("cList1 head should be null.", cList1.getHead());
		
		cList1.setHead(new LinkedListNode(12));
		assertEquals("cList1 head value should be 12.", new Integer(12), cList1.getHead().getValue());
		
		CircularLinkedList cList2 = new CircularLinkedList(5);
		
		assertEquals("cList2 head value should be 5.", new Integer(5), cList2.getHead().getValue());
		assertEquals("cList2 head next value should be 5.", new Integer(5), cList2.getHead().getNext().getValue());
	}

}
