package maxPriorityQueue;

import heap.Heap;

public class MaxPriorityQueue extends Heap {

	public MaxPriorityQueue(Integer[] array) {
		super(array);

	}

	public void insert(Integer newElement) {
		if (array.length == heapSize) {
			array = reSize();
		}

		array[heapSize] = newElement;
		heapSize++;
		
		int i = heapSize - 1; 
		
		while (i != 0) {
			heapify(parent(i));
			i = parent(i);
		}
	}

	public Integer maximum() {
		return array[0];
	}

	public Integer extractMax() {
		if (heapSize == 0) {
			return null;
		}
		
		Integer max = array[0];
		
		array[0] = array[heapSize - 1];
		
		heapify(0);

		heapSize--;
		
		return max;
	}
	
	public void increaseKey(Integer element, Integer amount) {
		for (int i = 0; i < heapSize; i++) {
			if (array[i].equals(element)) {
				array[i] = element + amount;
				heapify(parent(i));
			}
		}
	}

	private Integer[] reSize() {
		MAX_SIZE = array.length * 2;
		Integer[] newArray = new Integer[MAX_SIZE];

		for (int i = 0; i < array.length; i++) {
			newArray[i] = array[i];
		}

		return newArray;
	}

}
