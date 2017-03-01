package radixTree;

public class RadixTreeNode {

	private boolean key;
	private RadixTreeNode parent;
	private RadixTreeNode left;
	private RadixTreeNode right;

	public RadixTreeNode() {
		key = false;
		parent = null;
		left = null;
		right = null;
	}

	public boolean isKey() {
		return key;
	}

	public void setKey(boolean key) {
		this.key = key;
	}

	public RadixTreeNode getParent() {
		return parent;
	}

	public void setParent(RadixTreeNode parent) {
		this.parent = parent;
	}

	public RadixTreeNode getLeft() {
		return left;
	}

	public void setLeft(RadixTreeNode left) {
		this.left = left;
	}

	public RadixTreeNode getRight() {
		return right;
	}

	public void setRight(RadixTreeNode right) {
		this.right = right;
	}

}
