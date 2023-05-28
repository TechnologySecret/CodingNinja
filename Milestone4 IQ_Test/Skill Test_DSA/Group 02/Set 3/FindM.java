

 FindM  :- About this questions: 
   Math.max()is used to find out the largest of two numbers.
   It takes two parameters and returns the larger of the two.
   The data type of the returning variable is the same as the input parameters.
   Use the max(double a, double b), max(float a, float b), max(int a, int b), max(long a, long b)API methods of Math according to the types of arguments to get...











*******************************************Answers**************************************************

import java.util.Scanner;

public class FindM {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int matrixRow = s.nextInt();
        String[] input = new String[matrixRow];
        for(int i=0;i<matrixRow;i++){
            input[i] = s.next();//string lengths may be different
        }
        char[][] matrix = new char[matrixRow][];
        for(int i = 0;i<matrixRow;i++){
            matrix[i] = new char[input[i].length()];
            for(int j=0;j<input[i].length();j++){
                matrix[i][j] = input[i].charAt(j);
            }
        }

    }
    static int findPath(char[][] matrix,String word){
        int len1 = matrix.length;
        int len2 = matrix[0].length;
        for (int i=0;i<len1;i++){
            for (int j=0;j<len2;j++){

            }
        }
        return 1;
    }
}
