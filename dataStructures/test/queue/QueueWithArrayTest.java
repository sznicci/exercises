package queue;

import static org.junit.Assert.*;

import org.junit.Test;

public class QueueWithArrayTest {

	@Test
	public void queueWithArrayExamineTest() {
		QueueWithArray q1 = new QueueWithArray();

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
	public void queueWithArrayDenqueueTest() {
		QueueWithArray q1 = new QueueWithArray();

		assertNull("q1 dequeue should be null.", q1.dequeue());

		q1.enqueue(23);
		assertEquals("q1 dequeue should be 23.", new Integer(23), q1.dequeue());

		q1.enqueue(15);
		q1.enqueue(34);
		q1.enqueue(3);
		assertEquals("q1 dequeue should be 15.", new Integer(15), q1.dequeue());
	}

	@Test
	public void queueWithArrayEnqueueTest() {
		QueueWithArray q1 = new QueueWithArray();

		assertNull("q1 array should be null.", q1.getArray());

		q1.enqueue(23);
		assertEquals("q1 array[0] should be 23.", new Integer(23), q1.getArray()[0]);

		assertEquals("q1 dequeue should be 23.", new Integer(23), q1.dequeue());

		q1.enqueue(23);
		q1.enqueue(15);
		assertEquals("q1 array[0] should be 15.", new Integer(15), q1.getArray()[0]);
		assertEquals("q1 array[1] should be 23.", new Integer(23), q1.getArray()[1]);

		q1.enqueue(34);
		assertEquals("q1 array[0] should be 34.", new Integer(34), q1.getArray()[0]);
		assertEquals("q1 array[1] should be 15.", new Integer(15), q1.getArray()[1]);
		assertEquals("q1 array[2] should be 23.", new Integer(23), q1.getArray()[2]);
	}

}
