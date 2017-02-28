package radixTree;

import static org.junit.Assert.*;

import org.junit.Test;

public class RadixTreeTest {

	@Test
	public void testDelete() {
		RadixTree rt = new RadixTree();

		rt.insert("00");
		rt.insert("001");
		rt.insert("01011");
		
		assertTrue(rt.delete("00"));
		assertFalse(rt.search("00"));
		assertTrue(rt.delete("01011"));
		assertFalse(rt.search("01011"));
	}

	@Test
	public void testInsertAndSearch() {
		RadixTree rt = new RadixTree();

		rt.insert("00");
		rt.insert("001");
		rt.insert("01011");

		assertTrue(rt.search("00"));
		assertTrue(rt.search("01011"));
		assertFalse(rt.search("0101"));
		assertFalse(rt.search("01"));
		assertFalse(rt.search("0"));
		assertFalse(rt.search("100000000"));
	}

}
