package binarySearchTree;

public class BinarySearchTreeNode<T extends Comparable<T>> implements Comparable<T> {
	
	private T key;
	private BinarySearchTreeNode<T> parent;
	private BinarySearchTreeNode<T> left;
	private BinarySearchTreeNode<T> right;
	
	public BinarySearchTreeNode(T newElement) {
		key = newElement;
		parent = null;
		left = null;
		right = null;
	}

	public T getKey() {
		return key;
	}

	public void setKey(T key) {
		this.key = key;
	}

	public BinarySearchTreeNode<T> getParent() {
		return parent;
	}

	public void setParent(BinarySearchTreeNode<T> parent) {
		this.parent = parent;
	}

	public BinarySearchTreeNode<T> getLeft() {
		return left;
	}

	public void setLeft(BinarySearchTreeNode<T> left) {
		this.left = left;
	}

	public BinarySearchTreeNode<T> getRight() {
		return right;
	}

	public void setRight(BinarySearchTreeNode<T> right) {
		this.right = right;
	}

	@Override
	public int compareTo(T o) {
		if (key.compareTo(o) == 0) {
			return 0;
		} else if (key.compareTo(o) > 0) {
			return 1;
		}
		return -1;
	}


}
