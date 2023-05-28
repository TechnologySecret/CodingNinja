####    Group sum
Given an integer array A of size N and an integer k, check if it is possible to choose a group of some of the integers in the array such that the group sums to the given target k.
There is one with this additional constraint -
if there are numbers in the array that are adjacent and having identical values, they must either all be chosen, or none of them chosen.
Return true or false.
For example, with the array {1, 2, 2, 2, 5, 2}, either all three 2's in the middle must be chosen or not, all as a group.
Input Format :
Line 1 : Integer N
Line 2 : Elements of array (separated by space)
Line 3 : Integer k
Output Format :
true or false
Constraints :
1 <= N <= 30
1 <= Ai <= 10^4
Sample Input 1 :
4
2 4 4 8
14
Sample Output 1 :
false
Sample Input 2 :
5
2 4 4 1 8
16
Sample Output 2 :
true


***********************************************Answers*****************************************

import java.util.* ; 
public class Solution{    
  public  static boolean isSubsetSum(int set[],  int n, int sum){
        // Base Cases
        if (sum == 0)
            return true;
        if (n == 0)
            return false;
  
        // If last element is greater than
        // sum, then ignore it
        if (set[n - 1] > sum)
            return isSubsetSum(set, n - 1, sum);
  
        /* else, check if sum can be obtained 
        by any of the following
            (a) including the last element
            (b) excluding the last element */
        return isSubsetSum(set, n - 1, sum) || isSubsetSum(set, n - 1, sum - set[n - 1]);
    }
 public static boolean subsetSumToKIdentical(int input[], int n,int k){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
	 	 * Taking input and printing output is handled automatically.
		 */
   ArrayList<Integer> arr = new ArrayList<>() ; 
        for(int i= 1 ; i < n ; i++){
            int sum = input[i] ; 
            while(arr.size() != 0 && input[i] == arr.get(arr.size()-1)){
                sum+= input[i] ;  
                i++ ; 
            }
            arr.add(sum) ; 
            sum = 0 ; 
        }
        int[] newArr = new int[arr.size()] ; 
        
        for(int i= 0 ; i < arr.size() ; i++){
            newArr[i] = arr.get(i) ; 
        }
        return isSubsetSum(newArr , newArr.length, k) ; 
	}
}


