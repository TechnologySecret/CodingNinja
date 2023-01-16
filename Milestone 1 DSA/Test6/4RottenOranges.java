/*
Rotten Oranges
Send Feedback
You are given a 2D array of integers of size N * M. Each of the cell contains either of these 3 integers: 0, 1, 2. The integer 2 denotes a rotten orange, 1 denotes a fresh orange and 0 denotes an empty cell.
Each rotten orange can rot fresh oranges in 4 adjacent cells in 1 unit of time. The 4 cells are left, right, top and bottom cell.
For a given matrix, find the minimum units of time in which all oranges become rot. Return -1, if it is not possible.
Input Format:
The first line of input contains 2 space separated integers, N and M, that denotes size of given 2D array.
The following N lines contains M space separated integers, that denotes the value of cells of given 2D array.
Constraints:
Value of N and M lies in the range: [1, 10000].
Value of each cell in 2D array can be either 0, 1 or 2.
Output Format:
Print the required integer, as described in the problem description.   
Sample Input 1:
3 5
2 1 0 2 1
1 0 1 2 1
1 0 0 2 1
Sample Output 1:
2
Explanation:
 In the first unit of time, fresh oranges at coordinates: (0, 1), (0, 4), (1, 0), (1, 2), (1, 4), (2, 4).
 In the second unit of time, fresh orange at coordinate: (2, 0) gets rot. Hence, in 2 units of time, all the fresh oranges become rot.
Sample Input 2:
3 5
2 1 0 2 1
1 0 1 0 1
1 0 0 0 2
Sample Output 2:
-1
Explanation:
It is impossible to rot the fresh orange at (1, 2).   
*/

import java.util.Scanner;
public class Main {

	// Check if i, j is under the array
	// limits of row and column
	static boolean issafe(int i, int j, int R, int C) {
		return i >= 0 && i < R &&
				j >= 0 && j < C;
	}

	static int rotOranges(int v[][]) {
		boolean changed = false;
		int no = 2;
		int R = v.length, C = v[0].length;

		while (true) {
			for (int i = 0; i < R; i++) {
				for (int j = 0; j < C; j++) {

					// Rot all other oranges present at
					// (i+1, j), (i, j-1), (i, j+1), (i-1, j)
					if (v[i][j] == no) {
						if (issafe(i + 1, j, R, C) &&
								v[i + 1][j] == 1) {
							v[i + 1][j] = v[i][j] + 1;
							changed = true;
						}
						if (issafe(i, j + 1, R, C) &&
								v[i][j + 1] == 1) {
							v[i][j + 1] = v[i][j] + 1;
							changed = true;
						}
						if (issafe(i - 1, j, R, C) &&
								v[i - 1][j] == 1) {
							v[i - 1][j] = v[i][j] + 1;
							changed = true;
						}
						if (issafe(i, j - 1, R, C) &&
								v[i][j - 1] == 1) {
							v[i][j - 1] = v[i][j] + 1;
							changed = true;
						}
					}
				}
			}

			// If no rotten orange found it means all
			// oranges rottened now
			if (!changed)
				break;

			changed = false;
			no++;
		}

		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {

				// If any orange is found to be
				// not rotten then ans is not possible
				if (v[i][j] == 1)
					return -1;
			}
		}

		// Because initial value for a rotten
		// orange was 2
		return no - 2;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(), m = scanner.nextInt();
		int[][] arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		System.out.println(rotOranges(arr));
	}
}

