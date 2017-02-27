package radixTree;

import java.security.InvalidParameterException;

public class RadixTree {

	private static int height = 5;
	private RadixTreeNode root;

	public RadixTree() {
		root = new RadixTreeNode();
		createEmptyTree(root, height);
	}

	private void createEmptyTree(RadixTreeNode root, int height) {
		root.setLeft(new RadixTreeNode());
		root.setRight(new RadixTreeNode());
		for (int i = height - 1; i >= 0; i--) {
			createEmptyTree(root.getLeft(), i);
			createEmptyTree(root.getRight(), i);
		}
	}

	public void insert(String newElement) {
		if (newElement.length() >= height) {
			throw new InvalidParameterException("Too long parameter. Maximum length can be 4.");
		}
		
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
				root = root.getLeft();
			} else if (elementArray[i] == '1') {
				root = root.getRight();
			}
		}
		return root;
	}
	
	public boolean delete(String element) {
		return delete(root, element);
	}

	private boolean delete(RadixTreeNode root, String element) {
		if (element.length() >= height) {
			throw new InvalidParameterException("Too long parameter. Maximum length can be 4.");
		}
		
		root = getNode(root, element);
		root.setKey(false);
		
		return true;
	}

	public boolean search(String element) {
		if (element.length() >= height) {
			throw new InvalidParameterException("Too long parameter. Maximum length can be 4.");
		}
		
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
