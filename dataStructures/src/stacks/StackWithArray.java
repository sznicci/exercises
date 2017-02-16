package stacks;

public class StackWithArray {
	
	private static int MAX_SIZE = 100;
	private Integer[] array;
	
	public StackWithArray() {
		array = null;
	}
	
	public StackWithArray(Integer newElement) {
		array = new Integer[MAX_SIZE];
		array[0] = new Integer(newElement);
	}
	
	public Integer peek() {
		if (array == null || array[0] == null) {
			return null;
		}
		
		return array[size() - 1];
	}
	
	public void push(Integer newElement) {
		if (size() == MAX_SIZE) {
			MAX_SIZE = 200;
		} else if (array == null) {
			array = new Integer[MAX_SIZE];
		}
		
		array[size()] = newElement;
	}
	
	public Integer pop() {
		if (array == null || array[0] == null) {
			return null;
		}
		
		Integer popItem = array[size() - 1];
		array[size() - 1] = null;
		
		return popItem;
	}

	public int size() {
		int i = 0;
		
		while (array != null && array[i] != null) {
			i++;
		}
		
		return i;
	}

	public Integer[] getArray() {
		return array;
	}

	public void setArray(Integer[] array) {
		this.array = array;
	}

}
