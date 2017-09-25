package day6.examples;

import java.util.ArrayList;
import java.util.Random;

import javax.xml.soap.Node;

public class Bst {
	
	public static Node root;
	public Bst() {
		Bst.root=null;
	}
	
	public day6.examples.Node find(int n) {
		Node current=root;
		while(current.n!=n){
			
				if(n<current.data){
					current = current.left;
				}
				else {
					current = current.right;
				}	
			
		}	return current;
	}
	

	public static void insert(int d) {
		Node newNode= new Node(d);
		if(root==null) {
			root=newNode;
		}
		else {Node current=root;
		Node parent;
		
		while(true) {
			parent=current;
			if(d<current.data) {
				current=current.left;
				if(current==null) {
					parent.left=newNode;
					return;
				}
			}
			else {
				current=current.right;
				if(current==null) {
					parent.right=newNode;
					return;
				}
			}
			
		}}
		
	}
	public static void display(Node root) {
		if(root!=null){
			display(root.left);
			System.out.print(" " + root.data);
			display(root.right);
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		Bst f=new Bst();
		Bst.insert(3); Bst.insert(7); Bst.insert(10); Bst.insert(14); Bst.insert(0);
		Bst.insert(9); Bst.insert(23); Bst.insert(8); Bst.insert(5);
		Bst.display(Bst.root);
		System.out.println();
		System.out.println(f.find(9));
		
		/*Random rd=new Random();
		ArrayList<Integer> d=new ArrayList<>();
		for(int a=0;a<30;a=a+6) {
			d.add(rd.nextInt(50)+20);
		}
		System.out.println(d);
		System.out.println(d.size());*/

	}

}

	class Node{
		public int n;
		int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data=data;
			left=null;
			right=null;
		}
	}
