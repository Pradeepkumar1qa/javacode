package com.pradeep.datastructure;
/**print the sum of leaf nodes of BinarySearchTree
 * 
 * @author pradeepkumar1
 *
 */
public class BinarySearchTreeSumOfLeafNodes {
   int Tree[]= new int[100];
   int inval=1333;
   int max_index=0;
   public  BinarySearchTreeSumOfLeafNodes() {
	  
	 for(int i=0;i<Tree.length;i++)
		 Tree[i]=inval;
	   
   }
	
   public boolean insert(int num) {
	   int root=0;
	   while(true) {
		   if(Tree[0]==this.inval) {
//			   Tree[0]=num;
			   break;
		   }
		   else if(Tree[root]>num && Tree[root]!=inval) {
			   root=root*2+1;
			   if(Tree[root]==inval)break;
		   }
		   else if(Tree[root]<=num && Tree[root]!=inval) {
			   root=root*2+2;
			   if(Tree[root]==inval)break;
		   }
	   }
	   Tree[root]=num;
	   System.out.println("inserted num at the index\t"+root+"and number is \t"+num);
	   max_index=root;
	   return true;
   }
   
   public void deterMineSumOfLeafNodes() {
	   int sum=0;
	  for(int i=0;i<max_index*2+2;i++) {
		  if(Tree[2*i+1]==inval  && Tree[2*i+2]==inval && Tree[i]!=inval)
		  {
			System.out.println("detected leaf node at index\t"+i+"\t having value is \t"+Tree[i]);
		    sum=sum+Tree[i];
		  }
		 
			  
	  }
	  System.out.println("sum is \t"+sum);
   }
	
   public static void main(String[] args) {
		BinarySearchTreeSumOfLeafNodes TreeB=new BinarySearchTreeSumOfLeafNodes();
		TreeB.insert(5);
		TreeB.insert(3);
		TreeB.insert(2);
		TreeB.insert(4);
		TreeB.insert(9);
		TreeB.insert(7);
		TreeB.insert(10);
		TreeB.deterMineSumOfLeafNodes();
		

	}

}
