/*
LINK : https://practice.geeksforgeeks.org/problems/multiply-matrices/1/?track=SP%20-%202.2

Given two square Matrices A[][] and B[][]. Your task is to complete the function multiply which stores the multiplied matrices in a new matrix C[][].
 

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains an integer N denoting the size of the square matrix . Then in the next two lines are N*N space separated values of the matrix A[][] and B[][].
 

Output:
For each test case in a new line output will be the space separated values of the matrix C[][].
 

Constraints:
1<=T<=100
1 <= N <= 20
 

Example(To be used for the expected output):
Input:
2
2
7 18 2 9 
14 5 5 18 
2
17 4 17 16 
9 2 7 1 
Output:
188 359 73 172 
181 38 265 50 

*/


import java.util.Scanner;
class Matrix{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			int n = sc.nextInt();
			int[][] a = new int[n][n];
			int[][] b = new int[n][n];
			int[][] c = new int[n][n];
			for(int i = 0; i < n; i++)
				for(int j = 0; j < n; j++)
					a[i][j]=sc.nextInt();
			for(int i = 0 ;i < n; i++)
				for(int j = 0; j < n; j++)
					b[i][j]=sc.nextInt();
			GfG g = new GfG();
			g.multiply(a,b,c,n);
			for (int i = 0; i < n; i++)
			{for (int j = 0; j < n; j++)
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}


/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*Complete the function below*/
class GfG
{
      public static void multiply(int A[][], int B[][], int C[][], int N)
        {
           int n = N;
           for (int i = 0; i < n; i++){
              for (int j = 0; j < n; j++){
                  for (int k = 0; k < n; k++){
                      C[i][j] += A[i][k]*B[k][j];
                  }
              }
    		   }
        }
}
