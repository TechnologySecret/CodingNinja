/*
Number of Digits

Given the number 'n', find out and return the number of digits present in a number .
Input Format :
Integer n
Output Format :
Count of digits
Constraints :
1 <= n <= 10^6
Sample Input 1 :
 156
Sample Output 1 :
3
Sample Input 2 :
 7
Sample Output 2 :
1
*/

import java.util.*;
public class Solution{

	static int cnt=0;
	public static int count(int n){
		//Write your code here
		if(n>0){
			cnt++;
			count(n/10);
		}
		return cnt;
	}
	public static void main(String arg[]){
		Scanner sc= new Scanner(System.in);
		int res=0;
		int n=sc.nextInt();
		res=count(n);
		System.out.println(" "+res);
	}
}

