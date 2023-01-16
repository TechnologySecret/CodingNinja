/*
Remove Duplicates Recursively
Send Feedback
Given a string S, remove consecutive duplicates from it recursively.
Input Format :
String S
Output Format :
Output string
Constraints :
1 <= |S| <= 10^3
where |S| represents the length of string
Sample Input 1 :
aabccba
Sample Output 1 :
abcba
Sample Input 2 :
xxxyyyzwwzzz
Sample Output 2 :
xyzwz
*/
public class Solution {

	public static String removeConsecutiveDuplicates(String s) {
		// Write your code here
	if(s.length()<=1){
		return s;
	}
	String smallans= removeConsecutiveDuplicates(s.substring(1));
	if(smallans.charAt(0) == s.charAt(0)){
		return smallans;
	}
	else{
		return s.charAt(0) +smallans;
	}
	}


}
