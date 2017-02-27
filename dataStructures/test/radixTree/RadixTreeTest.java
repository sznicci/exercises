package radixTree;

import static org.junit.Assert.*;

import java.security.InvalidParameterException;

import org.junit.Test;

public class RadixTreeTest {

	@Test
	public void testDelete() {
		RadixTree rt = new RadixTree();

		rt.insert("00");
		
		assertTrue(rt.delete("00"));
		assertFalse(rt.search("00"));
	}

	@Test(expected = InvalidParameterException.class)
	public void testInsertAndSearchLongString() {
		RadixTree rt = new RadixTree();

		rt.insert("10000");
		rt.search("10000");
		rt.search("011110");
	}

	@Test
	public void testInsertAndSearch() {
		RadixTree rt = new RadixTree();

		rt.insert("00");
//		rt.insert("001");

//		assertTrue(rt.search("00"));
		assertFalse(rt.search("01"));
		assertFalse(rt.search("0"));
		assertFalse(rt.search("10"));
	}

}
