package doublyLinkedList;

import static org.junit.Assert.*;

import org.junit.Test;

public class DoublyLinkedListTest {

	@Test
	public void doublyLinkedListCreateEmptytest() {
		DoublyLinkedList lList1 = new DoublyLinkedList();

		assertNull("lList1 head should be null.", lList1.getHead());
	}

	@Test
	public void doublyLinkedListCreateOneElement() {
		DoublyLinkedList lList2 = new DoublyLinkedList(3);

		assertEquals("lList2 head value should be 3.", new Integer(3), lList2.getHead().getValue());
		assertEquals("lList2 tail value should be 3.", new Integer(3), lList2.getTail().getValue());

		assertEquals("lList2 head key should be 0.", new Integer(0), lList2.getHead().getKey());
		assertEquals("lList2 tail key should be 0.", new Integer(0), lList2.getTail().getKey());
	}

	@Test
	public void doublyLinkedListAddToEmptyListTest() {
		DoublyLinkedList lList3 = new DoublyLinkedList();

		lList3.add(5);

		assertEquals("lList3 head value should be 5.", new Integer(5), lList3.getHead().getValue());
		assertEquals("lList3 tail value should be 5.", new Integer(5), lList3.getTail().getValue());
	}

	@Test
	public void doublyLinkedListAddToNotEmptyListTest() {
		DoublyLinkedList lList4 = new DoublyLinkedList(100);

		// One element
		lList4.add(27);

		assertEquals("lList4 head value should be 100.", new Integer(100), lList4.getHead().getValue());
		assertEquals("lList4 head key should be 0.", new Integer(0), lList4.getHead().getKey());

		assertEquals("lList4 tail value should be 27.", new Integer(27), lList4.getTail().getValue());
		assertEquals("lList4 tail key should be 1.", new Integer(1), lList4.getTail().getKey());

		// Two elements
		lList4.add(39);

		assertNull("lList4 head previous should be null.", lList4.getHead().getPrevious());

		assertEquals("lList4 head value should be 100.", new Integer(100), lList4.getHead().getValue());
		assertEquals("lList4 head key should be 0.", new Integer(0), lList4.getHead().getKey());

		assertEquals("lList4 head next value should be 27.", new Integer(27), lList4.getHead().getNext().getValue());
		assertEquals("lList4 head next key should be 1.", new Integer(1), lList4.getHead().getNext().getKey());

		assertEquals("lList4 tail previous value should be 27.", new Integer(27),
				lList4.getTail().getPrevious().getValue());
		assertEquals("lList4 tail previous key should be 1.", new Integer(1), lList4.getTail().getPrevious().getKey());

		assertEquals("lList4 tail value should be 39.", new Integer(39), lList4.getTail().getValue());
		assertEquals("lList4 tail key should be 2.", new Integer(2), lList4.getTail().getKey());

		assertNull("lList4 tail next should be null.", lList4.getTail().getNext());
	}

	@Test
	public void removeLastFromEmptyListTest() {
		DoublyLinkedList lList5 = new DoublyLinkedList();

		lList5.removeLast();
		assertNull("lList5 head should be null.", lList5.getHead());
		assertNull("lList5 tail should be null.", lList5.getTail());
	}

	@Test
	public void removeLastFromNotEmptyList() {
		DoublyLinkedList lList6 = new DoublyLinkedList(100);

		// One element
		lList6.removeLast();

		assertNull("lList6 head should be null.", lList6.getHead());
		assertNull("lList6 tail should be null.", lList6.getTail());

		// Two elements
		lList6.add(3);
		lList6.add(45);

		lList6.removeLast();

		assertEquals("lList6 head value should be 3.", new Integer(3), lList6.getHead().getValue());
		assertEquals("lList6 tail value should be 3.", new Integer(3), lList6.getTail().getValue());

		assertNull("lList6 head previous should be null.", lList6.getHead().getPrevious());
		assertNull("lList6 head next should be null.", lList6.getHead().getNext());
		assertNull("lList6 tail previous should be null.", lList6.getTail().getPrevious());
		assertNull("lList6 tail next should be null.", lList6.getTail().getNext());

		// More than two elements
		lList6.add(23);
		lList6.add(34);
		lList6.add(67);

		lList6.removeLast();

		assertEquals("lList6 head value should be 3.", new Integer(3), lList6.getHead().getValue());

		assertEquals("lList6 head next value should be 23.", new Integer(23), lList6.getHead().getNext().getValue());

		assertEquals("lList6 tail value should be 34.", new Integer(34), lList6.getTail().getValue());

		assertEquals("lList6 tail previous value should be 23.", new Integer(23),
				lList6.getTail().getPrevious().getValue());

		assertNull("lList6 tail next should be null.", lList6.getTail().getNext());
	}

	@Test
	public void findInEmptyList() {
		DoublyLinkedList lList7 = new DoublyLinkedList();

		assertEquals("lList7 find 6 should be -1.", new Integer(-1), lList7.find(6));
	}

	@Test
	public void findInNotEmptyList() {
		DoublyLinkedList lList8 = new DoublyLinkedList(12);

		// One element
		assertEquals("lList8 find 12 should be 0.", new Integer(0), lList8.find(12));
		assertEquals("lList8 find 6 should be -1.", new Integer(-1), lList8.find(6));

		// Two elements
		lList8.add(15);

		assertEquals("lList8 find 12 should be 0.", new Integer(0), lList8.find(12));
		assertEquals("lList8 find 15 should be 1.", new Integer(1), lList8.find(15));
		assertEquals("lList8 find 6 should be -1.", new Integer(-1), lList8.find(6));

		// More than two elements
		lList8.add(23);
		lList8.add(34);
		lList8.add(67);

		assertEquals("lList8 find 12 should be 0.", new Integer(0), lList8.find(12));
		assertEquals("lList8 find 15 should be 1.", new Integer(1), lList8.find(15));
		assertEquals("lList8 find 23 should be 2.", new Integer(2), lList8.find(23));
		assertEquals("lList8 find 34 should be 3.", new Integer(3), lList8.find(34));
		assertEquals("lList8 find 67 should be 4.", new Integer(4), lList8.find(67));
		assertEquals("lList8 find 6 should be -1.", new Integer(-1), lList8.find(6));

	}

}
