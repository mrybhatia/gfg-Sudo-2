/*

Link : https://practice.geeksforgeeks.org/problems/print-the-pattern-set-1/1/?track=SP-2.1

Your task is to complete the function printPat which takes one argument 'n' denoting the length of the pattern and prints the following pattern
for n=2 the pattern will be 
2 2 1 1
2 1
for n=3 the pattern will be 
3 3 3 2 2 2 1 1 1
3 3 2 2 1 1
3 2 1

Input:
The first line of input is the number of test cases .  The T test cases follow . The first line of each test case is an integer N.

Output:
For each test case print the required pattern in a single line . 
Note : Instead of printing new line print a "$" without quotes.

Constraints:
1<=T<=20
1<=N<=40

Example:
Input
1
2
3
Output
2 2 1 1 $2 1 $
3 3 3 2 2 2 1 1 1 $3 3 2 2 1 1 $3 2 1 $
*/

import java.util.Scanner;
class PrintPattern
{
	public  static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			GfG g = new GfG();
			g.printPat(n);
			System.out.println();
		
		t--;
		}
	}
}


class GfG
{   StringBuilder out = new StringBuilder();
    void printPat(int n)
    {
        
         int t;
         int dn = n;
         while(dn!=0){
             t = n;
             for(int i=0;i<n;i++){
                 for(int j=0;j<dn;j++){
                    out.append(t);
                    out.append(" ");
                 }
                 t=t-1;
                 
             }out.append("$");
             dn--;
         }
         System.out.print(out); 
    }
}
