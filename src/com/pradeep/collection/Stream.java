package com.pradeep.collection;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(5);
		al.add(8);
		ArrayList <Integer>even=new ArrayList<Integer>();
		even=(ArrayList<Integer>) al.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(even);
		

	}

}
