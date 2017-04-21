package arraysAndStrings;

import static org.junit.Assert.*;

import org.junit.Test;

public class URLifyTest {

	@Test
	public void testUrlify() {
		assertEquals("Mr%20John%20Smith", URLify.Urlify("Mr John Smith    ", 13));
	}

}
