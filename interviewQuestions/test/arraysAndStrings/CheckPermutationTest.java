package arraysAndStrings;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckPermutationTest {

	@Test
	public void testCheckPermutation() {
		assertTrue("\"fdsa\" should be a permutation of \"asdf\".", CheckPermutation.checkPermutation("asdf", "fdsa"));

		assertFalse("\"ffsa\" should not be a permutation of \"asdf\".",
				CheckPermutation.checkPermutation("asdf", "ffsa"));
		
		assertFalse("\"fdsaaaaa\" should not be a permutation of \"asdf\".",
				CheckPermutation.checkPermutation("asdf", "fdsaaaaa"));
	}

}
