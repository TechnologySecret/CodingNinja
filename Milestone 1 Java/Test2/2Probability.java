/*
Probability

An urn contains 8 balls : 4 red , 2 blue and 2 green. Now n balls are drawn out of the urn. Calculate the probability that out of n drawn balls exactly x balls are red.
Find your answer multiplied by 100 and return the integer part.
All required values for computation will be in integer range.
x is always less than equal to 4 and x is always less than equal to n.
Input format :
Two spaced integers : n and x
Output format :
Integer part of (Probability * 100). 
Sample Input 1 :
3 1
Sample Output 1:
42
*/

public class Solution{
public static int factorial(double num) {
    int fact = 1;
    for (int i = 2; i <= num; i++) {
      fact *= i;
    }
    return fact;
  }
public static int probability(int n, int x) {
    double Ns, Ne1, Ne2;
    int Pe;
    Ns = factorial(8.0) / (factorial(n * 1.0) * factorial(8.0 - n));
    Ne1 = factorial(4.0) / (factorial(x * 1.0) * factorial(4.0 - x));
    Ne2 = factorial(4.0) /
          (factorial(((n - x) * 1.0)) * factorial((4.0 - (n - x))));
    Pe = (int)(((Ne1 * Ne2) / Ns) * 100);
    return Pe;
  }
}
