Pyramid Number Pattern
Print the following pattern for the given number of rows.
Pattern for N = 4
   1
  212
 32123
4321234
Input format : N (Total no. of rows)

Output format : Pattern in N lines

Sample Input :
5
Sample Output :
        1
      212
    32123
  4321234
543212345
          
***********************************************Answers*****************************************
import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
     int n =sc.nextInt();
         int i,j;
        for( i=1;i<=n;i++)
        {
            for( j=1;j<=n-i;j++)
            {
                System.out.print(" ");
                
            }
            for( j=i;j>=1;j--)
            {
                System.out.print(j);
                
            }
            for( j=2;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
		}
	}
}


          
