
Isomorphic Trees
Given two binary trees. Check whether these two trees are isomorphic or not.
Isomorphic trees are the ones which can be made identical by series of flips i.e. by swapping left and right children of a number of nodes.
Example
Input 

Output

 True
Input format :
Line 1 :  Elements in level order form (separated by space)
(If any node does not have left or right child, take -1 in its place)
Output Format :
True or False
Sample Input 1:
     5 35 10 2 3 5 2 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
     9 11 12 2 5 3 2 -1 -1  -1 -1 -1 -1 -1 -1
Sample Output 1:
     False
Sample Input 1:
     2 35 10 2 3  -1 -1 -1 -1 -1 -1
     9 10 35 -1 -1 3 2 -1 -1  -1 -1 
Sample Output 1:
     True
     
 *******************************ANSWERS*******************************
     

/*class BinaryTreeNode<T> {
 public T data;
 public BinaryTreeNode<T> left;
 public BinaryTreeNode<T> right;

 public BinaryTreeNode(T data) {
 this.data = data;
 left=null;
 right=null;
 }*/
       
public class solution {
	static boolean isIsomorphic(BinaryTreeNode<Integer> n1, BinaryTreeNode<Integer> n2) {
	if(n1==null&&n2==null)
	return true;
	if(n1==null ||  n2==null)
		return false;
		if(n1.data != n2.data)
		return false;
		return (isIsomorphic(n1.right,n2.right))  ||  (isIsomorphic(n1.left,n2.left));
	}
}



