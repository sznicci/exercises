package maxPriorityQueue;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxPriorityQueueTest {
	
	@Test
	public void testIncreaseKey() {
		Integer[] array = {45, 21, 23, 20, 15, 11, 9, 7};
		MaxPriorityQueue pq = new MaxPriorityQueue(array);
		
		pq.increaseKey(20, 5);
		assertEquals("pq 1 should be 25.", new Integer(25), pq.getArray()[1]);
//		System.out.println(pq.toString());
		
		Integer[] expArr = {45, 25, 23, 21, 15, 11, 9, 10};
		pq.increaseKey(7, 3);
		assertArrayEquals(expArr, pq.getArray());
	}
	
	@Test
	public void testExtractMaxWithSecond() {
		Integer[] array = {45, 21, 23, 20, 15, 11, 9, 7};
		MaxPriorityQueue pq = new MaxPriorityQueue(array);
		
		pq.extractMax();
		assertEquals("pq 0 should be 23.", new Integer(23), pq.getArray()[0]);
//		System.out.println(pq.toString());
	}
	
	@Test
	public void testExtractMaxWithFirst() {
		Integer[] array = {45, 25, 23, 20, 15, 11, 9, 7};
		MaxPriorityQueue pq = new MaxPriorityQueue(array);
		
		pq.extractMax();
		assertEquals("pq 0 should be 25.", new Integer(25), pq.getArray()[0]);
//		System.out.println(pq.toString());
	}
	
	@Test
	public void testMaximum() {
		Integer[] array = {23, 20, 15, 11, 9, 7};
		MaxPriorityQueue pq = new MaxPriorityQueue(array);
		
		assertEquals(new Integer(23), pq.maximum());
	}

	@Test
	public void testInsert() {
		Integer[] array = {23, 20, 15, 11, 9, 7};
		MaxPriorityQueue pq = new MaxPriorityQueue(array);
		
		pq.insert(45);
		assertEquals("pq 0 should be 45.", new Integer(45), pq.getArray()[0]);
	}

}
