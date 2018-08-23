/*

Link : https://practice.geeksforgeeks.org/problems/third-largest-element/1/?track=SP-2.1

Given an array of distinct elements, Your task is to find the third largest element in it. You have to complete the function thirdLargest which takes two argument . The first argument is the array a[] and the second argument is the size of the array (n). The function returns an integer denoting the third largest element in the array a[].

The function should return -1 if there are less than 3 elements in input.
 

Input:

The first line of input contains an integer T denoting the number of test cases. Then T test cases follow . The first line of each test case is N,N is the size of array.The second line of each test case contains N space separated values of the array a[ ].

Output:

Output for each test case will be  the third largest element of the array . 

Constraints:

1 ≤ T ≤ 100
1 ≤ N ≤ 100
1 ≤ A[ ] ≤ 100

Example(To be used for only expected output):

Input:
1
5
2 4 1 3 5

Output:
3
*/


import java.util.Scanner;
import java.util.*;
import java.io.*;
class ThirdLargestElement
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n =sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.thirdLargest(arr));
		t--;
		}
	}
}

class GfG
{
    int thirdLargest(int a[])
    {
    	int n = a.length;
    	if(n<3)
    	    return -1;
        Arrays.sort(a);
        int l = a[n-3];
        return l;
    }
}
