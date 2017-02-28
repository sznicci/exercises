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
		root = getNode(root, newElement);
		
		if (!root.isKey()) {
			root.setKey(true);
		}
	}
	
	private RadixTreeNode getNode(RadixTreeNode root, String element) {
		char[] elementArray = element.toCharArray();

		for (int i = 0; i < elementArray.length; i++) {
			if (elementArray[i] == '0') {
				if (root.getLeft() == null) {
					root.setLeft(new RadixTreeNode());
				}
				root = root.getLeft();
			} else if (elementArray[i] == '1') {
				if (root.getRight() == null) {
					root.setRight(new RadixTreeNode());
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
		root.setKey(false);
		
		return true;
	}

	public boolean search(String element) {
		return search(root, element);
	}

	private boolean search(RadixTreeNode root, String element) {
		
		root = getNode(root, element);

		return root.isKey();
	}

	public RadixTreeNode getRoot() {
		return root;
	}

}
