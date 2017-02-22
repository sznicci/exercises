package heap;

public class Heap {

	protected static int MAX_SIZE = 100;
	protected Integer[] array;
	protected int heapSize;
	private boolean isMin;	// if true then the heap is a min-heap.
	
	public Heap(Integer[] array) {
		this(array, false);
	}

	public Heap(Integer[] array, boolean isMin) {
		if (array == null) {
			this.array = new Integer[MAX_SIZE];
			heapSize = 0;
		} else if (array[array.length - 1] != null) {
			heapSize = array.length;
		} else {
			for (int i = 0; i < array.length; i++) {
				if (array[i] == null) {
					heapSize = i;
					break;
				}
			}
		}

		this.array = array;
		this.isMin = isMin;
	}

	public void heapify(int i) {
		if (left(i) == -1) {
			return;
		}

		Integer tmp = null;

		if (right(i) != -1 && array[right(i)] > array[i] && array[right(i)] > array[left(i)]) {
			tmp = array[right(i)];
			array[right(i)] = array[i];
			array[i] = tmp;
			heapify(right(i));
		} else if (array[left(i)] > array[i]) {
			tmp = array[left(i)];
			array[left(i)] = array[i];
			array[i] = tmp;
			heapify(left(i));
		}
	}
	
	public void heapifyMin(int i) {
		if (left(i) == -1) {
			return;
		}

		Integer tmp = null;

		if (right(i) != -1 && array[right(i)] < array[i] && array[right(i)] < array[left(i)]) {
			tmp = array[right(i)];
			array[right(i)] = array[i];
			array[i] = tmp;
			heapify(right(i));
		} else if (array[left(i)] < array[i]) {
			tmp = array[left(i)];
			array[left(i)] = array[i];
			array[i] = tmp;
			heapify(left(i));
		}
	}

	public void buildHeap() {
		for (int i = array[parent(heapSize - 1)]; i >= 0; i--) {
			if (isMin) {
				heapifyMin(i);
			} else {
				heapify(i);
			}
		}

	}

	public int left(int i) {
		int left = (2 * i) + 1;

		if (heapSize - 1 < left) {
			return -1;
		}

		return left;
	}

	public int right(int i) {
		int right = (2 * i) + 2;

		if (heapSize - 1 < right) {
			return -1;
		}

		return right;
	}

	public int parent(int i) {
		int parent = (i - 1) / 2;

		if (i == 0) {
			return -1;
		}

		return parent;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();

		for (Integer i : array) {
			sb.append(i + ", ");
		}

		return sb.toString();
	}

	public int getHeapSize() {
		return heapSize;
	}

	public void setHeapSize(int heapSize) {
		this.heapSize = heapSize;
	}

	public Integer[] getArray() {
		return array.clone();
	}
	
	public boolean isMin() {
		return isMin;
	}

}
