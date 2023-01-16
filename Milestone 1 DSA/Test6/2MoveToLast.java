/*
Move To Last
Send Feedback
Given a linked list and a key in it, the task is to move all occurrences of given key to end of linked list, keeping order of all other elements same.
Return the updated head of LL.
Input Format :
Line 1 : Elements of the linked list ending with -1 (-1 not included)
Line 2 : Key n, Element which has to shifted
Output Format :
Updated linked list
Constraints :
1 <= size of list <= 100
Sample Input 1:
1 2 2 3 4 5 -1
2
Sample Output 1:
1 3 4 5 2 2 
Sample Input 2:
1 1 2 3 4 -1
1
Sample Output 2:
2 3 4 1 1
*/
/***********
Following is the Linked list node structure already written 
 
class Node<T> {
    public T data;
    public Node<T> next;
    public Node(T data) {
		 this.data=data;
	 }
}

************/
public class Solution {
	public static Node<Integer> func(Node<Integer> head,int n) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
         if (head == null || head.next == null)
            return head;
        Node<Integer> prev = null, curr = head, tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        Node<Integer> oldTail = tail;
        while (curr.next != oldTail) {
            if (curr.data == n) {
                tail.next = new Node<>(n);
                tail = tail.next;
                if (prev == null) {
                    curr = curr.next;
                    head = curr;
                } else {
                    prev.next = prev.next.next;
                    curr = prev.next;
                }
            } else {
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
	}

}
