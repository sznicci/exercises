package stacks;

public class StackWithArray {
	
	private static int MAX_SIZE = 100;
	private Integer[] array;
	private int top;
	
	public StackWithArray() {
		array = null;
		top = -1;
	}

	public StackWithArray(Integer newElement) {
		array = new Integer[MAX_SIZE];
		top = 0;
		array[top] = new Integer(newElement);
	}
	
	public Integer peek() {
		if (array == null || array[0] == null) {
			return null;
		}
		
		return array[top];
	}
	
	public void push(Integer newElement) {
		if (top + 1 == MAX_SIZE) {
			MAX_SIZE *= 2;
		} else if (array == null) {
			array = new Integer[MAX_SIZE];
			top = -1;
		}
		
		top++;
		array[top] = newElement;
	}
	
	public Integer pop() {
		if (array == null || array[0] == null) {
			return null;
		}
		
		Integer popItem = array[top];
		array[top] = null;
		top--;
		
		return popItem;
	}

	public int size() {
		return top + 1;
	}

	public Integer[] getArray() {
		return array;
	}

	public void setArray(Integer[] array) {
		this.array = array;
	}
	
	public int getTop() {
		return top;
	}
	
	public void setTop(int top) {
		this.top = top;
	}

}
