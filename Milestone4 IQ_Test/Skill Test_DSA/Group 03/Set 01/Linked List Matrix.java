Linked List Matrix
Given a Matrix mat of N*N size, write a program that constructs a 2D linked list representation of the given matrix.
Input : 2D matrix
1 2 3
4 5 6
7 8 9
Output :
1 -> 2 -> 3 -> NULL
|    |    |
v    v    v
4 -> 5 -> 6 -> NULL
|    |    |
v    v    v
7 -> 8 -> 9 -> NULL
|    |    |
v    v    v
NULL NULL NULL
Input Format :
 The first line takes an integer N as input.
 The next line input n*n integers denoting the matrix.
Output format:
Print the matrix using the linked list header.
Sample Input:
3
1 2 3 4 5 6 7 8 9
Sample Output:
1 2 3
4 5 6
7 8 9
****************************************ANSWERS*****************************

public class Solution{
    static Node construct(int arr[][],int n)
    {
        if(arr.length==0) return null;
        
        Node head=new Node(arr[0][0]),temp=head;
        for(int i=0;i<arr.length;i++)
    {
    Node head2 =temp;
    for(int j=0 ; j<arr[i].length ; j++ ){
         temp.right=j==arr[0].length-1? null:new Node(arr[i][j+1]);
         temp.down=i==arr.length-1? null:new Node(arr[i+1][j]);
         temp=temp.right;

    }
    temp=head2;
    temp= temp.down;
    }
    return head;
    }
}
