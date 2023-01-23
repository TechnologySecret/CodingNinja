/*
BST to LL
Send Feedback
Given a BST, convert it into a sorted linked list. You have to return the head of LL.
Input format:
The first and only line of input contains data of the nodes of the tree in level order form. The data of the nodes of the tree is separated by space. If any node does not have left or right child, take -1 in its place. Since -1 is used as an indication whether the left or right nodes exist, therefore, it will not be a part of the data of any node.   
Output Format:
The first and only line of output prints the elements of sorted linked list.
Constraints:
Time Limit: 1 second
Sample Input 1:
8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
Sample Output 1:
2 5 6 7 8 10

*/


public class Solution {

	public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
      	if(root == null){
            return null;
        }
            
        LinkedListNode<Integer> leftLL = constructLinkedList(root.left);
        if(leftLL != null)
        {
            LinkedListNode<Integer> temp = leftLL;
            while(temp.next != null){
                temp = temp.next;
            }
                temp.next = new LinkedListNode<Integer>(root.data);
            
        }else{
            leftLL = new LinkedListNode<Integer>(root.data);
        }
        
            
        LinkedListNode<Integer> rightLL = constructLinkedList(root.right);
        LinkedListNode<Integer> temp = leftLL;
        while(temp.next != null){
            temp = temp.next;
        }
            temp.next = rightLL;
            return leftLL;  
	}
}
