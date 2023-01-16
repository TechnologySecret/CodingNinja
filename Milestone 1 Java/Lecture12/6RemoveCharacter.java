/*
Remove character
Send Feedback
For a given a string(str) and a character X, write a function to remove all the occurrences of X from the given string.
The input string will remain unchanged if the given character(X) doesn't exist in the input string.
Input Format:
The first line of input contains a string without any leading and trailing spaces.

The second line of input contains a character(X) without any leading and trailing spaces.
Output Format:
The only line of output prints the updated string. 
Note:
You are not required to print anything explicitly. It has already been taken care of.
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1:
aabccbaa
a
Sample Output 1:
bccb
Sample Input 2:
xxyyzxx
y
Sample Output 2:
xxzxx
*/

public class Solution {

	public static String reverseEachWord(String str) {
		//Your code goes here
		int n = str.length();
		String ans= "";
		int end = 0;
		int start=0;
		int i;
		for( i = 0;i<n;i++)
		{	
			if(str.charAt(i)==' ')
			{
				 end = i-1;
				 String rw = "";
				 
				 for(int j = start;j<=end;j++)
					{
						rw=str.charAt(j)+rw;
						
					}
				 ans +=rw+" ";
				 start = i+1;	

			}
		}
		end = i-1;
		String rw = "";
		end =i-1;
		 
		 for(int j = start;j<=end;j++)
			{
				rw=str.charAt(j)+rw;
				
			}

		ans += rw;
		return ans;



	}

}



