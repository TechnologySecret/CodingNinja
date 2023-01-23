/*
Level wise linkedlist
Send Feedback
Given a binary tree, write code to create a separate linked list for each level. You need to return the array which contains head of each level linked list.
Input format :
The first line of input contains data of the nodes of the tree in level order form. The data of the nodes of the tree is separated by space. If any node does not have left or right child, take -1 in its place. Since -1 is used as an indication whether the left or right nodes exist, therefore, it will not be a part of the data of any node.
Output format :
Each level linked list is printed in new line (elements are separated by space).
Constraints:
Time Limit: 1 second
Sample Input 1:
5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
Sample Output 1:
5 
6 10 
2 3 
9
*/

import java.util.ArrayList;
import java.util.*;

public class Solution {
	/*
	 * BinaryTreeNode class
	 * 
	 * class BinaryTreeNode<T> 
	 * { 
	 * 		T data; 
	 * 		BinaryTreeNode<T> left; 
	 * 		BinaryTreeNode<T> right;
	 *		public BinaryTreeNode(T data) 
	 *		{
	 *  		this.data = data; 
	 *  	} 
	 *  }
	 */
	/*
	 * LinkedListNode Class
	 * class LinkedListNode<T> 
	 * { 
	 * 		T data; 
	 * 		LinkedListNode<T> next;
	 * 		public LinkedListNode(T data) 	
	 * 		{
	 *  		this.data = data; 
	 *  	} 
	 *  }
	 */
	// public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root){
		// Write your code here

		private static ArrayList<LinkedListNode<Integer>> arr = new ArrayList<LinkedListNode<Integer>>();
				public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root) {
			// Write your code here
			if (root == null)
				return null;

			Queue<BinaryTreeNode<Integer>> nodesToPrint = new LinkedList<BinaryTreeNode<Integer>>();
			nodesToPrint.add(root);
			nodesToPrint.add(null);
			LinkedListNode<Integer> head = null, tail = null;
			// arr.add(head);

			while (!nodesToPrint.isEmpty()) {
				BinaryTreeNode<Integer> front = nodesToPrint.poll();
				if (front == null) {
					if (nodesToPrint.isEmpty())
						break;
					else {
						// System.out.println();
						nodesToPrint.add(null);
						tail.next = null;
						tail = tail.next;
						head = null;

					}

				} else {
					if (head == null) {
						head = new LinkedListNode<Integer>(front.data);
						tail = head;
						arr.add(head);
					} else {
						tail.next = new LinkedListNode<Integer>(front.data);
						tail = tail.next;
					}
					// System.out.print(front.data+" ");
					if (front.left != null)
						nodesToPrint.add(front.left);
					if (front.right != null)
						nodesToPrint.add(front.right);
				}
			}
			return arr;
	}

}


