/*

Link : https://practice.geeksforgeeks.org/problems/palindromic-array/1/?track=SP-2.1

Given a Integer array A[] of n elements. Your task is to complete the function PalinArray. Which will return 1 if all the elements of the Array are palindrome otherwise it will return 0.

Input:
The first line of input contains an integer denoting the no of test cases. Then T test cases follow. Each test case contains two lines. The first line of input contains an integer n denoting the size of the arrays. In the second line are N space separated values of the array A[].

Output:
For each test case in a new line print the required result.

Constraints:
1<=T<=50
1<=n<=20
1<=A[]<=10000

Example:
Input:
2
5
111 222 333 444 555
3
121 131 20

Output:
1
0

Explanation:
For First test case.
n=5;
A[0]=111    //which is a palindrome number.
A[1]=222   //which is a palindrome number.
A[2]=333   //which is a palindrome number.
A[3]=444  //which is a palindrome number.
A[4]=555  //which is a palindrome number.
As all numbers are palindrome so This will return 1.

*/

import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}

class GfG
{
	public static int palinArray(int[] a, int n)
           {
               int num,count=0,digit,rev;
                for(int i=0;i<n;i++){
                    num = a[i];
                    digit = 0;
                    rev = 0;
                    do
                     {
                         digit = num % 10;
                         rev = (rev * 10) + digit;
                         num = num / 10;
                     } while (num != 0);
                     if(rev == a[i])
                        count++;
                }
                if(count == n)
                    return 1;
                else
                    return 0;
           }
}
