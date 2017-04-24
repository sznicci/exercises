package linkedLists;

import static org.junit.Assert.*;

import org.junit.Test;

import singlyLinkedList.SinglyLinkedList;

public class DeleteMiddleNodeTest {

	@Test
	public void testDeleteMiddleNode() {
		
		SinglyLinkedList list = new SinglyLinkedList(7);

		list.add(3);
		list.add(6);
		list.add(8);
		list.add(1);
		list.add(0);
		list.add(5);
		list.add(2);
		list.add(4);
		
		assertEquals("7, 3, 6, 8, 0, 5, 2, 4, ", DeleteMiddleNode.deleteMiddleNode(list, 1).listToString());
		assertEquals("7, 3, 6, 8, 0, 5, 4, ", DeleteMiddleNode.deleteMiddleNode(list, 2).listToString());
		assertEquals("7, 6, 8, 0, 5, 4, ", DeleteMiddleNode.deleteMiddleNode(list, 3).listToString());
	}

	@Test
	public void testDeleteMiddleNodeFromBeginning() {
		
		SinglyLinkedList list = new SinglyLinkedList(7);

		list.add(3);
		list.add(6);
		list.add(8);
		list.add(1);
		list.add(0);
		list.add(5);
		list.add(2);
		list.add(4);
		
		assertEquals("7, 3, 6, 8, 1, 0, 5, 2, 4, ", DeleteMiddleNode.deleteMiddleNode(list, 7).listToString());
	}
	
	@Test
	public void testDeleteMiddleNodeFromEnd() {
		
		SinglyLinkedList list = new SinglyLinkedList(7);

		list.add(3);
		list.add(6);
		list.add(8);
		list.add(1);
		list.add(0);
		list.add(5);
		list.add(2);
		list.add(4);
		
		assertEquals("7, 3, 6, 8, 1, 0, 5, 2, 4, ", DeleteMiddleNode.deleteMiddleNode(list, 4).listToString());
	}
	
}
