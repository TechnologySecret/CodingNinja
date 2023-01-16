/*
Half Diamond Pattern
Write a program to print N number of rows for Half Diamond pattern using stars and numbers
Note : There are no spaces between the characters in a single line.


Input Format :
A single integer: N
Output Format :
Required Pattern
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
*
*1*
*121*
*12321*
*121*
*1*
*
Sample Input 2 :
 5
Sample Output 2 :
*
*1*
*121*
*12321*
*1234321*
*123454321*
*1234321*
*12321*
*121*
*1*
*

*/


import java.util.*;
public class Solution {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int dub=0;    
        int half=2;
    	int next=0;
        int count1=1;
        int count2=1;
        int nc=n;
        int nc2=n-2;

        System.out.println("*");
        int row=1;
        while(row<=2*n-1){
            System.out.print("*");
            if(row<=n) {
                int col=1;
                while(col<=row){
                    System.out.print(col);
                    col++;
                }
                count++;
                dub=count-1;
                for(int col1=1;col1<count;col1++) {
                    System.out.print(dub);
                    dub--;
                }
                 half++;
            }
            else {
                /* half triangle */
                int i=1;
                while(i<nc) {
                    System.out.print(i);
                    i++;
                }
                nc--;
                int dub3=nc2;
                // for(int j=1;j<=nc2;j++) {
                int j=1;
                while(j<=nc2){
                    System.out.print(dub3);
                    dub3--;
                    
                    j++;
                }
                nc2--;
            }
            System.out.print("*");
            System.out.println();
            row++;
        }
        System.out.println("*");
    }
}
