/*

Link : https://practice.geeksforgeeks.org/problems/check-for-binary/1/?track=SP-2.1

Given a non-empty sequence of characters, return true if sequence is Binary, else return false

Input:

The task is to complete the method that takes a string as argument. We should not read any input from stdin/console. There are multiple test cases. For each test case, this method will be called individually.

Output:
Your function should return true str is binary, else false

Constraints:
1<=T<=50
1<=Length of str<=10000

Example:

Input:
2
101
75

Output:
1
0

*/

import java.util.*;
class checkBinary
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		while(T>0)
		{
			String str = sc.nextLine();
			GfG g = new GfG();
			boolean b = g.isBinary(str);
			if(b== true)
				System.out.println(1);
			else
			    System.out.println(0);
		T--;
		}
	}
}


class GfG
{
	boolean isBinary(String str)
	{
	    int count = 0;
	    for(int i=0;i<str.length();i++)
	        if(str.charAt(i) == '0' || str.charAt(i) == '1')
	            count++;  
	    if(count == str.length())
	        return true;
	    else
	        return false;
	}
}
