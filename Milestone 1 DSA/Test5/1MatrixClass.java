/*
Matrix Class
Send Feedback
Write a code to perform different operations on matrix.
1. Addition
 You are given two matrices return the addition of these two matrices.
2. Multiplication
Given two matrices return the matrix multiplication of them.(Both the matrices will always be multiplicable).
3. Transpose
Given a Matrix calculate the transpose of the matrix and return it. (Number of rows and columns will be same)
4. Rotate by 90
Given a Matrix, rotate the matrix by 90 degree in anticlockwise direction.
Input format :
Line 1: Operation to be performed
Line 2 : No of rows(n1) & No of columns(m1) (separated by space)
Line 3 : Row 1 elements (separated by space)
Line 4 : Row 2 elements (separated by space)
Line 5 : and so on
(If needed)
Line n1+2 : No of rows(n2) & No of columns(m2)(separated by space)
Line n1+3 : Row 1 elements (separated by space)
Line n1+4 : Row 2 elements (separated by space)
Line n1+5 : and so on
Sample Input 1 :
1
2 2
1 2
1 3
2 2
4 3
1 5
Sample output 1 :
5 5
2 8
Sample Input 2 :
2
2 2
1 2
1 3
2 2
4 3
1 5
Sample output 2 :
6 13
7 18
Sample Input 3 :
3
2 2
1 2
1 3
Sample output 3 :
1 1
2 3
Sample Input 4 :
4
2 2
1 2
1 3
Sample output 4 :
2 3
1 1
Note : Partial marking is there, so implementation of each function will give you some marks.

*/

/* Signature of four required functions is given in the code. You can create other functions as well if you need.
*  Also you should submit your code even if you are not done with all the functions. 
*/
public class mat {
	int[][] matrix;

	mat(int[][] mat) {
		matrix = mat;
	}

	public static mat add(mat a, mat b) {
		int ans[][] = new int[a.matrix.length][a.matrix[0].length];
		for (int i = 0; i < a.matrix.length; i++) {
			for (int j = 0; j < a.matrix[0].length; j++) {
				ans[i][j] = a.matrix[i][j] + b.matrix[i][j];
			}
		}
		mat answer = new mat(ans);
		return answer;
	}

	public static mat multiply(mat a, mat b) {

		int ans[][] = new int[a.matrix.length][b.matrix[0].length];
		for (int i = 0; i < a.matrix.length; i++) {
			for (int j = 0; j < b.matrix[0].length; j++) {
				for (int k = 0; k < a.matrix[0].length; k++) {
					ans[i][j] += a.matrix[i][k] * b.matrix[k][j];
				}

			}
		}
		mat answer = new mat(ans);
		return answer;
	}

	public static mat transpose(mat m) {
		int trans_matrix[][] = new int[m.matrix.length][m.matrix.length];
		for (int i = 0; i < m.matrix.length; i++) {
			for (int j = 0; j < m.matrix.length; j++) {
				trans_matrix[i][j] = m.matrix[j][i];
			}
		}
		mat answer = new mat(trans_matrix);
		return answer;
	}

	public static mat rotate(mat m) {
		int r = m.matrix.length;
		int c = m.matrix[0].length;
		int[][] rotate_mat = new int[c][r];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++)
				rotate_mat[c - j - 1][i] = m.matrix[i][j];
		}
		mat answer = new mat(rotate_mat);
		return answer;
	}

	public void print() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
		System.out.println();
		}
	}
}
