/*
Number Star pattern 1
Send Feedback
Print the following pattern for given number of rows.
Input format :
Integer N (Total number of rows)
Output Format :
Pattern in N lines
Sample Input :
   5
Sample Output :
 5432*
 543*1
 54*21
 5*321
 *4321
 */
import java.util.*;

public class runner {

	public static void main(String[] args) {
		// Write your code here
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a, b;
		for (a = 1; a <= n; a++) {
			for (b = n; b >= 1; b--) {
				if (b != a)
					System.out.print(b);
				else
					System.out.print("*");
			}
			System.out.println("");
		}

	}
}
