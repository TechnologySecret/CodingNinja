/*
Binary to decimal

Given a binary number as an integer N, convert it into decimal and print.
Input format :
An integer N in the Binary Format
Output format :
Corresponding Decimal number (as integer)
Constraints :
0 <= N <= 10^9
Sample Input 1 :
1100
Sample Output 1 :
12
Sample Input 2 :
111
Sample Output 2 :
7
  */

import java.util.*;
public class Main {
	public static void main(String[] args) {
		// Write your code here
		 int binnum, decnum=0, i=1, rem;
      Scanner scan = new Scanner(System.in);
      binnum = scan.nextInt();
      while(binnum!=0)
      {
         rem = binnum%10;
         decnum = decnum + (rem*i);
         i = i*2;
         binnum = binnum/10;
      }
      System.out.println(decnum);


	}
}
