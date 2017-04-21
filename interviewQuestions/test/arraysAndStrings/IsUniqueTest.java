package arraysAndStrings;

import static org.junit.Assert.*;

import org.junit.Test;

public class IsUniqueTest {

	@Test
	public void testIsUnique() {
		assertTrue("\"asdf\" should be true.", IsUnique.isUnique("asdf"));
		
		assertFalse("\"thisisnot\" should be false.", IsUnique.isUnique("thisisnot"));
	}

}
