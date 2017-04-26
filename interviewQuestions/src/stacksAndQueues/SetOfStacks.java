package stacksAndQueues;

import java.util.ArrayList;

import stacks.StackWithLinkedList;

public class SetOfStacks {
	
	private static final int MAX_SIZE_FOR_STACKS = 3;
	private ArrayList<StackWithLinkedList> stacks = new ArrayList<>();;
	private int sizeOfLastStack;

	public SetOfStacks(Integer newItem) {
		stacks.add(new StackWithLinkedList(newItem));
		sizeOfLastStack = 1;
	}
	
	public void push(Integer newItem) {
		if (sizeOfLastStack == MAX_SIZE_FOR_STACKS) {
			stacks.add(new StackWithLinkedList(newItem));
			sizeOfLastStack = 1;
			return;
		}
		
		stacks.get(stacks.size() - 1).push(newItem);
		sizeOfLastStack++;
	}
	
	public Integer pop() {
		Integer removedItem = peek();
		
		if (sizeOfLastStack == 1) {
			stacks.remove(stacks.size() - 1);
			sizeOfLastStack = MAX_SIZE_FOR_STACKS;
			return removedItem;
		}
		
		stacks.get(stacks.size() - 1).pop();
		sizeOfLastStack--;
		
		return removedItem;
	}
	
	public Integer peek() {
		return stacks.get(stacks.size() - 1).peek();
	}
	
	public Integer popAt(int index) {
		if (index >= stacks.size()) {
			throw new IllegalArgumentException("There is no stack with index: " + index);
		}
		
		Integer removedItem = stacks.get(index).peek();
		
		if (index == stacks.size() - 1) {
			return pop();
		}
		
		if (stacks.get(index).peek() == null) {
			return null;
		}
		
		stacks.get(index).pop();
		
		return removedItem;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for (StackWithLinkedList s : stacks) {
			sb.append(s.toString());
			sb.append("|");
		}
		
		return sb.toString();
	}

	public int getSizeOfLastStack() {
		return sizeOfLastStack;
	}
	
	public int size() {
		return stacks.size();
	}

}
