package com.pradeep.geek;

import java.util.LinkedList;
//sprial binding
public class SPiralPrinting {
	public static void print(int a) {
		System.out.print(a+" ");
	}
	
	public static void printspiral(int endrow,int endcol,int [][] array) throws InterruptedException {
		int k=0;
		int l=0;
		while(k<endrow & l <endcol) {
			
			//print first row from remaining row
			for(int i=l;i<endcol;i++) {
				print(array[k][i]);
			}
			k++;
			//print last column from remaining column
			for(int j=k;j<endrow;j++) {
				print(array[j][endcol-1]);
			}
			endcol--;
			//print last row from remaining row
			for(int i=endcol-1;i>=l;i--) {
				print(array[endrow-1][i]);
			}
			endrow--;
			//print left row from remaining 
			for(int i=endrow-1;i>=k;i--) {
				print(array[i][l]);
			}
			l++;
			
		}
	}

	public static void main(String[] args) throws InterruptedException {
		
     int [] [] a= {{1,2,5,7,7},
    		 	   {1,2,5,7,8},
    		 	   {9,12,5,7,3},
    		 	   {1,11,5,7,3},
    		 	   {1,2,5,7,1},
    		 	   {1,2,5,7,3}};
     printspiral(6,5,a);
    
	}

}
