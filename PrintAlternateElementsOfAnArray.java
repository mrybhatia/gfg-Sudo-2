/*

Link : https://practice.geeksforgeeks.org/problems/print-alternate-elements-of-an-array/1/?track=SP-2.1

This is a functional problem . Your task is to write the print(int ar[ ], int n) funciton which prints the alternate elements of an array.

Input:

The first line of input contains T denoting the number of testcases.Then each of the T lines contains a single positive integer N denotes number of element in array. Next line contain 'N' integer elements of the array.


Output:

Print the alternate elements of the array(starting from index 0).


Constraints:


1<=T<=200

1<=N<=10^5

1<=ar[i]<=10^5

Example:

Input:

2
4
1 2 3 4
5
1 2 3 4 5

Output:

1 3
1 3 5
*/

import java.util.*;
class Alternate
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
             GfG gfg = new GfG();
             gfg.print(arr, n);
             System.out.println();
             
        }
    }
}

class GfG
{   StringBuilder out = new StringBuilder();
    public void print(int arr[], int n)
    {
        for(int i=0;i<n;i=i+2){
            out.append(arr[i]);
            out.append(" ");
        }
        System.out.print(out);
    }
}
