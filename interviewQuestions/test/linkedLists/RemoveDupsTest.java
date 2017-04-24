package linkedLists;

import static org.junit.Assert.*;

import org.junit.Test;

import singlyLinkedList.SinglyLinkedList;

public class RemoveDupsTest {

	@Test
	public void testRemoveDups() {
		SinglyLinkedList list = new SinglyLinkedList(5);
		
		list.add(5);
		list.add(6);
		list.add(6);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(3);
		
		assertEquals("5, 6, 1, 2, 3, ", RemoveDups.removeDups(list).listToString());
	}
	
	@Test
	public void testRemoveDupsFromtheBeginning() {
		SinglyLinkedList list = new SinglyLinkedList(5);
		
		list.add(5);
		list.add(6);
		list.add(1);
		list.add(2);
		list.add(3);
		
		assertEquals("5, 6, 1, 2, 3, ", RemoveDups.removeDups(list).listToString());
	}
	
	@Test
	public void testRemoveDupsDuplicatesFromTheEnd() {
		SinglyLinkedList list = new SinglyLinkedList(5);
		
		list.add(6);
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(3);
		
		assertEquals("5, 6, 1, 2, 3, ", RemoveDups.removeDups(list).listToString());
	}
	
	@Test
	public void testRemoveDupsFromListWithOneElement() {
		SinglyLinkedList list = new SinglyLinkedList(5);
		
		assertEquals("5, ", RemoveDups.removeDups(list).listToString());
	}
	
	@Test
	public void testRemoveDupsFromEmpty() {
		SinglyLinkedList list = new SinglyLinkedList();
		
		assertEquals("", RemoveDups.removeDups(list).listToString());
	}

}
