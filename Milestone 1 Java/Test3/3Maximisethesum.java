/*
Maximise the sum

Given 2 sorted arrays (in increasing order), find a path through the intersections that produces maximum sum and return the maximum sum.
That is, we can switch from one array to another array only at common elements.
If no intersection element is present, we need to take sum of all elements from the array with greater sum.
Input Format :
 Line 1 : An integer M i.e. size of first array
 Line 2 : M integers which are elements of first array, separated by spaces
 Line 3 : An integer N i.e. size of second array
 Line 4 : N integers which are elements of second array, separated by spaces
Output Format :
Maximum sum value
Constraints :
1 <= M, N <= 10^6
Sample Input :
6
1 5 10 15 20 25
5
2 4 5 9 15
Sample Output :
81
Explanation :
We start from array 2 and take sum till 5 (sum = 11). Then we'll switch to array at element 10 and take till 15. So sum = 36. Now, no elements left in array after 15, so we'll continue in array 1. Hence sum is 81
*/
public class Solution{
    public static long maximumSumPath(int ar1[], int ar2[]){
        int m = ar1.length, n = ar2.length;
        int i = 0, j = 0;
        long result = 0, sum1 = 0, sum2 = 0;
        while (i < m && j < n){
            if (ar1[i] < ar2[j])
                sum1 += ar1[i++];
            else if (ar1[i] > ar2[j])
                sum2 += ar2[j++];
            else
            {
                result += Math.max(sum1, sum2);
                sum1= 0;
                sum2= 0;
                                while (i < m && j < n && ar1[i] == ar2[j]) 
                {
                    result = result + ar1[i++];
                    j++;
                }
            }
        }
        while (i < m)
            sum1 += ar1[i++];
        while (j < n) 
        sum2 += ar2[j++];
        result += Math.max(sum1, sum2);
        return result;
    }
}

