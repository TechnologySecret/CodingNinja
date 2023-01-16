/*
Code : Triangle of Numbers

Print the following pattern for the given number of rows.
Pattern for N = 4



The dots represent spaces.



Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
           1
         232
       34543
     4567654
   567898765
Sample Input 2:
4
Sample Output 2:
           1
         232
       34543
     4567654
     */

import java.util.Scanner;
public class Solution{
	public static void main(String[] args){
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int k = 0, count = 0, count1 = 0;
    for (int i = 1; i <= n; ++i) {
      for (int space = 1; space <= n - i; ++space) {
        System.out.print("  ");
        ++count;
      }
      while (k != 2 * i - 1) {
        if (count <= n- 1) {
          System.out.print((i + k));
          ++count;
        } else {
          ++count1;
          System.out.print((i + k - 2 * count1));
        }
        ++k;
      }
      count1 = count = k = 0;
      System.out.println();
    }
	}			
}
