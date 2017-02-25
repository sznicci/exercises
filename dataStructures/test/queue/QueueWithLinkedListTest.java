package queue;

import static org.junit.Assert.*;

import org.junit.Test;

public class QueueWithLinkedListTest {

	@Test
	public void queueWithLinkedListExamineTest() {
		QueueWithLinkedList<Integer> q1 = new QueueWithLinkedList<>();

		assertNull("q1 examine should be null.", q1.examine());
		
		q1.enqueue(23);
		assertEquals("q1 examine should be 23.", new Integer(23), q1.examine());
		
		q1.enqueue(15);
		q1.enqueue(34);
		assertEquals("q1 examine should be 23.", new Integer(23), q1.examine());
		
		q1.enqueue(3);
		assertEquals("q1 examine should be 23.", new Integer(23), q1.examine());
	}

	@Test
	public void queueWithLinkedListDenqueueTest() {
		QueueWithLinkedList<Integer> q1 = new QueueWithLinkedList<>();

		assertNull("q1 dequeue should be null.", q1.dequeue());

		q1.enqueue(23);
		assertEquals("q1 dequeue should be 23.", new Integer(23), q1.dequeue());

		q1.enqueue(15);
		q1.enqueue(34);
		q1.enqueue(3);
		assertEquals("q1 dequeue should be 15.", new Integer(15), q1.dequeue());
	}

	@Test
	public void queueWithLinkedListEnqueueTest() {
		QueueWithLinkedList<Integer> q1 = new QueueWithLinkedList<>();

		assertNull("q1 list should be null.", q1.getList());

		q1.enqueue(23);
		assertEquals("q1 head value should be 23.", new Integer(23), q1.getList().getHead().getValue());

		q1.enqueue(15);
		assertEquals("q1 first should be 15.", new Integer(15), q1.getFirst());
		assertEquals("q1 last should be 23.", new Integer(23), q1.examine());

		q1.enqueue(34);
		assertEquals("q1 first should be 34.", new Integer(34), q1.getFirst());
		assertEquals("q1 first next should be 15.", new Integer(15), q1.getList().getHead().getNext().getValue());
		assertEquals("q1 last should be 23.", new Integer(23), q1.examine());
	}

}
