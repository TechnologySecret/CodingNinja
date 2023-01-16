/*
Code : Interesting Alphabets

Print the following pattern for the given number of rows.
Pattern for N = 5
E
DE
CDE
BCDE
ABCDE
Input format :
N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 26
Sample Input 1:
8
Sample Output 1:
H
GH
FGH
EFGH
DEFGH
CDEFGH
BCDEFGH
ABCDEFGH
Sample Input 2:
7
Sample Output 2:
G
FG
EFG
DEFG
CDEFG
BCDEFG
ABCDEFG
*/


import java.util.*;

public class Solution {
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
            int n=sc.nextInt();
            int i=1;
            int k=n;
            while(i<=n){
                char scc='A';
                scc=(char)(scc+k-1);
                int j=1;
                while (j<=i){
                    System.out.print(scc);
                    scc=(char)(scc+1);
                    j++;
                }
                System.out.println();
                i++;
                k--;
            }
    }
}
