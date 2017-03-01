package radixTree;

public class RadixTree {

	private RadixTreeNode root;

	public RadixTree() {
		root = new RadixTreeNode();
	}

	public void insert(String newElement) {
		insert(root, newElement);
	}

	private void insert(RadixTreeNode root, String newElement) {
		root = createNode(root, newElement);

		if (!root.isKey()) {
			root.setKey(true);
		}
	}

	private RadixTreeNode createNode(RadixTreeNode root, String element) {
		char[] elementArray = element.toCharArray();

		for (int i = 0; i < elementArray.length; i++) {
			RadixTreeNode newNode = new RadixTreeNode();
			if (elementArray[i] == '0') {
				if (root.getLeft() == null) {
					root.setLeft(newNode);
					newNode.setParent(root);
				}
				root = root.getLeft();
			} else if (elementArray[i] == '1') {
				if (root.getRight() == null) {
					root.setRight(newNode);
					newNode.setParent(root);
				}
				root = root.getRight();
			}
		}
		return root;
	}

	public boolean delete(String element) {
		return delete(root, element);
	}

	private boolean delete(RadixTreeNode root, String element) {
		root = getNode(root, element);

		if (root == null) {
			return false;
		}

		if (root.getLeft() != null || root.getRight() != null) {
			root.setKey(false);
			return true;
		} else {
			RadixTreeNode deleteNode = root;
			
			while (deleteNode.getParent().getLeft() == null || deleteNode.getParent().getRight() == null) {
				deleteNode.setLeft(null);
				deleteNode.setRight(null);
				
				deleteNode = deleteNode.getParent();
			}
			
			root = null;
		}

		return true;
	}

	public boolean search(String element) {
		return search(root, element);
	}

	private boolean search(RadixTreeNode root, String element) {
		root = getNode(root, element);

		if (root == null) {
			return false;
		}

		return root.isKey();
	}

	private RadixTreeNode getNode(RadixTreeNode root, String element) {
		char[] elementArray = element.toCharArray();

		for (int i = 0; i < elementArray.length; i++) {
			if (elementArray[i] == '0') {
				if (root.getLeft() == null) {
					return null;
				}
				root = root.getLeft();
			} else if (elementArray[i] == '1') {
				if (root.getRight() == null) {
					return null;
				}
				root = root.getRight();
			}
		}

		return root;
	}

	public RadixTreeNode getRoot() {
		return root;
	}

}
