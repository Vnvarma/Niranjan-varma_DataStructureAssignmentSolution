package Transactions;
class BSTtoSkewedConverter {

	public void printOut(Node parent) {
		Node curr = parent;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.right;
		}
	}

	private Node prev;

	private void Inorder(Node curr) {
		if (curr == null)
			return;
		Inorder(curr.left);
		prev.left = null;
		prev.right = curr;
		prev = curr;
		Inorder(curr.right);
	}

	public Node flattenToSkewed(Node parent) {
		Node dummy = new Node(-1);

		prev = dummy;

		Inorder(parent);

		prev.left = null;
		prev.right = null;
		Node ret = dummy.right;

		return ret;
	}

}
 