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

		if (root.getLeft() == null && root.compareTo(newElement) > 0) {
			root.setLeft(new BinarySearchTreeNode<T>(newElement));
			root.getLeft().setParent(root);
			return;
		} else if (root.getRight() == null && root.compareTo(newElement) < 0) {
			root.setRight(new BinarySearchTreeNode<T>(newElement));
			root.getRight().setParent(root);
			return;
		}

		if (root.compareTo(newElement) > 0) {
			insert(root.getLeft(), newElement);
		} else if (root.compareTo(newElement) < 0) {
			insert(root.getRight(), newElement);
		}
	}

	public BinarySearchTreeNode<T> search(BinarySearchTreeNode<T> root, T element) {
		if (root == null) {
			return null;
		}

		if (root.compareTo(element) == 0) {
			return root;
		} else if (root.compareTo(element) > 0) {
			return search(root.getLeft(), element);
		} else {
			return search(root.getRight(), element);
		}
	}

	public BinarySearchTreeNode<T> searchWithWhile(BinarySearchTreeNode<T> root, T element) {
		if (root == null) {
			return null;
		}

		while (root != null && root.compareTo(element) != 0) {
			if (root.compareTo(element) > 0) {
				root = root.getLeft();
			} else if (root.compareTo(element) < 0) {
				root = root.getRight();
			}
		}

		return root;
	}

	public BinarySearchTreeNode<T> predecessor(BinarySearchTreeNode<T> root) {
		if (root.getLeft() != null) {
			return maximum(root.getLeft());
		}

		BinarySearchTreeNode<T> predecessor = root.getParent();

		while (predecessor != null && predecessor.getLeft() == root) {
			root = predecessor;
			predecessor = predecessor.getParent();
		}

		return predecessor;
	}

	public BinarySearchTreeNode<T> successor(BinarySearchTreeNode<T> root) {
		if (root.getRight() != null) {
			return minimum(root.getRight());
		}

		BinarySearchTreeNode<T> successor = root.getParent();

		while (successor != null && successor.getRight() == root) {
			root = successor;
			successor = successor.getParent();
		}

		return successor;
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

	public String inorderToString(BinarySearchTreeNode<T> root) {
		return ((root.getLeft() != null) ? inorderToString(root.getLeft()) : " ") + root.getKey()
				+ ((root.getRight() != null) ? inorderToString(root.getRight()) : " ");
	}

	public String inorderToStringWithWhile(BinarySearchTreeNode<T> root) {
		return null;
	}

	public BinarySearchTreeNode<T> getRoot() {
		return root;
	}

	public void setRoot(BinarySearchTreeNode<T> root) {
		this.root = root;
	}

}
