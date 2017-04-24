package linkedLists;

import static org.junit.Assert.*;

import org.junit.Test;

import singlyLinkedList.SinglyLinkedList;

public class ReturnKthToLastTest {

	@Test
	public void testReturnKthToLast() {
		SinglyLinkedList list = new SinglyLinkedList(7);

		list.add(3);
		list.add(6);
		list.add(8);
		list.add(1);
		list.add(0);
		list.add(5);
		list.add(2);
		list.add(4);

		assertEquals(new Integer(5), ReturnKthToLast.returnKthToLast(list, 3).getValue());
	}

}
