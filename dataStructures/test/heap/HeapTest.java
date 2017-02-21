package heap;

import static org.junit.Assert.*;

import org.junit.Test;

public class HeapTest {
	
	@Test
	public void testBuildHeap() {
		Integer[] arr = {7, 9, 11, 6, 5, 15, 3, 1};
		Integer[] expectedArr = {15, 11, 9, 7, 6, 5, 3, 1};
		Heap heap = new Heap(arr);
		
		heap.buildHeap();
		System.out.println(heap.toString());
		assertArrayEquals("heap array should be equal to expectedArr.", expectedArr, heap.getArray());
	}
	
	@Test
	public void testHeapifyPenultimate() {
		Integer[] arr2 = {15, 13, 12, 8, 11, 6, 9, 3, 10};
		Heap heap2 = new Heap(arr2);
		
		heap2.heapify(3);
		assertEquals("after heapify(3) heap2 8 should be 8.", new Integer(8), heap2.getArray()[8]);
		assertEquals("after heapify(3) heap2 3 should be 10.", new Integer(10), heap2.getArray()[3]);
	}
	
	@Test
	public void testHeapifyLast() {
		Integer[] arr2 = {15, 13, 12, 10, 11, 6, 9, 3, 8};
		Heap heap2 = new Heap(arr2);
		
		heap2.heapify(8);
		assertEquals("after heapify(8) heap2 8 should be 8.", new Integer(8), heap2.getArray()[8]);
	}

	@Test
	public void testHeapify() {
		Integer[] arr = {20, 13, 12, 15, 11, 6, 8, 3, 10};
		Heap heap = new Heap(arr);
		
		heap.heapify(1);
		assertEquals("after heapify(1) heap 1 should be 15.", new Integer(15), heap.getArray()[1]);
		assertEquals("after heapify(1) heap 3 should be 13.", new Integer(13), heap.getArray()[3]);
		
		Integer[] arr2 = {8, 15, 12, 13, 11, 6, 9, 3, 10};
		Heap heap2 = new Heap(arr2);
		
		heap2.heapify(0);
		assertEquals("after heapify(0) heap2 0 should be 15.", new Integer(15), heap2.getArray()[0]);
		assertEquals("after heapify(0) heap2 8 should be 8.", new Integer(8), heap2.getArray()[8]);
		assertEquals("after heapify(0) heap2 1 should be 13.", new Integer(13), heap2.getArray()[1]);
		assertEquals("after heapify(0) heap2 3 should be 10.", new Integer(10), heap2.getArray()[3]);
	}
}
