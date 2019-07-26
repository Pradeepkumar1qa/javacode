package com.pradeep.geek;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class IteratorConcept {
 public static void main(String[] args) {
	LinkedList l=new LinkedList();
	for(int i=0;i<20;i++)
	{l.add(i);}
    ListIterator itr=l.listIterator();
    while(itr.hasNext()) {itr.next();}
    
    while(true) {System.out.println(itr.previous());break;}

    //    while(itr.hasNext()) {
//    	Integer temp=(Integer) itr.next();
//    	if(temp==5) {itr.remove();}
//    
//    }5
    System.out.println(l);
   

 }
}
