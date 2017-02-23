package hashTable;

import static org.junit.Assert.*;

import org.junit.Test;

import doublyLinkedList.DoublyLinkedList;

public class HashTableTest {
	
	@Test
	public void testHashTableDelete() {
		HashTable hT = new HashTable(DoublyLinkedList.class);
		
		hT.insert("adroit");
		hT.insert("indulgent");
		hT.insert("admonish");
		hT.insert("viable");
		
		assertEquals("indulgent", hT.delete("indulgent"));
		assertNull(hT.search("indulgent"));
		assertEquals("viable", hT.search("viable"));
	}
	
	@Test
	public void testHashTableInsertAndSearch() {
		HashTable hT = new HashTable(DoublyLinkedList.class);
		
		hT.insert("adroit");
		
		assertEquals("adroit", hT.search("adroit"));
		
		hT.insert("indulgent");
		
		assertEquals("indulgent", hT.search("indulgent"));
	}

	@Test
	public void testHashTableConstructor() {
		HashTable hT = new HashTable(DoublyLinkedList.class);
		
		assertNotNull("hT getArray should not be null.", hT);
	}

}
