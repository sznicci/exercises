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
		buildHeap();
	}

	public Integer maximum() {
		return array[0];
	}

	public void extractMax() {
		if (heapSize == 0) {
			return;
		} else if (heapSize == 2) {
			array[0] = array[1];
		} else if (heapSize == 1) {
			array[0] = null;
		} else {
			array[0] = array[1] >= array[2] ? array[1] : array[2];

			for (int i = array[0] == array[1] ? 1 : 2; i < heapSize - 1; i++) {
				array[i] = array[i + 1];
			}
			
			array[heapSize - 1] = null;
		}

		heapSize--;
	}
	
	public void increaseKey(Integer element, Integer amount) {
		for (int i = 0; i < heapSize; i++) {
			if (array[i].equals(element)) {
				array[i] = element + amount;
				buildHeap();
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
