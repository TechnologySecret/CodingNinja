
public class Solutions{
    /*
    You are given a binary string ‘STR’, containing only zeroes and ones.
Your task is to determine the total number of substrings having only ones.
Input Format:
The first line contains an integer ‘T’, which denotes the number of test cases to be run. Then, the T test cases follow.

The first line of each test case contains a single string, 'STR',
Output Format:
For each test case, print a single line containing a single integer, denoting the total number of substrings containing only ones.

The output for each test case will be printed in a separate line.
Note:
You do not need to print anything. It has already been taken care of. Just implement the given function.
Constraints:
1 <= T <= 10
1 <= |STR| <= 10 ^ 5

Where ‘T’ denotes the number of test cases and |STR| represents the total length of the string, ‘STR’.

Time Limit: 1 sec.
Sample Input 1:
1
1101
Sample Output 1:
4
Explanation for sample input 1:
In the given test case, there are 3 required substrings of length 1, at indices, 0, 1, and 3. There is also a required substring of length 2 starting at index 0.
So, there are a total of 4 substrings having only ones.
Sample Input 2:
1
111
Sample Output 2:
6
Explanation for sample input 2:
In the given test case, there are 3 required substrings of length 1, at indices, 0, 1, and 2. There are 2 required substrings of length 2, starting at indices, 0 and 1. There is also a required substring of length 3 starting at index 0.
So, there are a total of 6 substrings containing only ones.
     */
  
public static int findOneStrings(String str) {
        int res = 0, count = 0;
        for(int i = 0; i < str.length(); i++) {
            count = str.charAt(i) == '1' ? count + 1 : 0;
            res = (res + count);
        }
        return res;
    }
    public static void main(String[] args)
    {
        Test object = new Test();
    }

}
class Test
    {
        int a;
        int b;
        Test()
        {
            this(10, 20);
            System.out.print("constructor one ");
        }
        Test(int a, int b)
        {
            this.a = a;
            this.b = b;
            System.out.print("constructor two ");
        }
}
