package com.pradeep.algo;

import java.util.LinkedList;
import java.util.Scanner;

public class AdditionOfTwoLinkedList {

	public static LinkedList<Integer> addTwolinkedList(LinkedList<Integer> first, LinkedList<Integer> second) {
		LinkedList<Integer> result = new LinkedList<Integer>();

		int max = first.size() >= second.size() ? first.size() : second.size();
		 if(first.size()!=max) {
	        	result=first;
	        	first=second;
	        	second=result;
	        }
		int first_size = first.size() - 1;
		int second_size = second.size() - 1;
		int seconddata = 0;
		int firstdata = 0;
		int carryforward = 0;
       
		if (first_size == max - 1) {
			while (first_size >= 0) {
				seconddata = 0;
				firstdata = first.get(first_size--);

				if (second_size >= 0) {
					seconddata = second.get(second_size--);
				}
				firstdata = firstdata + seconddata + carryforward;
				if (first_size != -1)
					first.set(first_size + 1, firstdata % 10);
				else
					first.set(0, firstdata);
				carryforward = firstdata / 10;
			}
		}

		return first;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> first = new LinkedList<>();
		LinkedList<Integer> second = new LinkedList<Integer>();
		int data = 0;
		System.out.println("please enter content of first linked list and press -1 for exit");
		do {
			data = sc.nextInt();
			if (data == -1)
				break;
			first.add(data);
		} while (true);
		System.out.println(first);
		System.out.println("please enter content of second linked list and press -1 for exit");
		do {
			data = sc.nextInt();
			if (data == -1)
				break;
			second.add(data);
		} while (true);
		System.out.println(second);

		first = addTwolinkedList(first, second);
		System.out.println(first);
	}

}
