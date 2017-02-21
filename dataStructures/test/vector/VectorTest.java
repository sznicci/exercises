package vector;

import static org.junit.Assert.*;

import org.junit.Test;

public class VectorTest {
	
	@Test
	public void testRemove() {
		Vector v = new Vector();

		v.add(5);
		v.add(10);
		v.add(15);
		v.add(1);
		v.add(6);
		v.add(8);
		
		v.remove(15);
		assertEquals("elementAt 1 should return 1.", new Integer(1), v.elementAt(2));
		assertEquals("elementAt 4 should return 8.", new Integer(8), v.elementAt(4));
		assertNull("elementAt 7 should return null.", v.indexOf(7));
	}
	
	@Test
	public void testElementAt() {
		Vector v = new Vector();

		v.add(5);
		v.add(10);
		v.add(15);
		v.add(1);
		v.add(6);
		v.add(8);
		
		assertEquals("elementAt 1 should return 10.", new Integer(10), v.elementAt(1));
		assertNull("elementAt 7 should return null.", v.indexOf(7));
	}
	
	@Test
	public void testIndexOf() {
		Vector v = new Vector();

		v.add(5);
		v.add(10);
		v.add(15);
		v.add(1);
		v.add(6);
		v.add(8);
		
		assertEquals("indexOf 1 should return 3.", new Integer(3), v.indexOf(1));
		assertNull("indexOf 7 should return null.", v.indexOf(7));
	}

	@Test
	public void testAddAtAPosition() {
		Vector v = new Vector();

		v.add(5);
		v.add(10);
		v.add(15);
		v.add(1);
		v.add(6);
		v.add(8);
		v.add(45);
		v.add(55, 4);

		assertEquals(new Integer(5), v.getArray()[0]);
		assertEquals(new Integer(55), v.getArray()[4]);

		v.add(16, 2);
		assertEquals(new Integer(16), v.getArray()[2]);
	}

	@Test
	public void testAddToTheEnd() {
		Vector v = new Vector();

		v.add(5);
		v.add(10);
		v.add(15);
		v.add(1);
		v.add(6);
		v.add(8);
		v.add(45);

		assertEquals(new Integer(5), v.getArray()[0]);
		assertEquals(new Integer(45), v.getArray()[6]);
	}

}
