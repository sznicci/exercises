package singlyLinkedList;

import static org.junit.Assert.*;

import org.junit.Test;

public class SinglyLinkedListTest {
	
	@Test
	public void SinglyLinkedListInsertAfterTest() {
		// To empty list
		SinglyLinkedList lList1 = new SinglyLinkedList();
		
		lList1.insertAfter(5, 12);
		assertEquals("lList1 head value should be 12.", new Integer(12), lList1.getHead().getValue());
		
		// To a list with one element
		lList1.insertAfter(0, 45);
		
		assertEquals("lList1 head next value should be 45.", new Integer(45), lList1.getHead().getNext().getValue());
		
		// To a list with more than one element
		lList1.add(23);
		lList1.add(46);
		
		lList1.insertAfter(2, 35);
		assertEquals("lList1 find 35 should be 3.", new Integer(3), lList1.find(35));
		assertEquals("lList1 find 46 should be 4.", new Integer(4), lList1.find(46));
		
		lList1.insertAfter(4, 123);
		assertEquals("lList1 find 123 should be 5.", new Integer(5), lList1.find(123));
	}
	
	@Test
	public void SinglyLinkedListFindTest() {
		// In an empty list
		SinglyLinkedList lList1 = new SinglyLinkedList();
		
		assertNull("lList1 find 52 should be null.", lList1.find(52));
		
		// In a list with one element
		lList1.add(10);
		
		assertEquals("lList1 find 10 should be 0.", new Integer(0), lList1.find(10));
		
		// From a list with more than one element
		lList1.add(16);
		lList1.add(45);
		lList1.add(78);
		
		assertEquals("lList1 find 16 should be 1.", new Integer(1), lList1.find(16));
		assertEquals("lList1 find 45 should be 2.", new Integer(2), lList1.find(45));
		assertEquals("lList1 find 78 should be 3.", new Integer(3), lList1.find(78));
	}
	
	@Test
	public void SinglyLinkedListRemoveTest() {
		// From empty list
		SinglyLinkedList lList1 = new SinglyLinkedList();
		
		lList1.remove();
		assertNull("lList1 head should be null.", lList1.getHead());
		
		// From a list with one element
		lList1.add(10);
		
		lList1.remove();
		assertNull("lList1 head should be null.", lList1.getHead());
		
		// From a list with more than one element
		lList1.add(16);
		lList1.add(45);
		lList1.add(78);
		
		lList1.remove();
		assertEquals("lList1 head value should be 16.", new Integer(16), lList1.getHead().getValue());
		assertEquals("lList1 lastElement value should be 45.", new Integer(45), lList1.getLastElement().getValue());
	}
	
	@Test
	public void SinglyLinkedListAddTest() {
		// To empty list
		SinglyLinkedList lList1 = new SinglyLinkedList();
		
		lList1.add(12);
		assertEquals("lList1 head value should be 12.", new Integer(12), lList1.getHead().getValue());
		assertNull("lList1 head next should be null.", lList1.getHead().getNext());
		
		// To a list with one element
		
		lList1.add(45);
		assertEquals("lList1 head value should be 12.", new Integer(12), lList1.getHead().getValue());
		assertEquals("lList1 head next value should be 45.", new Integer(45), lList1.getHead().getNext().getValue());
		assertNull("lList1 head next next should be null.", lList1.getHead().getNext().getNext());
		
		// To a list with more than one element
		
		lList1.add(26);
		lList1.add(55);
		assertEquals("lList1 lastElement value should be 55.", new Integer(55), lList1.getLastElement().getValue());
	}
	
	@Test
	public void SinglyLinkedListGetLastElementTest() {
		// From empty list
		SinglyLinkedList lList1 = new SinglyLinkedList();
		
		assertNull("lList1 getLastElement should be null.", lList1.getLastElement());
		
		// From a list with one element
		
		lList1.add(10);
		assertEquals("lList1 getLastElement value should be 10.", new Integer(10), lList1.getLastElement().getValue());
		
		// From a list with more than one element
		
		lList1.add(16);
		lList1.add(45);
		lList1.add(78);
		assertEquals("lList1 getLastElement value should be 78.", new Integer(78), lList1.getLastElement().getValue());
	}

	@Test
	public void SinglyLinkedListNodeCreateTest() {
		SinglyLinkedListNode lList1 = new SinglyLinkedListNode();
		
		assertNull("lList1 value should be null.", lList1.getValue());
		assertNull("lList1 next should be null.", lList1.getNext());
		
		SinglyLinkedListNode lList2 = new SinglyLinkedListNode(26);
		
		assertEquals("lList2 value should be 26.", new Integer(26), lList2.getValue());
		assertNull("lList2 next should be null.", lList2.getNext());
		
		lList2.setValue(20);
		
		assertEquals("lList2 value should be 20.", new Integer(20), lList2.getValue());
	}
	
	@Test
	public void SinglyLinkedListCreateTest() {
		SinglyLinkedList lList1 = new SinglyLinkedList();
		
		assertNull("lList1 head should be null.", lList1.getHead());
		
		SinglyLinkedList lList2 = new SinglyLinkedList(15);
		
		assertEquals("lList2 head value should be 15.", new Integer(15), lList2.getHead().getValue());
		assertNull("lList2 head next should be null.", lList2.getHead().getNext());
		
		lList2.setHead(new SinglyLinkedListNode(52));
		
		assertEquals("lList2 head value should be 52.", new Integer(52), lList2.getHead().getValue());
	}

}
