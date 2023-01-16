/*
Palindrome number

Write a program to determine if given number is palindrome or not. Print true if it is palindrome, false otherwise.
Palindrome are the numbers for which reverse is exactly same as the original one. For eg. 121
Sample Input 1 :
121
Sample Output 1 :
true
Sample Input 2 :
1032
Sample Output 2 :
false
*/

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// Write your code here
      Scanner s=new Scanner(System.in);
        int num =s.nextInt();
        int org_num=num;
        int rev = 0;
        while(num>0){
            int rem = num%10;
            rev = rev*10 +rem; num =num/10;
        }
        if(org_num==rev){
            System.out.println(true);
        } else{
            System.out.println(false);
        }
    }
}
