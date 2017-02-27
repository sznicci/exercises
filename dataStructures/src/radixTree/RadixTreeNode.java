package radixTree;

public class RadixTreeNode {

	private boolean key;
	private RadixTreeNode left;
	private RadixTreeNode right;

	public RadixTreeNode() {
		key = false;
		left = null;
		right = null;
	}

	public boolean isKey() {
		return key;
	}

	public void setKey(boolean key) {
		this.key = key;
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
