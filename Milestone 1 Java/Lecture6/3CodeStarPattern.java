/*
Code : Star Pattern

Print the following pattern
Pattern for N = 4

The dots represent spaces.

Input Format :
N (Total no. of rows)
Output Format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
   *
  *** 
 *****
Sample Input 2 :
4
Sample Output 2 :
    *
   *** 
  *****
 *******
 */


import java.util.*;
public class Solution {
	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int i= 1;
        while(i<=n){
           int space =1;
           while(space <= n-i){
            System.out.print(' ');
            space++;
           }
            int num=1;
            while(num <= i){
                System.out.print("*");
                num++;
            }
           int  dec= i-1;
            while(dec>= 1){
                System.out.print("*");
                dec--;
            }
            System.out.println();
            i++;
        }

		
	}

}
