##Reset Matrix
Given an m x n matrix of 0s and 1s, if an element is 0, set its entire row and column to 0. Do it in place.
Note : You don't need to print the matrix. Just change in the given input.

Input format :
Line 1 : No. of rows & No. of columns (separated by space)
Line 2 : Row 1 elements (separated by space)
Line 3 : Row 2 elements (separated by space)
Line 4 : and so on

Sample Input 1 :
3 3
1 0 1
1 1 1 
1 1 1
Sample Output 1 :
0 0 0
1 0 1
1 0 1
  
***********************************************Answers*****************************************
public class solution {
	public static void makeRowsCols0(int [][]input) {
		boolean []row= new boolean[input.length];
        boolean []col= new boolean[input[0].length];
        for(int i =0;i<row.length;i++)
        {
            for(int j=0;j<col.length;j++)
            {
                if(input[i][j]==0)
                {
                    row[i]=true;
                    col[j]=true;
                    
                }
            }
        }
		 for(int i=0;i<row.length;i++)
         {
             if(row[i])
             {
                 for(int j=0;j<col.length;j++)
                 {
                     input[i][j]=0;
                 }
             }
         }
        for(int i=0;i<col.length;i++)
        {
            if(col[i])
            {
                for(int j=0;j<row.length;j++)
                {
                    input[j][i]=0;
				}
			}
		}
	}
}
           
  
