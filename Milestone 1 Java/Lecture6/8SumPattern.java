/*
Sum Pattern
Write a program to print triangle of user defined integers sum.
Input Format :
A single integer, N
Output Format :
Required Pattern
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
1=1
1+2=3
1+2+3=6
Sample Input 2 :
 5
Sample Output 2 :
1=1
1+2=3
1+2+3=6
1+2+3+4=10
1+2+3+4+5=15
*/

import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int currRow = 1;
		int sum = 0;
		while (currRow <= n) {
			sum += currRow;
			int currCol = 1;
			while (currCol <= currRow) {
				System.out.print(currCol);
				if (currCol == currRow) {
					System.out.print("=");
				} else {
					System.out.print("+");
				}
				++currCol;
			}
			System.out.println(sum);
			++currRow;
		}
	}
}
