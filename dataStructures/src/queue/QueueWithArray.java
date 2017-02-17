package queue;

public class QueueWithArray {
	
	private static int MAX_SIZE = 100;
	private Integer[] array;
	private int top;
	
	public QueueWithArray() {
		array = null;
		top = -1;
	}
	
	public QueueWithArray(Integer newElement) {
		array = new Integer[MAX_SIZE];
		top = 0;
		array[top] = newElement;
	}
	
	public void enqueue(Integer newElement) {
		if (array == null) {
			array = new Integer[MAX_SIZE];
		}
		
		if (top > -1) {
			for (int i = top; i >= 0; i--) {
				array[i + 1] = array[i];
			}
		}
		top++;
		array[0] = newElement;
	}
	
	public Integer dequeue() {
		if (top == -1) {
			return null;
		}
		
		Integer dequeueItem = array[top];
		top--;
		return dequeueItem;
	}
	
	public Integer examine() {
		if (top == -1) {
			return null;
		}
		
		return array[top];
	}

	public Integer[] getArray() {
		return array;
	}

}
