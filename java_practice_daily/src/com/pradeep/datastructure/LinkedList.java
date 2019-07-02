package com.pradeep.datastructure;

class Node {
	int number;
	Node nextNode;

	public Node(int number, Node nextNode) {

		this.number = number;
		this.nextNode = null;
	}

}

public class LinkedList {

	Node start = null;
	Node current = start;

	public boolean add(int n) {
		if (start == null) {
			start = current = new Node(n, null);
		} else {
			current.nextNode = new Node(n, null);
			current = current.nextNode;
			
		}
		return true;
	}

	public void docontigous() {
		int pointerforzero = 0;
		int pointerforone = 0;
		int pointerfortwo = 0;
		Node traverse = start;

		while (true) {
		
			if (traverse.number == 3) {
				pointerforzero++;
			} else if (traverse.number == 1) {
				pointerforone++;
			} else if (traverse.number == 2) {
				pointerfortwo++;
			}

			if (traverse.nextNode == null) {
				break;
			}
			traverse = traverse.nextNode;

		}

	    traverse = start;
		
	    while (true) {
			{
				if (pointerforzero != 0) {
					traverse.number = 3;
					pointerforzero--;

				} else if (pointerforone != 0) {
					traverse.number = 1;
					pointerforone--;
				} else if (pointerfortwo != 0) {
					traverse.number = 2;
					pointerfortwo--;
				}
			}
			if (traverse.nextNode == null)
				break;
			traverse = traverse.nextNode;
		}
	}

public void display() {
		
	Node traverse = start;
		do {
			System.out.print(traverse.number + "\t ");
			traverse = traverse.nextNode;

		} while (traverse.nextNode != null);
		System.out.println(traverse.number);
	}


	public static void main(String[] args) {
		int a[] = { 1, 2, 1, 2, 2, 1, 2, 2, 3, 3, 3, 3, 3, 2, 1, 3, 1, 1, 1 };
		LinkedList l = new LinkedList();
		
		for (int t : a) {
			l.add(t);
		}

		l.display();
		l.docontigous();
		l.display();
	}
}
