package stacks;

import static org.junit.Assert.*;

import org.junit.Test;

public class StackWithLinkedListTest {
	
	@Test
	public void stackWithLinkedListPopTest() {
		StackWithLinkedList sList1 = new StackWithLinkedList();

		assertNull("sList1 list pop should be null", sList1.pop());
		
		sList1.push(15);
		assertEquals("sList1 list pop should be 15", new Integer(15), sList1.pop());
		
		sList1.push(23);
		sList1.push(45);
		assertEquals("sList1 list pop should be 45", new Integer(45), sList1.pop());
	}
	
	@Test
	public void stackWithLinkedListPeekTest() {
		StackWithLinkedList sList1 = new StackWithLinkedList();

		assertNull("sList1 list peek should be null", sList1.peek());
	}

	@Test
	public void stackWithLinkedListPushTest() {
		StackWithLinkedList sList1 = new StackWithLinkedList();

		sList1.push(15);
		assertEquals("sList1 list peek should be 15", new Integer(15), sList1.peek());

		sList1.push(23);
		assertEquals("sList1 list peek should be 23", new Integer(23), sList1.peek());

		sList1.push(45);
		assertEquals("sList1 list peek should be 45", new Integer(45), sList1.peek());
	}

	@Test
	public void stackWithLinkedListCreateTest() {
		StackWithLinkedList sList1 = new StackWithLinkedList();

		assertNull("sList1 list peek should be null.", sList1.peek());

		StackWithLinkedList sList2 = new StackWithLinkedList(15);

		assertEquals("sList2 list peek should be 15", new Integer(15), sList2.peek());
	}

}
