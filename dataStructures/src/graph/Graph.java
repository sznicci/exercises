package graph;

import java.util.HashMap;
import java.util.NoSuchElementException;

import singlyLinkedList.SinglyLinkedList;

public class Graph {
	
	private HashMap<Integer, SinglyLinkedList> graph;
	
	public Graph() {
		graph = new HashMap<>();
	}
	
	public void insertVertex(Integer newElement) {
		if (graph.containsKey(newElement)) {
			return;
		}
		graph.put(newElement, new SinglyLinkedList());
	}
	
	public void insertEdge(Integer x, Integer y) {
		if (graph.get(x).find(y) != null) {
			return;
		}
		if (!graph.containsKey(x)) {
			insertVertex(x);
		} else if (!graph.containsKey(y)) {
			insertVertex(y);
		}
		graph.get(x).addAsFirst(y);
		graph.get(y).addAsFirst(x);
	}
	
	public SinglyLinkedList neighbours(Integer x) {
		return graph.get(x);
	}
	
	public boolean removeVertex(Integer x) {
		if (!graph.containsKey(x)) {
			return false;
		}
		
		graph.remove(x);
		
		return true;
	}
	
	public boolean removeEdge(Integer x, Integer y) {
		if (graph.get(x).find(y) == null) {
			return false;
		}
		
		graph.get(x).remove(y);
		graph.get(y).remove(x);
		
		return true;
	}
	
	public SinglyLinkedList getVertexValue(Integer x) {
		if (!graph.containsKey(x)) {
			throw new NoSuchElementException("There is no element like " + x);
		}
		
		return graph.get(x);
	}

	public HashMap<Integer, SinglyLinkedList> getGraph() {
		return graph;
	}

	public void setGraph(HashMap<Integer, SinglyLinkedList> graph) {
		this.graph = graph;
	}
	
}
