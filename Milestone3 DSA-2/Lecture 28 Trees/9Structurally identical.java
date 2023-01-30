/*
Structurally identical
Send Feedback
Given two Generic trees, return true if they are structurally identical i.e. they are made of nodes with the same values arranged in the same way.
Input format :

Line 1 : Tree 1 elements in level order form separated by space (as per done in class). Order is -

Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element

Line 2 : Tree 2 elements in level order form separated by space (as per done in class). Order is -

Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element

Output format : true or false

Sample Input 1 :
10 3 20 30 40 2 40 50 0 0 0 0 
10 3 20 30 40 2 40 50 0 0 0 0
Sample Output 1 :
true
Sample Input 2 :
10 3 20 30 40 2 40 50 0 0 0 0 
10 3 2 30 40 2 40 50 0 0 0 0
Sample Output 2:
false
*/

import java.util.*;
public class Solution {

/*	TreeNode structure 
 * 
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/

public static int numNodes(TreeNode<Integer>root) {
if(root==null) {
return 0;
}
int count=1;
for(int i=0;i<root.children.size();i++) {
TreeNode<Integer>child=root.children.get(i);
count= count+numNodes(child);
}
return count;
}

public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2){

		// Write your code here
		  
        if(root1.data!=root2.data){
            return false;
        }
       
        int nodes1=numNodes(root1);
        int nodes2=numNodes(root2);
        if(nodes1!=nodes2){
            return false;
        }
        boolean isIdentical=true;
        for(int i=0;i<root1.children.size();i++){
            TreeNode<Integer>child1=root1.children.get(i);
            TreeNode<Integer>child2=root2.children.get(i);
           
            if(child1.data!=child2.data){
                isIdentical=false;
            }
           
        }
       
        return isIdentical;
	}
	
}
