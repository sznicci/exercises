package stacks;

import static org.junit.Assert.*;

import org.junit.Test;

public class StackWithArrayTest {
	
	@Test
	public void stackWithArrayPopTest() {
		StackWithArray sArray1 = new StackWithArray();
		
		assertNull("sArray1 pop should be null.", sArray1.pop());
		
		sArray1.push(15);
		assertEquals("sArray1 pop should be 15", new Integer(15), sArray1.pop());
		
		sArray1.push(23);
		sArray1.push(45);
		assertEquals("sArray1 pop should be 45", new Integer(45), sArray1.pop());
		assertEquals("sArray1 size should be 1", 1, sArray1.size());
	}
	
	@Test
	public void stackWithArrayPeekTest() {
		StackWithArray sArray1 = new StackWithArray();
		
		assertNull("sArray1 peek should be null.", sArray1.peek());
		
		sArray1.push(15);
		assertEquals("sArray1 peek should be 15", new Integer(15), sArray1.peek());
		
		sArray1.push(23);
		sArray1.push(45);
		assertEquals("sArray1 peek should be 45", new Integer(45), sArray1.peek());
		assertEquals("sArray1 size should be 3", 3, sArray1.size());
	}
	
	@Test
	public void stackWithArrayPushTest() {
		StackWithArray sArray1 = new StackWithArray();
		
		sArray1.push(15);
		assertEquals("sArray1 array[0] should be 15", new Integer(15), sArray1.getArray()[0]);
		
		sArray1.push(23);
		assertEquals("sArray1 array[1] should be 23", new Integer(23), sArray1.getArray()[1]);
		
		sArray1.push(45);
		assertEquals("sArray1 array[2] should be 45", new Integer(45), sArray1.getArray()[2]);
	}

	@Test
	public void stackWithArrayCreateTest() {
		StackWithArray sArray1 = new StackWithArray();
		
		assertNull("sArray1 array should be null.", sArray1.getArray());
		
		StackWithArray sArray2 = new StackWithArray(15);
		
		assertEquals("sArray2 array[0] should be 15", new Integer(15), sArray2.getArray()[0]);
	}

}
