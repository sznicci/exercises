package stacksAndQueues;

import static org.junit.Assert.*;

import org.junit.Test;

public class SetOfStacksTest {

	@Test
	public void testSetOfStacksPush() {
		SetOfStacks setOfStacks = new SetOfStacks(5);
		
		setOfStacks.push(1);
		setOfStacks.push(12);
		setOfStacks.push(45);
		setOfStacks.push(3);
		setOfStacks.push(48);
		setOfStacks.push(78);
		setOfStacks.push(56);
		setOfStacks.push(8);
		
		
		assertEquals("12, 1, 5, |48, 3, 45, |8, 56, 78, |", setOfStacks.toString());
		assertEquals(3, setOfStacks.getSizeOfLastStack());
		assertEquals(3, setOfStacks.size());
	}
	
	@Test
	public void testSetOfStacksPop() {
		SetOfStacks setOfStacks = new SetOfStacks(5);
		
		setOfStacks.push(1);
		setOfStacks.push(12);
		setOfStacks.push(45);
		setOfStacks.push(3);
		setOfStacks.push(48);
		setOfStacks.push(78);
		setOfStacks.push(56);
		setOfStacks.push(8);
		
		setOfStacks.pop();
		
		assertEquals("12, 1, 5, |48, 3, 45, |56, 78, |", setOfStacks.toString());
		assertEquals(2, setOfStacks.getSizeOfLastStack());
		assertEquals(3, setOfStacks.size());
		
		
		setOfStacks.pop();
		setOfStacks.pop();
		
		assertEquals("12, 1, 5, |48, 3, 45, |", setOfStacks.toString());
		assertEquals(3, setOfStacks.getSizeOfLastStack());
		assertEquals(2, setOfStacks.size());
	}
	
	@Test
	public void testSetOfStacksPopAt() {
		SetOfStacks setOfStacks = new SetOfStacks(5);
		
		setOfStacks.push(1);
		setOfStacks.push(12);
		setOfStacks.push(45);
		setOfStacks.push(3);
		setOfStacks.push(48);
		setOfStacks.push(78);
		setOfStacks.push(56);
		setOfStacks.push(8);
		
		setOfStacks.popAt(2);
		
		assertEquals("12, 1, 5, |48, 3, 45, |56, 78, |", setOfStacks.toString());
		assertEquals(2, setOfStacks.getSizeOfLastStack());
		assertEquals(3, setOfStacks.size());
		
		
		setOfStacks.popAt(1);
		
		assertEquals("12, 1, 5, |3, 45, |56, 78, |", setOfStacks.toString());

		setOfStacks.popAt(1);
		setOfStacks.popAt(1);
		assertEquals("12, 1, 5, ||56, 78, |", setOfStacks.toString());
		
		setOfStacks.popAt(1);
		assertEquals("12, 1, 5, ||56, 78, |", setOfStacks.toString());
		assertEquals(3, setOfStacks.size());
		
		
		setOfStacks.push(100);
		assertEquals("12, 1, 5, ||100, 56, 78, |", setOfStacks.toString());
	}

}
