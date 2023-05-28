Amazing Strings
Shrey has just arrived in the city. When he entered the city, he was given two strings. Now, after arriving at his college, his professor gave him an extra string. To check his intelligence, his professor told him to check if the third string given to him has all the characters of the first and second strings in any order. Help Shrey before his professor scolds him. He has to answer “YES” if all characters are present else “NO”.
Example: ‘HELLO’ and ‘SHREY’ are two initial strings, and his professor gave him ’HLOHEELSRY’. So, here all the characters are present, so he has to say “YES”.
Note: The strings contain only uppercase Latin characters.
Input Format:
The first line contains a single integer ‘T’ representing the number of test cases. 

The first line of each test case contains three strings, and the first two strings, i.e. ‘FIRST’ and ‘SECOND’ are the strings which he was given at the beginning, and the third string is ‘THIRD’, which was given by the professor.
Output Format:
For each test case, you have to return “YES” if all characters are present in the third string of the first and second strings; else, return “NO”.

 Print the output of each test case in a separate line.
Note:
You don’t need to print anything; It has already been taken care of.
Constraints:
1 <= T <= 10^2
1 <= |FIRST|, |SECOND|, |THIRD| <= 10^5

Time Limit: 1 sec
Sample Input 1:
2
HI HEY EIHYH
ALL GOOD ADOLLG
Sample Output 1:
YES
NO
Explanation For Sample Input 1:
In the first test case, the string ‘THIRD’ has all the characters present in the strings ‘FIRST’ and ‘SECOND’. So, we will return “YES”.

In the second test case, the strings ‘FIRST’ and ‘SECOND’ combined has 1 A, 2 L, 1 G, 2 O and 1 D. While the string ‘THIRD’ has 1 A, 2 L, 1 G, 1 O and 1 D and So, it has one character less than the combined ‘FIRST’ and ‘SECOND’. Thus, we will return “NO”.
Sample Input 1:
2
CODING NINJA NINCODINGJA
YES NO NEEOOYS
Sample Output 1:
YES
NO
Explanation For Sample Input 1:
In the first test case, the string ‘THIRD’ has all the characters present in the strings ‘FIRST’ and ‘SECOND’. So, we will return “YES”.

In the second test case, the strings ‘FIRST’ and ‘SECOND’ combined have 1 N, 1 Y, 1 E, 1 S and 1 O. While the string ‘THIRD’ has 1 N, 1 Y, 2 E, 1 S and 2 O and So, it has one character more than ‘FIRST’ and ‘SECOND’. Thus, we will return “NO”.

  *************************************************************Answers***********************************************************************
public class Solution {
	public static String amazingStrings(String first, String second,String third) {
		// Write your code here.

		int[] s1 = new int[26];
		int[] s2 = new int[26];
		int[] s3 = new int[26];
		
		for(int i = 0; i < first.length(); i++) {

			s1[first.charAt(i) - 'A'] +=1;
		}
		for(int i = 0; i < second.length(); i++) {

			s2[second.charAt(i)-'A']+=1;
		}
		for(int i =0; i < third.length(); i++) {
			s3[third.charAt(i)-'A']+=1;
		}
		for(int i =0; i < 26; i++) {

			if(s1[i] + s2[i]!=s3[i]) {
				return "NO";
			}
		
		}
		return "YES";
	}
}

  
  
  
