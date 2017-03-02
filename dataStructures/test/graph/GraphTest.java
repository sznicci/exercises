package graph;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.Test;

public class GraphTest {
	
	@Test
	public void testRemoveEdge() {
		Graph g = new Graph();

		g.insertVertex(1);
		g.insertVertex(5);
		g.insertVertex(2);
		g.insertVertex(3);
		g.insertVertex(0);
		g.insertVertex(4);
		
		g.insertEdge(1, 5);
		g.insertEdge(1, 2);
		g.insertEdge(2, 5);
		g.insertEdge(2, 1);
		g.insertEdge(2, 4);
		g.insertEdge(3, 2);
		g.insertEdge(3, 4);
		g.insertEdge(4, 2);
		g.insertEdge(4, 5);
		
		g.removeEdge(2, 5);
		
		System.out.println("2: " + g.neighbours(2).listToString());
		System.out.println("1: " + g.neighbours(1).listToString());
		System.out.println("0: " + g.neighbours(0).listToString());
		System.out.println("3: " + g.neighbours(3).listToString());
		System.out.println("4: " + g.neighbours(4).listToString());
		System.out.println("5: " + g.neighbours(5).listToString());
		
	}
	
	@Test
	public void testNeighbours() {
		Graph g = new Graph();

		g.insertVertex(1);
		g.insertVertex(5);
		g.insertVertex(2);
		g.insertVertex(3);
		g.insertVertex(0);
		g.insertVertex(4);
		
		g.insertEdge(1, 5);
		g.insertEdge(1, 2);
		g.insertEdge(2, 5);
		g.insertEdge(2, 1);
		g.insertEdge(2, 4);
		g.insertEdge(3, 2);
		g.insertEdge(3, 4);
		g.insertEdge(4, 2);
		g.insertEdge(4, 5);
		
//		System.out.println("2: " + g.neighbours(2).listToString());
//		System.out.println("1: " + g.neighbours(1).listToString());
//		System.out.println("0: " + g.neighbours(0).listToString());
//		System.out.println("3: " + g.neighbours(3).listToString());
//		System.out.println("4: " + g.neighbours(4).listToString());
//		System.out.println("5: " + g.neighbours(5).listToString());
		
	}
	
	@Test
	public void testInsertEdge() {
		Graph g = new Graph();

		g.insertVertex(1);
		g.insertVertex(5);
		
		g.insertEdge(1, 5);
		
		assertEquals("g get vertex value 1 should be 5.", new Integer(5), g.getVertexValue(1).getHead().getValue());
		assertEquals("g get vertex value 5 should be 1.", new Integer(1), g.getVertexValue(5).getHead().getValue());
	}
	
	@Test(expected = NoSuchElementException.class)
	public void testGetNotContainedVertex() {
		Graph g = new Graph();
		
		g.getVertexValue(1);
	}

	@Test
	public void testRemoveVertex() {
		Graph g = new Graph();

		g.insertVertex(1);
		g.insertVertex(5);

		assertTrue("g removeVertex 1 should be true.", g.removeVertex(1));
		assertFalse("g remove not contained vertex should be false.", g.removeVertex(0));
	}

	@Test
	public void testInsertVertexAndGetVertexValue() {
		Graph g = new Graph();

		g.insertVertex(1);
		assertNull("g get vertex value 1 should be and empty singly linked list.", g.getVertexValue(1).getHead());

		g.insertVertex(5);
		assertNull("g get vertex value 5 should be and empty singly linked list.", g.getVertexValue(5).getHead());
	}

}
