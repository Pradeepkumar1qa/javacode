package com.pradeep.algo;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class CFG {
	public static void main(String[] args) {
		Queue<Integer> result = new LinkedList<Integer>();
		result.add(1);
		result.add(4);
		result.add(7);
	    result.add(9);
		result.add(23);
		System.out.println(result);
		Queue<Integer> resultt = modifyQueue(result, 3);
		System.out.println(resultt);
	}

	public static Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
		Queue<Integer> result =new LinkedList<Integer>();
		Stack<Integer> temp_stack = new Stack<Integer>();

		for (int i = 1; i <= k; i++) {
			temp_stack.add(q.poll());

		}
		System.out.println(temp_stack);

		while (temp_stack.empty() != true) {

			int data = temp_stack.pop();
			result.add(data);
			
		}

		while (q.isEmpty() != true) {
			result.add(q.poll());
		}

		return result;

	}
}