/*
Check AP

Given input consists of n numbers. Check whether those n numbers form an arithmetic progression or not. Print true or false.
Input format :
Line 1 : n
Line 2 : n numbers
Sample Input 1 :
6
2 6 10 14 18 22
Sample Output 1 :
true
Sample Input 2 :
6
2 6 10 15 19 23
Sample Output 2 :
false
*/

import java.util.*;
public class Main {
	public static void main(String[] args) {
		// Write your code here

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int prev = s.nextInt();
		int curr = s.nextInt();
		int diff = curr - prev;
		boolean isAp = true;
		for (int i = 0; i < n - 2; i++) {
			prev = curr;
			curr = s.nextInt();
			if ((curr - prev) != diff) {
				isAp = false;
				break;
			}
		}
		System.out.print(isAp);

	}
}
