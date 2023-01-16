/*
Code : Alpha Pattern
Print the following pattern for the given N number of rows.
Pattern for N = 3
 A
 BB
 CCC
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 26
Sample Input 1:
7
Sample Output 1:
A
BB
CCC
DDDD
EEEEE
FFFFFF
GGGGGGG
Sample Input 2:
6
Sample Output 2:
A
BB
CCC
DDDD
EEEEE
FFFFFF
*/

import java.util.*;
public class Solution {

	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i=1;
        while(i<=num){
            int j=1;
            while(j<=i){
                char ch=(char)('A'+i-1);
                System.out.print(ch);
                j=j+1;
            }
            System.out.println();
            i=i+1;
            }
	}

}
