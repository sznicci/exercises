package binarySearchTree;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchTreeTest {

	@Test
	public void testDelete() {
		BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>(23);
		bst.insert(bst.getRoot(), 12);
		bst.insert(bst.getRoot(), 30);
		bst.insert(bst.getRoot(), 5);
		bst.insert(bst.getRoot(), 27);
		bst.insert(bst.getRoot(), 17);
		bst.insert(bst.getRoot(), 40);
		bst.insert(bst.getRoot(), 3);
		bst.insert(bst.getRoot(), 7);
		bst.insert(bst.getRoot(), 1);
		bst.insert(bst.getRoot(), 11);
		bst.insert(bst.getRoot(), 8);
		bst.insert(bst.getRoot(), 10);
		bst.insert(bst.getRoot(), 0);
		bst.insert(bst.getRoot(), 35);
		bst.insert(bst.getRoot(), 32);

		// 0 child
		assertEquals("bst delete 17 key should be 17", new Integer(17), bst.delete(bst.getRoot(), 17).getKey());
		assertNull("bst search 12 left child should be null", bst.search(bst.getRoot(), 12).getRight());

		// left child
		assertEquals("bst delete 3 key should be 3", new Integer(3), bst.delete(bst.getRoot(), 3).getKey());
		assertEquals("bst search 5 left key should be 1", new Integer(1),
				bst.search(bst.getRoot(), 5).getLeft().getKey());
		assertEquals("bst search 1 left key should be 0", new Integer(0),
				bst.search(bst.getRoot(), 1).getLeft().getKey());

		// right child
		assertEquals("bst delete 7 key should be 7", new Integer(7), bst.delete(bst.getRoot(), 7).getKey());
		assertEquals("bst search 5 right key should be 8", new Integer(8),
				bst.search(bst.getRoot(), 5).getRight().getKey());
		assertEquals("bst search 8 right key should be 11", new Integer(11),
				bst.search(bst.getRoot(), 8).getRight().getKey());
		assertEquals("bst search 11 left should be 10", new Integer(10),
				bst.search(bst.getRoot(), 11).getLeft().getKey());

		// two children
		assertEquals("bst delete 30 key should be 30", new Integer(30), bst.delete(bst.getRoot(), 30).getKey());
		assertEquals("bst search 23 right key should be 32", new Integer(32),
				bst.search(bst.getRoot(), 23).getRight().getKey());
		assertEquals("bst search 32 right key should be 40", new Integer(40),
				bst.search(bst.getRoot(), 32).getRight().getKey());
		assertEquals("bst search 32 leftt key should be 27", new Integer(27),
				bst.search(bst.getRoot(), 32).getLeft().getKey());
		assertNull("bst search 35 left should be null", bst.search(bst.getRoot(), 35).getLeft());
	}

	@Test
	public void testInorderToString() {
		BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>(23);
		bst.insert(bst.getRoot(), 12);
		bst.insert(bst.getRoot(), 30);
		bst.insert(bst.getRoot(), 5);
		bst.insert(bst.getRoot(), 27);
		bst.insert(bst.getRoot(), 17);
		bst.insert(bst.getRoot(), 40);

		String expected = " 5 12 17 23 27 30 40 ";

		assertEquals("bst inordeToString should be `expected`", expected, bst.inorderToString(bst.getRoot()));
	}

	@Test
	public void testSearchWithWhile() {
		BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>(23);
		bst.insert(bst.getRoot(), 12);
		bst.insert(bst.getRoot(), 30);
		bst.insert(bst.getRoot(), 5);
		bst.insert(bst.getRoot(), 27);
		bst.insert(bst.getRoot(), 17);
		bst.insert(bst.getRoot(), 40);

		assertEquals("bst search 12 key should be 12.", new Integer(12),
				bst.searchWithWhile(bst.getRoot(), 12).getKey());
		assertEquals("bst search 23 key should be 23.", new Integer(23),
				bst.searchWithWhile(bst.getRoot(), 23).getKey());
		assertEquals("bst search 17 key should be 17.", new Integer(17),
				bst.searchWithWhile(bst.getRoot(), 17).getKey());
		assertNull("bst search 34 key should be 12.", bst.searchWithWhile(bst.getRoot(), 34));
	}

	@Test
	public void testSearch() {
		BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>(23);
		bst.insert(bst.getRoot(), 12);
		bst.insert(bst.getRoot(), 30);
		bst.insert(bst.getRoot(), 5);
		bst.insert(bst.getRoot(), 27);
		bst.insert(bst.getRoot(), 17);
		bst.insert(bst.getRoot(), 40);

		assertEquals("bst search 12 key should be 12.", new Integer(12), bst.search(bst.getRoot(), 12).getKey());
		assertEquals("bst search 23 key should be 23.", new Integer(23), bst.search(bst.getRoot(), 23).getKey());
		assertEquals("bst search 17 key should be 17.", new Integer(17), bst.search(bst.getRoot(), 17).getKey());
		assertNull("bst search 34 key should be 12.", bst.search(bst.getRoot(), 34));
	}

	@Test
	public void testPredecessor() {
		BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>(23);
		bst.insert(bst.getRoot(), 12);
		bst.insert(bst.getRoot(), 30);
		bst.insert(bst.getRoot(), 5);
		bst.insert(bst.getRoot(), 27);
		bst.insert(bst.getRoot(), 17);
		bst.insert(bst.getRoot(), 40);

		assertEquals("bst 12 predecessor key should be 5.", new Integer(5),
				bst.predecessor(bst.getRoot().getLeft()).getKey());
		assertEquals("bst 40 predecessor key should be 30.", new Integer(30),
				bst.predecessor(bst.getRoot().getRight().getRight()).getKey());
	}

	@Test
	public void testSuccessor() {
		BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>(23);
		bst.insert(bst.getRoot(), 12);
		bst.insert(bst.getRoot(), 30);
		bst.insert(bst.getRoot(), 5);
		bst.insert(bst.getRoot(), 27);
		bst.insert(bst.getRoot(), 17);
		bst.insert(bst.getRoot(), 40);

		assertEquals("bst 12 successor key should be 17.", new Integer(17),
				bst.successor(bst.getRoot().getLeft()).getKey());
		assertNull("bst 40 successor key should be null.", bst.successor(bst.maximum(bst.getRoot())));
		assertEquals("bst 27 successor key should be 30.", new Integer(30),
				bst.successor(bst.getRoot().getRight().getLeft()).getKey());
	}

	@Test
	public void testMinMax() {
		BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>(23);
		bst.insert(bst.getRoot(), 12);
		bst.insert(bst.getRoot(), 30);
		bst.insert(bst.getRoot(), 5);
		bst.insert(bst.getRoot(), 27);
		bst.insert(bst.getRoot(), 17);
		bst.insert(bst.getRoot(), 40);

		assertEquals("bst minimun key should be 5.", new Integer(5), bst.minimum(bst.getRoot()).getKey());
		assertEquals("bst maximun key should be 40.", new Integer(40), bst.maximum(bst.getRoot()).getKey());
	}

	@Test
	public void testInsert() {
		BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>(23);

		assertEquals("bst root key should be 23.", new Integer(23), bst.getRoot().getKey());

		// insert left element
		bst.insert(bst.getRoot(), 12);
		assertEquals("bst root left key should be 12.", new Integer(12), bst.getRoot().getLeft().getKey());

		// insert right element
		bst.insert(bst.getRoot(), 30);
		assertEquals("bst root right key should be 30.", new Integer(30), bst.getRoot().getRight().getKey());

		// insert left left element
		bst.insert(bst.getRoot(), 5);
		assertEquals("bst root left left key should be 5.", new Integer(5), bst.getRoot().getLeft().getLeft().getKey());

		// insert right left element
		bst.insert(bst.getRoot(), 27);
		assertEquals("bst root right left key should be 27.", new Integer(27),
				bst.getRoot().getRight().getLeft().getKey());

		// insert left right element
		bst.insert(bst.getRoot(), 17);
		assertEquals("bst root left right key should be 17.", new Integer(17),
				bst.getRoot().getLeft().getRight().getKey());

		// insert right right element
		bst.insert(bst.getRoot(), 40);
		assertEquals("bst root right right key should be 40.", new Integer(40),
				bst.getRoot().getRight().getRight().getKey());
	}

}
