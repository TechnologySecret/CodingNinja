/*
Sort 0 1 2
Send Feedback
You are given an integer array/list(ARR) of size N. It contains only 0s, 1s and 2s. Write a solution to sort this array/list in a 'single scan'.
'Single Scan' refers to iterating over the array/list just once or to put it in other words, you will be visiting each element in the array/list just once.
Note:
You need to change in the given array/list itself. Hence, no need to return or print anything. 
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the array/list.

Second line contains 'N' single space separated integers(all 0s, 1s and 2s) representing the elements in the array/list.
Output Format :
For each test case, print the sorted array/list elements in a row separated by a single space.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^5
Time Limit: 1 sec
Sample Input 1:
1
7
0 1 2 0 2 0 1
Sample Output 1:
0 0 0 1 1 2 2 
Sample Input 2:
2
5
2 2 0 1 1
7
0 1 2 0 1 2 0
Sample Output 2:
0 1 1 2 2 
0 0 0 1 1 2 2

*/


public class Solution {

    public static void printArr(int [] arr){
        int n=arr.length;
        for(int i=0; i<=n; i++){
            System.out.print(arr[i]+" ");
        }
    }
  public static void sort012(int[] arr){
    	//Your code goes here
          int indexOf0 = 0;
        int IndexOf2 = arr.length -1;
        int i = 1;
        int temp = 0;
        while(i < arr.length )  {
            if(arr[i] == 0 && i > indexOf0) {
                temp = arr[i];
                arr[i] = arr[indexOf0];
                arr[indexOf0] = temp;
                indexOf0++;
            } else if(arr[i] == 2 && i < IndexOf2) {
                temp = arr[i];
                arr[i] = arr[IndexOf2];
                arr[IndexOf2] = temp;
                IndexOf2--;
            } else
                i++;
        }
    }



 public static void main(String arg[]){
        int arr[]={0, 1,2,1,1,2};
        sort012(arr);
        printArr(arr);
    }
}
