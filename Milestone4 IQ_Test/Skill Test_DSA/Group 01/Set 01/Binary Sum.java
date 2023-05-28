#    Binary 

Ninja is playing with Binary Strings at his Granny’s house. Granny is always encouraging Ninja to practice math. So she has given him two binary strings. He has to return their sum as a binary string. Can you do it for Ninja?

  Input Format:
First line of input contains an integer t, representing the number of test cases.
First line of input of each test case contains the first binary string.
Second line of input each test case contains the second binary string.
  Constraints:
1 <= t <= 100
1 <= length of each string <= 10000
Time Limit: 1 second
Output Format:
For each query, you have to print the sum of the two given binary strings as a binary string.
  Sample Input 1:
1
1010001
1101
Sample Output 1:
1011110
Sample Input 2:
2
11001100
10
10000001
111101
Sample Output 2:
11001110
10111110
  
**************************Answer***********************************
import java.util.Scanner;

public class Solution{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int t = scanner.nextInt();

        // Process each test case
        for (int i = 0; i < t; i++) {
            // Read the binary strings
            String binary1 = scanner.next();
            String binary2 = scanner.next();

            // Calculate the sum of binary strings
            String sum = calculateBinarySum(binary1, binary2);

            // Print the result
            System.out.println(sum);
        }
    }

    private static String calculateBinarySum(String binary1, String binary2) {
        StringBuilder sum = new StringBuilder();
        int carry = 0;
        int i = binary1.length() - 1;
        int j = binary2.length() - 1;

        // Perform binary addition
        while (i >= 0 || j >= 0 || carry == 1) {
            int bit1 = (i >= 0) ? binary1.charAt(i--) - '0' : 0;
            int bit2 = (j >= 0) ? binary2.charAt(j--) - '0' : 0;

            int bitSum = bit1 + bit2 + carry;
            sum.insert(0, bitSum % 2);
            carry = bitSum / 2;
        }
        return sum.toString();
    }
}

