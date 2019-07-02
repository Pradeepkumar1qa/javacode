package com.pradeep.geeks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindNumber {
	
	public static void findTwoNumber(int[] numarray) {
		HashMap< Integer, List> hashmap= new HashMap<Integer,List>();
		int g1=numarray[0];
		int g2=0;
		for(int i=1;i<numarray.length;i++) {
			if(numarray[i]<=g1) {
				if((g1%numarray[i])==0) {
					
				}else {
					g2=numarray[i];
				}
			
			}else if((numarray[i]%g1)==0){
				g1=numarray[i];
			}else if(g2<numarray[i]) {g2=numarray[i];}
		}
		
		System.out.println(g1+"-------------------------"+g2);
	}

	public static void main(String[] args) {
		int [] numarray= {6,9,18,12,36,72,63,504,13,52};
	  findTwoNumber(numarray);
	}

}
