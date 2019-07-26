package com.pradeep.datastructure;

import java.util.ArrayList;
import java.util.TreeMap;

class NodeB{
	NodeB right;
	NodeB left;
	int key;
	
public NodeB( int key) {
		super();
		this.right = null;
		this.left = null;
		this.key = key;
	}
	
	
}
public class PrintAllNodesHavingSameVerticalAlingment {
    TreeMap<Integer, ArrayList<Integer>> m=new TreeMap<Integer, ArrayList<Integer>>();
    public static void getHorizontalDistanceofNodes(int hd,TreeMap m,NodeB root) {
		if(root==null)return;
		
		 ArrayList<Integer> get=(ArrayList<Integer>) m.get(hd);
		 if(get==null) {
			 get=new ArrayList<Integer>();
			 get.add(root.key);
		}else {
			get.add(root.key);
		}
	    m.put(hd, get);
	    getHorizontalDistanceofNodes(hd-1, m, root.left);
	    getHorizontalDistanceofNodes(hd+1, m, root.right);
		 
		
		
	}
	
	public static void main(String[] args) {
		TreeMap< Integer, ArrayList<Integer>> m=new TreeMap<Integer, ArrayList<Integer>>();
		    NodeB root = new NodeB(1); 
	        root.left = new NodeB(2); 
	        root.right = new NodeB(3); 
	        root.left.left = new NodeB(4); 
	        root.left.right = new NodeB(5); 
	        root.right.left = new NodeB(6); 
	        root.right.right = new NodeB(7); 
	        root.right.left.right = new NodeB(8); 
	        root.right.right.right = new NodeB(9); 
	        System.out.println("Vertical Order traversal is"); 
	        getHorizontalDistanceofNodes(0, m, root);
	        System.out.println(m);
	}

}
