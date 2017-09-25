package day6.examples;

class Node {

	int data;

	Node left;
	Node right;

	public Node(int data) {

		this.data = data;
	}

}
public class BinaryTree {

	static Node root;
	private int data;
	private BinaryTree left;
	private BinaryTree right;

	public void insert(int data) {

		Node newNode = new Node(data);

		if (root == null) {

			root = newNode;

		} 
		else {

			Node current = root;

			Node parent;

			while (true) {

				parent = current;

				if (data < current.data) {

					current = current.left;

					if (current == null) {

						parent.left = newNode;
						return;

					}

				} 
				
				else {

					current = current.right;

					if (current == null) {

						parent.right = newNode;
						return;

					}

				}

			}
		}

	}

	public void LDR(Node current) {

		if (current != null) {

			LDR(current.left);

			System.out.print(current.data+" ");

			LDR(current.right);

		}

	}

	public void DLR(Node current) {

		if (current != null) {

			System.out.print(current.data+" ");

			DLR(current.left);
			DLR(current.right);

		}

	}

	public void LRD(Node current) {

		if (current != null) {

			LRD(current.left);
			LRD(current.right);

			System.out.print(current.data+" ");

		}

	}
	
	public boolean delete(int data) {

		Node current = root;
		Node parent = root;

		boolean isItAleft = true;
		
		// the search part
		while (current.data != data) {

			parent = current;

			if (data < current.data) {

				isItAleft = true;

				current = current.left;

			} else {

				isItAleft = false;

				current = current.right;

			}

			if (current == null)
				return false;

		}
		// end of search part

		//deleting node if there are no left or right node
		if (current.left == null && current.right == null) {
			
			if (current == root)
				root = null;
			
			else if (isItAleft)
				parent.left = null;

			else
				parent.right = null;

		}
		//end
		
		//deleting node if there are no right node
		else if (current.right == null) {

			if (current == root)
				root = current.left;

			
			else if (isItAleft)
				parent.left = current.left;

			else
				parent.right = current.left;

		}
		//end

		//deleting node if there are no left node
		else if (current.left == null) {

			if (current == root)
				root = current.right;

			else if (isItAleft)
				parent.left = current.right;

			else
				parent.right = current.right;

		}//end

		//deleting node if there are both left and right node
		else {

			Node replacement = getReplacementNode(current);

			if (current == root)
				root = replacement;

			else if (isItAleft)
				parent.left = replacement;

			else
				parent.right = replacement;

			replacement.left = current.left;

		}

		return true;

	}
	//end

	//finding and replacing the successor for deleted node
	public Node getReplacementNode(Node replacedNode) {

		Node replacementParent = replacedNode;
		Node replacement = replacedNode;

		Node current = replacedNode.right;

		// While there are no more left children

		while (current != null) {

			replacementParent = replacement;

			replacement = current;

			current = current.left;

		}

		if (replacement != replacedNode.right) {

			replacementParent.left = replacement.right;
			replacement.right = replacedNode.right;

		}

		return replacement;

	}


	public boolean find(int data) {

		Node current = root;

		while (current.data != data) {

			if (data < current.data) {

				current = current.left;

			} else {

				current = current.right;

			}

			if (current == null)
				return false;

		}

		return true;

	}

public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();

		tree.insert(50);

		tree.insert(25);

		tree.insert(15);

		tree.insert(30);

		tree.insert(75);

		tree.insert(85);
		tree.insert(18);
		tree.insert(42);
		tree.insert(60);

		tree.LDR(BinaryTree.root);
		System.out.println();

		tree.DLR(BinaryTree.root);
		System.out.println();

		tree.LRD(BinaryTree.root);
		System.out.println();

		System.out.println(tree.find(75));
		tree.delete(25);
		tree.LDR(BinaryTree.root);
		System.out.println();
		

}
}

