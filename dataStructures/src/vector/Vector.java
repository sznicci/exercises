package vector;

public class Vector {

	private static int MAX_SIZE = 100;
	private Integer[] array;
	private int size;

	public Vector() {
		array = new Integer[MAX_SIZE];
		size = 0;
	}

	public Vector(Integer newElement) {
		array = new Integer[MAX_SIZE];
		array[0] = newElement;
		size = 1;
	}
	
	public void add(Integer newElement, int i) {
		if (size == MAX_SIZE) {
			array = reSize();
		}

		for (int j = size; j > i; j--) {
			array[j + 1] = array[j];
		}
		
		array[i] = newElement;
		size++;
	}

	public void add(Integer newElement) {
		if (size == MAX_SIZE) {
			array = reSize();
		}

		array[size] = newElement;
		size++;
	}
	
	public void remove(Integer element) {
		Integer indexOdElement = indexOf(element);
		
		if (indexOdElement == null) {
			return;
		}
		
		for (int i = indexOdElement; i < size; i++) {
			array[i] = array[i + 1];
		}
		
		size--;
	}
	
	public Integer elementAt(int i) {
		if (i >= size) {
			return null;
		}
		
		return array[i];
	}
	
	public Integer indexOf(Integer element) {
		for (int i = 0; i < size; i++) {
			if (array[i].equals(element)) {
				return i;
			}
		}
		
		return null;
	}
	
	public int capacity() {
		return MAX_SIZE;
	}

	public Integer[] reSize() {
		MAX_SIZE *= 2;
		Integer[] newArray = new Integer[MAX_SIZE];

		for (int i = 0; i < array.length; i++) {
			newArray[i] = array[i];
		}

		return newArray;
	}

	public int size() {
		return size;
	}

	public Integer[] getArray() {
		return array;
	}

}
