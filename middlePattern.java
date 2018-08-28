/*
LINK : https://practice.geeksforgeeks.org/problems/middle-pattern/1/?track=SP%20-%202.2

Given an odd length word your task is to complete the function printPattern that takes a string s as its argument and prints it from the middle of the word such that it follows the following pattern.
 

Input: PROGRAM                            Input: RAT
Output:                                   Output:
            G                                       A
          GR                                      AT  
        GRA                                     ATR
      GRAM
    GRAMP
  GRAMPR
GRAMPRO

The above is proper shaped pattern for the test case, but when
printed in a single line it becomes as shown in the output. 

Input:

The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case consists of a single line containing an odd length string s.


Output:
Corresponding to each test case in a new line print the pattern in a  single line where each row of the pattern is separated by a "$" instead of a new line.


Constraints:
1 ≤ T ≤ 20
1<=size of string(s)<=20


Example(To be used only for expected ouput):
Input
2
PROGRAM
RAT

Output

            G$          GR$        GRA$      GRAM$    GRAMP$  GRAMPR$GRAMPRO$
    A$  AT$ATR$
*/


import java.util.Scanner;
import java.lang.*;
class MiddlePattern
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            String s=sc.next();
            GfG g=new GfG();
            g.printPattern(s);
            System.out.println();
            t--;
        }
    }
}

class GfG
{
	void printPattern(String s)
	{   
	    StringBuilder sb = new StringBuilder();
      int len = s.length();
      int mid = (len + 1)/2;
	    int j = 1;
	    int spa = 2*len-2;
	    for(int i=1;i<=len;i++){
	        for(int k=spa;k>0;k--){
             if(i != len){      
                sb.append(" ");
             }
	        }
	        spa-=2;
          if(len %2 !=0){
            if(i<=mid){

              sb.append(s.substring(mid-1,mid+i-1));
              sb.append("$");
            }else{
              sb.append(s.substring(mid-1,len) + s.substring(0,j));
              sb.append("$");
              j++;
            }
          }else{	
            mid = (len + 2)/2;
            if(i<mid){

              sb.append(s.substring(mid-1,mid+i-1));
              sb.append("$");
            }else{
              sb.append(s.substring(mid-1,len) + s.substring(0,j));
              sb.append("$");
              j++;
            }

          }
	    }System.out.print(sb);
    }
 }
