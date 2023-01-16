/*
Odd Square

Write a program to print the pattern for the given N number of rows.
For N = 4
1357
3571
5713
7135
Input Format :
A single integer: N
Output Format :
Required Pattern
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
135
351
513
Sample Input 2 :
 5
Sample Output 2 :
13579
35791
57913
79135
91357
**/

import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while (i <= n) {
			int j = i - 1;
			while (j < n) {
				System.out.print((2 * j + 1));
				j++;
			}
			int k = 0;
			while (k < i - 1) {
				System.out.print((2 * k + 1));
				k++;
			}
			System.out.println();
			i++;
		}
	}
}
