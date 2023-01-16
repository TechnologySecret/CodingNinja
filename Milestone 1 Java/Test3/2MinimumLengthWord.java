/*
Minimum Length Word

Given a string S (that can contain multiple words), you need to find the word which has minimum length.
Note : If multiple words are of same length, then answer will be first minimum length word in the string.
Words are seperated by single space only.
Input Format :
String S
Output Format :
Minimum length word
Constraints :
1 <= Length of String S <= 10^5
Sample Input 1 :
this is test string
Sample Output 1 :
is
Sample Input 2 :
abc de ghihjk a uvw h j
Sample Output 2 :
a
*/

public class Solution {
	
	public static String minLengthWord(String input){
		
		// Write your code here
		int minStart=-1;
		int minLength = Integer.MAX_VALUE;
    int currentStart = 0;
        int i=0;
    for(;i<input.length();i++)
    {
        if(input.charAt(i)==' '){
            int currentLength = i-currentStart;
            if(currentLength<minLength){
                minStart=currentStart;
                minLength = currentLength;
            }
            currentStart= i+1;
        }
    }
	if(minStart == -1){
        return input;
    }else{
        int currentLength = i - currentStart;
        if(currentLength<minLength){
            minStart= currentStart;
            minLength=currentLength;
        }
        return input.substring(minStart, minStart+minLength);
    }
	
}

public static void main(String[] args) {
        String str = "this is test m";
        System.out.println(minLengthWord(str));
}
}
