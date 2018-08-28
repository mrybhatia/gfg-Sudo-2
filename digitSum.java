/*

Link : https://practice.geeksforgeeks.org/contest-problem/spp-digit-sum/1/

Given a positive integer N. Your task is to check if the sum of 1st and last digit of the number is equal to the sum of all remaining digits.

Input:
First line of input contains number of testcases T. For each testcase, there will be a single line containing a positive integer N.

Output:
For each testcase, print "YES" or "NO" (without quotes).

Task: Your task is to complete the function given in the text area. No need to worry about input and output.

Constraints:
1 <= T < 100
1 <= N <= 106

Example:
Input:
2
12345
10021
Output:
NO
YES
Explanation:
Testcase 1: Sum of first and last digit is 1 + 5 = 6 which is not equal to sum of remaining digit which is equal to 9.
Testcase 2: Sum of first and last digit is 1 + 1 = 2 which is equal to sum of remaining digit which is equal to 2.
*/

import java.util.*;
import java.io.*;
import java.lang.*;
class Main
{
    // Driver Code
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Testcase input
        int t = sc.nextInt();
        
        // Loop to iterate for all testcases
        while(t-- > 0)
        {
            // Input N, integer to check sum
            int n = sc.nextInt();
            
            // Calling function using object
            GFG obj = new GFG();
            obj.check(n);
        }
    }
}

class GFG{
    public static void check(int n)
    {
        char[] c = String.valueOf(n).toCharArray();
        int[] a = new int[c.length];
        int sum1 = 0;
        for(int i=0;i<c.length;i++){
            a[i] = Integer.parseInt(String.valueOf(c[i]));
            if(i>0 && i<c.length-1)
                sum1 += a[i];
        }
        int sum2 = a[0] + a[c.length -1];
        if(sum1 == sum2){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    
}
