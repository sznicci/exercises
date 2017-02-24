package binarySearchTree;

public class BinarySearchTree<T extends Comparable<T>> {
	
	private BinarySearchTreeNode<T> root;
	
	public BinarySearchTree(T newElement) {
		root = new BinarySearchTreeNode<T>(newElement);
	}
	
	public void insert(BinarySearchTreeNode<T> root, T newElement) {
		if (root == null) {
			root = new BinarySearchTreeNode<T>(newElement);
			return;
		}
		
		if (root.getLeft() == null && root.getKey().compareTo(newElement) > 0) {
			root.setLeft(new BinarySearchTreeNode<T>(newElement));
			root.getLeft().setParent(root);
			return;
		} else if (root.getRight() == null && root.getKey().compareTo(newElement) < 0) {
			root.setRight(new BinarySearchTreeNode<T>(newElement));
			root.getRight().setParent(root);
			return;
		}
		
		if (root.getKey().compareTo(newElement) > 0) {
			insert(root.getLeft(), newElement);
		} else if (root.getKey().compareTo(newElement) < 0) {
			insert(root.getRight(), newElement);
		}
	}
	
	public BinarySearchTreeNode<T> minimum(BinarySearchTreeNode<T> root) {
		if (root == null) {
			return null;
		} else if (root.getLeft() == null) {
			return root;
		}
		return minimum(root.getLeft());
	}
	
	public BinarySearchTreeNode<T> maximum(BinarySearchTreeNode<T> root) {
		if (root == null) {
			return null;
		} else if (root.getRight() == null) {
			return root;
		}
		return maximum(root.getRight());
	}
	
	

	public BinarySearchTreeNode<T> getRoot() {
		return root;
	}

	public void setRoot(BinarySearchTreeNode<T> root) {
		this.root = root;
	}

}
