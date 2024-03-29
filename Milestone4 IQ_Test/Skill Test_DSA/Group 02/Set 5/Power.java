Power
Ninja is given an easy task. He has to implement a function which calculates a^b. But there is a small difference, b is an extremely large positive number given in the form of an array.
Note: Since answers can be huge, print answer mod 1337.
It is given that b will not contain leading zeros.
Input Format:
 First line of input contains an integer a
 Second line of input contains an integer n, representing the size of the array.
 Third line of input contains an array (space separated).
Constraints:
1 <= a <= 2^31 - 1
1 <= b.length <= 3 * 10^6
0 <= b[i] <= 9
Time Limit: 1 second
Output Format:
Single line of output printing a^b
Sample Input 1:
5
2
1 5
Sample Output:
944
Explanation:
5 to the power 15 is 30517578125. Its mod with 1337 is 944.

***********************************************Answers*****************************************


import java.util.* ; 
public class Solution {
    private static int pow(int a, int b) {
        int base = 1337;
        int res = 1;
        for(int i = 0; i < b; i++) {
            res = (res * (a % base)) % base;
        }
        return res;
    }

    public static int superPow(int a, int[] b) {
        if(a == 1) return 1;
        int base = 1337;
        a = a % base;
        int time = a;
        int res = 1;
        for(int index = b.length - 1; index >= 0; index--) {
            if(index < b.length - 1) {
                time = pow(time, 10);
            }
            int bit = pow(time, b[index]);
            res = (bit * res) % base;
        }
        return res;
    }
    
    
	public static void main(String[] args) {
		/* Your class should be named Solution.
 			* Read input as specified in the question.
 			* Print output as specified in the question.
		*/

		// Write your code here
        
        Scanner s = new Scanner(System.in) ; 
        
        int a = s.nextInt() ; 
        int n = s.nextInt() ; 
        int b[] = new int[n] ; 
        
        for(int i=0 ; i < n ; i++){
            b[i] = s.nextInt() ; 
        }
        
        System.out.print(superPow(a , b));
	}
}

	
