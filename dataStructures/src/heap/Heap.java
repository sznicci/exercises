package heap;

public class Heap {

	private static int MAX_SIZE = 100;
	private Integer[] array;
	private int heapSize;

	public Heap(Integer[] array) {
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
	}

	public Integer heapify(int i) {
		if (left(i) == null) {
			return array[i];
		}

		Integer tmp = new Integer(0);

		if (right(i) != null && array[right(i)] > array[i] && array[right(i)] > array[left(i)]) {
			tmp = array[right(i)];
			array[right(i)] = array[i];
			array[i] = tmp;
			return heapify(right(i));
		} else if (array[left(i)] > array[i]) {
			tmp = array[left(i)];
			array[left(i)] = array[i];
			array[i] = tmp;
			return heapify(left(i));
		}

		return array[i];
	}

	public void buildHeap() {
		for (int i = array[parent(array.length - 1)]; i >= 0; i--) {
			heapify(i);
		}

	}

	public Integer left(int i) {
		int left = (2 * i) + 1;

		if (heapSize - 1 < left) {
			return null;
		}

		return left;
	}

	public Integer right(int i) {
		int right = (2 * i) + 2;

		if (heapSize - 1 < right) {
			return null;
		}

		return right;
	}

	public Integer parent(int i) {
		int parent = (i - 1) / 2;

		if (i == 0) {
			return null;
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

}
