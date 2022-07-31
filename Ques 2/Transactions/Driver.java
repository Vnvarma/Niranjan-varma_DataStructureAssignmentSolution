package Transactions;
public class Driver {

	public static void main(String[] args) {
		test(50, 30, 60, 10, 55);
	}

	public static void test(int p, int q, int r, int s, int t) {

		BSTtoSkewedConverter vns = new BSTtoSkewedConverter();
		Node root = new Node(p);
		root.left = new Node(q);
		root.right = new Node(r);
		root.left.left = new Node(s);
		root.right.left = new Node(t);

		vns.printOut(vns.flattenToSkewed(root));
	}

}




