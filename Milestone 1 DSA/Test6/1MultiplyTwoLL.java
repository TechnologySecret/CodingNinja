/*
Multiply Two Linked Lists
Send Feedback
1. You are given two linked lists. Data of each node of these linked lists contain a digit from the range: [0, 9].
2. The linked lists represent two numbers.
3. You have to print the product of these two numbers.
Input Format:
Input has already been managed for cpp and java submissions. In cpp and java, you have to just write a function which receives head nodes of two linked lists. The sizes of linked lists are N and M, respectively.
For other languages, the first line of input contains list of N space separated integers, terminated by -1. The following line of input also contains list of M space separated integers, terminated by -1. The integers form the data of nodes of two linked list.   
Constraints:
N and M lies in the range: [1, 1000].
0 <= |Node Data| <= 9
Output format:
Print the product of numbers, represented by two linked lists.
Sample Input:
1 2 3 4 5 -1
1 2 3 -1
Sample Output:
1 5 1 8 4 3 5
*/


/*Linked List Node Class

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;
    
    public LinkedListNode(T data) {
        this.data = data;
        this.next = null;
    }
}

*/
public class Solution {

    public static LinkedListNode<Integer> temphead;

    public static int reverse(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> prev = null;
        LinkedListNode<Integer> curr = head;
        int len = 0;
        LinkedListNode<Integer> ahead = null;
        while (curr != null) {
            len++;
            ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
        }

        head = prev;
        temphead = head;
        return len;
    }

    public static LinkedListNode<Integer> makeEmptyList(int length) {
        LinkedListNode<Integer> head = null;
        LinkedListNode<Integer> traverse = null;

        while (length > 0) {

            LinkedListNode<Integer> temp = new LinkedListNode<Integer>(0);

            if (head == null) {
                head = temp;
                traverse = temp;
            } else {
                traverse.next = temp;
                traverse = traverse.next;

            }
            length--;
        }

        return head;
    }

    public static LinkedListNode<Integer> multiplyLL(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {

        // Reverse the input lists and get their lengths
        int m = reverse(head1);
        head1 = temphead;
        int n = reverse(head2);
        head2 = temphead;

        // Make a list that will contain the result of multiplication, m+n+1 can be max
        // size of the list
        LinkedListNode<Integer> result = makeEmptyList(m + n);

        // Pointers for traversing the linked lists
        LinkedListNode<Integer> secondPtr = head2, resultPtr1 = result, resultPtr2, firstPtr;

        // multiply each Node of second list with first
        while (secondPtr != null) {
            int carry = 0;

            // Each time we start from the next of Node from which we started last time
            resultPtr2 = resultPtr1;

            firstPtr = head1;

            while (firstPtr != null) {

                // Multiply first list's digit with current second list's digit
                int mul = firstPtr.data * secondPtr.data + carry;

                // Assign the product to corresponding Node of result
                resultPtr2.data += mul % 10;

                // Resultant Node itself can have more than 1 digit
                carry = mul / 10 + resultPtr2.data / 10;
                resultPtr2.data = resultPtr2.data % 10;

                firstPtr = firstPtr.next;
                resultPtr2 = resultPtr2.next;
            }

            // If carry is remaining from last multiplication
            if (carry > 0) {
                resultPtr2.data += carry;
            }

            resultPtr1 = resultPtr1.next;
            secondPtr = secondPtr.next;

        }

        // reverse the result list
        reverse(result);
        result = temphead;

        // Remove if there are zeros at starting
        while (result.next != null && result.data == 0) {
            LinkedListNode<Integer> temp = result;
            result = result.next;
            // free(temp);
        }

        // Return head of multiplication list
        return result;

    }

    public static void multiply(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        LinkedListNode<Integer> print = multiplyLL(head1, head2);
        while (print != null) {
            System.out.print(print.data + " ");
            print = print.next;
        }
    }

}
