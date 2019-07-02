package com.pradeep.geek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.SortedSet;
import java.util.TreeSet;

class Node {
	int data;
	Node Next;

	Node(int data) {
		this.data = data;
		this.Next = null;
	}

}

public class LInkedList {

	public static Node buildLinkedList(String inputdata) {
		String data[] = inputdata.split(" ");
		Node start, current;
		start = current = null;

		for (String a : data) {
			if (start == null) {
				start = current = new Node(Integer.parseInt(a));
			} else {
				current.Next = new Node(Integer.parseInt(a));
				current = current.Next;
			}

		}
		return start;

	}

	public static void traverse(Node start) {
		Node current = start;
		while (true) {
			System.out.println(current.data);
			if (current.Next == null)
				break;
			current = current.Next;
		}
	}

	public static void arrange(Node start) {
		Node StartEven = null;
		Node EvenCurrentPointer = null;
		Node StartOdd = null;
		Node OddCurrentPointer = null;
		Node current = null;

		if ((current = start) == null)
			return;
		
		while (true) {
			if (current.data % 2 == 0) {
				if (StartEven == null) {
					EvenCurrentPointer = StartEven = current;
				} else {
					EvenCurrentPointer.Next = current;
					EvenCurrentPointer = EvenCurrentPointer.Next;
				}
			} else {
				if (StartOdd == null) {
					OddCurrentPointer = StartOdd = current;
				} else {
					EvenCurrentPointer.Next = current;
					EvenCurrentPointer = EvenCurrentPointer.Next;
				}
			}
			if(current.Next==null)break;
            current=current.Next;
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String Testcase = reader.readLine();
		String inputdata = reader.readLine();
		System.out.println(inputdata);

		traverse(buildLinkedList(inputdata));

	}

}
